package org.adactinpages;

import org.baseclass.LibGloble;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGloble {

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(id = "username")
	private WebElement txtuser;

	@FindBy(id = "password")
	private WebElement txtpass;

	@FindBy(name = "login")
	private WebElement btnlogin;
	
	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	

	public void loginpage(String user, String pass) {
		login(txtuser, user);
		login(txtpass, pass);
		click(btnlogin);                                                                            
		
	}

}
