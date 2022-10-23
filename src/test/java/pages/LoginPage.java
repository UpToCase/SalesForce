package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(LOGIN_BUTTON);
    }

    @Step("open base URL 'https://login.salesforce.com/?locale=de'")
    public LoginPage openPage() {
        driver.get(BASE_URL);
//        driver.get(BASE_URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    @Step("login in to the project like user: {user} with password: {password}")
    public HomePage login(String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
}
