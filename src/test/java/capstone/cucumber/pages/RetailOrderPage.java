package capstone.cucumber.pages;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.cucumber.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	} 
	
	
	
	
	
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement orderlink;
	
	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement cancelOrder;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement reason;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement ordersubmit;
	
		
	@FindBy(xpath="//div[@class='cancel__confirm']")
	public WebElement cancelSuccess;
	
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement firstOrder;
	
	// @ReturnOrder

	 @FindBy(id="returnBtn")
	 public WebElement returnbtn;
	 
	 @FindBy(id ="reasonInput")
	 public WebElement inputreason;
	 
	 @FindBy(id = "dropOffInput")
	 public WebElement dropOfInput;
	 
	 @FindBy(id = "orderSubmitBtn")
	 public WebElement returnButton;
	 
	 @FindBy(xpath="//p[text()='Return was successfull']")
	 public WebElement yourOrderReturn;
	 
	 //Review
	 

	 @FindBy(id = "reviewBtn")
	 public WebElement reviewBtn;
	 
	 @FindBy(id = "headlineInput")
	 public WebElement headlineInput;
	 
	 @FindBy(id = "descriptionInput")
	 public WebElement descriptionInput;
	 
	 @FindBy(id = "reviewSubmitBtn")
	 public WebElement reviewSubmitBtn;
	 
	 @FindBy(xpath="//div[text()='Your review was added successfully']")
	 public WebElement Msg;
	

}
