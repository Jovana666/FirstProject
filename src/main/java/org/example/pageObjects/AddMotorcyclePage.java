package org.example.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMotorcyclePage extends BaseCategoryPage{

    protected WebDriver driver;

    public AddMotorcyclePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "react-select-type-instance-placeholder")
    WebElement type;

    @FindBy (id = "type-input")
    WebElement typeInput;

    public void fillAddMotorcycleForm () {
        internalNumber.sendKeys("3222");
        chooseBrand.click();
        clickAndSelectDropdownItem(brandInput, "Kawasaki");
        modelInput.click();
        modelInput.sendKeys("model");
        year.sendKeys("2015");
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
        price.sendKeys("3000");
        firstName.sendKeys("Marija");
        lastName.sendKeys("Nedic");
        submitAdd.click();
    }

    public void checkCreatedAdIsVisible () {
        myProfile.click();
    }
}
