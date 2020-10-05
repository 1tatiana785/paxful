import Core.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp() {
        this.driver = Driver.InitialDriver();
    }


    @Test
    public void signIn() {
        // assertEquals(driver.getTitle(),"Yahoo!");      /// работает

        MainPage page = new MainPage().titleText();
        assertEquals(page, "Yahoo!");
    }
}

   /* @Test
    public void click() {
        mainPage.clickLogIn();

        //SignInPage signInPage = mainPage.clickLogIn();
    }


    @AfterClass                              // виполнится после выполнения всех методов
    public void afterClassMethod() {
        // driver.quit();
    }
}






/*
/*@BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp (){}

     @AfterTest                              // запускаеться после каждого тестового метода

    public void teardown(){
    }


 */
