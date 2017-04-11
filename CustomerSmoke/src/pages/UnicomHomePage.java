package pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.BellHomePagePO;
import pageobjects.UnicomHomePagePO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class UnicomHomePage extends BaseDriver
{
	public static WebDriver driver =BaseDriver.driver;
	static Properties allInputValue;
	public static	String BrowserForUse;
	@BeforeTest
	public static WebDriver start() throws Exception
	{	
		allInputValue = UtilityMethods.getUnicomPropValues();
		return driver = launchApp(allInputValue.getProperty("BaseURl"));
	}
	@Test(priority=1)
	public static void validateOperatorLogo() 
	{		
		PageFactory.initElements(driver, UnicomHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.UnicomLogo, "NotEqual","China Unicom Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(UnicomHomePagePO.UnicomLogo,"src",allInputValue.getProperty("UnicomLogo"),"China Unicom Operator Logo");
		System.out.println("HP001");
	} 
	@Test(priority=2)
	public static void validateCompanyLogo() 
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(UnicomHomePagePO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");
		System.out.println("HP002");
	}
	@Test(priority=3)
	public static void sectionOneIotStarterKitBellValidation()
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);	
		UtilityMethods.StringValidation(UnicomHomePagePO.TextBannerh1.getText(), allInputValue.getProperty("sectionOneH1"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextBannerh3.getText(), allInputValue.getProperty("sectionOneH3"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextBannerp1.getText().replace("\n", " "), allInputValue.getProperty("sectionOneP1"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextBannerp2.getText().replace("\n", " "), allInputValue.getProperty("sectionOneP2"), "equalsignorecase");
		System.out.println("HP003");
	}

	@Test(priority=4)
	public static void sectionOneIotStarterKitTrackOrderValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);	
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionOneTrackOrderButton, "NotEqual","Track Order Button in IoT Starter Kit banner");
		UnicomHomePagePO.SectionOneTrackOrderButton.click();
		Thread.sleep(2000);
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionOneTrackOrderPRButton, "NotEqual","Track Order on click Button in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionOneTrackOrderText, "NotEqual","Track Order on Click Text in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.TrackOrderEmailID, "NotEqual","Enter Email ID Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(UnicomHomePagePO.TrackOrderEmailID, "Enter Email Address", "Track Order Email ID");
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.TrackOrderCloseIcon, "NotEqual","Track Order Close Button in IoT Starter Kit");
		UnicomHomePagePO.TrackOrderCloseIcon.click();		
		System.out.println("HP004");
	}

	@Test(priority=5)
	public static void sectionOneIotStarterKitEnterReferralCodeValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionOneEnterReferralCodeButton, "NotEqual","Enter Referral Code Button in IoT Starter Kit");
		UnicomHomePagePO.SectionOneEnterReferralCodeButton.click();
		Thread.sleep(3000);	
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionOneOrderKitButton, "NotEqual","OrderKit Button in IoT Starter Kit ");				
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionOneEnterReferralCodeText, "NotEqual","Enter Referral Code Text in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.EnterReferralCode, "NotEqual","Enter Referral Code Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(UnicomHomePagePO.EnterReferralCode, "Enter Referral Code", "Enter Referral Code");
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.EnterReferralCodeCloseIcon, "NotEqual","Enter Referral Code Close Button in IoT Starter Kit");
		Thread.sleep(1000);	
		UnicomHomePagePO.EnterReferralCodeCloseIcon.click();	
		System.out.println("HP005");
	}
	@Test(priority=6)	
	public static void sectionOneIotStarterKitTrackOrderErrorValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UnicomHomePagePO.SectionOneTrackOrderButton.click();
		Thread.sleep(1000);
		UnicomHomePagePO.SectionOneTrackOrderPRButton.click();
		Thread.sleep(1000);
		UtilityMethods.TrackEmailIdvalidation(UnicomHomePagePO.TrackOrderEmailID, UnicomHomePagePO.TrackOrderInValidEmailError, allInputValue.getProperty("InvalidEmailID"),UnicomHomePagePO.SectionOneTrackOrderPRButton);			 			 
		Thread.sleep(1000);
		UtilityMethods.TrackOrderErrorValidation(UnicomHomePagePO.TrackOrderEmailID, UnicomHomePagePO.TrackOrderError);
		Thread.sleep(1000);
		UnicomHomePagePO.TrackOrderCloseIcon.click();
		System.out.println("HP006");
	}
	@Test(priority=7)
	public static void sectionOneIotStarterKitReferralCodeErrorValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UnicomHomePagePO.SectionOneEnterReferralCodeButton.click();
		Thread.sleep(1000);
		UnicomHomePagePO.SectionOneOrderKitButton.click();
		Thread.sleep(1000);
		UtilityMethods.EnterReferralCodeValidation(UnicomHomePagePO.EnterReferralCode, UnicomHomePagePO.ReferralCodeError);
		Thread.sleep(1000);
		UnicomHomePagePO.EnterReferralCodeCloseIcon.click();	
		Thread.sleep(1000);
		System.out.println("HP007");
	}
	@Test(priority=8)
	public static void sectionTwoWhatThekitIncludesContentvalidation()
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.Imagevalidation(UnicomHomePagePO.SimIcon, "src",allInputValue.getProperty("bellSimIcon"), "Bell Sim Icon");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextSimh1.getText(), allInputValue.getProperty("whatTheKitIncludesSimh1"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextSimh2.getText(), allInputValue.getProperty("whatTheKitIncludesSimh2"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextSimh3.getText(), allInputValue.getProperty("whatTheKitIncludesSimh3"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextSimp1.getText(), allInputValue.getProperty("whatTheKitIncludesSimp1"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextSimp2.getText(), allInputValue.getProperty("whatTheKitIncludesSimp2"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.TextSimp3.getText(), allInputValue.getProperty("whatTheKitIncludesSimp3"), "equalsignorecase");
		System.out.println("HP008");
	}

	@Test(priority=9)
	public static void sectionTwoWhatThekitIncludesToolsvalidation()
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(UnicomHomePagePO.ToolIcon, allInputValue.getProperty("bellToolIcon"), UnicomHomePagePO.ToolText, allInputValue.getProperty("whatTheKitIncludesToolc1"));
		UtilityMethods.whatThekitIncludesTextValidation(UnicomHomePagePO.ToolListText,allInputValue.getProperty("whatTheKitIncludesToolc2"),allInputValue.getProperty("whatTheKitIncludesToolc3"),allInputValue.getProperty("whatTheKitIncludesToolc4"));		
		System.out.println("HP009");
	}

	@Test(priority=10)
	public static void sectionTwoWhatThekitIncludesCentervalidation()  
	{	
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(UnicomHomePagePO.CenterIcon, allInputValue.getProperty("bellCenterIcon"), UnicomHomePagePO.CenterText,allInputValue.getProperty("whatTheKitIncludescenterc1"));
		UtilityMethods.whatThekitIncludesTextValidation(UnicomHomePagePO.CenterListText, allInputValue.getProperty("whatTheKitIncludescenterc2"), allInputValue.getProperty("whatTheKitIncludescenterc3"),allInputValue.getProperty("whatTheKitIncludescenterc4"));		
		System.out.println("HP010");
	}

	@Test(priority=11)
	public static void sectionTwoWhatThekitIncludesSuppportvalidation()
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(UnicomHomePagePO.SupportIcon, allInputValue.getProperty("bellSupportIcon"), UnicomHomePagePO.SupportText,allInputValue.getProperty("whatTheKitIncludesSupportc1"));
		UtilityMethods.whatThekitIncludesTextValidation(UnicomHomePagePO.SupportListText, allInputValue.getProperty("whatTheKitIncludesSupportc2"), allInputValue.getProperty("whatTheKitIncludesSupportc3"),allInputValue.getProperty("whatTheKitIncludesSupportc4"));
		System.out.println("HP011");
	}

	@Test(priority=12)
	public static void sectionThreeHowItWorksValidation()
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.StringValidation(UnicomHomePagePO.HowItWorksText.getText(), "How it Works", "equalsignorecase");
		UtilityMethods.howItWorksValidation(UnicomHomePagePO.HowItWorksOrder, "1", "Buy", allInputValue.getProperty("howItWorksText1"));
		UtilityMethods.howItWorksValidation(UnicomHomePagePO.HowItWorksActivate, "2", "Activate", allInputValue.getProperty("howItWorksText2"));
		UtilityMethods.howItWorksValidation(UnicomHomePagePO.HowItWorksExplore, "3", "Create", allInputValue.getProperty("howItWorksText3"));
		UtilityMethods.howItWorksValidation(UnicomHomePagePO.HowItWorksMonetize, "4", "Launch", allInputValue.getProperty("howItWorksText4"));	
		System.out.println("HP012");
	}	

	@Test(priority=13)
	public static void sectionFourWhatIsIotValidation()
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.Imagevalidation(UnicomHomePagePO.WhatIsIotImage, "src" , allInputValue.getProperty("whatIsIot"), "What is IoT?");
		UtilityMethods.StringValidation(UnicomHomePagePO.WhatIsIotText.getText(), "What is IoT?", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomHomePagePO.WhatIsIotParaText1.getText(), allInputValue.getProperty("whatIsIoTP1"), "equalsignorecase");
		System.out.println("HP013");
	}

	@Test(priority=14)
	public static void sectionOneLinkvalidation() throws Exception
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.sectionOneLinkvalidation(UnicomHomePagePO.WhattheKitIncludeLink);
		UtilityMethods.sectionOneLinkvalidation(UnicomHomePagePO.HowItWorkslink);
		UtilityMethods.sectionOneLinkvalidation(UnicomHomePagePO.WhatIsIotLink);
		System.out.println("HP014");
	}
	
	@Test(priority=17)
	public static void sectionTwoM2MDotCom() throws InterruptedException
	{   
		PageFactory.initElements(driver, UnicomHomePagePO.class);	
		driver.navigate().refresh();
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.M2MDotCom, "NotEqual", "M2MDotCom Link Button");
		UtilityMethods.PageNavigationValidation(UnicomHomePagePO.M2MDotCom,UnicomHomePagePO.M2MDotComFindElement,"M2M Developer Kits from the World�s Leading Mobile Operators"); 
		System.out.println("HP017");
	}
	
	
	@Test(priority=15)
	public static void sectionOneReferralRequestvalidation() throws InterruptedException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionOneReferralRrequestButton, "NotEqual", "Section One Referral Request Button");
		UtilityMethods.pageRedirection(UnicomHomePagePO.SectionOneReferralRrequestButton,UnicomHomePagePO.ReferrralRequestFindElement,"");
		System.out.println("HP015");
	}
	
	@Test(priority=16)
	public static void sectionTwoReferralRequestvalidation() throws InterruptedException, AWTException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.DisplayEnableValidator(UnicomHomePagePO.SectionTwoReferralRrequestButton, "NotEqual", "Section Two Referral Request Button");
		BrowserForUse=allInputValue.getProperty("Broswer");
		if (BrowserForUse.equals("IE"))
		{
			UtilityMethods.sleep(6000);
			System.out.println("Page redirection Done");
		}
		else
		{
		driver.navigate().refresh();
		UtilityMethods.pageRedirection(UnicomHomePagePO.SectionTwoReferralRrequestButton, UnicomHomePagePO.ReferrralRequestFindElement,"");			
		}
		System.out.println("HP016");
	}
	@Test(priority=18)
	public static void bellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		UtilityMethods.pageRedirection(UnicomHomePagePO.UnicomLogo, UnicomHomePagePO.WhatIsIotImage,"");
		System.out.println("HP018");
	}

	@Test(priority=19)
	public static void ReferralRequestButtonRedirection() throws InterruptedException
	{
		PageFactory.initElements(driver, UnicomHomePagePO.class);
		System.out.println("Req Buttton is displayed  :"+UnicomHomePagePO.SectionOneReferralRrequestButton.isDisplayed()+"");
		System.out.println("Req Buttton is enabled :"+UnicomHomePagePO.SectionOneReferralRrequestButton.isEnabled()+"");
		UnicomHomePagePO.SectionOneReferralRrequestButton.click();	
		System.out.println("HP019");
	}	

}