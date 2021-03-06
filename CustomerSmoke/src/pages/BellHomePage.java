package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import driver.BaseDriver;
import pageobjects.BellHomePagePO;
import utilitymethods.UtilityMethods;
public class BellHomePage extends BaseDriver
{
		public static WebDriver driver =BaseDriver.driver;
		static Properties allInputValue;
		public static	String BrowserForUse;
	//@BeforeTest
	public static WebDriver start() throws Exception
	{	
		allInputValue = UtilityMethods.getBellPropValues();
		return driver = launchApp(allInputValue.getProperty("BaseURl"));
	}
			 
	//@Test(priority=1)
	public static void validateOperatorLogo() 
	{		
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellHomePagePO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");
		System.out.println("HP001");
	} 
	
	//@Test(priority=2)
	public static void validateCompanyLogo() 
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellHomePagePO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");
		System.out.println("HP002");
	}
	
	//@Test(priority=3)
	public static void sectionOneIotStarterKitBellValidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerh1.getText(), allInputValue.getProperty("sectionOneH1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerh3.getText(), allInputValue.getProperty("sectionOneH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerp1.getText(), allInputValue.getProperty("sectionOneP1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerp2.getText(), allInputValue.getProperty("sectionOneP2"), "equalsignorecase");
		System.out.println("HP003");
	}
				
	//@Test(priority=4)
	public static void sectionOneIotStarterKitTrackOrderValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneTrackOrderButton, "NotEqual","Track Order Button in IoT Starter Kit banner");
		BellHomePagePO.SectionOneTrackOrderButton.click();
		Thread.sleep(2000);
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneTrackOrderPRButton, "NotEqual","Track Order on click Button in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneTrackOrderText, "NotEqual","Track Order on Click Text in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.TrackOrderEmailID, "NotEqual","Enter Email ID Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(BellHomePagePO.TrackOrderEmailID, "Enter Email Address", "Track Order Email ID");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.TrackOrderCloseIcon, "NotEqual","Track Order Close Button in IoT Starter Kit");
		BellHomePagePO.TrackOrderCloseIcon.click();		
		System.out.println("HP004");
	}
	
	//@Test(priority=5)
	public static void sectionOneIotStarterKitEnterReferralCodeValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneEnterReferralCodeButton, "NotEqual","Enter Referral Code Button in IoT Starter Kit");
		BellHomePagePO.SectionOneEnterReferralCodeButton.click();
		Thread.sleep(3000);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneOrderKitButton, "NotEqual","OrderKit Button in IoT Starter Kit ");				
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneEnterReferralCodeText, "NotEqual","Enter Referral Code Text in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.EnterReferralCode, "NotEqual","Enter Referral Code Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(BellHomePagePO.EnterReferralCode, "Enter Referral Code", "Enter Referral Code");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.EnterReferralCodeCloseIcon, "NotEqual","Enter Referral Code Close Button in IoT Starter Kit");
		Thread.sleep(1000);	
		BellHomePagePO.EnterReferralCodeCloseIcon.click();	
		System.out.println("HP005");
	}
	//@Test(priority=6)	
	public static void sectionOneIotStarterKitTrackOrderErrorValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		BellHomePagePO.SectionOneTrackOrderButton.click();
		Thread.sleep(1000);
		BellHomePagePO.SectionOneTrackOrderPRButton.click();
		Thread.sleep(1000);
		UtilityMethods.TrackEmailIdvalidation(BellHomePagePO.TrackOrderEmailID, BellHomePagePO.TrackOrderInValidEmailError, allInputValue.getProperty("InvalidEmailID"),BellHomePagePO.SectionOneTrackOrderPRButton);			 			 
		Thread.sleep(1000);
		UtilityMethods.TrackOrderErrorValidation(BellHomePagePO.TrackOrderEmailID, BellHomePagePO.TrackOrderError);
		Thread.sleep(1000);
		BellHomePagePO.TrackOrderCloseIcon.click();
		System.out.println("HP006");
	}
	//@Test(priority=7)
	public static void sectionOneIotStarterKitReferralCodeErrorValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		BellHomePagePO.SectionOneEnterReferralCodeButton.click();
		Thread.sleep(1000);
		BellHomePagePO.SectionOneOrderKitButton.click();
		Thread.sleep(1000);
		UtilityMethods.EnterReferralCodeValidation(BellHomePagePO.EnterReferralCode, BellHomePagePO.ReferralCodeError);
		Thread.sleep(1000);
		BellHomePagePO.EnterReferralCodeCloseIcon.click();	
		Thread.sleep(1000);
		System.out.println("HP007");
	}
				 
	//@Test(priority=8)
	public static void sectionTwoWhatThekitIncludesContentvalidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.Imagevalidation(BellHomePagePO.SimIcon, "src",allInputValue.getProperty("bellSimIcon"), "Bell Sim Icon");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh1.getText(), allInputValue.getProperty("whatTheKitIncludesSimh1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh2.getText(), allInputValue.getProperty("whatTheKitIncludesSimh2"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh3.getText(), allInputValue.getProperty("whatTheKitIncludesSimh3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh4.getText(), allInputValue.getProperty("whatTheKitIncludesSimh4"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimp1.getText(), allInputValue.getProperty("whatTheKitIncludesSimp1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimp2.getText(), allInputValue.getProperty("whatTheKitIncludesSimp2"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimp3.getText(), allInputValue.getProperty("whatTheKitIncludesSimp3"), "equalsignorecase");
		System.out.println("HP008");
	}
				 
	//@Test(priority=9)
	public static void sectionTwoWhatThekitIncludesToolsvalidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.ToolIcon, allInputValue.getProperty("bellToolIcon"), BellHomePagePO.ToolText, allInputValue.getProperty("whatTheKitIncludesToolc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.ToolListText,allInputValue.getProperty("whatTheKitIncludesToolc2"),allInputValue.getProperty("whatTheKitIncludesToolc3"),allInputValue.getProperty("whatTheKitIncludesToolc4"));		
		System.out.println("HP009");
	}
		
	//@Test(priority=10)
	public static void sectionTwoWhatThekitIncludesCentervalidation()  
	{	
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.CenterIcon, allInputValue.getProperty("bellCenterIcon"), BellHomePagePO.CenterText,allInputValue.getProperty("whatTheKitIncludescenterc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.CenterListText, allInputValue.getProperty("whatTheKitIncludescenterc2"), allInputValue.getProperty("whatTheKitIncludescenterc3"),allInputValue.getProperty("whatTheKitIncludescenterc4"));		
		System.out.println("HP010");
	}
	
	//@Test(priority=11)
	public static void sectionTwoWhatThekitIncludesSuppportvalidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.SupportIcon, allInputValue.getProperty("bellSupportIcon"), BellHomePagePO.SupportText,allInputValue.getProperty("whatTheKitIncludesSupportc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.SupportListText, allInputValue.getProperty("whatTheKitIncludesSupportc2"), allInputValue.getProperty("whatTheKitIncludesSupportc3"),allInputValue.getProperty("whatTheKitIncludesSupportc4"));
		UtilityMethods.StringValidation(BellHomePagePO.PleaseNoteText.getText(), allInputValue.getProperty("pleaseNote"), "equalsignorecase");
		System.out.println("HP011");
	}
	 
	//@Test(priority=12)
	public static void sectionThreeHowItWorksValidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.StringValidation(BellHomePagePO.HowItWorksText.getText(), "How it Works", "equalsignorecase");
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksOrder, "1", "Buy", allInputValue.getProperty("howItWorksText1"));
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksActivate, "2", "Activate", allInputValue.getProperty("howItWorksText2"));
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksExplore, "3", "Create", allInputValue.getProperty("howItWorksText3"));
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksMonetize, "4", "Launch", allInputValue.getProperty("howItWorksText4"));	
		System.out.println("HP012");
	}	
	
	//@Test(priority=13)
	public static void sectionFourWhatIsIotValidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.Imagevalidation(BellHomePagePO.WhatIsIotImage, "src" , allInputValue.getProperty("whatIsIot"), "What is IoT?");
		UtilityMethods.StringValidation(BellHomePagePO.WhatIsIotText.getText(), "What is IoT?", "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.WhatIsIotParaText1.getText(), allInputValue.getProperty("whatIsIoTP1"), "equalsignorecase");
		System.out.println("HP013");
	}
	
	//@Test(priority=14)
	public static void sectionOneLinkvalidation() throws Exception
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.sectionOneLinkvalidation(BellHomePagePO.WhattheKitIncludeLink);
		UtilityMethods.sectionOneLinkvalidation(BellHomePagePO.HowItWorkslink);
		UtilityMethods.sectionOneLinkvalidation(BellHomePagePO.WhatIsIotLink);
		System.out.println("HP014");
	}
	//@Test(priority=15)
	public static void sectionFiveWithBell()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.StringValidation(BellHomePagePO.WithBellTexth3.getText(), allInputValue.getProperty("withBellH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.WithBellTextp1.getText(), allInputValue.getProperty("withBellp1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.WithBellTextp2.getText(), allInputValue.getProperty("withBellp2"), "equalsignorecase");
		System.out.println("HP015");
	}
	
	//@Test(priority=16)
	public static void sectionFiveLTE()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.Imagevalidation(BellHomePagePO.LTENetworkIcon, "src" , allInputValue.getProperty("lTEIcon"), "LTE Icon?");
		UtilityMethods.StringValidation(BellHomePagePO.LTENetworkTexth3.getText(), allInputValue.getProperty("lTEnetworkH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.LTENetworkTextP.getText(), allInputValue.getProperty("lTEnetworkp1"), "equalsignorecase");
		System.out.println("HP016");
	}
	//@Test(priority=17)
	public static void sectionFivePartners()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.Imagevalidation(BellHomePagePO.PartnerIcon, "src" , allInputValue.getProperty("partnerIcon"), "Partners Icon");
		UtilityMethods.StringValidation(BellHomePagePO.PartnerTexth3.getText(), allInputValue.getProperty("partnersH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.PartnerTextP.getText(), allInputValue.getProperty("partnersP1"), "equalsignorecase");
		System.out.println("HP017");
	}
	//@Test(priority=18)
	public static void sectionFiveEndToEnd()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.Imagevalidation(BellHomePagePO.EndToEndIcon, "src" , allInputValue.getProperty("endToEndIcon"), "End To End");
		UtilityMethods.StringValidation(BellHomePagePO.EndToEndyTexth3.getText(), allInputValue.getProperty("endToEndH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.EndToEndTextP.getText(), allInputValue.getProperty("endToEndP1"), "equalsignorecase");
		System.out.println("HP018");
	}
	
	//@Test(priority=19)
	public static void sectionTwoM2MDotCom() throws InterruptedException
	{   
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.M2MDotCom, "NotEqual", "M2MDotCom Link Button");
		UtilityMethods.PageNavigationValidation(BellHomePagePO.M2MDotCom,BellHomePagePO.M2MDotComFindElement,"M2M Developer Kits from the World�s Leading Mobile Operators"); 
		System.out.println("HP0019");
	}
	
	
	//@Test(priority=20)
	public static void sectionFourLearnMoreFromBell() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.LearnMoreFromBell, "NotEqual", "JasperDotCom Link Button");
		UtilityMethods.PageNavigationValidation(BellHomePagePO.LearnMoreFromBell, BellHomePagePO.LearnMoreFromBellFindElement, "Request a callback for Bell Mobile Business Solutions");
		System.out.println("HP020");
	}
	
	//@Test(priority=21)
	public static void sectionOneReferralRequestvalidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneReferralRrequestButton, "NotEqual", "Section One Referral Request Button");
		UtilityMethods.pageRedirection(BellHomePagePO.SectionOneReferralRrequestButton,BellHomePagePO.ReferrralRequestFindElement,"");
		System.out.println("HP021");
	}
	
	//@Test(priority=22)
	public static void sectionTwoReferralRequestvalidation() throws InterruptedException, AWTException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionTwoReferralRrequestButton, "NotEqual", "Section Two Referral Request Button");
		BrowserForUse=allInputValue.getProperty("Broswer");
		if (BrowserForUse.equals("IE"))
		{
			UtilityMethods.sleep(6000);
			System.out.println("Page redirection Done");
			/*if(!BellHomePagePO.SectionTwoReferralRrequestButton.isEnabled())
			{
				Robot rb =new Robot();
				rb.keyPress(KeyEvent.VK_ESCAPE);
				rb.keyRelease(KeyEvent.VK_ESCAPE);
				UtilityMethods.sleep(2000);
				driver.navigate().refresh();
				UtilityMethods.sleep(5000);
			}
			BellHomePagePO.SectionTwoReferralRrequestButton.click();
			UtilityMethods.sleep(5000);
			if(BellHomePagePO.ReferrralRequestFindElement.isDisplayed())
			{
			driver.navigate().back();
			System.out.println("Page redirection Done");
			}
			else
			{
			System.out.println("Page redirection failed");	
			}*/
		}
		else
		{
		driver.navigate().refresh();
		UtilityMethods.pageRedirection(BellHomePagePO.SectionTwoReferralRrequestButton, BellHomePagePO.ReferrralRequestFindElement,"");			
		}
		System.out.println("HP022");
		
	}
	//@Test(priority=23)
	public static void bellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.pageRedirection(BellHomePagePO.BellLogo, BellHomePagePO.WhatIsIotImage,"");
		System.out.println("HP023");
	}
	
	////@Test(priority=25)
	public static void TrackOrderValidPageRedirection() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		BellHomePagePO.SectionOneTrackOrderButton.click();
		BellHomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.validTrackOrderEmailID"));
		UtilityMethods.PageNavigationValidation(BellHomePagePO.SectionOneTrackOrderPRButton, BellHomePagePO.SectionOneTrackOrderFindElement, "Post");
		System.out.println(""+"TS0023");
	}
	
	public static void ReferralRequestButtonRedirection() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		System.out.println("Req Buttton is displayed  :"+BellHomePagePO.SectionOneReferralRrequestButton.isDisplayed()+"");
		System.out.println("Req Buttton is enabled :"+BellHomePagePO.SectionOneReferralRrequestButton.isEnabled()+"");
		BellHomePagePO.SectionOneReferralRrequestButton.click();	
		System.out.println("HP024");
	}
}
