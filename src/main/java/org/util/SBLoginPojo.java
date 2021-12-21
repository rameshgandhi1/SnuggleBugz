package org.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SBLoginPojo extends BaseClass {
	public SBLoginPojo() {
		PageFactory.initElements(driver, this);
 	}
	
	@FindBy(id="log_in_email")
	private WebElement txtUser;
	
	@FindBy(id="log_in_password")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
		
	}	

}

