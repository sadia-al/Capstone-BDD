package capstone.cucumber.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import capstone.cucumber.pages.POMFactory;
import capstone.cucumber.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.signInPage().account);
		logger.info("user clicked on account option");
	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearText(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, name);
		clearText(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, phone);

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().update);
		logger.info("user clicked on update button");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationUpdated() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().alert));
		logger.info("user info updated");

	}

	@And("User enter below information")
	public void userFillTheNewPasswordInformation(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().PPassword, signUpData.get(0).get("previousPassword"));
		sendText(factory.accountPage().NPassword, signUpData.get(0).get("newPassword"));
		sendText(factory.accountPage().ConfirmPassword, signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information for password");
		slowDown();
	}

	@When("User click on Change Password button")
	public void userClickOnChabgePasswordButton() {
		click(factory.accountPage().PChange);
		logger.info("user clicked on Password Change button");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void userPasswordChangeSucess() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PasswordUpdateSuccess));
		logger.info("user password updated");

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddPaymentMethodLink() {
		click(factory.accountPage().PaymentMehtodLink);
		logger.info("user clicked on Payment method link");
	}

	@And("User fill Debit or credit card information")
	public void userFillTheDebitCardInformation(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().CardNumber, signUpData.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCard, signUpData.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationMonth, signUpData.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationYear, signUpData.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode, signUpData.get(0).get("securityCode"));
		logger.info("user entered required information for Debit Card");
		slowDown();

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user clicked on Payment submission button");
		slowDown();
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void paymentMethodAddedSucesss() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAdded));
		logger.info("user password updated");
	}

	@When("User click on added card")
	public void userClickedOnAddedCard() {
		click(factory.accountPage().ClickOnCardToEdit);
		logger.info("User click on added card");
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().Edit);
		logger.info("User clicked on login button");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
		clearText(factory.accountPage().CardNumber);
		sendText(factory.accountPage().CardNumber, map.get(0).get("cardNumber"));
		clearText(factory.accountPage().nameOnCard);
		sendText(factory.accountPage().nameOnCard, map.get(0).get("nameOnCard"));

		selectByVisibleText(factory.accountPage().expirationMonth, map.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear, map.get(0).get("expirationYear"));
		clearText(factory.accountPage().securityCode);
		sendText(factory.accountPage().securityCode, map.get(0).get("securityCode"));
		logger.info("User entered the following information");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {

		click(factory.accountPage().paymentSubmitBtn);
		logger.info("User clicked on updated button");
		slowDown();

	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		String actual = "Payment Method updated Successfully";
		String expect = getElementText(factory.accountPage().cardupdatedPopUp);
		Assert.assertEquals(actual, expect);
		logger.info("Message was displayed successfully");
	}

	@And("User click on remove option of card section")
	public void userClickOnRemoveCard() {
		slowDown();
		click(factory.accountPage().remove);
		logger.info("User clicked on remove button");

	}

	@Then("payment details should be removed")
	public void cardRemovedSucessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().CardNumber));
		logger.info("Card removed");

	}

	@And("User click on Add address option")
	public void userClickOnAddAddress() {
		slowDown();
		click(factory.accountPage().addAddress);
		logger.info("User clicked on Add Address");

	}

	@And("user fill new address form with below information")
	public void userFillAddressData(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().country, map.get(0).get("country"));
		sendText(factory.accountPage().fullName, map.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumber, map.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetAddress, map.get(0).get("streetAddress"));
		sendText(factory.accountPage().apt, map.get(0).get("apt"));
		sendText(factory.accountPage().city, map.get(0).get("city"));
		selectByVisibleText(factory.accountPage().state, map.get(0).get("state"));
		sendText(factory.accountPage().zipCode, map.get(0).get("zipCode"));
		logger.info("User entered the following information");
		slowDown();
	}

	@And("User click Add Your Address button")
	public void userClickOnAddAddressBtn() {
		slowDown();
		click(factory.accountPage().addAddress);
		logger.info("User clicked on Add your Address");

	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void addressAddedSucessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccess));
		logger.info("address added successfully");

	}

	@And("User click on edit address option")
	public void userClickOnEditAddressBtn() {

		click(factory.accountPage().editaddress);
		logger.info("User clicked on edit Address");

	}

	@And("user fill new address form with below informations")
	public void userEditAddressWithBelowData(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().fullName);
		sendText(factory.accountPage().fullName, map.get(0).get("fullName"));

		clearTextUsingSendKeys(factory.accountPage().phoneNumber);
		sendText(factory.accountPage().phoneNumber, map.get(0).get("phoneNumber"));

		clearTextUsingSendKeys(factory.accountPage().streetAddress);
		sendText(factory.accountPage().streetAddress, map.get(0).get("streetAddress"));

		clearTextUsingSendKeys(factory.accountPage().apt);
		sendText(factory.accountPage().apt, map.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().city);
		sendText(factory.accountPage().city, map.get(0).get("city"));
		selectByVisibleText(factory.accountPage().country, map.get(0).get("country"));

		selectByVisibleText(factory.accountPage().state, map.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCode);
		sendText(factory.accountPage().zipCode, map.get(0).get("zipCode"));
		logger.info("User entered the following information");
		slowDown();
	}

	@And("User click update Your Address button")
	public void userClickOnUpdateAddressBtn() {

		click(factory.accountPage().addAdressBtn);
		logger.info("User clicked on Add your Address");

	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressupdateSuccess));
		logger.info("address updated successfully");

	}

	@And("User click on remove option of Address section")
	public void userClickOnremoveAddressBtn() {

		click(factory.accountPage().removeAddress);
		logger.info("User clicked on remove Address");

	}

	@Then("Address details should be removed")
	public void addressShouldBeRemoved() {

		Assert.assertTrue(isElementDisplayed(factory.accountPage().addAddress));
		logger.info("address removed successfully");

	}
}
