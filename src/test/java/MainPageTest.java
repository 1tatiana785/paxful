import Core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;


public class MainPageTest {

    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();
    private SignInPage signInPage = new SignInPage();
    private EnterPasswordPage enterPasswordPage = new EnterPasswordPage();
    private MainPageLogin mainPageLogin = new MainPageLogin();
    /*@BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp() {
       }*/

    @Test
    public void logIn() {

        mainPage.startPage();
        mainPage.clickLogIn();
        signInPage.singInNext("t_test_t@yahoo.com");
        enterPasswordPage.passwordClickNext("test123456789");

       // mainPage.clickLoginNameLink();

        //assertEquals(mainPage.getEmailLoginName(), "t_test_t");

    }

    /*@Test
    public void maimPageTest() {

        mainPage.startPage();

        //mainPage.typeSearchField("gg");
        //mainPage.clearSearchField();
        //  Driver.getDriver().navigate().refresh();

        //assertEquals(mainPage.getTitle(), "pages.MainPage@525575");

        mainPage.clickSearchButton("text");
        Driver.getDriver().navigate().back();
    }*/
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
