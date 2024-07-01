package Org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement selected_displayed;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room_type;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement number_of_rooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement check_in_date;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement check_out_date;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults_per_room;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement children_per_room;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement select_hotel;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement displayed;
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continues;
	
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement book_displayed;
	

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
    }
	
	

	public WebDriver getDriver() {
		return driver;
	}
     
	
	public WebElement getLocation() {
		return location;
	}


	

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNumber_of_rooms() {
		return number_of_rooms;
	}

	public WebElement getCheck_in_date() {
		return check_in_date;
	}

	public WebElement getCheck_out_date() {
		return check_out_date;
	}

	public WebElement getAdults_per_room() {
		return adults_per_room;
	}

	public WebElement getChildren_per_room() {
		return children_per_room;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelect_hotel() {
		return select_hotel;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getSelected_displayed() {
		return selected_displayed;
}

	public WebElement getDisplayed() {
		return displayed;
	}
	
	  public WebElement getBook_displayed() {
			return book_displayed;
		}   
}