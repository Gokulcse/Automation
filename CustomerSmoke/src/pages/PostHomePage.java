package pages;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import pageobjects.PostHomePagePO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class PostHomePage extends BaseDriver
{
	public static FirefoxDriver driver = launchApp();
	 static Properties allInputValue;
	public static void start() throws IOException
	{
		allInputValue = UtilityMethods.getPostPropValues();
		PageFactory.initElements(driver, PostHomePagePO.class);	
	}
	public static void validateOperatorLogo()
	{		
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.PostLogo, "NotEqual","Tele2 Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(PostHomePagePO.PostLogo,"src",allInputValue.getProperty("tele2Logo"),"Tele2 Operator Logo");

	} 

	public static void validateCompanyLogo()
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(PostHomePagePO.CiscoLogo,"src",allInputValue.getProperty("tele2CompanyLogo"),"Cisco Jasper Company Logo");	
	}
	
	
	public static void sectionOneIotStarterKitTele2Validation()
	{
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerh1.getText(), allInputValue.getProperty("HomePage.Bannerh1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerh3.getText(), allInputValue.getProperty("HomePage.Bannerh3"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerp1.getText().replace("\n", " "),allInputValue.getProperty("HomePage.Bannerp1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextBannerp2.getText().replace("\n", " "), allInputValue.getProperty("HomePage.Bannerp2"), "equalsignorecase");
	
	}
	
	
	public static void sectionOneIotStarterKitTrackOrderValidation() throws InterruptedException
	{
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneTrackOrderButton, "NotEqual","Track Order Button in IoT Starter Kit banner");
		PostHomePagePO.SectionOneTrackOrderButton.click();
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneTrackOrderPRButton, "NotEqual","Track Order on click Button in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneTrackOrderText, "NotEqual","Track Order on Click Text in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.TrackOrderEmailID, "NotEqual","Enter Email ID Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(PostHomePagePO.TrackOrderEmailID, "Enter Email Address", "Track Order Email ID");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.TrackOrderCloseIcon, "NotEqual","Track Order Close Button in IoT Starter Kit");
		PostHomePagePO.TrackOrderCloseIcon.click();		
	}
	
	
	public static void sectionOneIotStarterKitEnterReferralCodeValidation() throws InterruptedException
	{Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneEnterReferralCodeButton, "NotEqual","Enter Referral Code Button in IoT Starter Kit");
		PostHomePagePO.SectionOneTrackOrderButton.click();
		try {	Thread.sleep(3000);	} 	catch (InterruptedException e)	{	e.printStackTrace();}	
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneOrderKitButton, "NotEqual","OrderKit Button in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneEnterReferralCodeText, "NotEqual","Enter Referral Code Text in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.EnterReferralCode, "NotEqual","Enter Referral Code Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(PostHomePagePO.EnterReferralCode, "Enter Referral Code", "Enter Referral Code");
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.EnterReferralCodeCloseIcon, "NotEqual","Enter Referral Code Close Button in IoT Starter Kit");
		//PostHomePagePO.EnterReferralCodeCloseIcon.click();		
	}

	
	public static void sectionTwoWhatThekitIncludesContentvalidation()
	{
		UtilityMethods.Imagevalidation(PostHomePagePO.SimIcon, "src",allInputValue.getProperty("tele2SimIcon"), "Tele2 Sim Icon");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimh1.getText(), "5 SIMS", "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimh2.getText(), "30 MB per SIM", "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimh3.getText(), "50 SMS", "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimp1.getText(), "with Post Connectivity", "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimp2.getText(), "per month for 3 months", "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.TextSimp3.getText(), "messages per SIM per month", "equalsignorecase");
	}
	
	
	public static void sectionTwoWhatThekitIncludesToolsvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(PostHomePagePO.ToolIcon, allInputValue.getProperty("tele2ToolIcon"), PostHomePagePO.ToolText, "Real-Time Testing Tool");
		UtilityMethods.whatThekitIncludesTextValidation(PostHomePagePO.ToolListText,"Test-as-you-build for fast, quality development","Visibility into device and network behavior","Diagnostics and troubleshooting help");		
	}
	
	
	public static void sectionTwoWhatThekitIncludesCentervalidation()
	{	
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(PostHomePagePO.CenterIcon, allInputValue.getProperty("tele2CenterIcon"), PostHomePagePO.CenterText,"Full Access to Tele2 M2M Control Center");
		UtilityMethods.whatThekitIncludesTextValidation(PostHomePagePO.CenterListText, "Complete suite of developer tools", "User logins for everyone on your team","Same environment for testing and deployment");		
	}

	
	public static void sectionTwoWhatThekitIncludesSuppportvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(PostHomePagePO.SupportIcon, allInputValue.getProperty("tele2SupportIcon"), PostHomePagePO.SupportText,"Exceptional Developer Support");
		UtilityMethods.whatThekitIncludesTextValidation(PostHomePagePO.SupportListText, "Developer guidelines", "Full access to APIs","M2M.com forum");
	}

	
	public static void sectionThreeHowItWorksValidation()
	{
		UtilityMethods.StringValidation(PostHomePagePO.HowItWorksText.getText(), "How it Works", "equalsignorecase");
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksOrder, "1", "Order", allInputValue.getProperty("HomePage.HowItWorksText1"));
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksActivate, "2", "Activate", allInputValue.getProperty("HomePage.HowItWorksText2"));
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksExplore, "3", "Explore", allInputValue.getProperty("HomePage.HowItWorksText3"));
		UtilityMethods.howItWorksValidation(PostHomePagePO.HowItWorksMonetize, "4", "Launch", allInputValue.getProperty("HomePage.HowItWorksText4"));	
	}
	
	
	public static void sectionFourWhatIsIotValidation()
	{
		UtilityMethods.Imagevalidation(PostHomePagePO.WhatIsIotImage, "src" , "http://tele2.devm2m.com/img/tele2/whatisiot.png", "What is IoT?");
		UtilityMethods.StringValidation(PostHomePagePO.WhatIsIotText.getText(), "What is IoT?", "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.WhatIsIotParaText1.getText(), allInputValue.getProperty("HomePage.WhatIsIoTP1"), "equalsignorecase");
		UtilityMethods.StringValidation(PostHomePagePO.WhatIsIotParaText2.getText(), allInputValue.getProperty("HomePage.WhatIsIoTP2"), "equalsignorecase");	
	}

	
	public static void sectionOneLinkvalidation()
	{
		UtilityMethods.sectionOneLinkvalidation(driver.findElements(By.xpath("//ul[@class='list-inline bl-whw']//li")).get(0));
		UtilityMethods.sectionOneLinkvalidation(driver.findElements(By.xpath("//ul[@class='list-inline bl-whw']//li")).get(1));
		UtilityMethods.sectionOneLinkvalidation(driver.findElements(By.xpath("//ul[@class='list-inline bl-whw']//li")).get(2));
	}
	
	
	public static void SectionThreeLearnMore() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.HowItWorksLearnMore, "NotEqual", "M2MDotCom Link Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.HowItWorksLearnMore,PostHomePagePO.M2MDotComFindElement,"Tel"); 	
	}
	

	public static void TrackOrderValidPageRedirection() throws InterruptedException

	{
	PostHomePagePO.SectionOneTrackOrderButton.click();
	PostHomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.validTrackOrderEmailID"));
	UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionOneTrackOrderPRButton, PostHomePagePO.SectionOneTrackOrderFindElement, "Tele2");
	}
	public static void TrackOrderInValidPageRedirection() throws InterruptedException
	{
		PostHomePagePO.SectionOneTrackOrderButton.click();
		PostHomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.InvalidTrackOrderEmailID"));
		UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionOneTrackOrderPRButton, PostHomePagePO.WhatIsIotImage, "Tele2");	
	}

	public static void SectionOTwoReferralRequestvalidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionTwoReferralRrequestButton, "NotEqual", "Section Two Referral Request Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionTwoReferralRrequestButton,PostHomePagePO.ReferrralRequestFindElement,"Tele2"); 
	}

	public static void SectionOneReferralRequestvalidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.SectionOneReferralRrequestButton, "NotEqual", "Section One Referral Request Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.SectionOneReferralRrequestButton,PostHomePagePO.ReferrralRequestFindElement,"Tele2"); 
	}
	
	
	public static void sectionTwoM2MDotCom() throws InterruptedException
	{
	UtilityMethods.DisplayEnableValidator(PostHomePagePO.M2mDotCom, "NotEqual", "M2MDotCom Link Button");
	UtilityMethods.PageNavigationValidation(PostHomePagePO.M2mDotCom,PostHomePagePO.M2MDotComFindElement,"M2M Developer Kits from the World�s Leading Mobile Operators"); 
	}

	
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
	public static void sectionFourJasperdotCom() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(PostHomePagePO.JasperDotCom, "NotEqual", "JasperDotCom Link Button");
		UtilityMethods.PageNavigationValidation(PostHomePagePO.JasperDotCom, PostHomePagePO.JasperDotComFindElement, "IoT Connectivity Management Platform | Cisco Jasper");
	}
	
	//failed
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
	


	@AfterTest
	public static void Exit()
	{
		extent.endTest(testcase);
		extent.flush();
		driver.close();
	} 
	
	
		
	
}