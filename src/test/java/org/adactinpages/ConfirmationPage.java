package org.adactinpages;

import org.baseclass.LibGloble;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends LibGloble{
	
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(name="radiobutton_0")
	private WebElement rbtn;
	
	@FindBy(name="continue")
	private WebElement cont;

	public WebElement getRbtn() {
		return rbtn;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public void confirmation() {

		click(rbtn);	
		click(cont);
	}

}
