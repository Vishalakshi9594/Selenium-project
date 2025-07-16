package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	public static void getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void pagesourcecode() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}
	
	public static void InputValues(WebElement element, String values) {
		element.sendKeys(values);
	}
	
	public static void login(WebElement element) {
		element.click();
	}
	
	public static void closeTab() {
		driver.close();
	}
	
	public static void quitTab() {
		driver.quit();
	}
	
	public static void Screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\visha\\eclipse-workspace\\SeleniumProject\\Screenshots\\"+ name +".png");
		Files.copy(source, destination);
	
	}
	
	public static void Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}
	
	public static void Enabled(WebElement element) {
		boolean Enabled = element.isEnabled();
		System.out.println(Enabled);

	}

	public static void Selected(WebElement element) {
		boolean Selected = element.isSelected();
		System.out.println(Selected);

	}
	
	public static void naviagteURL(String url) {

		driver.navigate().to(url);
	}
	public static  void navigateback() {

		driver.navigate().back();
	}
	public static void navigateforward() {

		driver.navigate().forward();
	}
	public static void refresh() {

		driver.navigate().refresh();
	}
	public static void gettingtext(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}
	public static void gettingAttribute(WebElement element, String value) {

		String attribute = element.getAttribute(value);
	}
	
	public static JavascriptExecutor javascriptObject() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}
	public static void scrollDownusingJS() {

		javascriptObject().executeScript("windows.scrollBy(0, 500);");
	}
	
	public static void scrollUpusingJS() {

		javascriptObject().executeScript("windows.scrollBy(0, -500);");
	}
	public static void scrollIntoViewusingJS(WebElement element) {
		
		javascriptObject().executeScript("argument[0].scrollIntoView();", element);

	}
	
	public static void passingvaluesusingJS(WebElement element,String value) {

		javascriptObject().executeScript("arguments[0].)", null);
	}
	
	public static void implicitWait(int sec) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public static void explicitWait(int sec, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static Select dropDownObject(WebElement element) {

		Select s = new Select(element);
		return s;
		
	}
	public static void selectByValue(WebElement element, String value) {

		dropDownObject(element).selectByValue(value);
	}
	
	public static void selectByIndex(WebElement element, int Index) {

		dropDownObject(element).selectByIndex(Index);
	}
	public static void selectByText(WebElement element, String value) {

		dropDownObject(element).selectByVisibleText(value);
	}
	public static void gettingAlloptions(WebElement element) {

		List<WebElement> options = dropDownObject(element).getOptions();
		for(WebElement allOptions : options) {
			String text = allOptions.getText();
			System.out.println(text);
		}
	}
	
	public static Alert alertObject(WebElement element) {

		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public static void acceptAlert(WebElement element) {

		alertObject(element).accept();
	}
	
	public static void dismissalert(WebElement element) {

		alertObject(element).dismiss();
	}
	public static void switchingFramesUsingID(String id) {

		driver.switchTo().frame(id);
	}
	public static void exitFrame() {

		driver.switchTo().parentFrame();
	}
	public static Actions actionsObject(){

		Actions act = new Actions(driver);
		return act;
	}
	public static void dragAndDrop(WebElement source, WebElement target) {

		actionsObject().dragAndDrop(source, target).perform();
	}
	public static void moveToElement(WebElement element) {

		actionsObject().moveToElement(element).perform();
	}
	public static void doubleClick(WebElement element) {

		actionsObject().doubleClick(element).perform();
	}
	public static void rightClick(WebElement element) {

		actionsObject().contextClick(element).perform();
	}
	public static Robot robotObject() throws AWTException {

		Robot r = new Robot();
		return r;
	}
	public static void downArrow() throws AWTException {

		robotObject().keyPress(KeyEvent.VK_DOWN);
	}
	public static void upArrow() throws AWTException {

		robotObject().keyPress(KeyEvent.VK_UP);
	}
	public static void enterKey() throws AWTException {

		robotObject().keyPress(KeyEvent.VK_ENTER);
	}
	public static void deleteKey() throws AWTException {

		robotObject().keyPress(KeyEvent.VK_DELETE);
	}
}
