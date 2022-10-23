package pages;

import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage {

    public final static By NEW_CONTACT_IS_EXIST = By.xpath("//*[@class='uiImage']//img[@title='Контакт']");

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Step("check correct page has been opened")
    @Override
    public boolean isPageOpened() {
        isExist(NEW_CONTACT_IS_EXIST);
        return false;
    }

    @Step("check new contact entered information")
    public ContactDetailsPage validateNewContact(Contact contact) {
        validateNewContactInfo("Имя", contact.getWelcome() + contact.getPersonalName()
                + contact.getLastName());
        validateNewContactLinks("Имя организации", "a//span", contact.getOrganisation());
        validateNewContactInfo("Должность", contact.getPosition());
        validateNewContactLinks("Тел.", "a", contact.getPhone());
        validateNewContactLinks("Мобильный тел.", "a", contact.getMobilePhone());
        validateNewContactLinks("Эл. почта", "a", contact.getEmail());
        validateNewContactLinks("Почтовый адрес", "a",
                contact.getStreetInPostAddress()
                        + contact.getCityInPostAddress() + contact.getRegionInPostAddress() + contact.getIndexInPostAddress()
                        + contact.getLandInPostAddress());
        validateNewContactLinks("Другой адрес", "a", contact.getAnotherStreet()
                + contact.getAnotherCity() + contact.getAnotherRegion() +
                contact.getAnotherIndex() + contact.getAnotherLand());
        validateNewContactLinks("Факс", "a", contact.getFax());
        validateNewContactLinks("Дом. тел.", "a", contact.getHomePhone());
        validateNewContactLinks("Другой тел.", "a", contact.getAnotherPhone());
        validateNewContactLinks("Тел. помощника", "a", contact.getAssistancePhone());
        validateNewContactInfo("Помощник", contact.getAssistance());
        validateNewContactInfo("Отдел", contact.getDepartment());
        validateNewContactInfo("Дата рождения", contact.getBirthDay());
        validateNewContactInfo("Описание", contact.getDescription().replaceAll(" ", ""));
        return this;
    }
}
