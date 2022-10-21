package accountElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDawn {
    WebDriver driver;
    String label;
    String dropDownLocator
            = "//*[contains(@class,'actionBody')]//span[contains(text(),'%s')]" +
            "/ancestor::div[contains(@class,'uiInput')]//a";
    String optionLocator = "//*[contains(@class,'select-options') and contains(@class,'visible')]//a[@title='%s']";

    public DropDawn(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public DropDawn select(String option) {
        driver.findElement(By.xpath(String.format(dropDownLocator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
        return this;
    }
}
 