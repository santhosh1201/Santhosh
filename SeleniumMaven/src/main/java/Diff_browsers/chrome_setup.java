package Diff_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chrome_setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Santhosh Maven\\Browser drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		driver.get("http://facebook.com");
		
		String pgtitle=driver.getTitle();
		System.out.println("pagetitle is" + pgtitle);
		
		//driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("rajesh");// textbox
		
		//driver.findElement(By.xpath("//*[@id='u_0_13']")).click();
		
		
		/*WebElement radio=driver.findElement(By.xpath("//*[@id='u_0_9']"));///radio button
		radio.click();
		
		
		WebElement texbox=driver.findElement(By.xpath("//*[@id='u_0_l']"));
		
		texbox.sendKeys("sbdfhd");
		texbox.clear();*/
		
		
		//Select day=new Select(driver.findElement(By.xpath("//*[@id='day']")));
		
		//day.selectByVisibleText("25");
		//driver.findElement(By.linkText("People")).click();
		//driver.findElement(By.partialLinkText("Peop")).click();
			
		
	}

}
