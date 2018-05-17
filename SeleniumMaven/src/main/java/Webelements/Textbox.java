package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay rentals\\Desktop\\chorome driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("santhosh");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	}

}
