package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import utilitymethods.UtilityMethods;

public class UnicomEndToEndFlowOne extends BaseDriver

{
	public static WebDriver driver;
	static Properties allInputValue;

	//@BeforeTest
	public static void DeletingPreviousEmail()
	{
		EmailIntegration.DeleteAllEmail();
	}
	@BeforeTest
	//@Test(priority=1)
	public static void BrowserIntilation() throws Exception
	{
		driver = UnicomHomePage.start();
	}

	@Test(priority=2)
	public static void HomePageBellLogo() 
	{
		UnicomHomePage.validateOperatorLogo();
	}
	@Test(priority=3)
	public static void HomePageCiscoLogo()
	{
		UnicomHomePage.validateCompanyLogo();
	}
	@Test(priority=4)
	public static void HomePageSecOneTextValidation()
	{
		UnicomHomePage.sectionOneIotStarterKitUnicomValidation();
	}
	@Test(priority=5)
	public static void HomePageTrackOrderValidation() throws InterruptedException
	{
		UnicomHomePage.sectionOneIotStarterKitTrackOrderValidation();	
	}
	@Test(priority=6)
	public static void HomePageReferralCodeValidation() throws InterruptedException
	{
		UnicomHomePage.sectionOneIotStarterKitEnterReferralCodeValidation();
	}
	@Test(priority=7)
	public static void HomePageTrackOrderErrorValidation() throws InterruptedException
	{
		UnicomHomePage.sectionOneIotStarterKitTrackOrderErrorValidation();
	}
	@Test(priority=8)
	public static void HomePageEnterrefrralCodeErrorvalidation() throws InterruptedException
	{
		UnicomHomePage.sectionOneIotStarterKitReferralCodeErrorValidation();
	}
	@Test(priority=9)
	public static void HomePageSecTwoContentValidation()
	{
		UnicomHomePage.sectionTwoWhatThekitIncludesContentvalidation();
	} 
	@Test(priority=10)
	public static void HomePageSecTwoWhatThekitIncludesToolsvalidation()
	{
		UnicomHomePage.sectionTwoWhatThekitIncludesToolsvalidation();
	}	
	@Test(priority=11)
	public static void HomePageSecTwoWhatThekitIncludesCentervalidation()  
	{	
		UnicomHomePage.sectionTwoWhatThekitIncludesCentervalidation();
	}
	@Test(priority=12)
	public static void HomePagesectionTwoWhatThekitIncludesSuppportvalidation()
	{	
		UnicomHomePage.sectionTwoWhatThekitIncludesSuppportvalidation();
	}
	@Test(priority=13)
	public static void HomePagesectionThreeHowItWorksValidation()
	{	
		UnicomHomePage.sectionThreeHowItWorksValidation();
	}	
	@Test(priority=14)
	public static void HomePagesectionFourWhatIsIotValidation()
	{		
		UnicomHomePage.sectionFourWhatIsIotValidation();
	}
	@Test(priority=15)
	public static void HomePagesectionOneLinkvalidation() throws Exception
	{		
		UnicomHomePage.sectionOneLinkvalidation();
	}
	@Test(priority=21)
	public static void HomePageSecOneReferralRequesButton() throws InterruptedException
	{
		UnicomHomePage.sectionOneReferralRequestvalidation();
	}
	@Test(priority=22)
	public static void HomePageM2MDotComvalidation() throws InterruptedException, IOException
	{
		UnicomHomePage.sectionTwoM2MDotCom();		
	}
	@Test(priority=23)
	public static void HomePageSectwoReferralRequestButton() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		UnicomHomePage.sectionTwoReferralRequestvalidation();
	}
	@Test(priority=24)
	public static void HomePageBellLogoValidation() throws InterruptedException
	{
		UnicomHomePage.UnicomLogoValidation(); 

	}
	@Test(priority=25)
	public static void sectionOneReferralRequestvalidation() throws Exception
	{
		UtilityMethods.sleep(4000);
		try {allInputValue=UtilityMethods.getBellPropValues();} catch (IOException e) {e.printStackTrace();}
		BrowserForUse=allInputValue.getProperty("Broswer");
		if(BrowserForUse.equals("Chrome")||BrowserForUse.equals("IE"))
		{
			driver.navigate().forward();
			UtilityMethods.sleep(4000);
			UnicomHomePage.ReferralRequestButtonRedirection();
			UtilityMethods.sleep(4000);
		}
		else
		{
			UtilityMethods.sleep(4000);
			UnicomHomePage.ReferralRequestButtonRedirection();
			UtilityMethods.sleep(4000);
		}
	}
	@Test(priority=26)
	public static void ReferralRequestBellLogo() throws Exception
	{
		UnicomReferralRequest.BrowserIntilation();
		UnicomReferralRequest.validateOperatorLogo();
	}

	@Test(priority=27)
	public static void ReferralRequestCompanyLogo()
	{
		UnicomReferralRequest.validateCompanyLogo();
	}

	@Test(priority=28)
	public static void ReferralRequestTextValiadtion()
	{
		UtilityMethods.sleep(2000);
		UnicomReferralRequest.ReferralRequestTextValidation();

	}
	@Test(priority=29)
	public static void ReferralrequestTextBoxDisplayedAndEnabled()
	{
		UnicomReferralRequest.RequestReferralCodeTextBoxDisplayedAndEnabled();
	}

	@Test(priority=30)
	public static void ReferralrequestLabelDisplayedAndEnabled()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UnicomReferralRequest.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@Test(priority=31)
	public static void ReferralRequestPlaceHolderValidation()
	{
		UnicomReferralRequest.RequestReferralCodePlaceholderValidation();
	}
	@Test(priority=32)
	public static void ReferralRequestValidInputValidation()
	{
		UnicomReferralRequest.ReferralRequestCodeValidInputValidation();
	}

	@Test(priority=33)
	public static void ReferrakRequestRequiredFieldValidation()
	{
		UnicomReferralRequest.ReferralRequestRequiredFieldValidation();
	}

	@Test(priority=34)
	public static void ReferralrequestSpaceNotAllowedValiadation()
	{
		UnicomReferralRequest.ReferralRequestSpaceNotAllowedValidation();
	}
	@Test(priority=35)
	public static void ReferralRequestMaximumInputValidation()
	{
		UnicomReferralRequest.ReferralRequestMaximumInputValidation();
	}

	@Test(priority=36)
	public static void ReferralRequestMinimumInputValidation()
	{
		UnicomReferralRequest.ReferralRequestMinimumInputValidation();
	}

	@Test(priority=37)
	public static void ReferralRequestEmailValidation()
	{
		UnicomReferralRequest.ReferralRequestEmailValidation();
	}

	@Test(priority=38)
	public static void ReferralRequestNumericFeild()
	{
		UnicomReferralRequest.ReferralRequestNumericFieldValidation();
	}

	@Test(priority=39)
	public static void ReferralRequestBellLogoValidation() throws InterruptedException
	{
		//UnicomReferralRequest.UnicomLogoValidation();
	}

	@Test(priority=41)
	public static void RferrralRequestcancelButton() throws InterruptedException
	{
		//UnicomReferralRequest.ReferralrequestCancelButton();
	}

	@Test(priority=42)
	public static void ReferralRequestButtonvalidation() throws InterruptedException
	{
		UnicomReferralRequest.RequestButtonValidation();	
		Thread.sleep(3000);
	}

	@Test(priority=43)
	public static void ThankYouBellLogo() throws Exception
	{
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UnicomReferralRequestThankYou.BrowserIntilation();
		UnicomReferralRequestThankYou.validateOperatorLogo();
	}
	
	@Test(priority=44)
	public static void ThankYouCiscoLogo()
	{
		UnicomReferralRequestThankYou.validateCompanyLogo();
	}
	
	@Test(priority=45)
	public static void ThankYouTextvalidation()
	{
		UnicomReferralRequestThankYou.ThankYouTextValidation();
	}
	
	@Test(priority=46)
	public static void ThankYouIOTvalidation() throws InterruptedException 
	{
		UnicomReferralRequestThankYou.backToIOT();
	}
	
	@Test(priority=47)
	public static void ThankYouBellPageRedirection() throws InterruptedException
	{
		UnicomReferralRequestThankYou.UnicomLogoValidation();
	}

	@Test(priority=48)
	public static void ThankYouIOTPagevalidation() throws InterruptedException
	{
		UnicomReferralRequestThankYou.backToIOTPageValidation();
	}

}
