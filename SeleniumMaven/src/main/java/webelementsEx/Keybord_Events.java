package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keybord_Events {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://google.co.in");
			
			WebElement we= driver.findElement(By.id("1st-ib"));

			we.sendKeys("Selenium");
			Thread.sleep(3000);
			
			we.sendKeys(Keys.ARROW_DOWN);
			we.sendKeys(Keys.ARROW_DOWN);
			we.sendKeys(Keys.ENTER);
	}

}
