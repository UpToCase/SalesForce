package pages;

import contactElements.DropDawn;
import contactElements.Input;
import contactElements.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModal extends BasePage {

    public final static By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    public ContactModal createNewContact(Contact contact) {

        new DropDawn(driver, "Приветствие").select(contact.getWelcome());
        new Input(driver, "Личное имя").write(contact.getPersonalName());
        new Input(driver, "Фамилия").write(contact.getLastName());
        new Input(driver, "Имя организации").choose(contact.getOrganisation());
        new Input(driver, "Должность").write(contact.getPosition());
        new Input(driver, "Тел.").write(contact.getPhone());
        new Input(driver, "Мобильный тел.").write(contact.getMobilePhone());
        new Input(driver, "Эл. почта").write(contact.getEmail());
//        new Input(driver, "Подчиненный").write(contact.getSubordinate());

        new TextArea(driver, "Улица в почтовом адресе").enter(contact.getStreetInPostAddress());
        new Input(driver, "Город в почтовом адресе").write(contact.getCityInPostAddress());
        new Input(driver, "Индекс в почтовом адресе").write(contact.getIndexInPostAddress());
        new Input(driver, "Область/штат в почтовом адресе").write(contact.getRegionInPostAddress());
        new Input(driver, "Страна в почтовом адресе").write(contact.getLandInPostAddress());

        new TextArea(driver, "Другая улица").enter(contact.getAnotherStreet());
        new Input(driver, "Другой город").write(contact.getAnotherCity());
        new Input(driver, "Другой индекс").write(contact.getAnotherIndex());
        new Input(driver, "Другая область/штат").write(contact.getAnotherRegion());
        new Input(driver, "Другая страна").write(contact.getAnotherLand());

        new Input(driver, "Факс").write(contact.getFax());
        new Input(driver, "Дом. тел.").write(contact.getHomePhone());
        new Input(driver, "Другой тел.").write(contact.getAnotherPhone());
        new Input(driver, "Тел. помощника").write(contact.getAssistancePhone());
        new Input(driver, "Помощник").write(contact.getAssistance());
        new Input(driver, "Отдел").write(contact.getDepartment());
//        new Input(driver, "Источник интереса").write(contact.getSourceInterest());
        new Input(driver, "Дата рождения").write(contact.getBirthDay());

        new TextArea(driver, "Описание").enter(contact.getDescription());
        return this;
    }

    public ContactModal save() {
        driver.findElement(SAVE_BUTTON).click();
        return this;
    }
}
