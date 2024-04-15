package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBicyclePage extends BaseCategoryPage{

    protected WebDriver driver;

    public AddBicyclePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "model")
    WebElement modelInput;

    @FindBy (id = "type-input")
    WebElement type;

    @FindBy (css = ".sc-jigNDC")
    WebElement submitBicycle;

    public void fillAddBicycleForm() {
        internalNumber.sendKeys("222");
        clickAndSelectDropdownItem(brandInput, "BMW");
        clickAndSelectDropdownItem(modelInput, "BMW");
        year.sendKeys("2015");
        clickAndSelectDropdownItem(type,"BMX");
        damage.click();
        clickAndSelectDropdownItem(damageInput, "Oštećen - u voznom stanju");
        price.sendKeys("3500");
        firstName.sendKeys("Ime3");
        lastName.sendKeys("last name");
        submitBicycle.click();
    }
}
