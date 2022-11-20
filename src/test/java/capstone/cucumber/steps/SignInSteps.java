package capstone.cucumber.steps;

import org.junit.Assert;

import capstone.cucumber.pages.POMFactory;
import capstone.cucumber.utilities.CommonUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}

	@When("User click on Sign in option")
	public void userClickOnSignUpOption() {
		click(factory.signInPage().SignIn);
		logger.info("user clicked on Sign up Button");

	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().LoginButton);
		logger.info("user clicked on logIn button");
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("user is logged in to account");
		slowDown();
	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {

		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);

		logger.info("user enterted email and password" + email);

	}
	
	
	
	
	
}
