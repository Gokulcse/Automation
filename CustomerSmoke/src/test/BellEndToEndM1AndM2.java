package test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import pageobjects.BellHomePagePO;
import pages.BellHomePage;
import pages.BellReferralRequestPage;
import pages.EmailIntegration;
import utilitymethods.UtilityMethods;

public class BellEndToEndM1AndM2 extends BaseDriver
{
	public static FirefoxDriver driver;
	static Properties allInputValue;
	
	@BeforeTest
	public static void DeletingPreviousEmail()
	{
		EmailIntegration.DeleteAllEmail();
	}
	
	@Test(priority=1)
	public static void BrowserIntilation() throws Exception
	{
		driver = BellHomePage.start();
	}
	
	@Test(priority=2)
	public static void HomePageBellLogo() 
	{
		BellHomePage.validateOperatorLogo();
	}
	@Test(priority=3)
	public static void HomePageCiscoLogo()
	{
		BellHomePage.validateCompanyLogo();
	}
	@Test(priority=4)
	public static void HomePageSecOneTextValidation()
	{
		BellHomePage.sectionOneIotStarterKitBellValidation();
	}
	@Test(priority=5)
	public static void HomePageTrackOrderValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitTrackOrderValidation();	
	}
	@Test(priority=6)
	public static void HomePageReferralCodeValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitEnterReferralCodeValidation();
	}
	@Test(priority=7)
	public static void HomePageTrackOrderErrorValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitTrackOrderErrorValidation();
	}
	@Test(priority=8)
	public static void HomePageEnterrefrralCodeErrorvalidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitReferralCodeErrorValidation();
	}
	@Test(priority=9)
	public static void HomePageSecTwoContentValidation()
	{
		BellHomePage.sectionTwoWhatThekitIncludesContentvalidation();
	} 
	@Test(priority=10)
	public static void HomePageSecTwoWhatThekitIncludesToolsvalidation()
	{
		BellHomePage.sectionTwoWhatThekitIncludesToolsvalidation();
	}	
	@Test(priority=11)
	public static void HomePageSecTwoWhatThekitIncludesCentervalidation()  
	{	
		BellHomePage.sectionTwoWhatThekitIncludesCentervalidation();
	}
	@Test(priority=12)
	public static void HomePagesectionTwoWhatThekitIncludesSuppportvalidation()
	{	
		BellHomePage.sectionTwoWhatThekitIncludesSuppportvalidation();
	}
	@Test(priority=13)
	public static void HomePagesectionThreeHowItWorksValidation()
	{	
		BellHomePage.sectionThreeHowItWorksValidation();
	}	
	@Test(priority=14)
	public static void HomePagesectionFourWhatIsIotValidation()
	{		
		BellHomePage.sectionFourWhatIsIotValidation();
	}
	@Test(priority=15)
	public static void HomePagesectionOneLinkvalidation() throws Exception
	{		
		BellHomePage.sectionOneLinkvalidation();
	}
	@Test(priority=16)
	public static void HomePagesectionFiveWithBell()
	{	
		BellHomePage.sectionFiveWithBell();
	}
	@Test(priority=17)
	public static void HomePagesectionFiveLTE()
	{	
		BellHomePage.sectionFiveLTE();
	}
	@Test(priority=18)
	public static void HomePagesectionFivePartners()
	{	
		BellHomePage.sectionFivePartners();
	}
	@Test(priority=19)
	public static void HomePagesectionFiveEndToEnd()
	{
		BellHomePage.sectionFiveEndToEnd();
	}
	@Test(priority=20)
	public static void HomePageLearnMoreFromBell() throws InterruptedException
	{
		BellHomePage.sectionFourLearnMoreFromBell();
	}
	@Test(priority=21)
	public static void HomePageSecOneReferralRequesButton() throws InterruptedException
	{
		BellHomePage.sectionOneReferralRequestvalidation();
	}
	@Test(priority=22)
	public static void HomePageM2MDotComvalidation() throws InterruptedException, IOException
	{
		BellHomePage.sectionTwoM2MDotCom();		
	}
	@Test(priority=23)
	public static void HomePageSectwoReferralRequestButton() throws InterruptedException
	{
		Thread.sleep(2000);
		BellHomePage.sectionTwoReferralRequestvalidation();
	}
	@Test(priority=24)
	public static void HomePageBellLogoValidation() throws InterruptedException
	{
		BellHomePage.bellLogoValidation();
		
	}
	@Test(priority=25)
	public static void sectionOneReferralRequestvalidation() throws Exception
	{
		driver.navigate().refresh();
		UtilityMethods.sleep(3000);
		BellHomePage.ReferralRequestButtonRedirection();
		UtilityMethods.sleep(3000);
	}
	@Test(priority=26)
	public static void ReferralRequestBellLogo()
	{
		BellReferralRequestPage.validateOperatorLogo();
	}
	
	@Test(priority=27)
	public static void ReferralRequestCompanyLogo()
	{
		BellReferralRequestPage.validateCompanyLogo();
	}
	
	@Test(priority=28)
	public static void ReferralRequestTextValiadtion()
	{
		UtilityMethods.sleep(2000);
		BellReferralRequestPage.ReferralRequestTextValidation();

	}
	
	
}
