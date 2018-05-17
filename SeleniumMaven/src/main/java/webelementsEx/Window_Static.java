package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Static {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("http://accounts.google.com");
		
		String pgTitle=driver.getTitle();
		 
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		Thread.sleep(2000);
		System.out.println("First page title:"+ pgTitle);
		
		pgTitle=driver.getTitle();
		System.out.println("Second page title:"+ pgTitle);
		
		driver.switchTo().window("");
	}

}
