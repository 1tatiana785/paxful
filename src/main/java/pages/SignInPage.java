package pages;

import Core.Driver;
import org.openqa.selenium.By;

public class SignInPage {

    private By userNameField = By.name("username");
    private By nextButton = By.name("signin");
    private By createAccountButton = By.id("createacc");

    public SignInPage typeUserName(String username) {
        Driver.getDriver().findElement(userNameField).sendKeys("t_test_t@yahoo.com");
        return this;
    }

    /*public SignInPage clickCreateAccount() {
        Driver.getDriver().findElement(createAccountButton).click();
        return ;
    }   */

    public EnterPasswordPage singInNext(String username) {
        this.typeUserName(username);
        Driver.getDriver().findElement(nextButton).click();
        return new EnterPasswordPage();
    }
}