package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    protected WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private String username = "jovanasalon@test.qa";
    private String password = "test1234";

    @FindBy(xpath =  "//input[contains(@placeholder,'Unesi e-mail adresu')]")
    WebElement emailFld;

    @FindBy (id = "password")
    WebElement passwordFld;

    @FindBy (xpath = "//body/div[@id='root']/div[1]/form[1]/div[3]/button[1]")
    WebElement submitBtn;

    public void login() {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(emailFld));
        emailFld.click();
        emailFld.sendKeys(username);
        passwordFld.sendKeys(password);
        submitBtn.click();
    }
}
