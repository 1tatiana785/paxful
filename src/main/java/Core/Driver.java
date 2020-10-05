package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

final public class Driver {

    private static WebDriver driver;
    private Driver() {
    }

    public static WebDriver InitialDriver(String typeDriver) {

        if (driver == null) {
            switch (typeDriver) {
                case "Firefox":
                    System.setProperty("webdriver.gecko.driver", "C:\\_projects\\testSelenium\\drivers\\geckodriver.exe");
                    driver = new FirefoxDriver(new FirefoxOptions());
            break;
            }
        }
        return driver;
    }
}