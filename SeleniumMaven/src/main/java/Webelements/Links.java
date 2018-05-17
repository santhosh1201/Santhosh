package Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args){
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay rentals\\Desktop\\chorome driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No.of links"+links.size());
		
		for(int i=0;i<=links.size();i++)
		{
			
			System.out.println(links.get(i).getText());
		}
	}

}
