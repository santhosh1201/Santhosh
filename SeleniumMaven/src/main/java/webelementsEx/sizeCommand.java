package webelementsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sizeCommand {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in");
		
		WebElement lang=driver.findElement(By.linkText("తెల�?గ�?"));
		
		int n=driver.findElements(By.linkText("తెల�?గ�?")).size();
		
		System.out.println("Before click on Telugu link");
		if (n!=0){
			System.out.println("Telugu link code is available in DOM");
		}
		lang.click();
		n=driver.findElements(By.linkText("తెల�?గ�?")).size();
		System.out.println("After click on telugu link");
		
		if(n==0){
			System.out.println("Telugu link code is not available in DOM");
		}

	}

}
