package pages;

import Core.InitialDriver;
import Core.WebElment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class MainPage {

    private By searchField = By.id("ybar-sbq");
    private By searchButton = By.className("rapid-noclick-resp");
    private By signInButton = By.linkText("Sign in");
    private By logo = By.xpath("//a[@id='ybar-logo']/img");
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
    private By loginNameLink = By.className("rapid-nonanchor-lt");    //By.xpath("//input[@id='ybarAccountMenu']");

    WebElment element = new WebElment();

    @Step("checking main page logo is displayed step ...")
    public boolean checkLogo() {
        element.watVisibility(logo);
        InitialDriver.getDriver().findElement(logo).isDisplayed();
        return true;
    }

    /*@Step("getting main page logo step ...")
    public String getLogo() {
        String logoLocation = InitialDriver.getDriver().findElement(logo).getText();
        return logoLocation;
    }*/


    @Step("getting main page title step ...")
    public String getTitle() {
        String text = InitialDriver.getDriver().findElement(titleText).getText();
        return text;
    }

    @Step("click signIn button step ...")
    public void clickLogIn() {
        InitialDriver.getDriver().findElement(signInButton).click();
    }

    @Step("set text in the search field step ...")
    public pages.MainPage typeSearchField(String text) {
        InitialDriver.getDriver().findElement(searchField).sendKeys(text);
        return this;
    }

    @Step("click search button step ...")
    public void clickSearchButton(String text) {
        typeSearchField(text);
        InitialDriver.getDriver().findElement(searchButton).submit();
    }

    @Step("clear search field step ...")
    public pages.MainPage clearSearchField() {
        InitialDriver.getDriver().findElement(searchField).clear();
        return this;
    }

    @Step("getting login name step ...")
    public String getLoginNameLink() {
        String text = InitialDriver.getDriver().findElement(loginNameLink).getText();
        return text;
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

    public void clickLifeLink() {
        InitialDriver.getDriver().findElement(lifeLink).click();
    }

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