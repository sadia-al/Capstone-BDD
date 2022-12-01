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
		
	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {

		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);

		logger.info("user enterted email and password" + email);

	}
	
	@And("User click on Create New Account button")
    public void userClickOnCreateNewAccountButton() {
        click(factory.signInPage().NewAccount);
        logger.info("user clicked on Create New Account button");
    
	}
	
	 @And("User fill the signUp information with below data")
	    public void userFillTheSignUpInformationWithBelowData(DataTable data) {
	        List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
	        sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
	        sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
	        sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
	        sendText(factory.signInPage().confirmPasswordInput,signUpData.get(0).get("confirmPassword"));
	        logger.info("user entered required information into sign up form");
	        slowDown();
	    }
	
	
	  @And("User click on SignUp button")
	    public void userClickOnSignUpButton() {
	        click(factory.signInPage().signUpButton);
	        logger.info("user clicked on Sign up Button");
	       
	       
	    }
	  
	  
	   @Then("User should be logged into account page")
	    public void userShouldBeLoggedIntoAccountPage() {
	        Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
	        logger.info("Account was created");
	        slowDown();
	    }
	    
	
}
