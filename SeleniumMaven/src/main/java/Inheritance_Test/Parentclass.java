 package Inheritance_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parentclass {
	
		WebDriver driver;
		public Parentclass(WebDriver driver){
		this.driver=driver;
	}
		public void logintest(){
			driver.findElement(By.name("user= Name")).sendKeys("Santhosh");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			
		}
}
