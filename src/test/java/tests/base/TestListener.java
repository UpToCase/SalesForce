package tests.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.AllureUtils;

import java.io.File;

public class TestListener implements ITestListener {

    public void onStart(ITestContext context) {
    }

    public void onTestStart(ITestResult result) {
        System.out.printf("Test started : %s" + "\n", result.getName());
    }

    //TODO api request to set status of test case
    public void onTestFailure(ITestResult result) {
        WebDriver driver = (WebDriver) result.getAttribute("driver");
        AllureUtils.allureScreenshots(driver);
        System.out.printf("Test failed : %s" + "\n", result.getName());
    }
}
