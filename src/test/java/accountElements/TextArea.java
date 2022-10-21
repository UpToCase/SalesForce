package accountElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String textBox = "//*[contains(@class,'modal-body')]" +
            "//*[contains(text(),'%s')]//ancestor::*[contains(@class,'uiInputTextArea')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public TextArea enter(String text) {
        System.out.printf("Writing text '%s' into text box with label '%s' %n", text, label);
        driver.findElement(By.xpath(String.format(textBox, label))).sendKeys(text);
        return this;
    }

}
