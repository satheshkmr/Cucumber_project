package Org.StepDefinition;

import java.time.Duration;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_Class;
import Org.Pom.Book_Hotel;
import Org.Pom.Login_Page;
import Org.Pom.Search_Hotel;
import Org.Runner.Adactin_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Adactin_StepDefinition extends Base_Class {

	public static WebDriver driver= Adactin_Runner.driver;

	public static Login_Page a = new Login_Page(driver);
	public static Search_Hotel b= new Search_Hotel(driver);
	public static Book_Hotel c= new Book_Hotel(driver);

	@Given("the user launch Adactin hotel url")
	public void the_user_launch_adactin_hotel_url() {
		driver.get("https://adactinhotelapp.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@When("the user Enter the user name in the user name field")
	public void the_user_enter_the_user_name_in_the_user_name_field() {
		send_keys(a.getUsername(), "Sathishece4");
	}
	@When("the user Enter the password in the password field")
	public void the_user_enter_the_password_in_the_password_field() {
		send_keys(a.getPassword(), "Password1");
	}
	@When("the user click the login button")
	public void the_user_click_the_login_button() {
		click(a.getLogin());

	}
	@Then("the user view the hotel search page")
	public void the_user_view_the_hotel_search_page() {
		isdisplayed(b.getSelected_displayed());     


	}

	@When("the user select loction in the location dropdown box")
	public void the_user_select_loction_in_the_location_dropdown_box() {

		click(b.getLocation());
		select_By_index(b.getLocation(),1);

	}
	@When("the user select hotel in the hotel dropdown box")
	public void the_user_select_hotel_in_the_hotel_dropdown_box() {
		click(b.getHotels());
		select_By_index(b.getHotels(),1);
	}
	@When("the user select room type in the room type drop down box")
	public void the_user_select_room_type_in_the_room_type_drop_down_box() {
		click(b.getRoom_type());
		select_By_index(b.getRoom_type(),1);
	}
	@When("the user select the number of rooms in the drop down box")
	public void the_user_select_the_number_of_rooms_in_the_drop_down_box() {
		click(b.getNumber_of_rooms());
		select_By_index(b.getNumber_of_rooms(), 1);
	}
	@When("the user Enter the check in date in the field")
	public void the_user_enter_the_check_in_date_in_the_field() {
		clear(b.getCheck_in_date());
		send_keys(b.getCheck_in_date(),"12/7/2024");
	}
	@When("the user enter the check out date in the field")
	public void the_user_enter_the_check_out_date_in_the_field() {
		clear(b.getCheck_out_date());
		send_keys(b.getCheck_out_date(),"13/7/2024");
	}
	@When("the user select the number of adults stay in the hotel dropdown box")
	public void the_user_select_the_number_of_adults_stay_in_the_hotel_dropdown_box() {
		click(b.getAdults_per_room());
		select_By_index(b.getAdults_per_room(), 1);
	}
	@When("the user select the number of childrens stay in the hotel dropdown box")
	public void the_user_select_the_number_of_childrens_stay_in_the_hotel_dropdown_box() {
		click(b.getChildren_per_room());
		select_By_index(b.getChildren_per_room(), 1);
	}
	@When("the user click the search button")
	public void the_user_click_the_search_button() {
		click(b.getSearch());
	}
//	@Then("the user view the select hotel page")
//	public void the_user_view_the_select_hotel_page() {
//       isdisplayed(b.getDisplayed());	
	//}
	@When("the user select radio button from select hotel page")
	public void the_user_select_radio_button_from_select_hotel_page() {
		click(b.getSelect_hotel());
	}
	@When("the user click the continue button")
	public void the_user_click_the_continue_button() {
		click(b.getContinues());

	}
	@Then("the user view Book a hotel page")
	public void the_user_view_book_a_hotel_page() {
		isdisplayed(b.getBook_displayed());
	}

	@When("the user Enter the first name in the first name field")
	public void the_user_enter_the_first_name_in_the_first_name_field() {
		send_keys(c.getFirst_name(),"sathesh");
	}
	@When("the user Enter the last name in the last name field")
	public void the_user_enter_the_last_name_in_the_last_name_field() {
		send_keys(c.getLast_name(),"kumar");
	}
	@When("the user enter the Adress in the Billing Adress field")
	public void the_user_enter_the_adress_in_the_billing_adress_field() {
		send_keys(c.getBilling_address(), "gurubux st");
	}
	@When("the user Enter credit card number in the credit card field")
	public void the_user_enter_credit_card_number_in_the_credit_card_field() {
		send_keys(c.getCredit_card_no(),"1234567890123456");
	}
	@When("the user select credit card type in the drop down box")
	public void the_user_select_credit_card_type_in_the_drop_down_box() {
		click(c.getCredit_card_type());
		select_By_index(c.getCredit_card_type(), 1);
	}
	@When("the user select the month and year of credit card data on expiry date drop down box")
	public void the_user_select_the_month_and_year_of_credit_card_data_on_expiry_date_drop_down_box() {
		click(c.getExpiry_date_month());
		select_By_index(c.getExpiry_date_month(), 1);
		click(c.getExpiry_date_year());
		select_By_index(c.getExpiry_date_year(), 14);
	}
	@When("the user enter the cvv number in the Cvv field")
	public void the_user_enter_the_cvv_number_in_the_cvv_field() {
		send_keys(c.getCvv_number(), "123");
	}
	@When("the user click the book now button")
	public void the_user_click_the_book_now_button() {
		click(c.getBook_now());
	}
//	@Then("the user viewed the booking confirmation page")
//	public void the_user_viewed_the_booking_confirmation_page() {
//		isdisplayed(c.getBooking_displayed());
//
//	}
	@Then("the user click on the logout page")
	public void the_user_click_on_the_logout_page() throws InterruptedException {
		Thread.sleep(5000);
		scrollIntoView(c.getScroll_down());
		
		
		click(c.getLogout());
		
	
	}
	@Then("the user have successfully loggedout")
	public void the_user_have_successfully_loggedout() {
		isdisplayed(c.getSuccessfully());
	}


}
