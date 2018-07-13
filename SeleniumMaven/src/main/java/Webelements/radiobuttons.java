package Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\Tools and jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		List<WebElement> listAllRadioButtons= driver.findElements(By.cssSelector("input[type='radio']")); 
		
		
		System.out.println("no.of radio buttons are"+listAllRadioButtons.size());
		
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
	
		//driver.findElement(By.xpath("//*[@id='u_0_c']")).click();
	}

}
