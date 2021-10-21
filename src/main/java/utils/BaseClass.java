package utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass{

    private PageManager pageManager;
    private static WebDriver driver;


    public void openBrowser(){
       driver=new BrowserManager().createDriver();
       driver.get(ConfigReader.getPropertyValue("url"));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
   }

   public PageManager getPageManager(){
       if(pageManager==null){
           pageManager=new PageManager();
           return pageManager;
       }else{
           return pageManager;
       }

   }

   public WebDriver getDriver(){
       return driver;
   }

   public void tearDown(){
       if(driver!=null){
           driver.quit();
       }
   }
}
