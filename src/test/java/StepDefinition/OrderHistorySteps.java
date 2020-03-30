package StepDefinition;

import cucumber.api.java.en.Given;
import pageObjectModel.AbstractClass;
import pageObjectModel.OrderHistoryPage;

public class OrderHistorySteps extends AbstractClass {

    OrderHistoryPage orderHistoryPage= new OrderHistoryPage();

    @Given("^click on your name$")
    public void click_on_your_name() {
       orderHistoryPage.clickonname();
    }

    @Given("^click on order history and details$")
    public void click_on_order_history_and_details() {

        orderHistoryPage.clickorderhistory();
    }



}
