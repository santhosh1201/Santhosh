package Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay rentals\\Desktop\\chorome driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
	Select date=new Select(driver.findElement(By.xpath("//*[@id='day']")));
		
	List<WebElement>options=date.getOptions();
	System.out.println("No of values"+options.size());
	
	for(int i=0;i<=options.size();i++)
	{
		
		System.out.println(options.get(i).getText());
	
	}
		   
	}

}
