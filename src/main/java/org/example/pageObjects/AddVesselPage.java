package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddVesselPage extends BaseCategoryPage{

    protected WebDriver driver;

    public AddVesselPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "model")
    WebElement modelInput;

    @FindBy (id = "react-select-type-instance-placeholder")
    WebElement type;

    @FindBy (id = "react-select-type-instance-listbox")
    private List<WebElement> typeList;

    @FindBy (xpath = "//div[@id='react-select-type-instance-option-1']")
    WebElement typeOption;

    @FindBy (id = "react-select-hullMaterial-instance-placeholder")
    WebElement material;

    @FindBy (xpath = "//div[@id='react-select-hullMaterial-instance-option-2']")
    WebElement materialOption;

    @FindBy (id = "react-select-numberOfEngines-instance-placeholder")
    WebElement numberOfEngines;

    @FindBy (xpath = "//div[@id='react-select-numberOfEngines-instance-option-3']")
    WebElement numberOfEnginesOption;

    @FindBy (id = "length")
    WebElement length;

    @FindBy (id = "width")
    WebElement width;

    @FindBy (id = "height")
    WebElement height;

    @FindBy (css = ".sc-eJNOVp")
    WebElement submitBtn;

    public void selectOptionFromList(WebElement element1, WebElement element2) {
        element1.click();
        element2.click();
    }

    public void fillAddVesselsForm() {
        internalNumber.sendKeys("433");
        chooseBrand.click();
        clickAndSelectDropdownItem(brandInput, "Airon marine");
        modelInput.sendKeys("560");
        year.sendKeys("2014");
        selectOptionFromList(type, typeOption);
        selectOptionFromList(material, materialOption);
        selectOptionFromList(numberOfEngines, numberOfEnginesOption);
        length.sendKeys("400");
        width.sendKeys("300");
        height.sendKeys("60");
        registeredUntil.click();
        clickAndSelectDropdownItem(registeredUntilInput, "07.2024.");
        damage.click();
        clickAndSelectDropdownItem(damageInput, "Nije oštećen");
        originOfTheVehicle.click();
        clickAndSelectDropdownItem(originInput, "Na ime kupca");
        price.sendKeys("6000");
        firstName.sendKeys("Ime3");
        lastName.sendKeys("last name");
        submitBtn.click();
    }
}
