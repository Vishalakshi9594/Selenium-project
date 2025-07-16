package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin extends BaseClass {
	
	public Adactin() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[contains(text(), 'Click here')]")
	private WebElement errormessage;

	public WebElement getErrormessage() {
		return errormessage;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
