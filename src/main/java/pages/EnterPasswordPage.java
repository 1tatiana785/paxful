package pages;

import Core.InitialDriver;
import Core.WebElment;
import org.openqa.selenium.By;

public class EnterPasswordPage {

    private By passwordField = By.xpath("//div[@id='password-container']/input[@id='login-passwd']");
    private By nextButton = By.id("login-signin");
    private By visibilityButton = By.xpath("//button[@id='password-toggle-button']");
    private By forgotPasswordLink = By.id("mbr-forgot-link");

    WebElment element = new WebElment();


       /*public String getTitleText() {
        String text =element.watVisibility(titleText).getText();
        return text;
    }*/

    public void clickVisibilityButton() {
        element.watClick(visibilityButton).click();
        InitialDriver.getDriver().findElement(visibilityButton).click();

    }

    public EnterPasswordPage typePassword(String password) {
        element.watClick(passwordField).click();
        InitialDriver.getDriver().findElement(passwordField).sendKeys("test123456789");
        return this;
    }

    public void passwordClickNext(String password) {
        InitialDriver.getDriver().findElement(visibilityButton).click();
        typePassword(password);
        InitialDriver.getDriver().findElement(nextButton).click();
    }
}