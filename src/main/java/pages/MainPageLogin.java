package pages;

import Core.Driver;
import org.openqa.selenium.By;

public class MainPageLogin {
    private By loginNameLink = By.className("_yb_z3kiw");
    private By emailLoginName = By.className("_yb_1611y");

    public void clickLoginNameLink() {
        Driver.getDriver().findElement(loginNameLink).click();
    }

    public boolean getEmailLoginName() {
        Driver.getDriver().findElement(emailLoginName).getText();
        return true;
    }



}
