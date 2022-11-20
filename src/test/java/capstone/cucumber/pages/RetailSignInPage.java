package capstone.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.cucumber.base.BaseSetup;



public class RetailSignInPage  extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	
	
	
	}
	
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	
	
	
	@FindBy(xpath="//button[@id='loginBtn']")
	public WebElement LoginButton;
	
	@FindBy(id="accountLink")
    public WebElement account;
	
	

	@FindBy(id="newAccountBtn")
    public WebElement NewAccount;
	
	
    @FindBy(id="nameInput")
    public WebElement nameInput;
    @FindBy(id="emailInput")
    public WebElement emailInput;
    @FindBy(id="passwordInput")
    public WebElement passwordInput;
    
    @FindBy(id="confirmPasswordInput")
    public WebElement confirmPasswordInput;
    
    
    @FindBy(id="signupBtn")
    public WebElement signUpButton;
    
    @FindBy(id="profileImage")
    public WebElement profileImage;
	
    @FindBy(id="signinLink")
	public WebElement SignIn;

}


