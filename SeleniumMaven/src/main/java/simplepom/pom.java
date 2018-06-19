package simplepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {
	
	WebDriver driver;	
	
		By username=By.xpath("//*[@id=\'txtuId\']");
		By password=By.xpath("//*[@id=\'txtPword\']");
		By submit=By.xpath("//*[@id=\'login\']");
		
		
		public pom(WebDriver driver)
	{
		this.driver=driver;
	}
		
	public void loginpage(String userid,String pass) throws Exception
		{
			driver.findElement(username).sendKeys(userid);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(submit).click();
	
	}

		
	// ANOTHER TYPR OF DECLARATION OF STRING VALUES OR PARAMETERS for Reusability
   
	
			public void typeusername(String userid) {
		
			driver.findElement(username).sendKeys(userid);
		
	}
			public void typepassword(String pass) {
	
			driver.findElement(password).sendKeys(pass);
	}

			public void sub() {
				
			driver.findElement(submit).click();
	}


}
   
