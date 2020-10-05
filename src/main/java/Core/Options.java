package Core;

import org.openqa.selenium.chrome.ChromeOptions;

public class Options {

    public ChromeOptions ChromeOptions()
    {
       return new ChromeOptions().addArguments("driver");
    }
}
