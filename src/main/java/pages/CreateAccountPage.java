package pages;

import Core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private By firstNameField=By.id("usernamereg-firstName");
    private By lastNameField =By.id("usernamereg-lastName");
    private By emailNameField= By.id("usernamereg-yid");
    private By passwordField =By.id("usernamereg-password");
    private By phoneField=By.id("usernamereg-phone");
    private By birthmonthField=By.id("register_password");
    private By dayField = By.id("usernamereg-day");
    private By yearField =By.id("usernamereg-year");
    private By genderField =By.id("usernamereg-freeformGender");
    private By continueButton=By.id("reg-submit-button");

    private WebDriver driver;
    public void CreateAccountPage() {
        this.driver = Driver.InitialDriver("Firefox");
    }

    public CreateAccountPage(WebDriver driver) {this.driver = driver;
    }

    public CreateAccountPage typeFirstName (String firstname) {
        driver.findElement(firstNameField).sendKeys("");
        return this;
    }
    public CreateAccountPage typeLastName (String lastname) {
        driver.findElement(lastNameField).sendKeys("");
        return this;
    }
    public CreateAccountPage typeEmail (String email) {
        driver.findElement(emailNameField).sendKeys("");
        return this;
    }
    public CreateAccountPage typePassword (String password) {
        driver.findElement(passwordField).sendKeys("");
        return this;
    }
    public CreateAccountPage typePhone (String phone) {
        driver.findElement(phoneField).sendKeys("");
        return this;
    }
    public CreateAccountPage typeDay (String day) {
        driver.findElement(dayField).sendKeys("");
        return this;
    }
    public CreateAccountPage typeYear (String year) {
        driver.findElement(yearField).sendKeys("");
        return this;
    }
    public CreateAccountPage typeGender (String gender) {
        driver.findElement(genderField).sendKeys("");
        return this;
    }
    public CreateAccountPage clickContinue () {
        driver.findElement(continueButton).click();
        return this;
    }

    /*
    public NewAccountPage register (String firstname, String lastname, String email, String password, String phone, String day, String year, String gender){
        this.typeFirstName (firstname);
        this.typeLastName (lastname);
        this.typeEmail (email);
        this.typePassword (password);
        this.typePhone (phone);
        this.typeDay (day);
        this.typeYear (year);
        this.typeGender (gender);
        this.clickContinue();
        return new NewAccountPage();
    }

     */

}