package pages;

import Core.InitialDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchPage {
    private By searchField = By.id("ybar-sbq");
    private By searchButton = By.className("rapid-noclick-resp _yb_bx4y3");
    private By signInButton = By.id("login-signin");

    @Step("getting search page title step ...")
    public String getTitleText() {
        String text = InitialDriver.getDriver().getTitle();
        return text;
    }
}
