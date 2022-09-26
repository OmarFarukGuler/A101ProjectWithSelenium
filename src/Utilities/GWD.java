package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    public static WebDriver driver;
    public static WebDriverWait wait;

  /*  public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver= new Chr;
       return driver;
    }
*/
 static {


      Logger logger = Logger.getLogger("");
      logger.setLevel(Level.SEVERE);

      System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
      System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
      driver = new org.openqa.selenium.chrome.ChromeDriver();

      driver.get("https://www.a101.com.tr/");

      driver.manage().window().maximize(); // max
      driver.manage().deleteAllCookies();  //

      wait=new WebDriverWait(driver,Duration.ofSeconds(30));

      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bütün webElement için geçerli


    }

public static void quitDriver(){
    try {
        Thread.sleep(2);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();

}

}
