
package com.application.tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	public static AndroidDriver driver;

	@BeforeClass
	public void launch() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Set android deviceName desired capability. Set your device name.
		capabilities.setCapability("deviceName", "emulator-5554");
		//capabilities.setCapability("deviceName", "de11dd389906");
		capabilities.setCapability("platformName", "Android");
		// capabilities.setCapability("automationName","uiautomator2");
		// Set your application’s appPackage if you are using any other app.
		//Windmill package
		capabilities.setCapability("appPackage", "com.dikshatech.windmill");
		//Contacts package
//		capabilities.setCapability("appPackage", "com.google.android.dialer");
		//Google search package
//		capabilities.setCapability("appPackage", "com.google.android.googlequicksearchbox");
		// Set your application’s appActivity if you are using any other app.
		//Windmill activity
		capabilities.setCapability("appActivity", "com.dikshatech.windmill.views.activities.LanguageActivity");
		//Contact activity
//		capabilities.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
		//GOogle search activity
//		capabilities.setCapability("appActivity", "com.google.android.apps.gsa.sidekick.main.optin.OptInActivity");
		// It will launch app in android device.
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//		driver.context("WEBVIEW");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

}
