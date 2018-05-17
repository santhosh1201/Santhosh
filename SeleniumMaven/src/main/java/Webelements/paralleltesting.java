package Webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class paralleltesting {
	
	WebDriver driver;
	String baseURL = "http://www.google.com/";
	
	@Parameters("browser")
	@BeforeTest
		public void openBrowser(String browser) {
			try {
				
				if (browser.equalsIgnoreCase("Firefox")) {
System.setProperty("webdriver.gecko.driver","F:\\Software Testing\\Tools and jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
					driver = new FirefoxDriver();
					
				} 
				else if (browser.equalsIgnoreCase("chrome"))  
				{
System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\Tools and jars\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
				} 
	/*			else if (browser.equalsIgnoreCase("IE"))
				{
					
System.setProperty("webdriver.ie.driver","C:\\Users\\USER\\Desktop\\Santhosh Maven\\Browser drivers\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}*/
			
			} catch (WebDriverException e) {
				
			System.out.println(e.getMessage());
			}
		}
		
		@Test
		public void login_TestCase() {
		driver.navigate().to(baseURL);
			
		}

		@Test
		public void search_TestCase() {
			driver.navigate().to(baseURL);
	           
		}

		@AfterTest
		public void closeBrowser() {
			driver.quit();
		

	}

	}

	