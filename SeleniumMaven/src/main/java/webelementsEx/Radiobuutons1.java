 package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuutons1 {

	public static void main(String[] args) throws InterruptedException {
		//We can use click() method to operate radiobuttons
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		List<WebElement> radios = driver.findElements(By.className("_58mt"));
		for(WebElement radio:radios){
		radio.click();
		Thread.sleep(2000);
		}

	}
}