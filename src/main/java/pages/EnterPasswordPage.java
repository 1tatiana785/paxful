package pages;

import Core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterPasswordPage {

    private By passwordField = By.id("login-passwd");
    private By nextButton = By.id("login-signin");
    private By forgotPasswordLink = By.id("mbr-forgot-link");
    private WebDriver driver;

    public void EnterPasswordPage() {
        this.driver = Driver.InitialDriver("Firefox");
    }

    public EnterPasswordPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys("test123456789");
        return this;
    }

    public MainPage passwordClickNext(String password) {
        this.typePassword(password);
        driver.findElement(nextButton).click();
        return new MainPage();
    }
}