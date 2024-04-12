import org.example.helper.Helper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;

    private static final String APP_URL = "https://public.stg.polovni.dev/";


    @Before
    public void launchApplication (){
        setChromeDriverProperty();
        driver = new ChromeDriver();
        driver.get(APP_URL);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser (){
        driver.quit();
    }

    private static void setChromeDriverProperty (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inspira\\IdeaProjects\\FirstProject\\src\\main\\resources\\chromedriver.exe");
    }
}
