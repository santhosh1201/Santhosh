package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://login.saleforce.com");

		//click() method will be to operate on/off CheckBox
		driver.findElement(By.name("rememberUn")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("rememberUn")).click();
		
		

	}

}
