import org.checkerframework.checker.units.qual.A;
import org.example.helper.Helper;
import org.example.pageObjects.AddCarPage;
import org.example.pageObjects.ChooseCategoryPage;
import org.example.pageObjects.LoginPage;
import org.junit.Test;

public class AddCarTest extends BaseTest{

    @Test
    //flaky
    public void chooseCar () {
        ChooseCategoryPage postAnAddPage = new ChooseCategoryPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Helper helper = new Helper(driver);
        postAnAddPage.chooseCategory();
        loginPage.login();
        helper.waitForPageToLoad();
        postAnAddPage.chooseCarCategory();
    }

    @Test

    public void addCar () {
        AddCarPage addCarPage = new AddCarPage(driver);
        Helper helper = new Helper(driver);
        chooseCar();
        helper.waitForPageToLoad();
        addCarPage.fillAdCarForm();
        addCarPage.checkCreatedAdIsVisible();
    }
}
