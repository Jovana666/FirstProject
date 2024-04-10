package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class ChooseCategoryPage {
    //this class represents a page object linked to https://profile.stg.polovni.dev/kategorije
    protected WebDriver driver;

    public ChooseCategoryPage(WebDriver driver) {
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

    public void chooseCategory() {
         postAnAdd.click();
    }

    // I would like to have one method where you choose which element you want to pass --> this method will click on the element
    public void chooseCarCategory () {
        //add wait for the page to load
        carsCategory.click();
    }

    public void chooseMotorcycleCategory () {
        //add wait for the page to load
        motorsCategory.click();
    }

    public void chooseTransportVehicleCategory () {
        //add wait for the page to load
        transportVehiclesCategory.click();
    }

    public void chooseAgroMachinesCategory () {
        //add wait for the page to load
        agriculturalMachinesCategory.click();
    }

    public void chooseWorkingMachinesCategory () {
        //add wait for the page to load
        workingMachinesCategory.click();
    }

    public void chooseVesselsCategory () {
        //add wait for the page to load
        vesselsCategory.click();
    }

    public void chooseBicycleCategory () {
        //add wait for the page to load
        bicyclesCategory.click();
    }

    public void choosePartsAndEquipmentsCategory () {
        //add wait for the page to load
        partsAndEquipmentCategory.click();
    }

}
