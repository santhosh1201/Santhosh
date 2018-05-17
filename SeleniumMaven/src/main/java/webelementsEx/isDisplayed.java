package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isDisplayed {
	
	public WebDriver driver;
	public void visibilityobj(){
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.expedia.co.in/Flights");
	
	try{
		WebElement reDate = driver.findElement(By.id("flight-returning"));
		System.out.println("Before selection of oneway");
		
		boolean x=reDate.isDisplayed();
		if(x==true){
		System.out.println("Return date is visible");
		}else{
		System.out.println("Return date is invisible");
		}
	    driver.findElement(By.id("flight-type-one-way-label")).click();
	    x=reDate.isDisplayed();
		System.out.println("After selection of oneway:"+x);
	}
		catch(Exception e){
		System.out.println("Return field is not visible");
		}
	}
		public static void main(String[] args) {
		
			isDisplayed id=new isDisplayed();
				id.visibilityobj();

	}

}
