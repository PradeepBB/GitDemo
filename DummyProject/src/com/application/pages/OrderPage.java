package com.application.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class OrderPage {
	
	//Global Android Driver declaration
	AndroidDriver<AndroidElement> driver;

	//Constructor creation of Classname
	public OrderPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	//Initializing the Page Elements
		PageFactory.initElements(driver, this);
    }

	//Finding the elements with Selectors
    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/button_activate')]")
    private WebElement orderbutton; //storing it in a webelement and making it as private

    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/recName')]")
    private WebElement recipientsname;
    
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/recPhone')]")
    private WebElement recipientsphone;

    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/recCity')]")
    private WebElement city;
    
//  @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/edt_search')]")
//  private WebElement citysearch;
    
    @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/recDetails')]")
    private WebElement details;
    
    @FindBy(xpath = "//android.widget.CheckBox[contains(@resource-id,'com.dikshatech.windmill:id/checkBox')]")
    private WebElement checkbox;
    
    @FindBy(xpath= "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/btn_continue')]")
    private WebElement confirm;
    
    //Checkout screen
    @FindBy(xpath= "//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/delivery_arrow')]")
    private WebElement deliveryoption;
    
//    @FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
//    private WebElement regularone;
    
    @FindBy(xpath= "//android.widget.TextView[contains(@text,'Regular')]")
    private WebElement regularone;

    @FindBy(xpath= "//android.widget.ImageView[contains(@resource-id,'com.dikshatech.windmill:id/close')]")
    private WebElement close;
    
    @FindBy(xpath= "//android.widget.Button[contains(@resource-id,'com.dikshatech.windmill:id/next')]")
    private WebElement choosepayment;
    
    //Payment
    @FindBy(xpath= "//android.widget.RelativeLayout[contains(@resource-id,'com.dikshatech.windmill:id/index_layout')]")  // Go pay
    private WebElement Ewallet;
    
    @FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]")  //Doku
    private WebElement EwalletDoku;
    
    @FindBy(xpath= "//android.widget.EditText[contains(@resource-id,'dw_user')]")  //Doku username
    private WebElement Dokuusername;
    
    @FindBy(xpath= "//android.widget.EditText[contains(@resource-id,'dw_pass')]")  //Doku password
    private WebElement Dokupassword;
    
    @FindBy(xpath= "//android.widget.Button[contains(@resource-id,'DOKU-SUBMIT-LANG')]")  //Doku pay
    private WebElement Dokupay;
    
    @FindBy(xpath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[9]/android.widget.Button")
    private WebElement Pay; //Go pay button
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]")
    private WebElement visa_ovo;
    
    @FindBy(xpath="//android.view.View[contains(@resource-id,'menu-mobiles')]")
    private WebElement selectpayment;
    
    @FindBy(xpath="//android.widget.Image[contains(@resource-id,'cc-drop-mobile-down')]")
    private WebElement creditcard;
    
    @FindBy(xpath="//android.widget.Image[contains(@resource-id,'atm-drop-mobile-down')]")
    private WebElement ATMtransfer;
    
    //Permata internet banking
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]")
    private WebElement permata;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.EditText")
    private WebElement admin;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.EditText")
    private WebElement password;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.Button")
    private WebElement signin;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]")
    private WebElement nextbutton_permata_payment;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[1]")
    private WebElement submit_permata_payment;
    
    //Dana Wallet
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
    private WebElement dana_wallet;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText")
    private WebElement dana_phonenumber;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.widget.Button")
    private WebElement dana_continue;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    private WebElement dana_pin1;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]")
    private WebElement dana_pin2;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    private WebElement dana_pin3;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    private WebElement dana_pin4;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    private WebElement dana_pin5;
    
    @FindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    private WebElement dana_pin6;
    
    @FindBy(xpath="//android.widget.Button[contains(@text,'PAY Rp35.010')]")
    private WebElement dana_pay;
    
    @FindBy(xpath="//android.widget.Button[contains(@text,'CLOSE')]")
    private WebElement dana_close;
    
    
    //Method creation
	public void order() throws InterruptedException
	{
		try
		{
			driver.findElement(By.id("com.dikshatech.windmill:id/positive")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		orderbutton.click();
		Thread.sleep(1000);
		}
	}
		public void orderexecute(String s1,String s2,String s3,String s4,String s5,String s6,String s7,int index1,String s8,String s9,String s10,String s11,String s12,String s13,String s14) throws InterruptedException
		{
  		recipientsname.sendKeys(s1);
  		recipientsphone.sendKeys(s2);
  		city.click();

  		WebElement element=driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'com.dikshatech.windmill:id/edt_search')]"));
  		element.sendKeys("Kota");
  	
  		
  		driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
  		driver.pressKeyCode(AndroidKeyCode.ENTER);
  		driver.pressKeyCode(AndroidKeyCode.ENTER);
 /* 		String text=driver.findElementById("com.dikshatech.windmill:id/tv_places").getText();
  		System.out.println("text found:" + text);
  		if(text.equals("Pagesangan,Kota,Mataram"))
  		{
  			System.out.println("pass");
  		}
  		else
  		{
  			System.out.println("Fail");
  		} 
  		Thread.sleep(1000);*/
  		details.sendKeys(s3);
  		checkbox.click();
  		Thread.sleep(2000);
        
    	MobileElement elementToClick2 = (MobileElement) driver
      		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
      		        + ".resourceId(\"com.dikshatech.windmill:id/card_end\")).scrollIntoView("
      		        + "new UiSelector().text(\"NEXT\"));");
    	elementToClick2.click(); 
  		
    	confirm.click();
  		deliveryoption.click();
  		regularone.click();
  		close.click();
  		choosepayment.click();
  		Thread.sleep(2000);
		
  		
