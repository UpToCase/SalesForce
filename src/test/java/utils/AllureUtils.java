package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AllureUtils {

    public static byte[] allureScreenshots(WebDriver driver){
        return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
