package org.adactinpages;

import org.baseclass.LibGloble;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage extends LibGloble {

	public searchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "location")
	private WebElement loaction;
	
	@FindBy(name = "hotels")
	private WebElement hotel;

	@FindBy(name = "room_type")
	private WebElement rtype;
	
	@FindBy(name="room_nos")
	private WebElement nrooms;
	

	@FindBy(name = "datepick_in")
	private WebElement cdate;

	@FindBy(name = "datepick_out")
	private WebElement odate;
	
	@FindBy(name = "adult_room")
	private WebElement aroom;

	@FindBy(name = "child_room")
	private WebElement croom;

	@FindBy(name="Submit")
	private WebElement search;
	
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getLoaction() {
		return loaction;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRtype() {
		return rtype;
	}
	
	public WebElement getNrooms() {
		return nrooms;
	}

	public WebElement getCdate() {
		return cdate;
	}

	public WebElement getOdate() {
		return odate;
	}

	public WebElement getAroom() {
		return aroom;
	}

	public WebElement getCroom() {
		return croom;
	}
	 

	public void searchHotel(String loc, String hot, String roomType, String noofRoom,
			String Checkin, String checkout, String adult, String child) {
		selectbyVisibleText(loaction, loc);
		selectbyVisibleText(hotel, hot);
		selectbyVisibleText(rtype, roomType);
		selectbyVisibleText(nrooms, noofRoom);
		selectbyVisibleText(aroom, adult);
		selectbyVisibleText(croom, child);
		click(search);
	}
}