//  		//GO pay
//  			Ewallet.click();  
//			Thread.sleep(15000);
//			Pay.click();
//			Thread.sleep(3000);
//			driver.navigate().back();
//			//Exit payment
//			driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'com.dikshatech.windmill:id/positive')]")).click();
			
			
	/*		//Dana wallet
			dana_wallet.click();
			dana_phonenumber.sendKeys(s8);
			Thread.sleep(3000);
			dana_continue.click();
			Thread.sleep(5000);
			//dana_pin1.sendKeys(s9);
			
			//driver.findElements(By.xpath("//android.view.View[@index ='1']")).get(1).sendKeys(s10);
		
			//driver.findElements(By.className("//android.view.View")).get(0).sendKeys(s9);
			//driver.findElement(By.xpath("//android.view.View[@bounds='[204,1015][261,1071]']")).sendKeys(s10);
			//System.out.println(dana_pin2.getLocation());
		//	dana_pin2.sendKeys(s10);
		
//			WebElement e=driver.findElements(By.className("android.view.View")).get(1);
//			e.sendKeys(s10);
			//dana_pin2.sendKeys(s10);
//			dana_pin3.sendKeys(s11);
//			dana_pin4.sendKeys(s12);
//			dana_pin5.sendKeys(s13);
//			dana_pin6.sendKeys(s14);
			
			dana_pay.click();
			Thread.sleep(3000);
			dana_close.click();
		}
 /* 		if(Ewallet.equals(Ewallet))	
  		{
  			try
  			{
  					Ewallet.click();  
  					Thread.sleep(15000);
  					Pay.click();
  					Thread.sleep(3000);
  			}
  			catch(Exception e)
  			{
  				e.printStackTrace();
  			}
  		}*/

  			try
  			{
  				EwalletDoku.click();
  				Thread.sleep(30000);
  				Dokuusername.sendKeys(s4);
  				Dokupassword.sendKeys(s5);
  				Dokupay.click();
  				Thread.sleep(5000);
  		
  				MobileElement el= (MobileElement) driver
      		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
      		        + ".className(\"android.widget.EditText\")).scrollIntoView("
      		        + "new UiSelector().resourceId(\"CASHWALLETPIN\"));");
  			
  				el.sendKeys("1122");
//    			Thread.sleep(1000);
  				//Pin
  				//driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[14]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")).sendKeys("1122");
  				//driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'CASHWALLETPIN')]")).sendKeys("1122");
    	
  				//Process payment
  				//driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[14]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button")).click();
    	
  				//Cancel
  				driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[14]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button")).click();
  				System.out.println("payment has been canceled successfully");
  			}
  			catch(Exception e)
  			{
  				e.printStackTrace();
  			}
  		}
  	/*	else if(visa_ovo.equals(visa_ovo))
  		{
  			try
  			{
  				visa_ovo.click();
  				Thread.sleep(5000);
  				selectpayment.click();
				if(creditcard.isSelected())
  				{
  				
  				}
  			}
  			catch(Exception e)
  			{
  				e.printStackTrace();
  			}
  			
  		} */
  		
      
