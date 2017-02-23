package pages;

import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import pageobjects.BellHomePagePO;
import utilitymethods.UtilityMethods;
public class BellHomePage extends BaseDriver
{
		public static FirefoxDriver driver;
		static Properties allInputValue;
		
	@BeforeTest
	public static void start() throws Exception
	{	 
		driver = launchApp();
		allInputValue = UtilityMethods.getBellPropValues();	
	}
			 
	@Test(priority=1)
	public static void validateOperatorLogo()
	{		
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellHomePagePO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");
		System.out.println(""+"TS001");
	} 
	
	@Test(priority=2)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellHomePagePO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");
		System.out.println(""+"TS002");
	}
	
	@Test(priority=3)
	public static void sectionOneIotStarterKitBellValidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerh1.getText(), allInputValue.getProperty("sectionOneH1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerh3.getText(), allInputValue.getProperty("sectionOneH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerp1.getText(), allInputValue.getProperty("sectionOneP1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerp2.getText(), allInputValue.getProperty("sectionOneP2"), "equalsignorecase");
		System.out.println(""+"TS003");
	}
				
	@Test(priority=4)
	public static void sectionOneIotStarterKitTrackOrderValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneTrackOrderButton, "NotEqual","Track Order Button in IoT Starter Kit banner");
		BellHomePagePO.SectionOneTrackOrderButton.click();
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneTrackOrderPRButton, "NotEqual","Track Order on click Button in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneTrackOrderText, "NotEqual","Track Order on Click Text in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.TrackOrderEmailID, "NotEqual","Enter Email ID Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(BellHomePagePO.TrackOrderEmailID, "Enter Email Address", "Track Order Email ID");
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.TrackOrderCloseIcon, "NotEqual","Track Order Close Button in IoT Starter Kit");
		BellHomePagePO.TrackOrderCloseIcon.click();		
		System.out.println(""+"TS004");
	}
	
	@Test(priority=5)
	public static void sectionOneIotStarterKitEnterReferralCodeValidation() throws InterruptedException
	{
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
		System.out.println(""+"TS005");
	}
		
	public static void sectionOneIotStarterKitTrackOrderErrorValidation()
	{
					 			 
	}
	
	public static void sectionOneIotStarterKitReferralCodeErrorValidation()
	{
					 				 
	}
				 
	@Test(priority=6)
	public static void sectionTwoWhatThekitIncludesContentvalidation()
	{
		UtilityMethods.Imagevalidation(BellHomePagePO.SimIcon, "src",allInputValue.getProperty("bellSimIcon"), "Bell Sim Icon");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh1.getText(), allInputValue.getProperty("whatTheKitIncludesSimh1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh2.getText(), allInputValue.getProperty("whatTheKitIncludesSimh2"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh3.getText(), allInputValue.getProperty("whatTheKitIncludesSimh3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimh4.getText(), allInputValue.getProperty("whatTheKitIncludesSimh4"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimp1.getText(), allInputValue.getProperty("whatTheKitIncludesSimp1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimp2.getText(), allInputValue.getProperty("whatTheKitIncludesSimp2"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextSimp3.getText(), allInputValue.getProperty("whatTheKitIncludesSimp3"), "equalsignorecase");
		System.out.println(""+"TS006");
	}
				 
	@Test(priority=7)
	public static void sectionTwoWhatThekitIncludesToolsvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.ToolIcon, allInputValue.getProperty("bellToolIcon"), BellHomePagePO.ToolText, allInputValue.getProperty("whatTheKitIncludesToolc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.ToolListText,allInputValue.getProperty("whatTheKitIncludesToolc2"),allInputValue.getProperty("whatTheKitIncludesToolc3"),allInputValue.getProperty("whatTheKitIncludesToolc4"));		
		System.out.println(""+"TS007");
	}
		
	@Test(priority=8)
	public static void sectionTwoWhatThekitIncludesCentervalidation()  
	{	
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.CenterIcon, allInputValue.getProperty("bellCenterIcon"), BellHomePagePO.CenterText,allInputValue.getProperty("whatTheKitIncludescenterc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.CenterListText, allInputValue.getProperty("whatTheKitIncludescenterc2"), allInputValue.getProperty("whatTheKitIncludescenterc3"),allInputValue.getProperty("whatTheKitIncludescenterc4"));		
		System.out.println(""+"TS008");
	}
	
	@Test(priority=9)
	public static void sectionTwoWhatThekitIncludesSuppportvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.SupportIcon, allInputValue.getProperty("bellSupportIcon"), BellHomePagePO.SupportText,allInputValue.getProperty("whatTheKitIncludesSupportc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.SupportListText, allInputValue.getProperty("whatTheKitIncludesSupportc2"), allInputValue.getProperty("whatTheKitIncludesSupportc3"),allInputValue.getProperty("whatTheKitIncludesSupportc4"));
		UtilityMethods.StringValidation(BellHomePagePO.PleaseNoteText.getText(), allInputValue.getProperty("pleaseNote"), "equalsignorecase");
		System.out.println(""+"TS009");
	}
	 
	@Test(priority=10)
	public static void sectionThreeHowItWorksValidation()
	{
		UtilityMethods.StringValidation(BellHomePagePO.HowItWorksText.getText(), "How it Works", "equalsignorecase");
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksOrder, "1", "Buy", allInputValue.getProperty("howItWorksText1"));
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksActivate, "2", "Activate", allInputValue.getProperty("howItWorksText2"));
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksExplore, "3", "Create", allInputValue.getProperty("howItWorksText3"));
		UtilityMethods.howItWorksValidation(BellHomePagePO.HowItWorksMonetize, "4", "Launch", allInputValue.getProperty("howItWorksText4"));	
		System.out.println(""+"TS0010");
	}	
	
	@Test(priority=11)
	public static void sectionFourWhatIsIotValidation()
	{
		UtilityMethods.Imagevalidation(BellHomePagePO.WhatIsIotImage, "src" , allInputValue.getProperty("whatIsIot"), "What is IoT?");
		UtilityMethods.StringValidation(BellHomePagePO.WhatIsIotText.getText(), "What is IoT?", "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.WhatIsIotParaText1.getText(), allInputValue.getProperty("whatIsIoTP1"), "equalsignorecase");
		System.out.println(""+"TS0011");
	}
	
	@Test(priority=12)
	public static void sectionOneLinkvalidation() throws Exception
	{
		UtilityMethods.sectionOneLinkvalidation(BellHomePagePO.WhattheKitIncludeLink);
		UtilityMethods.sectionOneLinkvalidation(BellHomePagePO.HowItWorkslink);
		UtilityMethods.sectionOneLinkvalidation(BellHomePagePO.WhatIsIotLink);
		System.out.println(""+"TS0012");
	}
	@Test(priority=13)
	public static void sectionFiveWithBell()
	{
		UtilityMethods.StringValidation(BellHomePagePO.WithBellTexth3.getText(), allInputValue.getProperty("withBellH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.WithBellTextp1.getText(), allInputValue.getProperty("withBellp1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.WithBellTextp2.getText(), allInputValue.getProperty("withBellp2"), "equalsignorecase");
		System.out.println(""+"TS0013");
	}
	
	@Test(priority=14)
	public static void sectionFiveLTE()
	{
		UtilityMethods.Imagevalidation(BellHomePagePO.LTENetworkIcon, "src" , allInputValue.getProperty("lTEIcon"), "LTE Icon?");
		UtilityMethods.StringValidation(BellHomePagePO.LTENetworkTexth3.getText(), allInputValue.getProperty("lTEnetworkH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.LTENetworkTextP.getText(), allInputValue.getProperty("lTEnetworkp1"), "equalsignorecase");
		System.out.println(""+"TS0014");
	}
	@Test(priority=15)
	public static void sectionFivePartners()
	{
		UtilityMethods.Imagevalidation(BellHomePagePO.PartnerIcon, "src" , allInputValue.getProperty("partnerIcon"), "Partners Icon");
		UtilityMethods.StringValidation(BellHomePagePO.PartnerTexth3.getText(), allInputValue.getProperty("partnersH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.PartnerTextP.getText(), allInputValue.getProperty("partnersP1"), "equalsignorecase");
		System.out.println(""+"TS0015");
	}
	@Test(priority=16)
	public static void sectionFiveEndToEnd()
	{
		UtilityMethods.Imagevalidation(BellHomePagePO.EndToEndIcon, "src" , allInputValue.getProperty("endToEndIcon"), "End To End");
		UtilityMethods.StringValidation(BellHomePagePO.EndToEndyTexth3.getText(), allInputValue.getProperty("endToEndH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.EndToEndTextP.getText(), allInputValue.getProperty("endToEndP1"), "equalsignorecase");
		System.out.println(""+"TS0016");
	}
	@Test(priority=17)
	public static void bellLogoValidation() throws InterruptedException
	{
		UtilityMethods.PageNavigationValidation(BellHomePagePO.BellLogo,BellHomePagePO.WhatIsIotImage,"Bell"); 
		
	}
	
	@Test(priority=18)
	public static void ciscoLogoValidation() throws InterruptedException
	{
		UtilityMethods.PageNavigationValidation(BellHomePagePO.CiscoLogo,BellHomePagePO.JasperDotComFindElement,"IoT Connectivity Management Platform | Cisco Jasper"); 
		
	}


	@Test(priority=19)
	public static void sectionOneReferralRequestvalidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionOneReferralRrequestButton, "NotEqual", "Section One Referral Request Button");
		UtilityMethods.PageNavigationValidation(BellHomePagePO.SectionOneReferralRrequestButton,BellHomePagePO.ReferrralRequestFindElement,"Bell"); 
		System.out.println(""+"TS0018");
	}
	
	@Test(priority=20)
	public static void sectionTwoReferralRequestvalidation() throws InterruptedException
	{
		//UtilityMethods.DisplayEnableValidator(BellHomePagePO.SectionTwoReferralRrequestButton, "NotEqual", "Section Two Referral Request Button");
		//UtilityMethods.PageNavigationValidation(BellHomePagePO.SectionTwoReferralRrequestButton,BellHomePagePO.ReferrralRequestFindElement,"Bell"); 
		
		BellHomePagePO.SectionTwoReferralRrequestButton.click();
		Thread.sleep(3000);
		String parentHandle = driver.getWindowHandle();
		try 
		{
		System.out.println("Try Block");
			for(String winHandle : driver.getWindowHandles())
		    {
				System.out.println("For each");
		        driver.switchTo().window(winHandle);
		        System.out.println("" +driver.getTitle());
			    if (driver.getTitle().equals("Bell"))
			    {
			    	if(!BellHomePagePO.ReferrralRequestFindElement.isDisplayed());
			    	{
					System.out.println("Page Rredirection Failed for"+BellHomePagePO.SectionTwoReferralRrequestButton.getText()+"");
					//Assert.assertEquals(true, FindElement.isDisplayed());
		        	}
			    }
		    }
		    driver.switchTo().window(parentHandle);
		  }
		catch(Exception e)
		{
		   System.out.println("Condition fail");
		}
				
		System.out.println(""+"TS0017");
		}
	@Test(priority=21)
	public static void TrackOrderValidPageRedirection() throws InterruptedException
	{
		BellHomePagePO.SectionOneTrackOrderButton.click();
		BellHomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.validTrackOrderEmailID"));
		UtilityMethods.PageNavigationValidation(BellHomePagePO.SectionOneTrackOrderPRButton, BellHomePagePO.SectionOneTrackOrderFindElement, "Post");
	}
	
	@Test(priority=22)
	public static void TrackOrderInValidPageRedirection() throws InterruptedException
	{
		BellHomePagePO.SectionOneTrackOrderButton.click();
		BellHomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.InvalidTrackOrderEmailID"));
		UtilityMethods.PageNavigationValidation(BellHomePagePO.SectionOneTrackOrderPRButton, BellHomePagePO.WhatIsIotImage, "Post");	
	}
	@Test(priority=23)
	public static void sectionTwoM2MDotCom() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.M2mDotCom, "NotEqual", "M2MDotCom Link Button");
		UtilityMethods.PageNavigationValidation(BellHomePagePO.M2mDotCom,BellHomePagePO.M2MDotComFindElement,"M2M Developer Kits from the World�s Leading Mobile Operators"); 
	}
	
	@Test(priority=24)
	public static void sectionFourJasperdotCom() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.JasperDotCom, "NotEqual", "JasperDotCom Link Button");
		UtilityMethods.PageNavigationValidation(BellHomePagePO.JasperDotCom, BellHomePagePO.JasperDotComFindElement, "IoT Connectivity Management Platform | Cisco Jasper");
	}
	
	
}
