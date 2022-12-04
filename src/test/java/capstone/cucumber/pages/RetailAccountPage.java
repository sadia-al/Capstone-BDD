package capstone.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.cucumber.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	
	  
	} 
	  
	
	
	//remove address
	
	
	@FindBy(xpath="//div[@class='account__address-grid']//div[2]//div[2]//button[2]")
	public WebElement removeAddress;
	
	
	//edit address
	@FindBy(xpath="//div[@class='account__address-grid']//div[2]//div[2]//button[1]")
	public WebElement editaddress;
	
	
	@FindBy(xpath ="//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressupdateSuccess;
	

	@FindBy(id="addressBtn")
	public WebElement addAdressBtn;
	
	//add Address
	
	

	
	@FindBy(xpath ="//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccess;
	@FindBy(id="countryDropdown")
	public WebElement country;
	
	@FindBy(id="fullNameInput")
	public WebElement fullName;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumber;
	
	@FindBy(id="streetInput")
	public WebElement streetAddress;
	
	@FindBy(id="apartmentInput")
	public WebElement apt;
	
	
	@FindBy(id="cityInput")
	public WebElement city;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement state;
	
	@FindBy(id="zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddress;
	
	//edit the card
	
	@FindBy(xpath="//div//child::p[@class='account__payment-sub-title']")
	public WebElement ClickOnCardToEdit;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement Edit;
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement remove;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement cardupdatedPopUp;
	
	
	@FindBy(xpath ="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAdded;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	@FindBy(xpath ="//div[text()='Password Updated Successfully']")
	public WebElement PasswordUpdateSuccess;
	
	@FindBy(xpath ="//P[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement PaymentMehtodLink;
	
	@FindBy(id="cardNumberInput")
	public WebElement CardNumber;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYear;
	
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneInput;
	
	
	@FindBy(id="personalUpdateBtn")
	public WebElement update; 
	
	@FindBy(xpath="//div[@class='Toastify__toast-body']")
	public WebElement alert; 
	
	
	@FindBy(id="previousPasswordInput")
	public WebElement PPassword; 
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement PChange; 
	
	@FindBy(id="newPasswordInput")
	public WebElement NPassword; 
	
	@FindBy(id="confirmPasswordInput")
	public WebElement ConfirmPassword; 
}