/*		//Permata working successfully
  		WebElement el=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Permata Internet Banking\"));");
  		el.click();
      	System.out.println("Scrolled successfully");
    	Thread.sleep(10000);
  		admin.clear();
  		admin.sendKeys(s6);
  		password.clear();
  		password.sendKeys(s7);
  		signin.click();
  		Thread.sleep(2000);
  		
  		//1st way
  		try
  		{	
  			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"NEXT\").instance(2));");
  			driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]")).click();
//  			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().className(\"android.widget.Button\").instance(2));").click();
//  			Thread.sleep(5000);
//  			driver.findElement(By.xpath("//android.wdget.Button[contains(@text,'NEXT')]")).click();
  			//Scrolling is fine but not clicking
			/*
			 * MobileElement element1 = (MobileElement) driver
			 * .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"NEXT\").instance(2))"
			 * ); Thread.sleep(3000); element1.click();
			 */
//  	        driver.findElement(By.xpath("//android.wdget.Button[contains(@text,'NEXT')]")).click();
  			
//  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().instance("+Index3+"));"));
  				
//  		    WebElement element1 = driver.findElement(By.className("android.widget.Button"));
//  		    Actions actions = new Actions(driver);
//  		    actions.moveToElement(element1);
//  		    // actions.click();
//  		    actions.perform();
  			
  			
//  			String context=driver.getContext();
//  			
//  			Set  contextNames=driver.getContextHandles();
//  			driver.context(context);
  			
//  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\""+Id3+"\").instance("+Index3+"));"));
//  			AndroidElement list = (AndroidElement) driver
//  					.findElement(By.className("android.view.View"));
//  			MobileElement listGroup = list
//  					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//  							+ "new UiSelector().text(\"NEXT\"));"));
//  			
//  			Thread.sleep(5000);
//  			listGroup.click();
  			
  			
  			
//  			driver.findElement(MobileBy.AndroidUIAutomator(
//  	                String.format("new UiSelector().text(\"%s\")", "NEXT"))).click();
  			
//  			driver.findElement(MobileBy.AndroidUIAutomator(
//  	                String.format("new UiSelector().index(0).clickable(true).text(\"NEXT\")"))).click();
  			
//  			MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
//  			        "new UiScrollable(new UiSelector().resource-id(\"_ctl0_lblRefNoValue\")).getChildByText("
//  			        + "new UiSelector().className(\"android.view.View\"), \"NEXT\")"));

//  			//Perform the action on the element
//  			element1.click();
  			
//  			MobileElement elementToClick = (MobileElement) driver
//  				    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//  				        + ".class(\"android.view.View\")).scrollIntoView("
//  				        + "new UiSelector().text(\"NEXT\"));");
//  			Thread.sleep(5000);
//  				elementToClick.click();
//  				
  				
//  			MobileElement abc = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//                    +"new UiSelector().text(\"NEXT\"));"));
//  			System.out.println(abc.getLocation());
//            abc.click();
//  			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"NEXT\").instance(0))");
//  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\""+Id2+"\").instance("+Index2+"));"));
//  			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"NEXT\"));");
  			
//  			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().instance("+Index2+"));"));
  			
//  			MobileElement next=(MobileElement)driver.findElement(
//  					MobileBy.AndroidUIAutomator(
//  							"new UiScrollable(new UiSelector().className(\"android.view.View\")).scrollIntoView("
//  							+ "new UiSelector().index(\"2\"))"));
//  			Thread.sleep(5000);
//  			System.out.println(next.getLocation());
//  			next.click();
  			
//				Identify Elememt using Text
//  			MobileElement next = driver.findElement(MobileBy.AndroidUIAutomator(
//  							"new UiScrollable(new UiSelector().className(\"android.view.View\")).scrollIntoView("
//  							+ "new UiSelector().text(\"NEXT\"))"));
  			
//  			Thread.sleep(3000);
  			
  			//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().instance("+Index2+"));"));
  			
