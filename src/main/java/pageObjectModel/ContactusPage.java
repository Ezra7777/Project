package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactusPage extends AbstractClass {

    WebDriver driver;

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactus;

    public void clickoncontactus(){
        clickOnFunctionalities(contactus);
    }
}
