/*package Methods;

import java.awt.Robot;
import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DiffeentClasses {
	
	WebDriver driver;
	
	//Alert class
	
		Alert alt=driver.switchTo().alert();
		alt.accept();
		alt.dismiss();
		alt.sendKeys("");
		alt.getText();
		
	//Action class
		
	Actions act=new Actions(driver);
	act.moveToELement(webelement).click().build().perform();
		act.moveToELement(webelement).Contextclick().build().perform();
		act.moveToElement(search).keyDown(keys.SHIFT).sendKeys("smallerletters").build().perform();
	
		
	//Screenshot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src,new File("path of the file".png));
		
	//Robotclass
		
	Robot rb=new Robot();
		
	keyPress(keyEvent.VK_S);	//VK-Virtual Keyboard
	
keyRelease(keyEvent.VK_S);
		
//Frames
		
		driver.switchTo().frame(framename);
		
//Checkboxes,Radiobuttons,Links,Dropbox
		

List<WebElement> chks=driver.findElements(By.name("Checkbox"));
		
System.out.println("No.of Checkboxes are:"+chks.size());
			
		for (WebElement chck:chcks)
			
		if(!chck.isSelected()) // To check all checkboxes 
		
		if(chck.isSelected())  //To uncheck all chechboxes
	
		chck.click();
		---------
		
List<WebElement> radios = driver.findElements(By.className("_58mt"));
		
		for(WebElement radio:radios)
		
radio.click();
		
		---------
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
System.out.println("No.of links"+links.size());
		
		for(WebElement link:links)
		
String x=link.getText();
		
System.out.println(x);
		
		----------
		
Select date=new Select(driver.findElement(By.xpath("//*[@id='day']")));
			
List<WebElement>options=date.getOptions();
			
System.out.println("No of values"+options.size());
		
for(int  i=0;i<=options.size();i++)
				
	System.out.println(options.get(i).getText());
		
		
}
*/
