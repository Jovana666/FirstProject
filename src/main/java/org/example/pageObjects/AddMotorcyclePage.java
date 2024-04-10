package org.example.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMotorcyclePage {

    protected WebDriver driver;

    public AddMotorcyclePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "agencyInternalId")
    WebElement internalNumber;

    @FindBy (id = "react-select-brand-instance-placeholder")
    WebElement chooseMotorcycleBrand;

    @FindBy (id = "brand-input")
    WebElement brandInput;

    @FindBy (id = "model")
    WebElement motorcycleModelInput;

    @FindBy (id = "year")
    WebElement motorcycleYear;

    @FindBy (id = "react-select-type-instance-placeholder")
    WebElement type;

    @FindBy (id = "type-input")
    WebElement typeInput;

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
    WebElement motorcyclePrice;

    //contact info

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

    public void fillAddMotorcycleForm () {
        internalNumber.sendKeys("3222");
        chooseMotorcycleBrand.click();
        clickAndSelectDropdownItem(brandInput, "Kawasaki");
        motorcycleModelInput.click();
        motorcycleModelInput.sendKeys("model");
        motorcycleYear.sendKeys("2015");
        type.click();
        clickAndSelectDropdownItem(typeInput, "Sport/Super sport");
        cubicCapacity.sendKeys("200");
        powerKw.sendKeys("550");
        mileage.sendKeys("20000");
        registeredUntil.click();
        clickAndSelectDropdownItem(registeredUntilInput,"Nije registrovan");
        damage.click();
        clickAndSelectDropdownItem(damageInput, "Nije oštećen");
        originOfTheVehicle.click();
        clickAndSelectDropdownItem(originInput, "Na ime kupca");
        motorcyclePrice.sendKeys("3000");
        firstName.sendKeys("Marija");
        lastName.sendKeys("Nedic");
        submitAdd.click();
    }

    /*public void checkCreatedAdIsVisible () {
        myProfile.click();
        String adName = createdAd.getText();
        String adExpectedName = "oglas1";
        //createdAd.click();
        Assert.assertEquals(adName,adExpectedName);
        System.out.println("Ad title: " + adName);
    }*/
}
