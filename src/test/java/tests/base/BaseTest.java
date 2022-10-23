package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {

    public final static String USER = System.getProperty("testLogin");
    public final static String PASSWORD = System.getProperty("testPassword");
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected AccountListPage accountListPage;
    protected AccountModal accountModal;
    protected AccountDetailsPage accountDetailsPage;
    protected ContactPage contactPage;
    protected ContactListPage contactListPage;
    protected ContactModal contactModal;
    protected ContactDetailsPage contactDetailsPage;

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {
        System.out.println("The browser is" + ": " + browser);
        if (browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless", "--disable-notifications",
                    "disable-translate", "disable-popup-blocking", "ignore-certificate-errors");
            driver = new ChromeDriver(options);
        }else if (browser.equals("opera")) {
            WebDriverManager.operadriver().setup();
            OperaOptions options = new OperaOptions();
            options.addArguments("--headless", "--disable-notifications",
                    "disable-translate", "disable-popup-blocking", "ignore-certificate-errors");
            driver = new OperaDriver(options);
        }else if (browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver();
        }else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless", "--disable-notifications",
                    "disable-translate", "disable-popup-blocking", "ignore-certificate-errors");
            driver = new FirefoxDriver();
        }else if (browser.equals("safari")){
            WebDriverManager.safaridriver().setup();
            SafariOptions options = new SafariOptions();
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        testContext.setAttribute("driver", driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModal = new AccountModal(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        contactPage = new ContactPage(driver);
        contactListPage = new ContactListPage(driver);
        contactModal = new ContactModal(driver);
        contactDetailsPage = new ContactDetailsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

