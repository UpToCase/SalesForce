package pages;

import accountElements.DropDawn;
import accountElements.Input;
import accountElements.TextArea;
import io.qameta.allure.Step;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

public class AccountModal extends BasePage {
    public final static By MODAL_TITLE = By.xpath("//h2[contains(text(),'Создать организацию')]");
    public final static By SAVE_BUTTON = By.cssSelector("[title=Сохранить]");

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    @Step("check correct page has been opened")
    @Override
    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("create new account")
    public AccountModal createNewCompany(Account account) {
        new Input(driver, "Имя организации").write(account.getCompanyName());
        new Input(driver, "Веб-узел").write(account.getNewCompanyUrl());
        new Input(driver, "Тел.").write(account.getCompanyPhoneNumber());
        new Input(driver, "Сотрудники").write(account.getCompanyWorkersAmount());
        new Input(driver, "Почтовый индекс для счета").write(account.getPostcodeForPayment());
        new Input(driver, "Город для счета").write(account.getCityForPayment());
        new Input(driver, "Область/штат для счета").write(account.getRegionForPayment());
        new Input(driver, "Страна для счета").write(account.getCountryForPayment());
        new Input(driver, "Почтовый индекс для доставки").write(account.getShipmentPostcode());
        new Input(driver, "Город для доставки").write(account.getShipmentCity());
        new Input(driver, "Область/штат для доставки").write(account.getShipmentRegion());
        new Input(driver, "Страна для доставки").write(account.getShipmentCountry());
        new DropDawn(driver, "Тип").select(account.getCompanyType());
        new DropDawn(driver, "Отрасль").select(account.getCompanyIndustry());
        new TextArea(driver, "Улица для счета").enter(account.getStreetForPayment());
        new TextArea(driver, "Улица для доставки").enter(account.getStreetForShipment());
        new TextArea(driver, "Описание").enter(account.getCompanyDescription());
        return this;
    }

    @Step("save created new account")
    public AccountModal save() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        wait.until(ExpectedConditions.);
        driver.findElement(SAVE_BUTTON).click();
        return this;
    }
}
