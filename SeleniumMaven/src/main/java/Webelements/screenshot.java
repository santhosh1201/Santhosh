package Webelements;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Santhosh Maven\\Santosh\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();

	    driver.get("http://www.google.com");
	    
	 // call method
	    screenshot.captureScreenShot(driver);

}

public static void captureScreenShot(WebDriver driver){

    
	//Take screenshot and store as a file format             
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);           
try {

	//now copy the  screenshot to desired location using copyFile method

FileUtils.copyFile(src, new File("./screenshot/San/san.png"));                              

}
catch (IOException e)

{
System.out.println(e.getMessage());
}
}
}


