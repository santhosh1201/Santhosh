 /*package datadriven;
import java.awt.Robot;
import java.io.File;
import java.util.i,nvaz\List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class allcodes 
{
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


// actions class
 
WebElement cc=driver.findElement(By.linkText("Customer Care"));
Actions act=new Actions(driver);
act.moveToElement(cc).build().perform();
//keyboard events
WebElement we= driver.findElement(By.id("1st-ib"));

we.sendKeys("Selenium");
Thread.sleep(3000);
we.sendKeys(Keys.ARROW_DOWN);
we.sendKeys(Keys.ARROW_DOWN);
we.sendKeys(Keys.ENTER);



//Screenshot

TakesScreenshotts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("path of the file".png));


//Robotclass

Robot rb=new Robot();
keyPress(keyEvent.VK_S); //VK-Virtual Keyboard
keyRelease(keyEvent.VK_S);


//Frames

driver.switchTo().frame(framename);


//Checkboxes,Radiobuttons,Links,Dropbox

List<WebElement>chks=driver.findElements(By.name("Checkbox"));
System.out.println("No.ofCheckboxes are:"+chks.size());
for (WebElementchck:chcks)
if(!chck.isSelected()) // To check all checkboxes
if(chck.isSelected())  //To uncheck all chechboxes
chck.click();

---------

List<WebElement> radios = driver.findElements(By.className("_58mt"));
for(WebElementradio:radios)
radio.click();
---------

// links

List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println("No.of links"+links.size());
for(int i=0;i<=links.size();i++)
{
System.out.println(links.get(i).getText());
}
----------
Select date=new Select(driver.findElement(By.xpath("//*[@id='day']")));
date.selectByIndex(index);
date.selectByValue(value);
date.selectByVisibleText(text);
List<WebElement>options=date.getOptions();
System.out.println("No of values"+options.size());
for(inti=0;i<=options.size();i++)
System.out.println(options.get(i).getText());


//screenshot

TakesScreenshot ts= (TakesScreenshot)driver;
File src =ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src , new File("C:\\Users\\arte262_pavan\\Desktop\\pavan\\pavan workspace\\test\\pavan\\login.png"));
 
 
 
// parllel testing .xml file 
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Parallel test suite" parallel="tests">
   
   <test name="Firefox Test">
   <parameter name="browser" value="Firefox"/>
     <classes>
       <class name="Webelements.paralleltesting"/>
     </classes>
     </test> 
   
   <test name="Chrome Test">
   <parameter name="browser" value="chrome"/>
     <classes>
     <class name="Webelements.paralleltesting"/>
   </classes>
   </test>
   
</suite> <!-- Suite -->





// this code is used to call screenshot 

this.takeSnapShot(driver, "path to save in folder and screenshot name.png");  

// log4j syntax   this should be given before system.setproperties

Logger logger=Logger.getLogger("arbudget");
PropertyConfigurator.configure("log4j.properties");
logger.info("message"); 
logger.info("message"); 
logger.info("message"); 
//

}

*/