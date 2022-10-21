package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Test (description = "Login to the project", threadPoolSize = 1, invocationCount = 1)
    public void loginTest() {
        loginPage
                .openPage();
        assertTrue(loginPage.isPageOpened(), "Login page is not been opened");
        loginPage
                .login(USER, PASSWORD);
        assertTrue(homePage.isPageOpened(), "Home page is not been opened");
    }
}
