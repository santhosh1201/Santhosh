package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://W3schools.com");
		
		driver.findElement(By.linkText("Learn HTML")).click();
		driver.findElement(By.linkText("HTML Tables")).click();
		
		WebElement mytable=driver.findElement(By.id("customers"));
		List<WebElement> trs=driver.findElements(By.tagName("tr"));
		
		System.out.println("no.of rows are:"+trs.size());
		
		/*for(WebElement tr:trs){
		List<WebElement> tds=tr.findElements(By.tagName("td"));
		
		System.out.println("no.of tds are:"+tds.size());
		
		}
		System.out.println("***********");
		*/
	}

}
