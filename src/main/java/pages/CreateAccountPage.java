package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

    @FindBy(id = "usernamereg-firstName")
    private WebElement firstNameField;
    @FindBy (id = "usernamereg-lastName")
    private WebElement lastNameField;
    @FindBy (id = "usernamereg-yid")
    private WebElement emailNameField;
    @FindBy (id = "usernamereg-password")
    private WebElement passwordField;
    @FindBy (id = "usernamereg-phone")
    private WebElement phoneField;
    @FindBy (id = "register_password")
    private WebElement birthmonthField;
    @FindBy (id = "usernamereg-day")
    private WebElement dayField;
    @FindBy (id = "usernamereg-year")
    private WebElement yearField;
    @FindBy (id = "usernamereg-freeformGender")
    private WebElement genderField;
    @FindBy (id = "reg-submit-button")
    private WebElement continueButton;

    private WebDriver driver;
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }


    public CreateAccountPage typeFirstName (String firstname) {
        firstNameField.sendKeys("");
        return this;
    }
    public CreateAccountPage typeLastName (String lastname) {
        lastNameField.sendKeys("");
        return this;
    }
    public CreateAccountPage typeEmail (String email) {
        emailNameField.sendKeys("");
        return this;
    }
    public CreateAccountPage typePassword (String password) {
        passwordField.sendKeys("");
        return this;
    }
    public CreateAccountPage typePhone (String phone) {
        phoneField.sendKeys("");
        return this;
    }
    public CreateAccountPage typeDay (String day) {
        dayField.sendKeys("");
        return this;
    }
    public CreateAccountPage typeYear (String year) {
        yearField.sendKeys("");
        return this;
    }
    public CreateAccountPage typeGender (String gender) {
        genderField.sendKeys("");
        return this;
    }
    public CreateAccountPage clickContinue () {
        continueButton.click();
        return new CreateAccountPage(driver);
    }
    public CreateAccountPage register (String firstname, String lastname, String email, String password, String phone, String day, String year, String gender){
        this.typeFirstName (firstname);
        this.typeLastName (lastname);
        this.typeEmail (email);
        this.typePassword (password);
        this.typePhone (phone);
        this.typeDay (day);
        this.typeYear (year);
        this.typeGender (gender);
        this.clickContinue();
        return new CreateAccountPage(driver);
    }
}