package org.runnerclass;

import org.baseclass.BaseClass;
import org.pom.FacebookLoginPage;
import org.pom.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class FacebookCreateNewAccount extends BaseClass {
	@Test
	@Parameters({"username", "password"})
	public void TC01(String username, String password) {
		launchBrowser("chrome");
		urlLaunch("https://www.facebook.com/");
		implicitWait(10);
		LoginPage l = new LoginPage();
		InputValues(l.getUsername(), username);
		InputValues(l.getPassword(), password);
		login(l.getCreateNewAccount());
		FacebookLoginPage FB = new FacebookLoginPage();
		InputValues(FB.getFirstname(), "Vishalakshi");
		InputValues(FB.getLastname(), "Senthilnathan");
		selectByText(FB.getMonth(), "May");
		selectByIndex(FB.getDay(), 9);
		selectByValue(FB.getYear(), "1994");
		login(FB.getFemale());
		InputValues(FB.getMobilenumber(), "09065069522");
		InputValues(FB.getNewpassword(), "Welcome@123");
		login(FB.getSignupbutton());
		
		
		
		
	}
		
	}


