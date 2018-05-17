package Diff_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gecko_driver {

	@Test
	public void browser() {
	
		// To work with webDriver 3.0.1 we should configure GeckoDriverServer
System.setProperty("webdriver.gecko.driver","F:\\Software Testing\\Tools and jars\\geckodriver-v0.19.1-win64\\geckodriver.exe ");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
	}

}
