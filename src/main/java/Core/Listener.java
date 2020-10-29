package Core;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Listener implements ITestListener {
    private static String getMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    //Text attachment for Allure
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    // Text attachment for Allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    //HTML attachment for Allure
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("OnStart method called " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", InitialDriver.getDriver());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("OnFinish method called " + iTestContext.getName());
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("OnTestStart method called " + getMethodName(iTestResult) + " start");
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("OnTestSuccess method called " + getMethodName(arg0) + " Passed");
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        System.out.println("OnTestFailure method Called " + getMethodName(arg0) + " Failed");
        //Get driver from InitialDriver and assign to local webDriver variable.
        Object testClass = arg0.getInstance();
        WebDriver driver = InitialDriver.getDriver();

        //Allure ScreenshotRobot and SaveRTestingLog
        if (driver instanceof WebDriver) {
            System.out.println("Screenshot captured for test case: " + getMethodName(arg0));
            saveScreenshotPNG(driver);
            //Take screenshot
           String base64 = ((TakesScreenshot) InitialDriver.getInstance().getDriver()).getScreenshotAs(OutputType.BASE64);
           byte[] screenShot = ((TakesScreenshot) InitialDriver.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
            // Allure.addAttachment("Any Name", new ByteArrayInputStream(((TakesScreenshot)InitialDriver.getDriver()).getScreenshotAs(OutputType.BYTES)));
            Allure.getLifecycle().addAttachment(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy_hh:mm:ss")), "image/png", "png", screenShot);

        }
        //Save a log on allure
        saveTextLog(getMethodName(arg0) + " failed and screenshot taken!");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("OnTestSkipped method Called " + getMethodName(iTestResult) + " skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getMethodName(iTestResult));
    }
}