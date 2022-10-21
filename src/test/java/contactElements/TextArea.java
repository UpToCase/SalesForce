package contactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String textLocator = "//*[contains(@class,'isModal active')]//label[contains(text(),'%s')]" +
            "//ancestor::*[contains(@class,'slds-form-element')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public TextArea enter(String text) {
        System.out.printf("Writing text %s into text box with label %s %n", text, label);
        driver.findElement(By.xpath(String.format(textLocator, label))).sendKeys(text);
        return this;
    }
}
