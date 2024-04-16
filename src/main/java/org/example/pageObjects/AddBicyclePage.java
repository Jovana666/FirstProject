package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBicyclePage extends BaseCategoryPage {

    @FindBy(id = "model")
    private WebElement modelInput;

    @FindBy(id = "type-input")
    private WebElement bicycleTypeInput;

    @FindBy(css = ".sc-jigNDC")
    private WebElement submitButton;

    public AddBicyclePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

        public void fillAddBicycleForm() {
        enterText(internalNumber, "222");
        clickAndSelectDropdownItem(brandInput, "BMW");
        clickAndSelectDropdownItem(modelInput, "BMW");
        enterText(year, "2015");  
        clickAndSelectDropdownItem(bicycleTypeInput, "BMX");
        selectDamageState("Oštećen - u voznom stanju");
        enterText(price, "3500");  
        enterText(firstName, "Ime3"); 
        enterText(lastName, "last name");  
        submitForm();
    }

    private void selectDamageState(String damageState) {
        damage.click();  // Assuming this is necessary to make the damageInput interactable
        clickAndSelectDropdownItem(damageInput, damageState);
    }

    private void submitForm() {
        submitButton.click();
    }
}