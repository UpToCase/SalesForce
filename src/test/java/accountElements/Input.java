package accountElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String inputLocator
            = "//*[contains(@class,'modal-body')]//span[contains(text(),'%s')]" +
            "/ancestor::div[contains(@class,'uiInput')]//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public Input write(String text) {
        System.out.printf("Writing text '%s' into input with label '%s' %n", text, label);
        driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys(text);
        return this;
    }
}
