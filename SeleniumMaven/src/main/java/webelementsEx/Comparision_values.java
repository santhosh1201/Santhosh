package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Comparision_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		String uid="Insightq";
		WebElement userid=driver.findElement(By.id("Email"));
		userid.click();
		userid.sendKeys(uid);
		
		String Email=userid.getAttribute("value");
		userid.clear();
		
		if(Email.equals(uid))
		{
			System.out.println("Enter value is displayed");
		}
			else{
				System.out.println("Values are mismatching");
			
			}
		}
		
	}


