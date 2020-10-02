package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy (name = "username")
    private WebElement userNameField;
    @FindBy (name = "signin")
    private WebElement nextButton;
    @FindBy (id = "createacc")
    private WebElement createAccountButton;

    private WebDriver driver;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    public SignInPage typeUserName(String username) {
        userNameField.sendKeys("t_test_t@yahoo.com");
        return this;
    }
    public SignInPage clickCreateAccount() {
        createAccountButton.click();
        return new SignInPage (driver);
    }
    public SignInPage singInNext (String username) {
        this.typeUserName (username);
        nextButton.click();
        return new SignInPage(driver);
    }
}