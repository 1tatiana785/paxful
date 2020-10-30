package pages;

import Core.InitialDriver;
import Core.WebElment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class EnterPasswordPage {

    private By passwordField = By.xpath("//div[@id='password-container']/input[@id='login-passwd']");
    private By nextButton = By.id("login-signin");
    private By visibilityButton = By.xpath("//button[@id='password-toggle-button']");
    private By forgotPasswordLink = By.id("mbr-forgot-link");

    WebElment element = new WebElment();

    @Step("click visibility button step ...")
    public void clickVisibilityButton() {
        InitialDriver.getDriver().findElement(visibilityButton).click();
    }

    @Step("type password: {0} step ...")
    public EnterPasswordPage typePassword(String password) {
        element.watClick(passwordField).click();
        InitialDriver.getDriver().findElement(passwordField).sendKeys("test123456789");
        return this;
    }

    @Step("click enter password page next button step ...")
    public void passwordClickNext(String password) {
        InitialDriver.getDriver().findElement(visibilityButton).click();
        typePassword(password);
        InitialDriver.getDriver().findElement(nextButton).click();
    }
}