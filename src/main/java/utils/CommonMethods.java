package utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass{


    public void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public void click(WebElement element){
        element.click();
    }

    public JavascriptExecutor getJSexecutor(){
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        return js;
    }

    public void jsClick(WebElement element){
        getJSexecutor().executeScript("arguments[0].click()",element);
    }

    public static Select getSelect(WebElement element){
        Select select=new Select(element);
        return select;
    }

    public Faker getFaker(){
        Faker faker=new Faker();
        return faker;
    }

    public String getFakeFirstName(){
        String firstName=getFaker().name().firstName();
        return firstName;
    }

    public String getFakeLastName(){
        String lastName=getFaker().name().lastName();
        return lastName;
    }


}
