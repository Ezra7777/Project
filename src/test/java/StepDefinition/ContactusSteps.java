package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.AbstractClass;
import pageObjectModel.ContactusPage;

public class ContactusSteps extends AbstractClass {

   ContactusPage contactusPage= new ContactusPage();

    @Given("^Click on Contact Us Tab$")
    public void click_on_Contact_Us_Tab() {

        contactusPage.clickoncontactus();
    }

    @Given("^Select Subject Heading$")
    public void select_Subject_Heading() {
    }

    @Given("^Select Order Reference$")
    public void select_Order_Reference() {
    }

    @Given("^Select Product$")
    public void select_Product() {
    }

    @Given("^Type the \"([^\"]*)\"$")
    public void type_the(String arg1) {

    }

    @Given("^Click on Send Button$")
    public void click_on_Send_Button() {

    }

    @Then("^Verify message has been successfully sent is displayed$")
    public void verify_message_has_been_successfully_sent_is_displayed() {

    }


}

