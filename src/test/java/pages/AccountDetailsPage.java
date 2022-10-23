package pages;

import io.qameta.allure.Step;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public final static By NEW_COMPANY_DETAILS = By.xpath("//li[@title='Сведения']");
    public static final By DATA_IMAGES = By.xpath("//img[@title='Организация']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Step("check correct page has been opened")
    @Override
    public boolean isPageOpened() {
        isExist(DATA_IMAGES);
        return false;
    }

    @Step("open account tab")
    public AccountDetailsPage openDetailsTab() {
        driver.findElement(NEW_COMPANY_DETAILS).click();
        return this;
    }

    @Step("check new account entered information")
    public AccountDetailsPage validateNewAccount(Account account) {
        validateNewAccountText("Имя организации", account.getCompanyName());
        validateNewAccountText("Веб-узел", account.getNewCompanyUrl());
        validateNewAccountText("Тел.", account.getCompanyPhoneNumber());
        validateNewAccountText("Сотрудники", account.getCompanyWorkersAmount());
        validateAddressInformation("Адрес для счета",
                account.getStreetForPayment() + account.getCityForPayment()
                        + account.getRegionForPayment() + account.getPostcodeForPayment()
                        + account.getCountryForPayment());
        validateAddressInformation("Адрес для доставки", account.getStreetForShipment()
                + account.getShipmentCity() + account.getShipmentRegion()
                + account.getShipmentPostcode() + account.getShipmentCountry());
        validateNewAccountText("Тип", account.getCompanyType());
        validateNewAccountText("Отрасль", account.getCompanyIndustry());
        validateNewAccountText("Описание", account.getCompanyDescription());
        return this;
    }
}
