package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    public WebDriver getInitDriver(){
         System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         driver.get("https://www.magazineluiza.com.br/");
         return driver;
     }
}
