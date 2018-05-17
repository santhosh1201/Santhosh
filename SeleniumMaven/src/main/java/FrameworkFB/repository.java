package FrameworkFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class repository {
	
	
public void facebookaccount(){
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Santhosh Maven\\Browser drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(locators.facebook_firstname).sendKeys(testdata.facebook_firstname);
	driver.findElement(locators.facebook_surname).sendKeys(testdata.facebook_surname);
	driver.findElement(locators.facebook_mobile).sendKeys(testdata.facebook_mobile);
	driver.findElement(locators.facebook_newpassword).sendKeys(testdata.facebook_newpassword);
	
	driver.close();
}
public void facebooklogin() throws Exception  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Santhosh Maven\\Browser drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(locators.facebook_email).sendKeys(testdata.facebook_email);
	driver.findElement(locators.facebook_password).sendKeys(testdata.facebook_password);
	
	Thread.sleep(3000);
	driver.findElement(locators.facebook_login).click();

	
}
}
