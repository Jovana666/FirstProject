package org.example.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class AddCarPage extends BaseCategoryPage{

    protected WebDriver driver;

    public AddCarPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private String filePath = "C:\\Users\\inspira\\IdeaProjects\\FirstProject\\imageCar.jpg";


    @FindBy (id = "reserved")
    WebElement reservedCheckbox;

    @FindBy (id = "imageUpload")
    WebElement uploadPhoto;

    @FindBy (id = "brand-input")
    WebElement carBrandList;

    @FindBy (xpath = "//div[@id='model']//div[@class=' css-b44d4p']")
    WebElement chooseCarModel;

    @FindBy (id = "model-input")
    WebElement modelList;

    @FindBy (id = "react-select-fuelType-instance-placeholder")
    WebElement fuel;

    @FindBy (id = "fuelType-input")
    WebElement fuelList;

    @FindBy (id = "react-select-engineEmissionClass-instance-placeholder")
    WebElement engineEmissionClass;

    @FindBy (id = "engineEmissionClass-input")
    WebElement getEngineEmissionList;

    @FindBy (xpath = "//div[@id='drive']//div[@class=' css-b44d4p']")
    WebElement drive;

    @FindBy (id = "drive-input")
    WebElement driveList;

    @FindBy (xpath = "//div[@id='transmission']//div[@class=' css-g1hey4']")
    WebElement transmission;

    @FindBy (id = "transmission-input")
    WebElement transmissionList;

    @FindBy (xpath = "//div[@id='numberOfDoors']//div[@class=' css-g1hey4']")
    WebElement numberOfDoors;

    @FindBy (id = "numberOfDoors-input")
    WebElement numberOfDoorsList;

    @FindBy (id = "react-select-numberOfSeats-instance-placeholder")
    WebElement numberOfSeats;

    @FindBy (id = "numberOfSeats-input")
    WebElement numberOfSeatsList;

    @FindBy (id = "react-select-sideOfSteeringWheel-instance-placeholder")
    WebElement sideOfTheSteeringWheel;

    @FindBy (id = "sideOfSteeringWheel-input")
    WebElement sideOfSteeringWheelNumber;

    @FindBy (id = "react-select-airCondition-instance-placeholder")
    WebElement airCondition;

    @FindBy (id = "airCondition-input")
    WebElement airConditionBoolean;

    @FindBy (xpath = "//div[@id='color']//div[@class=' css-g1hey4']")
    WebElement carColor;

    @FindBy (id = "color-input")
    WebElement carColorInput;

    @FindBy (xpath = "//a[contains(.,'oglas1')]")
    WebElement createdAd;
    //needs a different way of asserting

    public void fillAdCarForm() {
        internalNumber.sendKeys("1234");
        reservedCheckbox.click();
        uploadPhoto.sendKeys(filePath);
        chooseBrand.click();
        clickAndSelectDropdownItem(carBrandList, "Mercedes benz");
        chooseCarModel.click();
        clickAndSelectDropdownItem(modelList, "114");

        //basic information
        year.sendKeys("2011");
        fuel.click();
        clickAndSelectDropdownItem(fuelList, "benzin");

        //additional information
        cubicCapacity.sendKeys("550");
        powerKw.sendKeys("20");
        mileage.sendKeys("10000");
        engineEmissionClass.click();
        clickAndSelectDropdownItem(getEngineEmissionList, "Euro 1");
        drive.click();
        clickAndSelectDropdownItem(driveList,"Prednji");
        transmission.click();
        clickAndSelectDropdownItem(transmissionList, "Manuelni 4 brzine");
        numberOfDoors.click();
        clickAndSelectDropdownItem(numberOfDoorsList, "2/3 vrata");
        numberOfSeats.click();
        clickAndSelectDropdownItem(numberOfSeatsList, "5 sedišta");
        sideOfTheSteeringWheel.click();
        clickAndSelectDropdownItem(sideOfSteeringWheelNumber, "Levi volan");
        airCondition.click();
        clickAndSelectDropdownItem(airConditionBoolean, "Ima klimu");
        carColor.click();
        clickAndSelectDropdownItem(carColorInput, "Crvena");
        registeredUntil.click();
        clickAndSelectDropdownItem(registeredUntilInput, "Nije registrovan");
        damage.click();
        clickAndSelectDropdownItem(damageInput, "Nije oštećen");
        originOfTheVehicle.click();
        clickAndSelectDropdownItem(originInput, "Na ime kupca");
        //car price
        price.sendKeys("3000");
        //contact info
        firstName.sendKeys("Ana");
        lastName.sendKeys("Bajic");
        submitAdd.click();
    }

    public void checkCreatedAdIsVisible () {
        myProfile.click();
    }
}
