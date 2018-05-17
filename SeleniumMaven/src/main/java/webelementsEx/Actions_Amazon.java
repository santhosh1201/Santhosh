package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		
		act.moveToElement(search).contextClick().build().perform();

	}

}
