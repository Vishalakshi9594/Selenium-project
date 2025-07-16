package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends BaseClass{
	
	public FacebookLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//*[@id='month']")
	private WebElement month;
	
	@FindBy(xpath = "//*[@id='day']")
	private WebElement day;

	@FindBy(xpath = "//*[@id='year']")
	private WebElement year;
	
	@FindBy(xpath = "(//label[@class ='_58mt'])[1]")
	private WebElement female;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement newpassword;
	
	@FindBy(xpath = "//*[@name= 'websubmit']")
	private WebElement signupbutton;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getSignupbutton() {
		return signupbutton;
	}
	
	

}
