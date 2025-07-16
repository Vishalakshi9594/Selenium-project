package org.runnerclass;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;

public class RunnerClass extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser("Chrome");
		urlLaunch("https://www.amazon.co.jp");
		implicitWait(10);
		getTitle();
		Screenshot("Landingpage");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		InputValues(search, "Apple iphone 15");
		Screenshot("Search");
		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
		login(click);
		getCurrentURL();
		Screenshot("Results");
		naviagteURL("https://www.amazon.co.jp/-/en/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.jp%2F-%2Fen%2Fgp%2Fhelp%2Fcustomer%2Fdisplay.html%3FnodeId%3DG4CY3HAXTSFLGC22%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=jpflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		LoginPage l = new LoginPage();
		InputValues(l.getUsername(), "09065069522");
		l.getContinuebutton().click();
		navigateback();
		l.getCreateNewAccount().click();
		Thread.sleep(5000);
		quitTab();
		
	}

}
