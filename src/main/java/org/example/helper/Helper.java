package org.example.helper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {
    protected WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitingForElement(WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForPageToLoad() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
    }

    public void clickAndSelectDropdownItem (WebElement element, String string) {
        element.click();
        element.sendKeys(string);
        element.sendKeys(Keys.ENTER);
    }
}
