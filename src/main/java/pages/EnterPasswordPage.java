package pages;

import Core.Driver;
import org.openqa.selenium.By;

public class EnterPasswordPage {

    private By passwordField = By.id("login-passwd");
    private By nextButton = By.id("login-signin");
    private By forgotPasswordLink = By.id("mbr-forgot-link");


    public EnterPasswordPage typePassword(String password) {
        Driver.getDriver().findElement(passwordField).sendKeys("test123456789");
        return this;
    }

    public MainPage passwordClickNext(String password) {
        this.typePassword(password);
        Driver.getDriver().findElement(nextButton).click();
        return new MainPage();
    }
}