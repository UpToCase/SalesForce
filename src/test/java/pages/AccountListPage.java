package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public final static By CREATE_NEW_COMPANY_BUTTON = By.cssSelector("[title='Создать']");
    public final static By NEW_COMPANY_ICON = By.xpath("//span[@title='Имя организации']");

    String  NEW_COMPANY_PAGE_LINK = "https://ddqltd.lightning.force.com/lightning/o/Account/list?filterName=Recent";


    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(NEW_COMPANY_ICON);
    }

    public AccountListPage open() {
        driver.get(NEW_COMPANY_PAGE_LINK);
        return this;
    }

    public AccountListPage createNewCompanyForm() {
        driver.findElement(CREATE_NEW_COMPANY_BUTTON).click();
        return this;
    }
}
