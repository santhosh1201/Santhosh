package webelementsEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_Java {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.aponline.gov.in");
		
		driver.findElement(By.id("user Id")).sendKeys("Insightq");
		driver.findElement(By.id("ImageBotton1")).click();
		
		Alert alt=driver.switchTo().alert();
		alt.getText();
		alt.accept();
		
		driver.findElement(By.id("password")).sendKeys("Mercury");

	}

}
