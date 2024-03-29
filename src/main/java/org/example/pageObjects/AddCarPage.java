package org.example.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage {
    @FindBy(id = "agencyInternalId")
    WebElement internalNumber;

    @FindBy (id = "reserved")
    WebElement reservedCheckbox;

    @FindBy (id = ".ant-upload-drag-container")
    WebElement uploadPhoto;

    @FindBy (xpath = "//div[@class=' css-1xyxx1l-control']/div[@class=' css-133ebha']")
    WebElement chooseCarBrand;

    @FindBy (xpath = "//div[@id='modelCol']//div[@class='sc-khsqcC fNoDuJ select-field']")
    WebElement chooseCarModel;

    @FindBy (id = "year")
    WebElement carYear;

    @FindBy (xpath = "//div[@id='fuelType']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement fuel;

    @FindBy (id = "cubic")
    WebElement cubicCapacity;

    @FindBy (id = "powerkW")
    WebElement powerKw;

    @FindBy (id = "powerks")
    WebElement powerKs;

    @FindBy (id = "mileage")
    WebElement mileage;

    @FindBy (xpath = "//div[@id='engineEmissionClass']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement engineEmissionClass;

    @FindBy (xpath = "//div[@id='drive']//div[@class=' css-g1hey4']")
    WebElement drive;

    @FindBy (xpath = "//div[@id='transmission']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement gearBox;

    @FindBy (xpath = "//div[@id='numberOfDoors']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement doorNumber;

    @FindBy (xpath = "//div[@id='numberOfSeats']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement numberOfSeats;

    @FindBy (xpath = "//div[@id='sideOfSteeringWheel']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement sideOfTheSteeringWheel;

    @FindBy (xpath = "//div[@id='airCondition']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement airCondition;

    @FindBy (xpath = "//div[@id='color']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement carColor;

    @FindBy (xpath = "//div[@id='interiorMaterial']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement interiorMaterial;

    @FindBy (xpath = "//div[@id='interiorColor']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement interiorColor;

    @FindBy (xpath = "//div[@id='registeredUntil']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement registeredUntil;

    @FindBy (xpath = "//div[@id='damage']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement damage;

    @FindBy (xpath = "//div[@id='exchange']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement noReplacement;

    @FindBy (xpath = "//div[@id='origin']//div[@class=' css-1xc3v61-indicatorContainer']")
    WebElement originOfTheVehicle;

    @FindBy (id = "negotiated")
    WebElement carPrice;

    //contact info

    @FindBy (css = ".sc-bmpQMC")
    WebElement submitAdd;
}
