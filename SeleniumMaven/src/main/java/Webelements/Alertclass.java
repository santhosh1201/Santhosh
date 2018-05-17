package Webelements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                                                                                                                                                                                                                                                                                                                                                                                                                                                               
System.setProperty("webdriver.fireFox.driver","C:\\Usersarte267_santhosh\\Desktop\\Santhosh\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();

	    driver.get("http://");
	    
	   Alert alt=driver.switchTo().alert();
	   
	   alt.getText();
	   alt.accept();
	   alt.dismiss();
	   alt.sendKeys("");
	   
	      
	}

}
