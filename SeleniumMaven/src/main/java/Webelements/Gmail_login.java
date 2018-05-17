package Webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arte267_santhosh\\Desktop\\Santhosh\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("santhosh");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("san");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		//driver.close();
	}
	
}


