package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1_Static {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		Select mylist=new Select(driver.findElement(By.name("country")));
		
		String mycountry="INDIA123";
		List<WebElement> options=mylist.getOptions();
		
		boolean myStatus=false;
		for(WebElement option:options)
		{
				if(mylist.equals(mycountry)){
					mylist.selectByVisibleText(mycountry);
				   	myStatus=true;
					break;
				}
				}
		            if(myStatus==false){
					System.out.println("mycountry:"+"value not exit");
					
				}
		}
	}
