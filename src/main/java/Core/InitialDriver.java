package Core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

final public class InitialDriver {

    private static final ThreadLocal<InitialDriver> driverThread = new ThreadLocal<>();
    private static WebDriver driver = null;

    public static InitialDriver getInstance() {
        if (driverThread.get() == null) {
            synchronized (InitialDriver.class) {
                driverThread.set(new InitialDriver());
            }
        }
        return driverThread.get();
    }

    private InitialDriver() {
    }

    public static WebDriver getDriver() {
        //singleton pattern
        if (driver == null) {
            if (Constants.browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\_projects\\testPaxful\\drivers\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);

            } else if (Constants.browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\_projects\\testPaxful\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver(new FirefoxOptions());
            }
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(Constants.url);
        }
        return driver;
    }

    public static void quite() {
        System.out.println("Quitting the browser");
        driver.quit();
        driver = null;
    }

    public static void close() {
        System.out.println("Closing the browser");
        driver.close();
        driver = null;
    }
}