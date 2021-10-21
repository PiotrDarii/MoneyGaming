package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//a[@class='newUser green']")
    public WebElement JoinNowButton;

    @FindBy(xpath = "//select[@id='title']")
    public WebElement titleDD;

    @FindBy(xpath = "//input[@name='map(firstName)']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='map(lastName)']")
    public WebElement surnameBox;

    @FindBy(xpath = "//input[@name='map(terms)']")
    public WebElement tearmAndConditionsCheckBox;

    @FindBy(xpath = "//input[@id='form']")
    public WebElement bigJoinNowButton;

    @FindBy(xpath = "//select[@id='dobYear']/following-sibling::label[@for='dob']")
    public WebElement errorMessageUnderDOB;

    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }
}
