package com.application.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.application.pages.SignupPage;

public class Sign extends BaseClass{

	@Test
	public void testSign() throws InterruptedException, IOException
	{
		System.out.println("Signup");
		SignupPage s=new SignupPage(driver);
		s.execute("98273819181666","1","1","1","1", "partha", "parthap@gmail.com");
		
	}
	
/*	@Test
	public void testUnlock()
	{
		MobileDevice mobileDevice = desktop.<MobileDevice> find("//MobileDevice");
		
	}*/
}
