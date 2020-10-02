package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {


    @FindBy (id = "ybar-sbq")
    private WebElement searchField;

    @FindBy (id = "login-signin")
    private WebElement signInButton;
    @FindBy (className = "_yb_quxea _yb_47iry")
    private WebElement mainText;

    private WebDriver driver;
        public MainPage(WebDriver driver) {
        this.driver = driver;
        }

        public MainPage header(){
            mainText.getText();
            return this;
        }

        public CreateAccountPage click () {
            searchField.click();
            return new CreateAccountPage(driver);
        }

        public SignInPage clickLogIn() {
            signInButton.click();
            return new SignInPage(driver);
        }

}
