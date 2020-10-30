package pages;

import Core.InitialDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SignInPage {

    private By userNameField = By.name("username");
    private By nextButton = By.name("signin");
    private By createAccountButton = By.id("createacc");

    @Step("set username: {0} step ...")
    public void singInNext(String username) {
        InitialDriver.getDriver().findElement(userNameField).sendKeys("t_test_t@yahoo.com");
        InitialDriver.getDriver().findElement(nextButton).click();
    }
}