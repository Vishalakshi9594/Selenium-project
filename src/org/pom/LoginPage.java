package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(xpath = "//input[@class='a-button-input']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement createNewAccount;

	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

}
