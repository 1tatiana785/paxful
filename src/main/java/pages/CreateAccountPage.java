package pages;

import Core.InitialDriver;
import org.openqa.selenium.By;

public class CreateAccountPage {

    private By firstNameField = By.id("usernamereg-firstName");
    private By lastNameField = By.id("usernamereg-lastName");
    private By emailNameField = By.id("usernamereg-yid");
    private By passwordField = By.id("usernamereg-password");
    private By phoneField = By.id("usernamereg-phone");
    private By birthMonthField = By.id("register_password");
    private By dayField = By.id("usernamereg-day");
    private By yearField = By.id("usernamereg-year");
    private By genderField = By.id("usernamereg-freeformGender");
    private By continueButton = By.id("reg-submit-button");


    public void typeFirstName(String firstname) {
        InitialDriver.getDriver().findElement(firstNameField).sendKeys("");
    }

    public CreateAccountPage typeLastName(String lastname) {
        InitialDriver.getDriver().findElement(lastNameField).sendKeys("");
        return this;
    }

    public CreateAccountPage typeEmail(String email) {
        InitialDriver.getDriver().findElement(emailNameField).sendKeys("");
        return this;
    }

    public CreateAccountPage typePassword(String password) {
        InitialDriver.getDriver().findElement(passwordField).sendKeys("");
        return this;
    }

    public CreateAccountPage typePhone(String phone) {
        InitialDriver.getDriver().findElement(phoneField).sendKeys("");
        return this;
    }

    public CreateAccountPage typeDay(String day) {
        InitialDriver.getDriver().findElement(dayField).sendKeys("");
        return this;
    }

    public CreateAccountPage typeYear(String year) {
        InitialDriver.getDriver().findElement(yearField).sendKeys("");
        return this;
    }

    public CreateAccountPage typeGender(String gender) {
        InitialDriver.getDriver().findElement(genderField).sendKeys("");
        return this;
    }

    public CreateAccountPage clickContinue() {
        InitialDriver.getDriver().findElement(continueButton).click();
        return this;
    }


    public void register(String firstname, String lastname, String email, String password, String phone, String day, String year, String gender) {
        typeFirstName(firstname);
        typeLastName(lastname);
        typeEmail(email);
        typePassword(password);
        typePhone(phone);
        typeDay(day);
        typeYear(year);
        typeGender(gender);
        clickContinue();

    }
}