package com.stepdefine;

import org.adactinpages.ConfirmationPage;
import org.adactinpages.LoginPage;
import org.adactinpages.searchPage;
import org.baseclass.LibGloble;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefine  extends  LibGloble {
	
	@Given("User is on Adactin page")
	public void userIsOnAdactinPage() {
		browser();
		url("https://adactinhotelapp.com/");
	   
	}

	@When("User should enter {string} and {string} and click login button")
	public void userShouldEnterAndAndClickLoginButton(String user, String pass) {
		LoginPage lo=new LoginPage();
		lo.loginpage(user, pass);
		
	}

	@When("User should select all fields {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldSelectAllFields(String loc, String hot, String roomType, String noofRoom,
			String Checkin, String checkout, String adult, String child) {
		searchPage sp = new searchPage();
		sp.searchHotel(loc, hot, roomType, noofRoom, Checkin, checkout, adult, child);
	  
	}

	@Then("User should navigate to booking conformation")
	public void userShouldNavigateToBookingConformation() {
		
		ConfirmationPage cp = new ConfirmationPage();
		cp.confirmation();
	   
	}
	

	

}
