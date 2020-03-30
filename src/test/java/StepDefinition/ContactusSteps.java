package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.AbstractClass;
import pageObjectModel.ContactusPage;

public class ContactusSteps extends AbstractClass {

   ContactusPage contactusPage= new ContactusPage();

 @Given("^Click on Contact Us Tab$")
 public void click_on_Contact_Us_Tab() throws Throwable {
  contactusPage.clickOnContactUs();
 }

 @Given("^Select Subject Heading$")
 public void select_Subject_Heading() throws Throwable {
  contactusPage.selectSubjectHeading();
  scrollDown();


 }

 @Given("^Select Order Reference$")
 public void select_Order_Reference() throws Throwable {
  Thread.sleep(5000);
  contactusPage.selectOrderPreference();

 }

 @Given("^Select Product$")
 public void select_Product() throws Throwable {
  contactusPage.selectOrderPreference();

 }

 @Given("^Type the \"([^\"]*)\"$")
 public void type_the(String myMessage) throws Throwable {
  contactusPage.typeTheMessage(myMessage);

 }

 @Given("^Click on Send Button$")
 public void click_on_Send_Button() throws Throwable {
  contactusPage.clickOnSendButton();

 }

 @Then("^Verify message has been successfully sent is displayed$")
 public void verify_message_has_been_successfully_sent_is_displayed() throws Throwable {
  contactusPage.verifySentMessage();

 }
}