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
		 	testcase.log(LogStatus.FAIL, result.getTestName());
		}
		if(result.getStatus()==ITestResult.SUCCESS)
		{
		 	testcase.log(LogStatus.PASS, result.getTestName());
		}
		extent.endTest(testcase);
	}
	
	@Test(priority=1)
	public static void BrowserIntilation() throws Exception
	{
		testcase = extent.startTest("Intialise Browser", "opening Browser and loading base URL");
	 	testcase.log(LogStatus.INFO, "opening Browser and loading base URL");
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
		testcase = extent.startTest("Home Page Track Order Error", "Validating Track Order Error Message");
	 	testcase.log(LogStatus.INFO, "Validating Error Message For Trak Order");
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
	@AfterTest
	public static void Exit()
	{
		extent.endTest(testcase);
		extent.flush();
		driver.close();
	}

}