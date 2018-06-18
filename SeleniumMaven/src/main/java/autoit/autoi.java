package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


@Test
public class autoi {
	
	public void auto() throws InterruptedException, IOException {


		    System.setProperty("webdriver.gecko.driver","F:\\Software Testing\\Tools and jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://topdf.com/");
			
			driver.findElement(By.xpath("//*[@id=\'pick-files\']/span[2]")).click();
			
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\Users\\Santhosh\\Desktop\\autoit.exe");

			
		}
}

    // script editor


/*Syntax  :  ControlFocus("title","text","controlid")

ControlFocus("File Upload","","Edit1",)

ControlSetText("File Upload","","Edit1", "C:\Users\Santhosh\Desktop\Santhosh Resume .docx")

ContrlClick("File Upload","","Button1")*/
