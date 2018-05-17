package Diff_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_driversetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver","C:\\Users\\USER\\Desktop\\Santhosh Maven\\Browser drivers\\IEDriverServer.exe");
		
        WebDriver driver = new InternetExplorerDriver();
		
        driver.manage().window().maximize();
		driver.get("http://facebook.com");
	}

}
