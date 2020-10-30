package Core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Collection;

public class WebElment {
    private static Collection ignored_exeptions = Arrays.asList(
            NoSuchElementException.class,
            ElementNotVisibleException.class,
            ElementNotSelectableException.class);

    public WebDriverWait waitEl() {
        WebDriverWait waitE = new WebDriverWait(InitialDriver.getDriver(), 3000);
        waitE.ignoring(NoSuchElementException.class);
        return waitE;
    }

    public WebElement watVisibility(By locator) {
        waitEl().ignoreAll(ignored_exeptions);
        return waitEl().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement watVisibility(WebElement element) {
        waitEl().ignoreAll(ignored_exeptions);
        waitEl().until(ExpectedConditions.visibilityOfAllElements(element));
        return element;
    }

    public WebElement waitingSelect(WebElement element) {
        waitEl().until(ExpectedConditions.elementToBeSelected(element));
        waitEl().ignoreAll(ignored_exeptions);
        return element;
    }

    public WebElement waitingSelect(By locator) {
        waitEl().ignoreAll(ignored_exeptions);
        return waitEl().until(ExpectedConditions.elementToBeClickable(locator));
    }


    public WebElement watClick(By locator) {
        return waitEl().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement watClick(WebElement element) {
        return waitEl().until(ExpectedConditions.elementToBeClickable(element));
    }
}
