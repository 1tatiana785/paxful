import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

        private By createAccountButton = By.xpath("//a[@class ='btn btn-secondary d-none d-xl-flex ']");
        private By logInButton = By.xpath("//a[@class ='c-header__menu-link c-header__auth-link d-none d-xl-block']");

        public CreateAccountPage clickCreateAccount() {
            driver.findElement(createAccountButton).click();
            return new CreateAccountPage(driver);
        }

        public SignInPage clickLogIn() {
            driver.findElement(logInButton).click();
            return new SignInPage(driver);
        }
}


/*
        WebElement username = driver.findElement(By.id("register_email"));
        username.sendKeys("anastasiia.filon@paxful.com");
        WebElement password = driver.findElement(By.id("register_password"));
        password.sendKeys("Anastasia_11");
        WebElement button1 = driver.findElement(By.xpath("//button/span[text() = 'Create Paxful account']"));
        button1.submit();

 */

