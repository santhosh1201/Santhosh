package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox2 {

	public static void main(String[] args) {
		// Script to check "on" all the checkboxes
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms09.htm"); 
		
		  List<WebElement> chks=driver.findElements(By.name("Checkbox"));
		System.out.println("No.of Checkboxes are:"+chks.size());
		
		for(WebElement chk:chks){
			if(!chk.isSelected()){
				chk.click();
			}
		}
	}
}
