import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\_projects\\testSelenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://paxful.com/");

        MainPage mainPage = new MainPage(driver);
        SignInPage signInPage = new SignInPage(driver);

        mainPage.clickLogIn();
        signInPage.clickLogIn1("anastasiia.filon@paxful.com", "Anastasia_11");

    }
}
