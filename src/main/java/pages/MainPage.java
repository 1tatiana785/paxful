package pages;

import Core.Driver;
import Core.WebElment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private By searchField = By.id("ybar-sbq");
    private By signInButton = By.id("login-signin");
    private By titleText = By.xpath("//title[text()='Yahoo']");
    private WebDriver driver;
    WebElment element = new WebElment();

    public void MainPage() {
        this.driver = Driver.InitialDriver("Firefox");
    }

    public String getTitleText() {
        String text = element.watVisibve(titleText).getText();
        return text;
    }

    public void click() {
        driver.findElement(searchField).click();
    }

    public SignInPage clickLogIn() {
        driver.findElement(signInButton).click();
        return new SignInPage();
    }

}
