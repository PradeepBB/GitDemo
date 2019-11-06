package com.application.tests;

import org.testng.annotations.Test;

import com.application.pages.LoginPage;
import com.application.pages.OrderPage;


public class Login extends BaseClass{

	@Test
	public void testLogin() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.execute("roopesh@gmail.com");
		 	
//		Swipe s =new Swipe(driver);
//		s.launch();
		
		OrderPage o=new OrderPage(driver);
		Thread.sleep(10000);
		o.order();
		o.scrollBy("com.dikshatech.windmill:id/cv1", 1);
		o.orderexecute("Pradeep", "938538535006","ajsadca","1654417417","dokutes123","admin","admin",0,"817345545","1","2","3","3","2","1");
	}
}  