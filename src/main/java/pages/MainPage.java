package pages;

import Core.InitialDriver;
import Core.WebElment;
import org.openqa.selenium.By;


public class MainPage {

    private By searchField = By.id("ybar-sbq");
    private By searchButton = By.className("rapid-noclick-resp");
    private By signInButton = By.linkText("Sign in");
    private By titleText = By.xpath("//title[text()='Yahoo']");
    private By mailLink = By.className("_yb_1qge5 ");
    private By coronavirusLink = By.partialLinkText("Coronavirus");
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
    private By loginNameLink = By.className("rapid-nonanchor-lt _yb_eun8m");    //By.xpath("//input[@id='ybarAccountMenu']");
    private By emailLoginName = By.className("_yb_1611y");

    WebElment element = new WebElment();

    public MainPage getTitle() {
        InitialDriver.getDriver().getTitle();
        return this;
    }

    /*public String getTitleText() {
        String text =element.watVisibility(titleText).getText();
        return text;
    }*/

    public void startPage() {
        InitialDriver.getDriver().get("http://yahoo.com/");
    }

    public void clickLogIn() {
        InitialDriver.getDriver().findElement(signInButton).click();
    }

    public void clickLoginNameLink() {
        InitialDriver.getDriver().findElement(loginNameLink).click();
    }

    public boolean getEmailLoginName() {
        InitialDriver.getDriver().findElement(emailLoginName).getText();
        return true;
    }


    public MainPage typeSearchField(String text) {
        InitialDriver.getDriver().findElement(searchField).sendKeys(text);
        return this;
    }

    public void clickSearchButton(String text) {
        typeSearchField(text);
        InitialDriver.getDriver().findElement(searchButton).submit();
    }

    public MainPage clearSearchField() {
        InitialDriver.getDriver().findElement(searchField).clear();
        return this;
    }
    public void clickCoronavirusLink() {
        InitialDriver.getDriver().findElement(coronavirusLink).click();
    }

    public void clickNewsLink() {
        InitialDriver.getDriver().findElement(newsLink).click();
    }

    public void clickFinanceLink() {
        InitialDriver.getDriver().findElement(financeLink).click();
    }

    public void clickSportsLink() {
        InitialDriver.getDriver().findElement(sportsLink).click();
    }

    public void clickElectionLink() {
        InitialDriver.getDriver().findElement(electionLink).click();
    }

    public void clickBlmLink() {
        InitialDriver.getDriver().findElement(blmLink).click();
    }

    public void clickEntertainmentLink() {
        InitialDriver.getDriver().findElement(entertainmentLink).click();
    }

    public void clickLifeLink() { InitialDriver.getDriver().findElement(lifeLink).click(); }

    public void clickShoppingLink() {
        InitialDriver.getDriver().findElement(shoppingLink).click();
    }

    public void clickPremiumOffersLink() {
        InitialDriver.getDriver().findElement(premiumOffersLink).click();
    }

    public void clickMoreLink() {
        InitialDriver.getDriver().findElement(moreLink).click();
    }

    public void clickMailLink() {
        InitialDriver.getDriver().findElement(mailLink).click();
    }


}
