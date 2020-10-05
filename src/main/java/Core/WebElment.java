package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElment {

    WebDriver driver = Driver.InitialDriver("Firefox");

    public WebDriverWait waitEl() {
        WebDriverWait waitE = new WebDriverWait(driver, 30);
        waitE.ignoring(NoSuchElementException.class);
        return waitE;
    }
    public WebElement watVisibve(By locator) {
        return waitEl().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement watClick(By locator) {
        return waitEl().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement watClick(WebElement element) {
        return waitEl().until(ExpectedConditions.elementToBeClickable(element));
    }


}
