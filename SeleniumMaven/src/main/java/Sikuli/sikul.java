package Sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;


public class sikul {
	
	@Test
	public void sikuli() throws FindFailed{

	
	System.setProperty("webdriver.gecko.driver","F:\\Software Testing\\Tools and jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	Screen screen = new Screen();
	  
	Pattern image1 = new Pattern("C:\\Users\\Santhosh\\Desktop\\Screenshot\\san.PNG");
	
	screen.type(image1, "san");
	
	Pattern image2 = new Pattern("C:\\Users\\Santhosh\\Desktop\\Screenshot\\kan.PNG");
	
	screen.type(image2, "9959");
	

	driver.close();

	
	}
}
