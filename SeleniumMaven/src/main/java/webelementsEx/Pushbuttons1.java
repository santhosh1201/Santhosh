package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pushbuttons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		WebElement btn=driver.findElement(By.id("loginbutton"));
		
		if(btn.isEnabled()){
			System.out.println("Button is enabled");
			btn.click();
		}
			else{
				System.out.println("Button is disabled");
			}
		}
	}