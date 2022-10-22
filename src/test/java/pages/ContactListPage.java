package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage {

    public final static By CREATE_NEW_CONTACT_FORM_BUTTON = By.xpath("//*[@title='Создать']");
    public final static By MODAL_FORM_IS_OPENED = By.xpath("//*[contains(@class,'slds-modal__title') " +
            "and contains(text(),'Создать контакт')]");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(MODAL_FORM_IS_OPENED);
    }

    public ContactListPage createNewContactForm() {
        driver.findElement(CREATE_NEW_CONTACT_FORM_BUTTON).click();
        return this;
    }
}
