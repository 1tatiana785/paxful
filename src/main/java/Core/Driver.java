package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

final public class Driver {

   private static WebDriver driver;

   private Driver() {}

   public static WebDriver InitialDriver(String typeDriver){
       if (driver == null) {
           switch (typeDriver) {
               case "Chrome":
                  // new ChromeDriver(new ChromeOptions());
           }
       }
       return driver;
   }
}