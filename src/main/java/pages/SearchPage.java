package pages;

import Core.Driver;
import org.openqa.selenium.By;

public class SearchPage {

    private By searchField = By.id("ybar-sbq");
    private By searchButton = By.className("rapid-noclick-resp _yb_bx4y3");
    private By signInButton = By.id("login-signin");


     public String getTitleText() {
        String text = Driver.getDriver().getTitle();
        return text;
    }
}
