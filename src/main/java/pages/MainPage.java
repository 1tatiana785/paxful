package pages;

import Core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private By searchField = By.id("ybar-sbq");
    private By signInButton = By.id("login-signin");
    private By titleText = By.xpath("//title[text()='Yahoo']");
    private WebDriver driver;

    public void MainPage() {
        this.driver = Driver.InitialDriver();
    }

    public MainPage titleText() {
        driver.findElement(titleText).getText();
        return this;
    }

    public CreateAccountPage click() {
        driver.findElement(searchField).click();
        return new CreateAccountPage(driver);
    }

    public SignInPage clickLogIn() {
        driver.findElement(signInButton).click();
        return new SignInPage();
    }

}
