package Inheritance_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childclass {
	
		public static WebDriver driver;
		public void setup(){

System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Tools and jars\\chromedriver_win32\\chromedriver.exe ");	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	}
		public void teardown(){
			driver.close();
		}
		
	public static void main(String[] args) {
		
		Childclass cc=new Childclass();
		cc.setup();
		Parentclass pc=new Parentclass(driver);
		pc.logintest();
		cc.teardown();

	}

}
