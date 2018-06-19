package simplepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pomtest {

	
	@Test
	public void verifylogin() throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver","F:\\Software Testing\\Tools and jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		pom po=new pom(driver);    
		
		po.loginpage("admin", "admin");
		
		// ANOTHER TYPE DECLARATION CODE FROM OBJ
	
		po.typeusername("Admin");
		po.typepassword("Admin");
		po.sub();
	}

}



