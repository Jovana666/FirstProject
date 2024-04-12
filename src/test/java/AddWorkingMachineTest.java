import org.example.helper.Helper;
import org.example.pageObjects.AddMotorcyclePage;
import org.example.pageObjects.ChooseCategoryPage;
import org.example.pageObjects.LoginPage;
import org.example.pageObjects.WorkingMachinesPage;
import org.junit.Assert;
import org.junit.Test;

public class AddWorkingMachineTest extends BaseTest{

    @Test

    public void chooseWorkingMachine () {
        ChooseCategoryPage postAnAddPage = new ChooseCategoryPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Helper helper = new Helper(driver);
        postAnAddPage.chooseCategory();
        loginPage.login();
        helper.waitForPageToLoad();
        postAnAddPage.chooseWorkingMachinesCategory();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url ,"https://profile.stg.polovni.dev/radne-masine");
    }

    @Test
    public void addWorkingMachine () {
        WorkingMachinesPage workingMachinesPage = new WorkingMachinesPage(driver);
        Helper helper = new Helper(driver);
        chooseWorkingMachine();
        helper.waitForPageToLoad();
        workingMachinesPage.fillAddWorkingMachineForm();
        //workingMachinesPage.verifyAddCreated();
        //helper.waitForPageToLoad();
        //String url = driver.getCurrentUrl();
        //Assert.assertEquals(url ,"https://public.stg.polovni.dev/radne-masine-delovi/9592/oglas1");

    }
}
