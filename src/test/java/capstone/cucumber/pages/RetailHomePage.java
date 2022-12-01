package capstone.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.cucumber.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() { 
        PageFactory.initElements(getDriver(), this);
    }
	 @FindBy(id ="signinBtn") 
	 public WebElement signIn;

}
