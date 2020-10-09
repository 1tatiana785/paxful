package pages;

import Core.Driver;
import org.openqa.selenium.By;

public class EnterPasswordPage {

    private By passwordField = By.name("password");
    private By nextButton = By.id("login-signin");
    private By visibilityButton = By.id("password-toggle-button");
    private By forgotPasswordLink = By.id("mbr-forgot-link");


    public void clickVisibilityButton (){
        Driver.getDriver().findElement(visibilityButton).click();
    }

    public EnterPasswordPage typePassword(String password) {
        Driver.getDriver().findElement(passwordField).sendKeys("test123456789");
        return this;
    }

    public void passwordClickNext(String password) {
        this.typePassword(password);
        Driver.getDriver().findElement(nextButton).click();
    }
}