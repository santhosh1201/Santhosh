package FrameworkFB;


import org.testng.annotations.Test;

import FrameworkFB.repository;

public class testexecution extends repository {
	
	
	@Test(priority=1)
	
	public void account() throws InterruptedException{
		
		facebookaccount();
		
		Thread.sleep(3000);
	
	}
@Test(priority=2)

public void login() throws Exception {
	
	facebooklogin();
}
}
