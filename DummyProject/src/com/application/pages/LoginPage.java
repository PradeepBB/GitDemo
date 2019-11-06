package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
    }
	
    
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/Next')]") //Changes done
    private WebElement splashscreen1;
 
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/get_started')]")
    private WebElement splashscreen5;
    
  //  @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/signup_btn')]")
  //  private WebElement singup;
    
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/login_btn')]")
    private WebElement loginscreen;
    
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/user_id')]")
    private WebElement gmail;
    @FindBy(xpath="//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/next')]")
    private WebElement nextbutton;
    
 /* @FindBy(xpath = "")
    private WebElement login;
    @FindBy(xpath= "Phone number")
    private WebElement phonenumber;
    @FindBy(xpath="NEXT")
    private WebElement nextbutton; */
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp1')]")
    private WebElement textfield1;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp2')]")
    private WebElement textfield2;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp3')]")
    private WebElement textfield3;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/otp4')]")
    private WebElement textfield4;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/ful_name')]")
    private WebElement fullname;
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/email')]")
    private WebElement email;
    @FindBy(xpath = "//android.widget.CheckBox[contains(@resource-id,'com.dikshatech.windmill:id/checkBox')]")
    private WebElement checkbox;
    
    
    @FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView[1]")
    private WebElement text1;
    @FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/two')]")
    private WebElement text2;
    @FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/three')]")
    private WebElement text3;
    @FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/four')]")
    private WebElement text4;
    @FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/five')]")
    private WebElement text5;
    @FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/six')]")
    private WebElement text6;
    
 /*   @FindBy(xpath="//android.widget.TextView[@index='0']")
    private WebElement text6;
    @FindBy(xpath="//android.widget.TextView[@index='1']")
    private WebElement text7;
    @FindBy(xpath="//android.widget.TextView[@index='2']")
    private WebElement text8;
    @FindBy(xpath="//android.widget.TextView[@index='3']")
    private WebElement text9;
    @FindBy(xpath="//android.widget.TextView[@index='4']")
    private WebElement text10; */
    
    @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/imageView3')]")
    private WebElement fingerprint;
    
    @FindBy(name="Submit")
    private WebElement submitbutton;
    @FindBy(name="Skip")
    private WebElement skipbutton;
    
    //driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'com.dikshatech.windmill:id/positive')]"));
    public void execute(String s1)throws InterruptedException
    {
    	Thread.sleep(8000);
    	splashscreen1.click();
    	splashscreen1.click();
    	splashscreen1.click();
    	//splashscreen1.click();
    	splashscreen5.click();
    	
    	loginscreen.click();
    	
      //login.click();
    	gmail.sendKeys(s1);
    	Thread.sleep(1000);
    	//driver.navigate().back();
    	nextbutton.click();
    	Thread.sleep(3000);
/*    	text1.sendKeys(s2);
    	text2.sendKeys(s3);
    	text3.sendKeys(s4);
    	text4.sendKeys(s5);
    	text5.sendKeys(s6);
    	text6.sendKeys(s7);
    	nextbutton.click();*/
    }
    	
 /*   	textfield1.sendKeys(s2);
    	textfield2.sendKeys(s3);
    	textfield3.sendKeys(s4);
    	textfield4.sendKeys(s5);
    	nextbutton.click();
    	
    	fullname.sendKeys(s6);
    	email.sendKeys(s7);
    	checkbox.click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/button')]")).click();
    	//Thread.sleep(1000);
    	
    	text1.sendKeys(s8);
 /*   	text2.sendKeys(s9);
    	text3.sendKeys(s10);
    	text4.sendKeys(s11);
    	text5.sendKeys(s12);
    	nextbutton.click();
    	text6.sendKeys(s13);
    	text7.sendKeys(s14);
    	text8.sendKeys(s15);
    	text9.sendKeys(s16);
    	text10.sendKeys(s17);
    	nextbutton.click();
    	//submitbutton.click();
    	skipbutton.click(); */
    }

