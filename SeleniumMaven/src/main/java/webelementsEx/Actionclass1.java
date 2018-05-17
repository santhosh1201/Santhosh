package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://hdfcbank.com");
		
		driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
		
		Actions act=new Actions(driver);
		WebElement cc=driver.findElement(By.linkText("Customer Care"));
		
		act.moveToElement(cc).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Frequently Asked Questions")).click();

	}

}
