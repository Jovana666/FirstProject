import org.example.helper.Helper;
import org.junit.Test;
import org.example.pageObjects.LoginPage;
import org.example.pageObjects.PostAnAddPage;

public class ChooseCarCategoryTest extends BaseTest{
    @Test
    //flaky
    public void chooseCar() {
        PostAnAddPage postAnAddPage = new PostAnAddPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Helper helper = new Helper(driver);
        postAnAddPage.chooseCategory();
        loginPage.login();
        helper.waitForPageToLoad();
        postAnAddPage.chooseCarCategory();
    }
}
