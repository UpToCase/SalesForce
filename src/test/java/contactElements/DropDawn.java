package contactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDawn {
    WebDriver driver;
    String label;
    String dropDownLocator = "//*[contains(@class,'isModal active')]//label[contains(text(),'%s')]" +
            "//ancestor::*[contains(@class,'slds-form-element')]//button";

    String optionLocator = "//*[contains(@class,'slds-is-open')]//span[@title='%s']";

    public DropDawn(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public DropDawn select(String option) {
        driver.findElement(By.xpath(String.format(dropDownLocator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
        return this;
    }
}
