package test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.AdminOperation;
import pages.BellBillingInfo;
import pages.BellControlCenter;
import pages.BellHomePage;
import pages.BellOrderSummary;
import pages.BellReferralRequestPage;
import pages.BellReferralRequestThankYou;
import pages.BellReviewConfirm;
import pages.BellShippingInfo;
import pages.BellYourInfo;
import pages.EmailIntegration;
import utilitymethods.UtilityMethods;

public class DummyTest 
{

	public static WebDriver driver;
	static Properties allInputValue;
	public static ExtentReports extent;
	public static ExtentTest testcase;
	
	
	@BeforeTest
	public static void DeletingPreviousEmail()
	{
		//EmailIntegration.DeleteAllEmail();
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/Advanced.html", true );
	}
	@AfterMethod
	public static void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			testcase.log(LogStatus.FAIL, result.getName());
		}
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			testcase.log(LogStatus.PASS, result.getName());
		}
		extent.endTest(testcase);
	}
	
	@Test(priority=1)
	public static void BrowserIntilation() throws Exception
	{
		testcase = extent.startTest("Intialise Browser", "opening Browser and loading Base Home Page URL");
	 	testcase.log(LogStatus.INFO, "opening Browser and loading base Home Page URL");
		driver = BellHomePage.start();
	}

	@Test(priority=2)
	public static void HomePageBellLogo() 
	{
		testcase = extent.startTest("Home Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellHomePage.validateOperatorLogo();
	}
	@Test(priority=3)
	public static void HomePageCiscoLogo()
	{
		testcase = extent.startTest("Home Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellHomePage.validateCompanyLogo();
	}
	@Test(priority=4)
	public static void HomePageSecOneTextValidation()
	{
		testcase = extent.startTest("Home Page Section 1 ", "Section One Text validation");
	 	testcase.log(LogStatus.INFO, "String Validation");
		BellHomePage.sectionOneIotStarterKitBellValidation();
	}
	@Test(priority=5)
	public static void HomePageTrackOrderValidation() throws InterruptedException
	{
		testcase = extent.startTest("Home Page Track Order", "Validating track Order Button");
		testcase.log(LogStatus.INFO, "Validating String,PlaceHolder,Enabled,Displayed");
		BellHomePage.sectionOneIotStarterKitTrackOrderValidation();	
	}
	@Test(priority=6)
	public static void HomePageReferralCodeValidation() throws InterruptedException
	{
		testcase = extent.startTest("Home Page Referral Code", "Validating ReferralCode");
		testcase.log(LogStatus.INFO, "Validating String,PlaceHolder,Enabled,Displayed");
		BellHomePage.sectionOneIotStarterKitEnterReferralCodeValidation();
	}
	@Test(priority=7)
	public static void HomePageTrackOrderErrorValidation() throws InterruptedException
	{
		testcase = extent.startTest("Home Page Track Order pop up Error message and Close Icon", "Validating Track Order Error Message and Close Icon");
	 	testcase.log(LogStatus.INFO, "Validating Error Message For Trak Order CLose Icon");
		BellHomePage.sectionOneIotStarterKitTrackOrderErrorValidation();
	}
	@Test(priority=8)
	public static void HomePageEnterrefrralCodeErrorvalidation() throws InterruptedException
	{
		testcase = extent.startTest("Home Page Enter Referral Code Error Message and Close Icon", "Validating Enter Referral Code Error Message and Close Icon");
	 	testcase.log(LogStatus.INFO, "Validating Error Message For Trak Order CLose Icon");
		BellHomePage.sectionOneIotStarterKitReferralCodeErrorValidation();
	}
	@Test(priority=9)
	public static void HomePageSecTwoContentValidation()
	{
		testcase = extent.startTest("Home Page Section 2 What The kit includes Content ", "Section Two Content Text validation");
	 	testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionTwoWhatThekitIncludesContentvalidation();
	} 
	@Test(priority=10)
	public static void HomePageSecTwoWhatThekitIncludesToolsvalidation()
	{
		testcase = extent.startTest("Home Page Section 2 What The kit includes Content ", "Section Two Tools Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionTwoWhatThekitIncludesToolsvalidation();
	}	
	@Test(priority=11)
	public static void HomePageSecTwoWhatThekitIncludesCentervalidation()  
	{	
		testcase = extent.startTest("Home Page Section 2 What The kit includes Content ", "Section Two Center Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionTwoWhatThekitIncludesCentervalidation();
	}
	@Test(priority=12)
	public static void HomePagesectionTwoWhatThekitIncludesSuppportvalidation()
	{	
		testcase = extent.startTest("Home Page Section 2 What The kit includes Content ", "Section Two Support Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionTwoWhatThekitIncludesSuppportvalidation();
	}
	@Test(priority=13)
	public static void HomePagesectionThreeHowItWorksValidation()
	{	
		testcase = extent.startTest("Home Page Section 3 How It Works", "Section Three How It Works Text validation");
	 	testcase.log(LogStatus.INFO, "String Validation");
		BellHomePage.sectionThreeHowItWorksValidation();
	}	
	@Test(priority=14)
	public static void HomePagesectionFourWhatIsIotValidation()
	{		
		testcase = extent.startTest("Home Page Section 4 IoT From Bell ", "Section Four IoT From Bell Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionFourWhatIsIotValidation();
	}
	@Test(priority=15)
	public static void HomePagesectionOneLinkvalidation() throws Exception
	{		
		testcase = extent.startTest("Home Page Section 1 Scrolling Link Validation ", "Section One Scrolling Link Validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Page Scrolling");
		BellHomePage.sectionOneLinkvalidation();
	}
	@Test(priority=16)
	public static void HomePagesectionFiveWithBell()
	{	
		testcase = extent.startTest("Home Page Section 5 With Bell", "Section Five With Bell Text validation");
	 	testcase.log(LogStatus.INFO, "String Validation");
		BellHomePage.sectionFiveWithBell();
	}
	@Test(priority=17)
	public static void HomePagesectionFiveLTE()
	{	
		testcase = extent.startTest("Home Page Section 5 With Bell ", "Section Five With Bell 1 Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionFiveLTE();
	}
	@Test(priority=18)
	public static void HomePagesectionFivePartners()
	{	
		testcase = extent.startTest("Home Page Section 5 With Bell ", "Section Five With Bell 2 Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionFivePartners();
	}
	@Test(priority=19)
	public static void HomePagesectionFiveEndToEnd()
	{
		testcase = extent.startTest("Home Page Section 5 With Bell ", "Section Five With Bell 2 Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionFiveEndToEnd();
	}

	@AfterTest
	public static void Exit()
	{
		extent.endTest(testcase);
		extent.flush();
		driver.close();
	}

}
