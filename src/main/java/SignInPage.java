import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameField = By.id("login_email");
    private By passwordField = By.id("login_password");
    private By logInButton = By.xpath("//button/span[text() = 'Log in to Paxful.com']");

    public SignInPage typeUserName(String username1) {
        driver.findElement(userNameField).sendKeys("anastasiia.filon@paxful.com");
        return this;
    }

    public SignInPage typePassword(String password1) {
        driver.findElement(passwordField).sendKeys("Anastasia_11");
        return this;
    }

    public SignInPage clickLogIn1 (String username1, String password1) {
        this.typeUserName (username1);
        this.typePassword (password1);
        driver.findElement(logInButton).click();
        return new SignInPage(driver);
    }
}
