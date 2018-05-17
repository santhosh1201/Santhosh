package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_Html {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://goindigo.in");
		
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/div/div/ul/li[3]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[1]/button")).click();
		

	}

}