//  			next.click();
  			
//  			AndroidElement list=(AndroidElement) driver.findElement(By.className("android.view.View"));
//  			MobileElement listgroup=list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"NEXT\"));"));
//  			listgroup.click();
  			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().className(\"android.view.View\"));");
  			
//  			WebElement next=driver.findElementByAndroidUIAutomator("new UiScrollable(\r\n" +
//  			 "new UiSelector().className(\"android.view.View\"));"); 
//  			next.click();
  			
  			
//  		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().instance("+Index2+"));"));
//  		WebElement el1=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"NEXT\"));");
//  		el1.click();
//  		 MobileElement permatabanking = (MobileElement) driver
//  				  .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
//  				  ".className(\"android.view.View\")).scrollIntoView(" +
//  				  "new UiSelector().text(\"NEXT\"));");
  		 
		/*
		 * // } catch(Exception e) { e.printStackTrace(); }
		 */
//  		
//  		//2nd way
//  		try {
//  			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"NEXT\"))");
//  			
//  		}catch(Exception e) {
//  			System.out.println("whatever");
//  		}

  		
  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\""+Id2+"\").instance("+Index2+"));"));
 
		/*
		 * WebElement
		 * next=driver.findElementByAndroidUIAutomator("new UiScrollable(\r\n" +
		 * "new UiSelector().className(\"android.view.View\"));"); next.click();
		 */
  		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"NEXT\"));").click();
  		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\""+Id+"\").instance("+index+"));"));
		/* */
//		  MobileElement permatabanking = (MobileElement) driver
//		  .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
//		  ".className(\"android.view.View\")).scrollIntoView(" +
//		  "new UiSelector().text(\"NEXT\"));");
		 
  		
//  		WebElement el1=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"NEXT\"));");
//  		el1.click();
 
		
  		/*	try
		{
			
			Thread.sleep(20000);

	  		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id+"\").instance("+index+"));"));
	  		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]")).click();
	  		Thread.sleep(50000);
		}
  			catch(Exception e)
  			{
  				e.printStackTrace();
  			}
		} /*
			/*
			 * MobileElement permatabanking = (MobileElement) driver
			 * .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
			 * ".className(\"android.view.View\")).scrollIntoView(" +
			 * "new UiSelector().text(\"NEXT\"));");
			 * 
			 * Thread.sleep(50000);
			 */		  //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().instance("+index1+"));")).click();
		  
		 // permatabanking.click();
		 
	/*	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
//		 Thread.sleep(5000);*/
  		
  		
  		
//		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().instance("+index1+"));")); 
  			//driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]").click(); 
  			
//  		WebElement el2=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"NEXT\"));");
//		el2.click();
//		  MobileElement permatabanking1 = (MobileElement) driver
//		  .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
//		  ".className(\"android.webkit.WebView\")).scrollIntoView(" +
//		  "new UiSelector().text(\"NEXT\"));");
//		  Thread.sleep(5000);
//		  permatabanking1.click();
		  
		 

		
		 
  			
		//permata.click();
//		AndroidElement list=(AndroidElement) driver.findElement(By.id("com.dikshatech.windmill:id/txt_wallet"));
//  		MobileElement listgroup=list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Permata Internet Banking\"));"));
//  		permata.click();
  		
  	  // WebElement element1 = driver.findElementByAndroidUIAutomator("new UiScrollable().index(10)");
  	    //assertEquals("android.widget.LinearLayout", element1.getTagName());
  		
// 		MobileElement listgroup=list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).getChildByText(new UiSelector().className(\"android.widget.TextView\"), \"Permata Internt Banking\")"));
	
//  		
//  		List<MobileElement> elementsTextContainsTO = ((AndroidDriver<MobileElement>)driver).findElementsByAndroidUIAutomator("new UiSelector().textContains(\"Permata Internet Banking\")");
//  		for(MobileElement element1 : elementsTextContainsTO) {
//	System.out.println("Element - " + element1.getText());

//  		driver.findElementsById("com.dikshatech.windmill:id/index_layout").get(10).click();

		/*
		 * MobileElement elementToClick1 = (MobileElement) driver
		 * .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
		 * ".resourceId(\"com.dikshatech.windmill:id/txt_wallet\")).scrollIntoView(" +
		 * "new UiSelector().text(\"Permata Internet Banking\"));"); Thread.sleep(3000);
		 * elementToClick1.click();
		 */

