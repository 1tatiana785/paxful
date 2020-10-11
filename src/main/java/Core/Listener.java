package Core;

import org.openqa.selenium.WebDriver;
import org.testng.*;


public class Listener implements ITestListener {

    private static String getMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("OnStart method Called " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", InitialDriver.getDriver());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("OnFinish method Called " + iTestContext.getName());
        //Do tier down operations for extentreports reporting!
//        Reports.start_test();
//        Reports.end_report();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("OnTestStart method Called " + getMethodName(iTestResult) + " start");
        //System.out.println("OnTestStart method Called");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("OnTestSuccess method Called " + getMethodName(iTestResult) + " Passed");
  /*      //ExtentReports log operation for passed tests.
        Reports.start_test().log(Status.PASS, "Test passed");*/
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("OnTestFailure method Called " + getMethodName(iTestResult) + " Failed");
/*//Get driver from BaseTest and assign to local webDriver variable.
        Object testClass = iTestResult.getInstance();
        WebDriver webDriver = driver;//Take base64Screenshot screenshot.
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) webDriver).
        getScreenshotAs(OutputType.BASE64);
        //ExtentReports log and screenshot operations for failed tests.
        Reports.start_test().log(Status.FAIL, "Test Failed");*/
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("OnTestSkipped method Called " + getMethodName(iTestResult) + " skipped");
    /*  //ExtentReports log operation for skipped tests.
        Reports.start_test().log(Status.SKIP, "Test Skipped");*/
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getMethodName(iTestResult));
            /*public void onException(Throwable error, WebDriver driver) {
        System.out.println("Exception occured: " + error);
        try {
        TestUtil.takeScreenshotAtEndOfTest();
        } catch (IOException e) {
        e.printStackTrace();
        }*/
    }

}