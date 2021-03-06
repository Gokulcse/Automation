package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.PostHomePagePO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class PostHomePage extends BaseDriver
{
	public static WebDriver driver =BaseDriver.driver;
	 static Properties allInputValue;
	
	 @BeforeTest
	 public static WebDriver start() throws Exception
	{
		
		allInputValue = UtilityMethods.getPostPropValues();
		return driver = launchApp(allInputValue.getProperty("BaseURl"));
	}
	 
	 @Test(priority=1)
	private static void validateOperatorLogo()
	{		
		PageFactory.initElements(driver, PostHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.PostLogo, "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(PostHomePagePO.PostLogo,"src",allInputValue.getProperty("postLogo"),"Post Operator Logo");
		
		System.out.println(""+"TS001");
	} 

	 @Test(priority=2)
	protected static void validateCompanyLogo()
	{
		 PageFactory.initElements(driver, PostHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(PostHomePagePO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");
		System.out.println(""+"TS002");
	}
	
	 @Test(priority=3)
	public static void sectionOneIotStarterKitPostValidation()
	{
		 PageFactory.initElements(driver, PostHomePagePO.class);	
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerh1.getText(), allInputValue.getProperty("HomePage.Bannerh1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerh3.getText(), allInputValue.getProperty("HomePage.Bannerh3"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerp1.getText().replace("\n", " "),allInputValue.getProperty("HomePage.Bannerp1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerp2.getText().replace("\n", " "), allInputValue.getProperty("HomePage.Bannerp2"), "equalsignorecase");
		System.out.println(""+"TS003");
	}
	
	 @Test(priority=4)
	public static void sectionOneIotStarterKitTrackOrderValidation() throws InterruptedException
	{
		 PageFactory.initElements(driver, PostHomePagePO.class);	
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneTrackOrderButton, "NotEqual","Track Order Button in IoT Starter Kit banner");
		PostHomePagePO.SectionOneTrackOrderButton.click();
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneTrackOrderPRButton, "NotEqual","Track Order on click Button in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneTrackOrderText, "NotEqual","Track Order on Click Text in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.TrackOrderEmailID, "NotEqual","Enter Email ID Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(PostHomePagePO.TrackOrderEmailID, "Enter Email Address", "Track Order Email ID");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.TrackOrderCloseIcon, "NotEqual","Track Order Close Button in IoT Starter Kit");
		PostHomePagePO.TrackOrderCloseIcon.click();		
		System.out.println(""+"TS004");
	}
	
	 @Test(priority=5)
	public static void sectionOneIotStarterKitEnterReferralCodeValidation() throws InterruptedException
	{
		 Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneEnterReferralCodeButton, "NotEqual","Enter Referral Code Button in IoT Starter Kit");
		PostHomePagePO.SectionOneTrackOrderButton.click();
		try {	Thread.sleep(3000);	} 	catch (InterruptedException e)	{	e.printStackTrace();}	
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneOrderKitButton, "NotEqual","OrderKit Button in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneEnterReferralCodeText, "NotEqual","Enter Referral Code Text in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.EnterReferralCode, "NotEqual","Enter Referral Code Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(PostHomePagePO.EnterReferralCode, "Enter Referral Code", "Enter Referral Code");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.EnterReferralCodeCloseIcon, "NotEqual","Enter Referral Code Close Button in IoT Starter Kit");
		PostHomePagePO.EnterReferralCodeCloseIcon.click();		
		System.out.println(""+"TS005");
	}

	 @Test(priority=6)
	public static void sectionTwoWhatThekitIncludesContentvalidation()
	{
		UtilityMethods.Imagevalidation(PostHomePagePO.SimIcon, "src",allInputValue.getProperty("postSimIcon"), "Post Sim Icon");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimh1.getText(), allInputValue.getProperty("HomePage.WhatTheKitIncludesSimh1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimh2.getText(), allInputValue.getProperty("HomePage.WhatTheKitIncludesSimh2"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimh3.getText(), allInputValue.getProperty("HomePage.WhatTheKitIncludesSimh3"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimh4.getText(), allInputValue.getProperty("HomePage.WhatTheKitIncludesSimh4"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimp1.getText(), allInputValue.getProperty("HomePage.WhatTheKitIncludesSimp1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimp2.getText(), allInputValue.getProperty("HomePage.WhatTheKitIncludesSimp2"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimp3.getText(), allInputValue.getProperty("HomePage.WhatTheKitIncludesSimp3"), "equalsignorecase");
		System.out.println(""+"TS006");
	}
		
	 @Test(priority=7)
	public static void sectionTwoWhatThekitIncludesToolsvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(PostHomePagePO.ToolIcon, allInputValue.getProperty("postToolIcon"), PostHomePagePO.ToolText, "Real-Time Testing Tool");
		UtilityMethods.whatThekitIncludesTextValidation(PostHomePagePO.ToolListText,"Test-as-you-build for fast, quality development","Visibility into device and network behavior","Diagnostics and troubleshooting help");		
		System.out.println(""+"TS007");
	}
		
	 @Test(priority=8)
	public static void sectionTwoWhatThekitIncludesCentervalidation()
	{	
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(PostHomePagePO.CenterIcon, allInputValue.getProperty("postCenterIcon"), PostHomePagePO.CenterText,"Full Access to Control Centre");
		UtilityMethods.whatThekitIncludesTextValidation(PostHomePagePO.CenterListText, "Complete suite of developer tools", "User logins for everyone on your team","Same environment for testing and deployment");		
		System.out.println(""+"TS008");
	}
	
	 @Test(priority=9)
	public static void sectionTwoWhatThekitIncludesSuppportvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(PostHomePagePO.SupportIcon, allInputValue.getProperty("postSupportIcon"), PostHomePagePO.SupportText,"Exceptional Developer Support");
		UtilityMethods.whatThekitIncludesTextValidation(PostHomePagePO.SupportListText, "Developer guidelines and M2M.com forum", "Access to APIs","Accelerated device certification");
		System.out.println(""+"TS009");
	}
	
	 @Test(priority=10)
	public static void sectionThreeHowItWorksValidation()
	{
		UtilityMethods.StringValidation(PostHomePagePO.HowItWorksText.getText(), "How it Works", "equalsignorecase");
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksOrder, "1", "Buy", allInputValue.getProperty("HomePage.HowItWorksText1"));
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksActivate, "2", "Activate", allInputValue.getProperty("HomePage.HowItWorksText2"));
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksExplore, "3", "Explore", allInputValue.getProperty("HomePage.HowItWorksText3"));
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksMonetize, "4", "Launch", allInputValue.getProperty("HomePage.HowItWorksText4"));	
		System.out.println(""+"TS0010");
	}	
	
	 @Test(priority=11)
	public static void sectionFourWhatIsIotValidation()
	{
		UtilityMethods.Imagevalidation(PostHomePagePO.WhatIsIotImage, "src" , allInputValue.getProperty("whatIsIot"), "What is IoT?");
		UtilityMethods.StringValidation(PostHomePagePO.WhatIsIotText.getText(), "What is IoT?", "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.WhatIsIotParaText1.getText(), allInputValue.getProperty("HomePage.WhatIsIoTP1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.WhatIsIotParaText2.getText(), allInputValue.getProperty("HomePage.WhatIsIoTP2"), "equalsignorecase");	
	}

	 @Test(priority=12)
	public static void sectionOneLinkvalidation() throws Exception
	{
		UtilityMethods.sectionOneLinkvalidation(PostHomePagePO.WhattheKitIncludeLink);
		UtilityMethods.sectionOneLinkvalidation(PostHomePagePO.HowItWorkslink);
		UtilityMethods.sectionOneLinkvalidation(PostHomePagePO.WhatIsIotLink);
	}
	
	 @Test(priority=13)
	public static void SectionThreeLearnMore() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.HowItWorksLearnMore, "NotEqual", "M2MDotCom Link Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.HowItWorksLearnMore,PostHomePagePO.M2MDotComFindElement,"Bell"); 	
	}

	 @Test(priority=14)
	public static void TrackOrderValidPageRedirection() throws InterruptedException
	{
	PostHomePagePO.SectionOneTrackOrderButton.click();
	PostHomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.validTrackOrderEmailID"));
	UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionOneTrackOrderPRButton, PostHomePagePO.SectionOneTrackOrderFindElement, "Post");
	}
	
	 @Test(priority=15)
	public static void TrackOrderInValidPageRedirection() throws InterruptedException
	{
		PostHomePagePO.SectionOneTrackOrderButton.click();
		PostHomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.InvalidTrackOrderEmailID"));
		UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionOneTrackOrderPRButton, PostHomePagePO.WhatIsIotImage, "Post");	
	}

	 @Test(priority=16)
	public static void SectionOTwoReferralRequestvalidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionTwoReferralRrequestButton, "NotEqual", "Section Two Referral Request Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionTwoReferralRrequestButton,PostHomePagePO.ReferrralRequestFindElement,"Post"); 
	}

	 @Test(priority=17)
	public static void SectionOneReferralRequestvalidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneReferralRrequestButton, "NotEqual", "Section One Referral Request Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionOneReferralRrequestButton,PostHomePagePO.ReferrralRequestFindElement,"Post"); 
	}
	
	 @Test(priority=18)
	public static void sectionTwoM2MDotCom() throws InterruptedException
	{
	UtilityMethods.DisplayEnableValidator(PostHomePagePO.M2mDotCom, "NotEqual", "M2MDotCom Link Button");
	UtilityMethods.PageNavigationValidation(PostHomePagePO.M2mDotCom,PostHomePagePO.M2MDotComFindElement,"M2M Developer Kits from the World�s Leading Mobile Operators"); 
	}
	
	 @Test(priority=19)
	public static void sectionTwoM2MdotCo()
	{
		try {	Thread.sleep(4500);	} catch (InterruptedException e){	e.printStackTrace();}	
	WebElement referralrequest= driver.findElement(By.xpath("//a[text()='M2M.com']"));
	UtilityMethods.DisplayEnableValidator(referralrequest, "NotEqual", "M2M.com Link Button");
	referralrequest.click();
	try {	Thread.sleep(5000);	} catch (InterruptedException e){	e.printStackTrace();}	
	try {
	    for(String winHandle : driver.getWindowHandles())
	    {
	   
	        driver.switchTo().window(winHandle);
	        WebElement FindElement= driver.findElement(By.xpath("//div[@id='footer_wrap']"));
	        if (!FindElement.isDisplayed())
	        {
	        System.out.println("The Page Redirection Error in Request Referral Code");
	        }   
	    }
	    }	
	catch(Exception e)
	{
	   System.out.println("Condition fail for M2M.com link");
	}	
	driver.navigate().back();
	}

