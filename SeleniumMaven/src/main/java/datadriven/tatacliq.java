package datadriven;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class tatacliq 
	{
			
		WebDriver driver;
		@Test(dataProvider="Santhosh")
		
	public void tatacliqtest(String mailID,String password ,String pincode , String locatity,String name,String address,String mobile) 
			{
			
		System.setProperty("webdriver.gecko.driver","F:\\Software Testing\\Tools and jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			
		driver=new FirefoxDriver();
				
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			driver.get("https://www.tatacliq.com/");
		
		// 1st item
				
		WebElement ele1=driver.findElement(By.xpath("html/body/main/header/div[2]/div[4]/div/nav/ul/li[1]/div"));
			
			Actions act1 =new Actions(driver);
			act1.moveToElement(ele1).build().perform();
			   

		//
			
		driver.findElement(By.xpath("")).click();
			   
		//
		
		driver.findElement(By.xpath("")).click();
		//
		
		driver.findElement(By.xpath("")).click();
		//
		
		driver.findElement(By.xpath("")).click();
		//
		
		driver.findElement(By.xpath("")).click();
			   
			      
		// second item
		
		//men
		
	   WebElement ele2= driver.findElement(By.xpath(""));
			Actions act2 =new Actions(driver);
		   act2.moveToElement(ele1).build().perform();
			   
			   //sports shoes
			   driver.findElement(By.xpath("")).click();
			
			   
			//price filter
			   driver.findElement(By.xpath("")).click();
			   //seletcted product
			   driver.findElement(By.xpath("")).click();
			   //selected size
			   driver.findElement(By.xpath("")).click();
			   //added
			   driver.findElement(By.xpath("")).click();
			   
			   
		 // third item
			   
			   //women
			   WebElement ele3= driver.findElement(By.xpath(""));
				Actions act3 =new Actions(driver);
			   act3.moveToElement(ele2).build().perform(); 
			   
			   //footware
			   driver.findElement(By.xpath("")).click();
			   //selected product
			   driver.findElement(By.xpath("")).click();
			   //selected size
			   driver.findElement(By.xpath("")).click();
			   //added
			   driver.findElement(By.xpath("")).click();
			   
			   	   
			   // click on cart
			   
			   driver.findElement(By.xpath("")).click();
			   
			   driver.findElement(By.xpath("")).click();
		
			   // place order
			   
			   driver.findElement(By.xpath("")).click();
			   
			   List<WebElement> btns = driver.findElements(By.tagName("button"));
			   System.out.println("no of links are"+btns.size());
			   for (int i = 0; i <btns.size(); i++)
			   {
				System.out.println(btns.get(i).getText());
			}
			    
			   //enter email
			   
			   driver.findElement(By.xpath("")).sendKeys(mailID);
			   // enter password
			   
			   driver.findElement(By.xpath("")).sendKeys(password);
			   //click login
			   
			   driver.findElement(By.xpath("")).click();
			   
			  
			   // enter pincode
			   
			   driver.findElement(By.xpath("")).sendKeys(pincode);
			   
			   //enter locality
			   
			   WebElement loc =driver.findElement(By.xpath(""));
			   loc.click();
			  
			   // enter name
			   
			   driver.findElement(By.xpath("")).sendKeys(name);
				
			   // enter address	   
			
			   driver.findElement(By.xpath("")).sendKeys(address);
			   
			   //enter mobile number
			   
			   driver.findElement(By.xpath("")).sendKeys(mobile);
			   
			   // enter locality
			   
			   driver.findElement(By.xpath("")).sendKeys(locatity);
				
			   //click on hometype checkbox	   
			   
			   driver.findElement(By.xpath("")).click();
			   
			   //click on save button
			   
			   driver.findElement(By.xpath("")).click();
			   
			   //click on continue
			   
			   driver.findElement(By.xpath("")).click();
			   
			   
			}
			
			@DataProvider(name = "Santhosh" )
			public Object[][] getData()
			{
			
			exceldata config= new exceldata("");
			
			int row=config.getRows("Santhosh");
			Object[][]data=new Object[row][7];
			for (int i = 0; i<row; i++)
			{
			   data[i][0]=config.getStringData("", i,0);	
			   data[i][1]=config.getStringData("",i,1 );	
			   data[i][2]=config.getStringData("",i,2);	
			   data[i][3]=config.getStringData("",i,3 );	
			   data[i][4]=config.getStringData("",i,4 );	
			   data[i][5]=config.getStringData("",i,5 );	
			   data[i][6]=config.getStringData("",i,6 );	
			}
			
			return data;
			
			}		

	}
