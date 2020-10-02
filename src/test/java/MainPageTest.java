import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.MainPage;
import pages.SignInPage;
import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeClass                            // виполнится перед выполнением всех методов
    public void beforeClassMethod() {
        System.setProperty("webdriver.gecko.driver", "C:\\_projects\\testSelenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yahoo.com/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void signIn() {
       System.out.println("aaa");
       Boolean heading = mainPage.equals("Yahoo");

      //SignInPage signInPage = mainPage.clickLogIn();

    }

    @AfterClass                              // виполнится после выполнения всех методов
    public void afterClassMethod (){
        driver.quit();
    }
}






/*
/*@BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp (){}

     @AfterTest                              // запускаеться после каждого тестового метода

    public void teardown(){
    }


 */
