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
        long id = Thread.currentThread().getId(); // parallel tests
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
        System.out.println(mainPage.getTitle());
       // Assert.assertEquals(mainPage.getTitle(), Constants.mainPageTitle);
    }

    @Test(priority = 1, description = "verifying logo test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Test verify logo test")
    @Story("Story Name: To check logo test")
    @Feature("Validate logo")
    public void checkLogoTest() {
        Assert.assertEquals(mainPage.checkLogo(), true);
       // System.out.println(mainPage.getLogo());
    }

    @Test(priority = 3, description = "verifying search field test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Test verify search field test")
    @Story("Story Name: Use search field test")
    @Feature("Validate search field")
    public void mainPageSearchTest() {
        mainPage.typeSearchField("!!!!!!!!!!!");
        mainPage.clearSearchField();
        mainPage.clickSearchButton("news");
    }

/*    @AfterTest                              // запускаеться после каждого тестового метода
       }*/

    @AfterClass                             // виполнится после выполнения всех методов
    public void tearDown() { InitialDriver.quite();
    }
}