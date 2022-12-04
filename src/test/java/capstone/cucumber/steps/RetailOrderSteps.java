package capstone.cucumber.steps;

import org.junit.Assert; 

import capstone.cucumber.pages.POMFactory;
import capstone.cucumber.utilities.CommonUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RetailOrderSteps  extends CommonUtility {

	POMFactory factory = new POMFactory();

	@And("User click on first order in list")
	public void userClickOnFirstOrder() {
		click(factory.orderPage().firstOrder);
		logger.info("user clicked on first order option");
	
	} 
	@And("User click on Orders section")
	public void userClickOnAccountOption() {
		click(factory.orderPage().orderlink);
		logger.info("user clicked on order option");
	
	} 
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelOrder() {
		click(factory.orderPage().cancelOrder);
		logger.info("user clicked on cancel order");
	
	} 

	@And("User select the cancelation Reason {string}")
	public void userSelectCancelationReason(String reason) {
		
		selectByVisibleText(factory.orderPage().reason, reason);
		slowDown();

	} 
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderbtn() {
		click(factory.orderPage().ordersubmit);
		logger.info("user clicked on cancel order");
	
	} 
	
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void orderCanceldSucesss() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelSuccess));
		logger.info("order canceled successfully");
	}
	
	
	@And("User click on Return Items button")
	public void userClickedonReturnItemsBttn() {
	click(factory.orderPage().returnbtn);
	logger.info("User clicked on Return Items Button");
	}
	
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReasonDamaged(String RID) {
	sendText(factory.orderPage().inputreason,RID);
	logger.info("User Select Reason Item Damaged");
	}
	
	@And("User select the drop off service {string}")
	public void userSelecttheDropOfFedex(String fedex) {
	sendText(factory.orderPage().dropOfInput,fedex);
	logger.info("User select the drop off as Fedex");
	}
	
	@And("User click on Return Order button")
	public void userClickedOnReturnOrderBtn() {
	click(factory.orderPage().returnButton);
	logger.info("User click on Return Order button");
	}
	
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aMsg_should_BePresentAs_returnWassuccessful() {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderReturn));
	logger.info("A cancelation message popped up on the top of the page");
	}
	
	@And("User click on Review button")
	public void userClickedOnReviewButton() {
	click(factory.orderPage().reviewBtn);
	logger.info("User click on Review Button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteAReview(String headline, String text ) {
	sendText(factory.orderPage().headlineInput,headline);
	sendText(factory.orderPage().descriptionInput,text);
	logger.info("User write review on headline and review text");
	}
	
	@And("User click Add your Review button")
	public void userClickedAddYourReviewButton() {
	click(factory.orderPage().reviewSubmitBtn);
	logger.info("User click add review button");
	}
	
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aMsgShouldBeDipsplayed() {
	slowDown();
	Assert.assertTrue(isElementDisplayed(factory.orderPage().Msg));
	logger.info("A message diplayed Your Review Was Added Successfully");
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
} 
