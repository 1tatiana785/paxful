package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

final public class Driver {

    private static WebDriver driver;

    private Driver() {
    }

    private void InitialDriver () {
        String typeDriver = "Firefox";
        if (driver == null) {
            switch (typeDriver) {
                case "Firefox": {
                    System.setProperty("webdriver.gecko.driver", "C:\\_projects\\testSelenium\\drivers\\geckodriver.exe");
                    driver = new FirefoxDriver(new FirefoxOptions());
                    break;
                }
                case "CHROME": {
                    System.setProperty("webdriver.chrome.driver", "C:\\_projects\\testSelenium\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver(new ChromeOptions());
                    break;
                }
            }
        }
        this.driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}