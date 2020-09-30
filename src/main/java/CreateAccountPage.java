import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userNameField = By.id("register_email");
    private By passwordField = By.id("register_password");
    private By createAccountButton = By.xpath("//button/span[text() = 'Create Paxful account']");

    public CreateAccountPage typeUserName (String username) {
        driver.findElement(userNameField).sendKeys("anastasiia.filon@paxful.com");
        return this;
    }
    public CreateAccountPage typePassword (String password) {
        driver.findElement(passwordField).sendKeys("Anastasia_11");
        return this;
    }
    public CreateAccountPage clickCreateAccount() {
        driver.findElement(createAccountButton).click();
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage register (String username, String password){
        this.typeUserName(username);
        this.typePassword(password);
        this.clickCreateAccount();
        return new CreateAccountPage(driver);
    }
}
