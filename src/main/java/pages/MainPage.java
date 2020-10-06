package pages;

import Core.Driver;
import Core.WebElment;
import org.openqa.selenium.By;

public class MainPage {

    private By searchField = By.id("ybar-sbq");
    private By searchButton = By.className("rapid-noclick-resp _yb_bx4y3");
    private By signInButton = By.id("login-signin");
    private By titleText = By.xpath("//title[text()='Yahoo']");
    private By mailLink = By.linkText(" Mail ");
    private By coronavirusLink = By.linkText(" Coronavirus  ");
    private By newsLink = By.linkText(" News  ");
    private By financeLink = By.linkText(" Finance  ");
    private By sportsLink = By.linkText(" Sports  ");
    private By electionLink = By.linkText(" 2020 Election  ");
    private By blmLink = By.linkText(" BLM  ");
    private By entertainmentLink = By.linkText(" Entertainment  ");
    private By lifeLink = By.linkText(" Life  ");
    private By shoppingLink = By.linkText("Shopping  ");
    private By premiumOffersLink = By.linkText(" Premium Offers  ");
    private By moreLink = By.linkText(" More...  ");


    WebElment element = new WebElment();

    /*public String getTitleText() {
        String text = element.watVisibility(titleText).getText();
        return text;
    }*/

    public void startPage () {
        Driver.getDriver().get("http://yahoo.com/");
    }

    public MainPage typeSearchField(String text) {
        Driver.getDriver().findElement(searchField).sendKeys("text");
        return this;
    }
    public MainPage clearSearchField() {
        Driver.getDriver().findElement(searchField).clear();
        return this;
    }

    public SearchPage clickSearchButton() {
        Driver.getDriver().findElement(searchButton).click();
        return new SearchPage();
    }

    public MainPage clickMailLink() {
        Driver.getDriver().findElement(mailLink).click();
        return this;
    }

    public void clickCoronavirusLink() {
        Driver.getDriver().findElement(coronavirusLink).click();
    }

    public void clickNewsLink() {
        Driver.getDriver().findElement(newsLink).click();
    }

    public void clickFinanceLink() {
        Driver.getDriver().findElement(financeLink).click();
    }

    public void clickSportsLink() {
        Driver.getDriver().findElement(sportsLink).click();
    }

    public void clickElectionLink() {
        Driver.getDriver().findElement(electionLink).click();
    }

    public void clickBlmLink() {
        Driver.getDriver().findElement(blmLink).click();
    }

    public void clickEntertainmentLink() {
        Driver.getDriver().findElement(entertainmentLink).click();
    }

    public void clickLifeLink() {
        Driver.getDriver().findElement(lifeLink).click();
    }

    public void clickShoppingLink() {
        Driver.getDriver().findElement(shoppingLink).click();
    }

    public void clickPremiumOffersLink() {
        Driver.getDriver().findElement(premiumOffersLink).click();
    }

    public void clickMoreLink() {
        Driver.getDriver().findElement(moreLink).click();
    }

    public SignInPage clickLogIn() {
        Driver.getDriver().findElement(signInButton).click();
        return new SignInPage();
    }
}
