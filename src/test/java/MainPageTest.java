import Core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class MainPageTest {

    private MainPage mainPage = new MainPage();
    /*@BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp() {
       }
      */

    @Test
    public void maimPageTest() {

        mainPage.startPage("http://yahoo.com/");
        mainPage.typeSearchField("text11");
        mainPage.clickSearchButton();

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
