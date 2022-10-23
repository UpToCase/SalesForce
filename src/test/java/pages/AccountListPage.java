package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public final static By CREATE_NEW_COMPANY_BUTTON = By.cssSelector("[title='Создать']");
    public final static By NEW_COMPANY_ICON = By.xpath("//span[@title='Имя организации']");

    public final static By  NEW_COMPANY_PAGE_TAB = By.xpath("//*[@data-id='Account']");


    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Step("check correct page has been opened")
    @Override
    public boolean isPageOpened() {
        return isExist(NEW_COMPANY_ICON);
    }

    @Step("open account tab")
    public AccountListPage open() {
        driver.findElement(NEW_COMPANY_PAGE_TAB).click();
        return this;
    }

    @Step("open new form for account creating")
    public AccountListPage createNewCompanyForm() {
        driver.findElement(CREATE_NEW_COMPANY_BUTTON).click();
        return this;
    }
}
