import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CreateAccountPage;
import pages.EnterPasswordPage;
import pages.MainPage;
import pages.SignInPage;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\_projects\\testSelenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://login.yahoo.com/");

        MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        EnterPasswordPage enterPasswordPage = PageFactory.initElements(driver,EnterPasswordPage.class);

        mainPage.clickLogIn();
        signInPage.singInNext("t_test_t@yahoo.com");
        enterPasswordPage.passwordClickNext("test123456789");
        // createAccountPage.register("hh","jjj","anastasiia.filon@paxful.com", "hhh", "9999", "44", "1990", "ghl");
    }
}
