package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkingMachinesPage extends BaseCategoryPage{

    protected WebDriver driver;

        public WorkingMachinesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy (id = "model")
    WebElement model;

    @FindBy (id = "type-input")
    WebElement typeInput;

    @FindBy (xpath = "//input[@value='true']")
    WebElement PDVbtn;

    @FindBy (css = ".sc-kMJsQO dOIIOq")
    WebElement submitAddBtn;

    @FindBy (xpath = "//a[@href='https://public.stg.polovni.dev/radne-masine-delovi/9592/oglas1']")
    WebElement profileAddTitle;

    public void fillAddWorkingMachineForm() {
            internalNumber.sendKeys("433");
            chooseBrand.click();
            clickAndSelectDropdownItem(brandInput, "IMR");
            model.click();
            clickAndSelectDropdownItem(model, "500");
            year.sendKeys("2015");
            typeInput.click();
            clickAndSelectDropdownItem(typeInput, "Drobilica");
            registeredUntil.click();
            clickAndSelectDropdownItem(registeredUntilInput, "06.2024.");
            damage.click();
            clickAndSelectDropdownItem(damageInput, "Nije oštećen");
            originOfTheVehicle.click();
            clickAndSelectDropdownItem(originInput, "Na ime kupca");
            price.sendKeys("6000");
            PDVbtn.click();
            districtInput.click();
            firstName.sendKeys("Ime");
            lastName.sendKeys("last name");
            submitAddBtn.click();
    }

    public void verifyAddCreated () {
        myProfile.click();
        profileAddTitle.click();
    }
}
