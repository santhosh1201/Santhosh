package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Static {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		Select mylist=new Select(driver.findElement(By.name("country")));
		
		mylist.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		mylist.selectByIndex(0);
		Thread.sleep(2000);
		mylist.selectByValue("92");
		
		List<WebElement> options=mylist.getOptions();
		System.out.println("No.of values are:"+options.size());
		
		for(WebElement option:options)
		{
			System.out.println("option.getText()");
		}
	}
}
