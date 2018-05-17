package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No.of links"+links.size());
		
		for(WebElement link:links){
			String x=link.getText();
			System.out.println(x);
			
			if(x.equals("")){
				link.click();
				break;
			}
		}	
	}
}