package Org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement booking_displayed;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_name;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last_name;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billing_address;
	
	@FindBy(xpath ="//input[@name='cc_num']")
	private WebElement credit_card_no;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement credit_card_type;
	
    @FindBy(xpath="//select[@name='cc_exp_month']")
    private WebElement expiry_date_month;
    
    @FindBy(xpath = "//select[@name='cc_exp_year']")
    private WebElement expiry_date_year;
    
    @FindBy(xpath="//input[@name='cc_cvv']")
    private WebElement cvv_number;
    
    @FindBy(xpath = "//input[@name='book_now']")
    private WebElement book_now;
    
    @FindBy(xpath = "//input[@id='arrival_date']")
    private WebElement scroll_down;
    
    @FindBy(xpath="//input[@id='logout']")
    private WebElement logout;
    
    @FindBy(xpath="//td[@class='reg_success']")
    private WebElement successfully;
    
    public Book_Hotel(WebDriver driver2) {
    	this.driver=driver2;
		PageFactory.initElements(driver, this);
	
    }

	public WebDriver getDriver() {
		return driver;
	}

	
	public WebElement getBooking_displayed() {
		return booking_displayed;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBilling_address() {
		return billing_address;
	}

	public WebElement getCredit_card_no() {
		return credit_card_no;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getExpiry_date_month() {
		return expiry_date_month;
	}

	public WebElement getExpiry_date_year() {
		return expiry_date_year;
	}

	public WebElement getCvv_number() {
		return cvv_number;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getLogout() {
		return logout;	
		
	}
	
	

	public WebElement getScroll_down() {
		return scroll_down;
	}

	public WebElement getSuccessfully() {
		return successfully;
	}
    
    
    
    
    
    
    
    
    
}
