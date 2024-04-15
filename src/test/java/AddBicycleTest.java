import org.example.helper.Helper;
import org.example.pageObjects.AddBicyclePage;
import org.example.pageObjects.ChooseCategoryPage;
import org.example.pageObjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class AddBicycleTest extends BaseTest{

    @Test
    public void chooseBicycle () {
        ChooseCategoryPage postAnAddPage = new ChooseCategoryPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Helper helper = new Helper(driver);
        postAnAddPage.chooseCategory();
        loginPage.login();
        helper.waitForPageToLoad();
        postAnAddPage.chooseBicycleCategory();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url ,"https://profile.stg.polovni.dev/bicikli");
    }

    @Test
    public void addBicycle () {
        AddBicyclePage addBicyclePage = new AddBicyclePage(driver);
        Helper helper = new Helper(driver);
        chooseBicycle();
        helper.waitForPageToLoad();
        addBicyclePage.fillAddBicycleForm();
    }
}
