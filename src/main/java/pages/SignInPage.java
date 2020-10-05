package pages;

import Core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private By userNameField = By.name("username");
    private By nextButton = By.name("signin");
    private By createAccountButton = By.id("createacc");

    private WebDriver driver;

    public void SignInPage() {
        this.driver = Driver.InitialDriver("Firefox");
    }

    public SignInPage typeUserName(String username) {
        driver.findElement(userNameField).sendKeys("t_test_t@yahoo.com");
        return this;
    }

    /*public SignInPage clickCreateAccount() {
        driver.findElement(createAccountButton).click();
        return ;
    }

     */

    public EnterPasswordPage singInNext(String username) {
        this.typeUserName(username);
        driver.findElement(nextButton).click();
        return new EnterPasswordPage();
    }
}