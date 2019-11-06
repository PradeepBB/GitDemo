package com.application.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SignupPage {

	AndroidDriver<AndroidElement> driver;
	
	
	public SignupPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }

    
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/Next')]") //Changed done
    private WebElement splashscreen1;
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/Next')]")
    private WebElement splashscreen2;
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/Next')]")
    private WebElement splashscreen3;
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/get_started')]")
    private WebElement splashscreen4;
    
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/signup_btn')]")
    private WebElement singup;
    
    @FindBy(xpath= "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/phoneNumber')]")
    private WebElement phonenumber;
    @FindBy(xpath="//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/next')]")
    private WebElement nextbutton;
    
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp1')]")
    private WebElement textfield1;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp2')]")
    private WebElement textfield2;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp3')]")
    private WebElement textfield3;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp4')]")
    private WebElement textfield4;
  /*  @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/otp1')]")
    private WebElement textfield1;
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/otp2')]")
    private WebElement textfield2;
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/otp3')]")
    private WebElement textfield3;
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/otp4')]")
    private WebElement textfield4;*/
    @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/ful_name')]")
    private WebElement fullname;
    @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/email')]")
    private WebElement email;
    @FindBy(xpath = "//android.widget.CheckBox[contains(@resource-id,'com.dikshatech.windmill:id/checkBox')]")
    private WebElement checkbox;
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/button')]")
    private WebElement next1;
    
 /*   @FindBy(xpath="//android.widget.TextView[@index='0']")
    private WebElement text1;
    @FindBy(xpath="//android.widget.TextView[@index='1']")
    private WebElement text2;
    @FindBy(xpath="//android.widget.TextView[@index='2']")
    private WebElement text3;
    @FindBy(xpath="//android.widget.TextView[@index='3']")
    private WebElement text4;
    @FindBy(xpath="//android.widget.TextView[@index='4']")
    private WebElement text5;
    
    @FindBy(xpath="//android.widget.TextView[@index='0']")
    private WebElement text6;
    @FindBy(xpath="//android.widget.TextView[@index='1']")
    private WebElement text7;
    @FindBy(xpath="//android.widget.TextView[@index='2']")
    private WebElement text8;
    @FindBy(xpath="//android.widget.TextView[@index='3']")
    private WebElement text9;
    @FindBy(xpath="//android.widget.TextView[@index='4']")
    private WebElement text10;*/
    
    @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/imageView3')]")
    private WebElement fingerprint;
    
    @FindBy(name="Submit")
    private WebElement submitbutton;
    @FindBy(name="Skip")
    private WebElement skipbutton;
    
    //driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'com.dikshatech.windmill:id/positive')]"));
    public void execute(String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws InterruptedException, IOException
    {
    	splashscreen1.click();
    	splashscreen2.click();
    	splashscreen3.click();
    	splashscreen4.click();
    	singup.click();
    	//login.click();
    	phonenumber.sendKeys(s1);
    	nextbutton.click();
    	Thread.sleep(2000);
    	textfield1.sendKeys(s2);
    	textfield2.sendKeys(s3);
    	textfield3.sendKeys(s4);
    	textfield4.sendKeys(s5);
    	nextbutton.click();
    	fullname.sendKeys(s6);
    	email.sendKeys(s7);
    	checkbox.click();
    	Thread.sleep(2000);
    	next1.click();
    	Thread.sleep(10000);
    

    	//Runtime.getRuntime().exec("adb -e emulator-5554 emu finger touch 1");
    	fingerprint.click();
    	Runtime.getRuntime().exec("adb -s emulator-5554 emu finger touch 1");
    	Thread.sleep(5000);
    	
  /*  	text1.sendKeys(s8);
    	text2.sendKeys(s9);
    	text3.sendKeys(s10);
    	text4.sendKeys(s11);
    	text5.sendKeys(s12);
    	nextbutton.click();
    	text6.sendKeys(s13);
    	text7.sendKeys(s14);
    	text8.sendKeys(s15);
    	text9.sendKeys(s16);
    	text10.sendKeys(s17); 
    	nextbutton.click();*/
    	
    
    	
    	//submitbutton.click();
//    	fingerprint.click();
    	Thread.sleep(1000);
    	//skipbutton.click();
    }
}
