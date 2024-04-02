import org.checkerframework.checker.units.qual.A;
import org.example.helper.Helper;
import org.example.pageObjects.AddCarPage;
import org.example.pageObjects.LoginPage;
import org.junit.Test;

public class AddCarAdTest extends BaseTest{
    @Test

    public void addCar() {
        AddCarPage addCarPage = new AddCarPage(driver);
        Helper helper = new Helper(driver);
        ChooseCarCategoryTest chooseCarCategoryTest = new ChooseCarCategoryTest();
        chooseCarCategoryTest.chooseCar();
        helper.waitForPageToLoad();
        addCarPage.fillAdCarForm();
        addCarPage.checkCreatedAdIsVisible();

    }
}
