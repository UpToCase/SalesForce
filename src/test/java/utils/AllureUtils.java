package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AllureUtils {

    @Attachment(value = "screenshots", type = "image/png")
    public static byte[] allureScreenshots(WebDriver driver){
        return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
