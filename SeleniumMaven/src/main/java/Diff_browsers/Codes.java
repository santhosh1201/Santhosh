/*


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


package allcodes;


import java.awt.Robot;
import java.io.File;
import java.util.List;

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

public class pa1
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
			
		
			
			
			
			// parllel testing ,cross browser testing
			
			
			 import org.openqa.selenium.WebDriver;
			 import org.openqa.selenium.WebDriverException;
			 import org.openqa.selenium.chrome.ChromeDriver;
			 import org.openqa.selenium.firefox.FirefoxDriver;
			 import org.testng.annotations.AfterTest;
			 import org.testng.annotations.BeforeTest;
			 import org.testng.annotations.Parameters;
			 import org.testng.annotations.Test;


			 public class crossbrowser {
			 	
			 	WebDriver driver;
			 	String baseURL = "http://www.google.com/";
			 	
			 	@Parameters("browser")
			 	@BeforeTest
			 	public void openBrowser(String browser) {
				try {
			 				
				if (browser.equalsIgnoreCase("Firefox")) {
			 	
			 	System.setProperty("webdriver.gecko.driver","C:\\Users\\arte262_pavan\\Desktop\\geckodriver.exe ");
				driver = new FirefoxDriver();
			 					
			 } 
			else if (browser.equalsIgnoreCase("chrome")) 
			{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte262_pavan\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		    	driver = new ChromeDriver();
			 } 
         		
         		else if (browser.equalsIgnoreCase("IE"))
			 {
			 					
			 System.setProperty("webdriver.ie.driver","C:\\Users\\USER\\Desktop\\Santhosh Maven\\Browser drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			}
			 			
			} 
			catch (WebDriverException e) {
			 				
			 System.out.println(e.getMessage());
			 }
			 }
			 		
			 		@Test
			 		public void login_TestCase() {
			 		driver.navigate().to(baseURL);
			 			
			 		}

			 		@Test
			 		public void search_TestCase() {
			 			driver.navigate().to(baseURL);
			 	           
			 		}

			 		@AfterTest
			 		public void closeBrowser() {
			 			driver.quit();
			 		
			 	}

			 	}         
			 
			 
			// parllel testing 0.xml file      
  
  
  * Here .xml file will be obtained after converting into testNG suit and we need to open that xml file
  * we have to give parameter and browser name. 
			  
			
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
			
			
			
			//keyboard events
			
			
			
			WebElement we= driver.findElement(By.id("1st-ib"));

			we.sendKeys("Selenium");
			Thread.sleep(3000);
			
			we.sendKeys(Keys.ARROW_DOWN);
			we.sendKeys(Keys.ARROW_DOWN);
			we.sendKeys(Keys.ENTER);


// DATADRIVEN FRAMEWORK

 exceldataprovider background code

 For this data driven we need  apache-poi and poi-ooxml dependencies for maven project and jars for java project.
 WE NEED TO PREPARE ONE EXCEL DOC AND WE HAVE TO USE THAT DOC ADDRESS			
			
			package datadriven;

			import java.io.FileInputStream;

			import org.apache.poi.xssf.usermodel.XSSFWorkbook;

			public class ExcelDataProvider
			{
			XSSFWorkbook wb;
				
				public ExcelDataProvider(String excelPath)
				{try
					{
						wb=new XSSFWorkbook(new FileInputStream(new File(excelPath)));
					} 
					catch (Exception e) 
					{
						System.out.println("Unable to load Excel file "+e);
					}
					}
				public int getRows(int sheetIndex)
				{
					int rows= wb.getSheetAt(sheetIndex).getLastRowNum();
						return rows+1;
				}
				public int getRows(String sheetName)
				{
					int rows= wb.getSheet(sheetName).getLastRowNum();
					
					return rows+1;
					}
				
				// Method overloading
				public String getStringData(int sheetIndex,int row,int column)
				{
						return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
				}
				
				public String getStringData(String sheetName,int row,int column)
				{
						return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
				}
				public int getNumericData(String sheetName,int row,int column)
				{
						return (int)wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
				}
				public int getRowCount(int sheetIndex)
				{
					int row=wb.getSheetAt(sheetIndex).getLastRowNum();
					 return row+1;
					
					}
				}
			
			
			
			
			// main code of excel data provider
			
			
			
			import java.io.File;
			import java.util.List;
			import java.util.concurrent.TimeUnit;

			import org.apache.commons.io.FileUtils;
			import org.apache.log4j.Logger;
			import org.apache.log4j.PropertyConfigurator;
			import org.apache.log4j.spi.Configurator;
			import org.openqa.selenium.By;
			import org.openqa.selenium.OutputType;
			import org.openqa.selenium.TakesScreenshot;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.openqa.selenium.interactions.Actions;
			import org.openqa.selenium.support.ui.Select;
			import org.testng.annotations.DataProvider;
			import org.testng.annotations.Test;

			public class myntra 
			{
				
						
						
			WebDriver driver;
			@Test(dataProvider="PAVAN")
	public void myntratest(String mailID,String password ,String pincode , String locatity,String name,String address,String mobile,String cardno,String nameoncard,String cvv) throws Exception
		{
			
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte262_pavan\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
			
			//write codde to perform some action
			     
					}
			
			
					@DataProvider(name = "PAVAN" )
					public Object[][] getData()
					{
					
					ExcelDataProvider config= new ExcelDataProvider("C:\\Users\\arte262_pavan\\Desktop\\PAVAN.xlsx");
					
					int row=config.getRows("PAVAN");
					Object[][]data=new Object[row][10];
					for (int i = 0; i<row; i++)
					{
					   data[i][0]=config.getStringData("PAVAN",i,0);	
					   data[i][1]=config.getStringData("PAVAN",i,1);	
					   data[i][2]=config.getStringData("PAVAN",i,2);	
					   data[i][3]=config.getStringData("PAVAN",i,3);	
					   data[i][4]=config.getStringData("PAVAN",i,4);	
					   data[i][5]=config.getStringData("PAVAN",i,5);	
					   data[i][6]=config.getStringData("PAVAN",i,6);	
					   data[i][7]=config.getStringData("PAVAN",i,7);
					   data[i][8]=config.getStringData("PAVAN",i,8);
					   data[i][9]=config.getStringData("PAVAN",i,9);
					}
					
					return data;
					
					}
			
			
			
			
			// to call screenshot method in between the code the background code is
			
			
			
			
					//screenshot
					public void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception
					{

			    //Convert web driver object to TakeScreenshot

			    TakesScreenshot scrShot =((TakesScreenshot)driver);

			    //Call getScreenshotAs method to create image file

			            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			        //Move image file to new destination

			            File DestFile=new File(fileWithPath);

			            //Copy file at destination

			            FileUtils.copyFile(SrcFile, DestFile);

	
					}
			
			
			// this code is used to call screenshot 
			
					 this.takeSnapShot(driver, "path to save in foldr and screenshot name.png") ;  
			
			
			
			
			// log4j syntax   this should be given before system.setproperties
			
			
					 Logger logger=Logger.getLogger("arbudget");
						PropertyConfigurator.configure("log4j.properties");
			
						logger.info("message");	
						logger.info("message");	
						logger.info("message");	
			
			
			//
				

//            https://www.cs.utexas.edu/~scottm/cs307/codingSamples.htm          this site is for java simple programs





   //             sample POM 


package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class pom 
{
	WebDriver driver;
			
	
	By username=By.xpath("//*[@id=\'txtuId\']");
	By password=By.xpath("//*[@id=\'txtPword\']");
	By submit=By.xpath("//*[@id=\'login\']");
	public  pom (WebDriver driver)
	{
		this.driver=driver;
	}
		public void loginpage(String userid,String pass ) throws Exception
		{
driver.findElement(username).sendKeys(userid);
driver.findElement(password).sendKeys(pass);
driver.findElement(submit).click();
		}


// ANOTHER TYPR OF DECLARATION OF STRING VALUES OR PARAMETERS
   
	public void typeusername(String userid) {
		
		driver.findElement(username).sendKeys(userid);
		
	}
public void typepassword(String pass) {
	
	driver.findElement(password).sendKeys(pass);
}

			public void sub() {
				
				driver.findElement(submit).click();
			}





     
	//    TEST EXECUTION OF SIMPLE POM FROM THIS CLASS	



      package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SubmitElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcases {

	
	@Test
	public void verifylogin() throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		pom po=new pom(driver);    
		po.loginpage("admin", "admin");
		
		
		// ANOTHER TYPE DECLARATION CODE FROM OBJ
		
		pom po=new pom(driver);
		po.typeusername("Admin");
		po.typepassword("Admin");
		po.sub();
	}
}


    //every step screenshot capture 
	WebDriver driver;
	@Test
	public void y() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\'u_0_j\']")).sendKeys("pav");
    this.takeSnapShot(driver, "C:\\Users\\new\\Desktop\\screenshot\\1.png");
	driver.findElement(By.xpath("//*[@id=\'u_0_v\']")).sendKeys("jdfgnj");
	this.takeSnapShot(driver, "C:\\Users\\new\\Desktop\\screenshot\\2.png");
}
 public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception
 {
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		 File DestFile=new File(fileWithPath);
 org.apache.commons.io.FileUtils.copyFile(src1, DestFile);
	}


                     // AUTOIT 


package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) throws IOException, Exception {
	    System.setProperty("webdriver.gecko.driver", "");
		WebDriver driver=new firefoxDriver();
		driver.get("http://topdf.com/");
		driver.findElement(By.xpath("//*[@id=\'pick-files\']/span[2]")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\new\\Desktop\\autoit\\fileupload4.exe");
	}

}



			//EXTENT REPORTS USING DATADRIVEN FRAMEWORK.
    
            --EXTENT REPORT CODE WILL BE RITURN IN SRC/TEST/JAVA WITH DIF PACKAGE AND CLASS NAME.
                     
           --EXCELDATADRIVEN CODE WILL BE RETURN IN SRC/MAIN/JAVA EITH CLASS NAME EXCELDATADRIVEN AND 
                    TWO SAMPLE PACKAGES (REPORTS AND SCREENSHOT NAMES) WILL BE CREATED FOR THIS CODE TO USE IN THE SCRIPT.



 package extentreport;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class wordpress {

WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		extent = new ExtentReports(System.getProperty("user.dir") + "\\src\\main\\java\\reports\\" + "index.html", false);
		
		
	}
	public String getScreenShot(String imagename) throws IOException{
		if(imagename.equals("")){
			imagename="blank";
		}
		File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String imagelocation=System.getProperty("user.dir")+"\\src\\main\\java\\screenshot\\";
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String actualimagename=imagelocation+imagename+"_"+formater.format(calendar.getTime())+".png";
		File destFile=new File(actualimagename);
		FileUtils.copyFile(image, destFile);
		return actualimagename;
	}
	
	public static void highLightElement(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try 
		{
			Thread.sleep(500);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}


	public void getresult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName() + " test is pass");
			String screen=getScreenShot("");
			test.log(LogStatus.PASS, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.ERROR, result.getName() + " test is failed" + result.getThrowable());
			String screen=getScreenShot("");
			test.log(LogStatus.FAIL, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.STARTED) {
			test.log(LogStatus.INFO, result.getName() + " test is started");
		}
	}

	@AfterMethod()
	public void afterMethod(ITestResult result) throws IOException {
		getresult(result);
	}

	
	@BeforeMethod()
	public void beforeMethod(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + " test Started");
	}

	@AfterClass(alwaysRun = true)
	public void endTest() {
		extent.endTest(test);
		extent.flush();
	}



	

	@Test(dataProvider="wordpress")
	
	public void login (String username,String password) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
         test.log(LogStatus.PASS,"browser launched");
		driver.get("http://primusbank.qedgetech.com/");
		test.log(LogStatus.PASS,"applicaton url launched");
	WebElement ele=	driver.findElement(By.xpath("//*[@id='txtuId']"));
	highLightElement(driver, ele);
	ele.sendKeys(username);
	
		test.log(LogStatus.PASS,"enter username");
	WebElement ele1=driver.findElement(By.xpath("//*[@id='txtPword']"));
	highLightElement(driver, ele1);
	ele1.sendKeys(password);
		
		test.log(LogStatus.PASS,"enter password");
		
		WebElement ele3=driver.findElement(By.xpath("//*[@id='login']"));
		highLightElement(driver, ele3);
		ele3.click();
		
		test.log(LogStatus.PASS,"click on login button");
	
		//driver.close();
		//test.log(LogStatus.PASS,"closed the browser");
		
	}
		@DataProvider(name="wordpress")
		public Object[][] passdata(){
			
			ExcelDataProvider config=new ExcelDataProvider("C:\\Users\\new\\Desktop\\Login.xlsx");
			
			int row=config.getRows("Login");
			Object[][]data=new Object[row][2];
			
			for(int i=0;i<row;i++){
				data[i][0]=config.getStringData("Login", i, 0);
				data[i][1]=config.getStringData("Login", i, 1);
				
			
			}
			return data;
			
			
			}
	
	}







                                                  //SIKULI
	//FOR THIS SIKULI WE NEED SIKULI JARS WHICH ARE AVAILABLE IN MVN REPOSITORY AND WE REQUIRED SIKULI SETUP TO BE INSTALLED .BY USING SNIPPING TOOL WE CAN CROP THE IMAGE.
        THE PROCESS FOR SIKULI IS INSTALLING JARS AND ADDING THEM TO THE PROJECT AND WE NEED TO MAKE SETUP IN THE SYSTEM GOOGLE-SIKULI SETUP-DOWNLOAD AND INSTALL.
        GO TO START-ALL PROGRAMS-ACCESSORIES-SNIPPING TOOL-CLICK NEW-CROP SOMETHING WHICH IS USEFULL-SAVE IN A FOLDERON DESKTOP.

         \\SIKULI IS USED TO FIND THE NON WEBELEMENTS ,   AND WITHOUT USING THE LOCATORD AND IF WE DIDNT FOUND LOCATORS OF A WEBELEMENTS IN A APP ,AND DYNAMICALLY CHANGING X-PATHS ,
            AT THESE SITUATION WE CAN USE SIKULI



package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuli {
	
	
public static void main(String args[]) throws FindFailed {
	 
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Screen screen = new Screen();
	 
	Pattern image1 = new Pattern("C:\\Users\\new\\Desktop\\sik\\firstname.PNG");
	screen.type(image1, "jsfjd");
	Pattern image2 = new Pattern("C:\\Users\\new\\Desktop\\sik\\newpassword.PNG");
	screen.type(image2, "nghkgnh");

	
	
}
}





                    // calling screenshot method to another method


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class callingmethodofscreenshot
{
WebDriver driver;
@Test
public void tcforcllingscreenshotmethod() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");

	driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("Learn Automation");
	this.screenshotmethod();                                                           // this is the main part
}

public void screenshotmethod() throws Exception {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("D:\\Raju\\JDBC\\sikuli\\SCREENSHOT\\1.png"));
}


}







                    // taking  step by step screenshot

package screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takingevrystepscreenshot 
{
	WebDriver driver;

@Test
public void stepbystepscreenshot() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
 this.screenshotmethod(driver, "path of screenshotand screen shot name.png");               // this is the main part
	driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("Learn Automation");
	this.screenshotmethod(driver, "path of screenshotand screen shot name.png");     // here we have to change the name of screenshot
}
public void screenshotmethod(WebDriver driver,String path) throws Exception {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);

	File dest= new File(path);
	FileUtils.copyFile(source, dest);
}
}




             // taking screenshot for failed and passed testcases


package sikuli;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class codeoffailedandpassedTC
{
	WebDriver driver;
	@Test
	public void captureScreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");

	driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("Learn Automation");
}
	//It will execute after every test execution 
@AfterMethod
	public void tearDown(ITestResult result)
	{

	//Here will compare if test is failing then only it will enter into if condition
	if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{

	TakesScreenshot ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("D:\\Raju\\JDBC\\sikuli\\SCREENSHOT\\1.png"));
System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
		System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
}
		driver.quit();
		}
}




    //every step screenshot capture 

WebDriver driver;
	@Test
	public void y() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\'u_0_j\']")).sendKeys("pav");
    this.takeSnapShot(driver, "C:\\Users\\new\\Desktop\\screenshot\\1.png");
	driver.findElement(By.xpath("//*[@id=\'u_0_v\']")).sendKeys("jdfgnj");
	this.takeSnapShot(driver, "C:\\Users\\new\\Desktop\\screenshot\\2.png");
}
 public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception
 {
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		 File DestFile=new File(fileWithPath);
 org.apache.commons.io.FileUtils.copyFile(src1, DestFile);
	}






                     // AUTOIT 


package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) throws IOException, Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://topdf.com/");
		driver.findElement(By.xpath("//*[@id=\'pick-files\']/span[2]")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\new\\Desktop\\autoit\\fileupload4.exe");
	}

}










			//EXTENT REPORTS USING DATADRIVEN FRAMEWORK.
    
            --EXTENT REPORT CODE WILL BE RITURN IN SRC/TEST/JAVA WITH DIF PACKAGE AND CLASS NAME.
                     
           --EXCELDATADRIVEN CODE WILL BE RETURN IN SRC/MAIN/JAVA EITH CLASS NAME EXCELDATADRIVEN AND 
                    TWO SAMPLE PACKAGES (REPORTS AND SCREENSHOT NAMES) WILL BE CREATED FOR THIS CODE TO USE IN THE SCRIPT.



 package extentreport;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class wordpress {

WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		extent = new ExtentReports(System.getProperty("user.dir") + "\\src\\main\\java\\reports\\" + "index.html", false);
		
		
	}
	public String getScreenShot(String imagename) throws IOException{
		if(imagename.equals("")){
			imagename="blank";
		}
		File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String imagelocation=System.getProperty("user.dir")+"\\src\\main\\java\\screenshot\\";
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String actualimagename=imagelocation+imagename+"_"+formater.format(calendar.getTime())+".png";
		File destFile=new File(actualimagename);
		FileUtils.copyFile(image, destFile);
		return actualimagename;
	}
	
	public static void highLightElement(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try 
		{
			Thread.sleep(500);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}


	public void getresult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName() + " test is pass");
			String screen=getScreenShot("");
			test.log(LogStatus.PASS, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.ERROR, result.getName() + " test is failed" + result.getThrowable());
			String screen=getScreenShot("");
			test.log(LogStatus.FAIL, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.STARTED) {
			test.log(LogStatus.INFO, result.getName() + " test is started");
		}
	}

	@AfterMethod()
	public void afterMethod(ITestResult result) throws IOException {
		getresult(result);
	}

	
	@BeforeMethod()
	public void beforeMethod(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + " test Started");
	}

	@AfterClass(alwaysRun = true)
	public void endTest() {
		extent.endTest(test);
		extent.flush();
	}



	

	@Test(dataProvider="wordpress")
	
	public void login (String username,String password) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
         test.log(LogStatus.PASS,"browser launched");
		driver.get("http://primusbank.qedgetech.com/");
		test.log(LogStatus.PASS,"applicaton url launched");
	WebElement ele=	driver.findElement(By.xpath("//*[@id='txtuId']"));
	highLightElement(driver, ele);
	ele.sendKeys(username);
	
		test.log(LogStatus.PASS,"enter username");
	WebElement ele1=driver.findElement(By.xpath("//*[@id='txtPword']"));
	highLightElement(driver, ele1);
	ele1.sendKeys(password);
		
		test.log(LogStatus.PASS,"enter password");
		
		WebElement ele3=driver.findElement(By.xpath("//*[@id='login']"));
		highLightElement(driver, ele3);
		ele3.click();
		
		test.log(LogStatus.PASS,"click on login button");
	
		//driver.close();
		//test.log(LogStatus.PASS,"closed the browser");
		
	}
		@DataProvider(name="wordpress")
		public Object[][] passdata(){
			
			ExcelDataProvider config=new ExcelDataProvider("C:\\Users\\new\\Desktop\\Login.xlsx");
			
			int row=config.getRows("Login");
			Object[][]data=new Object[row][2];
			
			for(int i=0;i<row;i++){
				data[i][0]=config.getStringData("Login", i, 0);
				data[i][1]=config.getStringData("Login", i, 1);
				
			
			}
			return data;
			
			
			}
	
	}







                                                  //SIKULI
	//FOR THIS SIKULI WE NEED SIKULI JARS WHICH ARE AVAILABLE IN MVN REPOSITORY AND WE REQUIRED SIKULI SETUP TO BE INSTALLED .BY USING SNIPPING TOOL WE CAN CROP THE IMAGE.
        THE PROCESS FOR SIKULI IS INSTALLING JARS AND ADDING THEM TO THE PROJECT AND WE NEED TO MAKE SETUP IN THE SYSTEM GOOGLE-SIKULI SETUP-DOWNLOAD AND INSTALL.
        GO TO START-ALL PROGRAMS-ACCESSORIES-SNIPPING TOOL-CLICK NEW-CROP SOMETHING WHICH IS USEFULL-SAVE IN A FOLDERON DESKTOP.

         \\SIKULI IS USED TO FIND THE NON WEBELEMENTS ,   AND WITHOUT USING THE LOCATORD AND IF WE DIDNT FOUND LOCATORS OF A WEBELEMENTS IN A APP ,AND DYNAMICALLY CHANGING X-PATHS ,
            AT THESE SITUATION WE CAN USE SIKULI



package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuli {
	
	
public static void main(String args[]) throws FindFailed {
	 
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Screen screen = new Screen();
	 
	Pattern image1 = new Pattern("C:\\Users\\new\\Desktop\\sik\\firstname.PNG");
	screen.type(image1, "jsfjd");
	Pattern image2 = new Pattern("C:\\Users\\new\\Desktop\\sik\\newpassword.PNG");
	screen.type(image2, "nghkgnh");

	
	
}
}

                    // calling screenshot method to another method


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class callingmethodofscreenshot
{
WebDriver driver;
@Test
public void tcforcllingscreenshotmethod() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");

	driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("Learn Automation");
	this.screenshotmethod();                                                           // this is the main part
}

public void screenshotmethod() throws Exception {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("D:\\Raju\\JDBC\\sikuli\\SCREENSHOT\\1.png"));
}


}


                    // taking  step by step screenshot

package screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takingevrystepscreenshot 
{
	WebDriver driver;

@Test
public void stepbystepscreenshot() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
 this.screenshotmethod(driver, "path of screenshotand screen shot name.png");               // this is the main part
	driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("Learn Automation");
	this.screenshotmethod(driver, "path of screenshotand screen shot name.png");     // here we have to change the name of screenshot
}
public void screenshotmethod(WebDriver driver,String path) throws Exception {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(path);
	FileUtils.copyFile(source, dest);
}
}


             // taking screenshot for failed and passed testcases


package sikuli;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class codeoffailedandpassedTC
{
	WebDriver driver;
	@Test
	public void captureScreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");

	driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("Learn Automation");
}
	//It will execute after every test execution 
@AfterMethod
	public void tearDown(ITestResult result)
	{

	//Here will compare if test is failing then only it will enter into if condition
	if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{

	TakesScreenshot ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("D:\\Raju\\JDBC\\sikuli\\SCREENSHOT\\1.png"));
System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
		System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
}

		driver.quit();
		}
}

*/