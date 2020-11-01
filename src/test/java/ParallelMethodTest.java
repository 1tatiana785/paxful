import Core.Constants;
import Core.InitialDriver;
import Core.Listener;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

import java.lang.ref.PhantomReference;

@Listeners({Listener.class})
public class ParallelMethodTest {

    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();
    private SignInPage signInPage = new SignInPage();
    private EnterPasswordPage enterPasswordPage = new EnterPasswordPage();


    //allure serve C:\_projects\testPaxful\allure-results          /// see report
    // mvn clean test
    @BeforeClass
    public void setUp() {
        long id = Thread.currentThread().getId();
        System.out.println("Before class-method. Thread id is: " + id);// parallel tests
        InitialDriver.getDriver();
    }

/*    @BeforeTest                           //  запускаеться перед каждым тестовым методом
    public void setExtent() {
    }*/

    @Test(priority = 2, description = "verifying login test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Test verify login test")
    @Story("Story Name: To check login functionality")
    @Feature("Login")
    public void logIn() {
        long id = Thread.currentThread().getId();
        System.out.println("Verifying login test. Thread id is: " + id);
        mainPage.clickLogIn();
        signInPage.singInNext("t_test_t@yahoo.com");
        enterPasswordPage.clickVisibilityButton();
        enterPasswordPage.passwordClickNext("test123456789");
        mainPage.getLoginNameLink();
        System.out.println("Login name is " + mainPage.getLoginNameLink());
        Assert.assertEquals(mainPage.getLoginNameLink(), "test123");
    }

    @Test(priority = 1, description = "verifying title test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Test verify title test")
    @Story("Story Name: To check title test")
    @Feature("Validate title")
    public void mainPageTitle() {
        long id = Thread.currentThread().getId();
        System.out.println("Verifying title test. Thread id is: " + id);
        System.out.println(mainPage.getTitle());
       // Assert.assertEquals(mainPage.getTitle(), Constants.mainPageTitle);
    }

    @Test(priority = 1, description = "Check logo test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Test chack logo test")
    @Story("Story Name: To check logo test")
    @Feature("Check logo")
    public void checkLogoTest() {
        long id = Thread.currentThread().getId();
        System.out.println("Check logo test. Thread id is: " + id);
        Assert.assertEquals(mainPage.checkLogo(), true);
       // System.out.println(mainPage.getLogo());
    }

    @Test(priority = 3, description = "verifying search field test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Test verify search field test")
    @Story("Story Name: Use search field test")
    @Feature("Validate search field")
    public void mainPageSearchTest() {
        long id = Thread.currentThread().getId();
        System.out.println("Verifying search field test. Thread id is: " + id);
        mainPage.typeSearchField("!!!!!!!!!!!");
        mainPage.clearSearchField();
        mainPage.clickSearchButton("news");
    }

/*    @AfterTest                              // запускаеться после каждого тестового метода
       }*/

    @AfterClass                             // виполнится после выполнения всех методов
    public void tearDown() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id);
        InitialDriver.quite();
    }
}