//Failed
	 @Test(priority=20)
	public static void sectionFourJasperdotCom() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.JasperDotCom, "NotEqual", "JasperDotCom Link Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.JasperDotCom, PostHomePagePO.JasperDotComFindElement, "IoT Connectivity Management Platform | Cisco Jasper");
	}
	
	//failed
	 @Test(priority=21)
public static void sectionFourJasperdotCo() throws InterruptedException
	{
	Thread.sleep(2000);	
	WebElement referralrequest= driver.findElement(By.xpath("//section[@id='what-iot']//a"));
	UtilityMethods.DisplayEnableValidator(referralrequest, "NotEqual", "Jasper.com Link Button");
	referralrequest.click();
	Thread.sleep(5000);		
	try {
	    for(String winHandle : driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	        WebElement FindElement= driver.findElement(By.xpath("//footer"));
	        if (!FindElement.isDisplayed())
	        {
	        System.out.println("The Page Redirection Error in Request Referral Code");
	        }   
	    }
	    }	
	catch(Exception e)
	{
	   System.out.println("Condition fail for jasper.com link");
	}	
	driver.navigate().back();
	}
	
	 @Test(priority=22)
	public static void sectionTwoReferralRequestButton()
	{
		try {	Thread.sleep(5000);	} catch (InterruptedException e){	e.printStackTrace();}	
		WebElement referralrequest= driver.findElement(By.xpath("//section[@id='kit-inc']//a[text()='Request Referral Code']"));
		UtilityMethods.DisplayEnableValidator(referralrequest, "NotEqual", "Referral Request Button");
		referralrequest.click();
		try {	Thread.sleep(5000);	} catch (InterruptedException e){	e.printStackTrace();}	
		try {
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        WebElement FindElement= driver.findElement(By.xpath("//input[@value='Request']"));
		        if (!FindElement.isDisplayed())
		        {
		        System.out.println("The Page Redirection Error in Request Referral Code");
		        }   
		    }
		    }	
		catch(Exception e)
		{
		   System.out.println("Condition fail for Referral request in section 2");
		}	
		driver.navigate().back();
	}
	
/*	@AfterTest
	public static void Exit()
	{
		extent.endTest(testcase);
		extent.flush();
		driver.close();
	}*/ 	
}