//		public void changeDriverContextToWebView(AppiumDriver driver) {
//		    Set contextHandles = driver.getContextHandles();
//		    for (String name: contextHandles) {
//		        if (name.equals("WEBVIEW"))
//		            driver.context(name);
//		    }
		

		public void scrollAndClick(String visibleText) {
		     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(2))").click();
		        }
		    
		
		public void scrollByID(String Id, int index) {

	        try {

	             driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id+"\").instance("+index+"));")).click(); 
	             System.out.println("scrolled successfuly and clicked successfully");
	        } catch (Exception e) {
	           e.printStackTrace();
	        }
	    }
		
		public void scrollBy(String Id1, int index1) {

	        try {

	         
		        	MobileElement elementToClick1 = (MobileElement) driver
		          		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
		          		        + ".resourceId(\"com.dikshatech.windmill:id/phonenumber\")).scrollIntoView("
		          		        + "new UiSelector().text(\"NEXT\"));");
		          	
			             List<AndroidElement> el=driver.findElements(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id1+"\").instance("+index1+"));"));
			             System.out.println("MDN list has:" +el.size() + " " + "numbers");
			             
			             Thread.sleep(2000);
			             // Clicking MDN number
			             driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id1+"\").instance("+index1+"));")).click(); 
			             //System.out.println(elementToClick1);
			             elementToClick1.click();
	             
			             
	        } catch (Exception e) {
	           e.printStackTrace();
	        } 
	    }
	}

		
	/*	protected MobileElement scrollToElementByTextContains(String text) {
		    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
		            ".scrollIntoView(new UiSelector().textContains(\"" + text + "\").instance(0));")
		}

		protected MobileElement srollToElementByResourceId(String regex) {
		    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
		            ".scrollIntoView(new UiSelector().resourceIdMatches(\".*" + regex + "\").instance(0));")
		}
		
		
	/*	//Scrolling to the MDN's list
      	MobileElement elementToClick = (MobileElement) driver
      		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
      		        + ".resourceId(\"com.dikshatech.windmill:id/phonenumber\")).scrollIntoView("
      		        + "new UiSelector().elementId(\"15\");");
      		elementToClick.click();
      		
      	//Scrolling to the Next button
         	MobileElement elementToClick1 = (MobileElement) driver
          		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
          		        + ".resourceId(\"com.dikshatech.windmill:id/phonenumber\")).scrollIntoView("
          		        + "new UiSelector().text(\"NEXT\"));");
          		elementToClick1.click(); */
		
    /*s  	MobileElement elementToClick = (MobileElement) driver
      		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
      		        + ".resourceId(\"com.dikshatech.windmill:id/phonenumber\")).scrollIntoView("
      		        + "new UiSelector().reosurceId(\"com.dikshatech.windmill:id/cv1\r\n" + 
      		        "\");");
		
			//driver.findElementByAndroidUIAutomator("new UiScrollable.scrollable(true)");
          		

		} 		
      		
	}
    	
    	
    	
    	
    	
    	
    	
    	

    	
      
    
/* public void scrollAndClick(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
           } */
    
 /*   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().resourceId(\"com.dikshatech.windmill:id/next\")).getChildByText("
            + "new UiSelector().className(\"android.view.ViewGroup\"), \"Next\")"));

    //Perform the action on the element
    element.click();*/
      	
 /*     	MobileElement elementToClick = (MobileElement) driver
      		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
      		        + ".resourceId(\"com.dikshatech.windmill:id/phonenumber\")).scrollIntoView("
      		        + "new UiSelector().text(\"NEXT\"));");
      		//elementToClick.click();
      		
      	/*	nextbutton.click();
      		recipientsname.sendKeys();
      		recipientsph.sendKeys();
      		city.click(); */
      		
/*@SuppressWarnings("deprecation")
public void handleAutocomplete()
{
	driver.findElementById("").sendKeys("Kotas");
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
	driver.pressKeyCode(AndroidKeyCode.ENTER);
	String text=driver.findElementById("").getText();
	System.out.println("Text found is:"+text);
	if(text.equals(""))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	} 
}*/



