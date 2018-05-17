package Webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.gecko.driver","F:\\\\Software Testing\\\\Tools and jars\\\\geckodriver-v0.19.1-win64\\\\geckodriver.exe ");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.tutorialspoint.com/index.htm");
	    
	    WebElement aa = driver.findElement(By.xpath("//*[@id='java_technologies']/li[1]/a"));
	    Actions act = new Actions(driver);
	   
	    
	    act.moveToElement(aa).click().build().perform();
	    
	  
	    
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/aside/ul[1]/li[3]/a")).click();
	    
	}

}
