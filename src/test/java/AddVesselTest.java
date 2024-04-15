import org.example.helper.Helper;
import org.example.pageObjects.AddVesselPage;
import org.example.pageObjects.ChooseCategoryPage;
import org.example.pageObjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class AddVesselTest extends BaseTest{

    @Test
    public void chooseVessels () {
        ChooseCategoryPage postAnAddPage = new ChooseCategoryPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Helper helper = new Helper(driver);
        postAnAddPage.chooseCategory();
        loginPage.login();
        helper.waitForPageToLoad();
        postAnAddPage.chooseVesselsCategory();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url ,"https://profile.stg.polovni.dev/plovila");
    }

    @Test
    public void addVessel () {
        AddVesselPage addVesselsPage = new AddVesselPage(driver);
        Helper helper = new Helper(driver);
        chooseVessels();
        helper.waitForPageToLoad();
        addVesselsPage.fillAddVesselsForm();
    }

}
