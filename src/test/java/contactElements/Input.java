package contactElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label;
    String inputLocator
            = "//*[contains(@class,'isModal active')]//label[(text()='%s')]" +
            "//ancestor::lightning-input[contains(@class,'slds-form-element')]//input";
    String inputDropdownLocator = "//*[contains(@class,'isModal active')]//label[(text()='%s')]" +
            "//ancestor::*[contains(@class,'slds-form-element')]//input";
    String optionLocator = "//*[contains(@class,'slds-is-open')]//span[@title='%s']";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public contactElements.Input write(String text) {
        System.out.printf("Writing text '%s' into input with label '%s' %n", text, label);
        driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys(text);
        return this;
    }

    public Input choose(String option) {
        driver.findElement(By.xpath(String.format(inputDropdownLocator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
        return this;
    }
}
