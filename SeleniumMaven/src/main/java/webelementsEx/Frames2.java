package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames2 {

	public static void main(String[] args) { 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(("https://netbanking.hdfcbank.com/netbanking/"));
		
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();;
        
	    String emsg=driver.switchTo().alert().getText();
	    System.out.println(emsg);
	    		
	    driver.switchTo().alert().accept();
	    driver.findElement(By.name("fldLoginUserId")).sendKeys("123456");
	    }
	}