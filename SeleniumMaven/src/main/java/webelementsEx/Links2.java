package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links2 {

	public static void main(String[] args) {
		// No.of language links in google.co.in
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in");
		
		WebElement langs=driver.findElement(By.id("_eEe"));
		List<WebElement> lang=langs.findElements(By.tagName("a"));
	
		System.out.println("Links available are:"+lang.size());
		
		driver.findElement(By.linkText("తెల�?గ�?")).click();
	}
	
	
	

}
