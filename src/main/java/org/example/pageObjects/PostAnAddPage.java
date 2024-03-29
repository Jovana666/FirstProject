package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostAnAddPage {
    //this class represents a page object linked to https://profile.stg.polovni.dev/kategorije
    protected WebDriver driver;

    public PostAnAddPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Postavi oglas')]")
    private WebElement postAnAdd;

    @FindBy (id = "cars")
    private WebElement carsCategory;

    @FindBy (id = "motors")
    private WebElement motorsCategory;

    @FindBy (id = "transportVehicles")
    private WebElement transportVehiclesCategory;

    @FindBy (id = "agriculturalMachines")
    private WebElement agriculturalMachinesCategory;

    @FindBy (id = "workingMachines")
    private WebElement workingMachinesCategory;

    @FindBy (id = "vessels")
    private WebElement vesselsCategory;

    @FindBy (id = "bicycles")
    private WebElement bicyclesCategory;

    @FindBy (id = "partsAndEquipment")
    private WebElement partsAndEquipmentCategory;

    public void chooseCategory () {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(postAnAdd));
        postAnAdd.click();
    }
}
