package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {

    public final static By CONTACT_TAB = By.xpath("//*[@data-id='Contact']");
    public final static By NEW_CONTACT_ICON = By.xpath("//img[@title='Контакты']");


    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public ContactPage openContactTab() {
        driver.findElement(CONTACT_TAB).click();
        return this;
    }

    @Override
    public boolean isPageOpened() {
        return isExist(NEW_CONTACT_ICON);
    }
}