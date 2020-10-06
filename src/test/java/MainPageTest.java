import Core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class MainPageTest {

    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();
    /*@BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp() {
       }
      */

    @Test
    public void maimPageTest() {

        mainPage.startPage();
        mainPage.typeSearchField("text11");
        mainPage.clearSearchField();
        Driver.getDriver().navigate().refresh();
        //mainPage.clickMailLink();
       //mainPage.clickSearchButton();
        //searchPage.getTitleText();

        Driver.getDriver().navigate ().back ();

        /*String actualeText = mainPage.getTitleText();
        assertEquals(actualeText, "Yahoo!");*/
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
