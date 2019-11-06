package com.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe {

	
	AndroidDriver<AndroidElement> driver;

	public Swipe(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
	
	public void launch() throws InterruptedException
	{

	/*	driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'com.google.android.dialer:id/contacts_tab')]")).click();
		Thread.sleep(1000);
      	MobileElement elementToClick = (MobileElement) driver
      		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
      		        + ".resourceId(\"com.google.android.dialer:id/recycler_view\")).scrollIntoView("
      		        + "new UiSelector().text(\"2222\"));");
      		elementToClick.click(); */
		
//		driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'com.google.android.googlequicksearchbox:id/text_container')]")).sendKeys("fa");
		TouchAction t=new TouchAction(driver);
		t.moveTo(driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'com.google.android.googlequicksearchbox:id/text_container')]"))).perform();
		
		
	}
}
