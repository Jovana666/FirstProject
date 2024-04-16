import org.example.helper.Helper;
import org.example.pageObjects.AddBicyclePage;
import org.example.pageObjects.ChooseCategoryPage;
import org.example.pageObjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class AddBicycleTest extends BaseTest{
    private ChooseCategoryPage postAnAddPage;
    private LoginPage loginPage;
    private AddBicyclePage addBicyclePage;
    private Helper helper;

    @Before
    public void testSetUp() {
        postAnAddPage = new ChooseCategoryPage(driver);
        loginPage = new LoginPage(driver);
        addBicyclePage = new AddBicyclePage(driver);
        helper = new Helper(driver);
    }

    @Test
    public void testChooseBicycleCategory () {
        postAnAddPage.chooseCategory();
        loginPage.login();
        helper.waitForPageToLoad();
        postAnAddPage.chooseBicycleCategory();
        String url = driver.getCurrentUrl();
        Assert.assertEquals("URL should match expected" ,"https://profile.stg.polovni.dev/bicikli");
    }

    @Test
    public void testAddBicycle () {
        testChooseBicycleCategory();
        helper.waitForPageToLoad();
        addBicyclePage.fillAddBicycleForm();
        // Add assertions here to verify the outcome
    }
}
