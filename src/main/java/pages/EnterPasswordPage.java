package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterPasswordPage {

    @FindBy(id = "login-passwd")
    private WebElement passwordField;
    @FindBy(id = "login-signin")
    private WebElement nextButton;
    @FindBy(id = "mbr-forgot-link")
    private WebElement forgotPasswordLink;

    private WebDriver driver;
    public EnterPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public EnterPasswordPage typePassword (String password){
        passwordField.sendKeys("test123456789");
        return this;
    }
    public EnterPasswordPage passwordClickNext (String password){
        this.typePassword (password);
        nextButton.click();
        return new EnterPasswordPage (driver);
    }
}