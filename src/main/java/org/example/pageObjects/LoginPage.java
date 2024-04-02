package org.example.pageObjects;

import org.example.helper.Helper;
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

    Helper helper;
    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        helper = new Helper(this.driver);
    }

    private String username = "jovanabiznis@test.qa";
    private String password = "test1234";

    @FindBy(xpath =  "//input[contains(@placeholder,'Unesi e-mail adresu')]")
    WebElement emailFld;

    @FindBy (id = "password")
    WebElement passwordFld;

    @FindBy (xpath = "//body/div[@id='root']/div[1]/form[1]/div[3]/button[1]")
    WebElement submitBtn;

    public void login() {

        //how to access Helper class ?
        helper.waitingForElement(emailFld);
        emailFld.click();
        emailFld.sendKeys(username);
        passwordFld.sendKeys(password);
        submitBtn.click();
    }
}
