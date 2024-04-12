package org.example.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseCategoryPage {

    protected WebDriver driver;

    public BaseCategoryPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "agencyInternalId")
    WebElement internalNumber;

    @FindBy (id = "react-select-brand-instance-placeholder")
    WebElement chooseBrand;

    @FindBy (id = "brand-input")
    WebElement brandInput;

    @FindBy (id = "model")
    WebElement modelInput;

    @FindBy (id = "year")
    WebElement year;

    @FindBy (id = "cubic")
    WebElement cubicCapacity;

    @FindBy (id = "powerKw")
    WebElement powerKw;

    @FindBy (id = "mileage")
    WebElement mileage;

    @FindBy (xpath = "//div[@id='registeredUntil']//div[@class=' css-g1hey4']")
    WebElement registeredUntil;

    @FindBy (id = "registeredUntil-input")
    WebElement registeredUntilInput;

    @FindBy (xpath = "//div[@id='damage']//div[@class=' css-g1hey4']")
    WebElement damage;

    @FindBy (id = "damage-input")
    WebElement damageInput;

    @FindBy (id = "react-select-origin-instance-placeholder")
    WebElement originOfTheVehicle;

    @FindBy (id = "origin-input")
    WebElement originInput;

    @FindBy (id = "negotiated")
    WebElement price;

    @FindBy (id = "firstName")
    WebElement firstName;

    @FindBy (id = "lastName")
    WebElement lastName;

    @FindBy (css = ".sc-bmpQMC")
    WebElement submitAdd;

    @FindBy (css = ".sc-gJFNMl")
    WebElement myProfile;

    public void clickAndSelectDropdownItem (WebElement element, String string) {
        element.click();
        element.sendKeys(string);
        element.sendKeys(Keys.ENTER);
    }
}
