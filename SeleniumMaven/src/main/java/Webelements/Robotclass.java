package Webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\arte267_santhosh\\Desktop\\Santhosh\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://accounts.google.com");
	    
	    driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("santhoshkdsp@gmail.com");
	    driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	    
	    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("");
	    driver.findElement(By.xpath("")).click();
	    
	    driver.findElement(By.xpath("//*[@id=':c3']/div/div")).click();
	    driver.findElement(By.xpath("//*[@id=':in']")).click();
	    
	    Thread.sleep(3000);
	    
	    Robot rb = new Robot();
	    
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    
	    
	}
		
	}
