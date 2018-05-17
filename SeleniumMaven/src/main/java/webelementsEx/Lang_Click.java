package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lang_Click {
	    
	public WebDriver driver;

		public void setup(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in");
		}
		public void langclick(String mylang) throws InterruptedException{
		
			driver.findElement(By.linkText(mylang)).click();
			Thread.sleep(3000);
		}
		public void teardown(){
			driver.quit();
		}
		public static void main(String[] args) throws InterruptedException {
			
			Lang_Click gl=new Lang_Click();
			gl.setup();
			gl.langclick("తెల�?గ�?");
			gl.langclick("English");
			gl.teardown();

	}

}
