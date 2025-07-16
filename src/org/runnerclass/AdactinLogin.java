package org.runnerclass;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pom.Adactin;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactinLogin extends BaseClass {
	
	@Test
	public void TC01() {
		
		System.out.println("Launch the browser");
	}
	
	@DataProvider(name = "Loginentries")
	public Object [][] entries(){
		
		Object [][] entry = new Object [4][2];
		entry[0][0]	= "Vishaly";
		entry[0][1] = "Vishaly@123";
		entry[1][0] = "Ayyappan";
		entry[1][1] = "Ayyappan@123";
		entry[2][0] = "Sainithran";
		entry[2][1] = "Sainithran@123";
		entry[3][0] = "Saikutty";
		entry[3][1] = "Saikutty@123";
		return entry;		
	}
	
	@Test(dataProvider = "Loginentries")
	public void TC02(String value1, String value2) throws IOException {
		launchBrowser("chrome");
		driver.get("https://adactinhotelapp.com/");
		implicitWait(10);
		Adactin page = new Adactin();
		InputValues(page.getUsername(), value1);
		InputValues(page.getPassword(), value2);
		login(page.getLoginbutton());
		Screenshot("Error");
		Displayed(page.getErrormessage());
		Assert.assertEquals(true, true);
		quitTab();
		
		
	}

}
