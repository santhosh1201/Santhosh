package Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay rentals\\Desktop\\chorome driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
		List<WebElement> chcks=driver.findElements(By.name("Checkbox")); 
		
		for (WebElement chck:chcks)
			
			//if(!chck.isSelected()) // To check all checkboxes 
		
			if(chck.isSelected())  //To uncheck all chechboxes
			{
		
				chck.click();
			
			}
		}
		
	}
