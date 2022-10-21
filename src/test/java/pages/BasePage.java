package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {

    public final static String BASE_URL = "https://login.salesforce.com/?locale=de";

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
//        wait = new WebDriverWait(driver, 15);
    }

    public abstract boolean isPageOpened();

    public boolean isExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public BasePage validateNewAccountText(String label, String expectedText) {
        String locator = "//span[text()='%s']//ancestor::records-record-layout-item//*[@slot='outputField']";
        assertEquals(driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expectedText, "Wrong text is displaced");
        return this;
    }

    public BasePage validateAddressInformation(String label, String expectedAddressInfo) {
        String locator = "//span[text()='%s']//ancestor::records-record-layout-item//a";
        assertEquals(driver.findElement(By.xpath(String.format(locator, label)))
                        .getText().replaceAll("[\\pP\\s]", ""),
                expectedAddressInfo, "Wrong text is displaced");
        return this;
    }

    public BasePage validateNewContactLinks(String label, String organisationCorrectLocator, String expectedLink) {
        String linkLocator = "//span[(text()='%s')]//ancestor::*[contains(@class,'slds-form__item')]//%s";
        assertEquals(driver.findElement(By.xpath(String.format(linkLocator, label, organisationCorrectLocator)))
                        .getText().replaceAll("\n| |,", ""),
                expectedLink, "Wrong link is displaced");
        return this;
    }

    public BasePage validateNewContactInfo(String label, String expectedContactInfo) {
        String locatorInfo = "//span[(text()='%s')]//ancestor::*[contains(@class,'slds-form-element')]" +
                "//*[@slot='outputField']";
        assertEquals(driver.findElement(By.xpath(String.format(locatorInfo, label))).getText().
                        replaceAll(" ", ""), expectedContactInfo,
                "Wrong information is displaced");
        return this;
    }

}
