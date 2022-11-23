package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GWD {

    private static WebDriver driver;

   public static WebDriver getDriver()
    {
        if (driver==null) { //1 kere başlat
            //driverı start et doldur, başlat ve gönder
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver=new FirefoxDriver();
        }

        return driver;
    }
    public static void quitDriver()
    {
      try {
          Thread.sleep(5000);
      }catch (InterruptedException e){
          throw new RuntimeException(e);
      }

      if (driver !=null)//dolu ise
          {
              driver.quit();
              driver=null;
          }
    }
}
