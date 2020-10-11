import Core.InitialDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MainPageTest {

    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();
    private SignInPage signInPage = new SignInPage();
    private EnterPasswordPage enterPasswordPage = new EnterPasswordPage();


    /*@BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp() {}*/

    //allure serve C:\_projects\testPaxful\allure-results /// see report

    @Test
    public void logIn() {
        mainPage.startPage();
        mainPage.clickLogIn();
        signInPage.singInNext("t_test_t@yahoo.com");
        enterPasswordPage.clickVisibilityButton();
        enterPasswordPage.passwordClickNext("test123456789");
    }

    @Test
    public void mainPageSearchTest() {
        mainPage.startPage();
        mainPage.getTitle();
        System.out.println(mainPage.getTitle());
        mainPage.typeSearchField("!!!!!!!!!!!");
        mainPage.clearSearchField();
        mainPage.clickSearchButton("news");
        InitialDriver.getDriver().navigate().back();
    }


    /*mainPage.clickLoginNameLink();
        assertEquals(mainPage.getEmailLoginName(), "t_test_t");
        InitialDriver.getDriver().navigate().refresh();
        MainPage title = mainPage.getTitle();
        System.out.println(title);
        MainPage title1 = mainPage.;
        assertEquals(mainPage.getTitle(), title);*/

    /*  @BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setUp (){}

    @AfterTest                              // запускаеться после каждого тестового метода
    public void teardown(){   }

    @AfterClass                              // виполнится после выполнения всех методов
    public void afterClassMethod() { driver.quit();}*/

}