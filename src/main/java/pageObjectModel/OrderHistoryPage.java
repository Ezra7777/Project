package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderHistoryPage extends  AbstractClass{

    WebDriver driver;


    @FindBy(xpath = "//span[text()='zara ozturk']")
    private WebElement name;

    public void clickonname(){
        clickOnFunctionalities(name);
    }

    @FindBy(xpath = "//span[contains(text(),'Order history and details')]")
    private WebElement orderhistory;

    public void clickorderhistory(){
        clickOnFunctionalities(orderhistory);
    }



}
