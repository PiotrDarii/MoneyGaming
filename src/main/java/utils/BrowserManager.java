package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserManager {

    private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();

    public WebDriver createDriver(){
        utils.ConfigReader.readProperties(utils.Constants.CONFIGURATION_FILEPATH);
        switch (utils.ConfigReader.getPropertyValue("browser")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
            default:
                throw new RuntimeException("Invalid name of browser");
        }

        return driver.get();
    }

}
