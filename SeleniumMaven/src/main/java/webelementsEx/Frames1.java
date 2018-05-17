package webelementsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(("https://seleniumhq.github.io/selenium/docs/api/java/"));
		
		List<WebElement> frs= driver.findElements(By.tagName("frame"));
        System.out.println("no.of frames are:"+frs.size());  
        
        for(WebElement fr:frs){
        	System.out.println(fr.getAttribute("name"));
        }
        driver.switchTo().frame("classFrame");
        
        driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
	}
	

}
