package test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bell.BellBillingInfo;
import bell.BellControlCenter;
import bell.BellHomePage;
import bell.BellOrderSummary;
import bell.BellReferralRequestPage;
import bell.BellReferralRequestThankYou;
import bell.BellReviewConfirm;
import bell.BellShippingInfo;
import bell.BellTrackOrder;
import bell.BellYourInfo;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.AdminOperation;
import pages.EmailIntegration;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class BellEndToEndExtended extends BaseDriver
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
		testcase = extent.startTest("Home Page Section 2 What The kit includes Sim Content ", "Section Two Content Text validation");
	 	testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionTwoWhatThekitIncludesContentvalidation();
	} 
	@Test(priority=10)
	public static void HomePageSecTwoWhatThekitIncludesToolsvalidation()
	{
		testcase = extent.startTest("Home Page Section 2 What The kit includes Tools Content ", "Section Two Tools Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionTwoWhatThekitIncludesToolsvalidation();
	}	
	@Test(priority=11)
	public static void HomePageSecTwoWhatThekitIncludesCentervalidation()  
	{	
		testcase = extent.startTest("Home Page Section 2 What The kit includes Center Content ", "Section Two Center Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionTwoWhatThekitIncludesCentervalidation();
	}
	@Test(priority=12)
	public static void HomePagesectionTwoWhatThekitIncludesSuppportvalidation()
	{	
		testcase = extent.startTest("Home Page Section 2 What The kit includes Support Content ", "Section Two Support Text validation");
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
		testcase = extent.startTest("Home Page Section 5 With Bell LTE ", "Section Five With Bell 1 Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionFiveLTE();
	}
	@Test(priority=18)
	public static void HomePagesectionFivePartners()
	{	
		testcase = extent.startTest("Home Page Section 5 With Bell Partners", "Section Five With Bell 2 Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionFivePartners();
	}
	@Test(priority=19)
	public static void HomePagesectionFiveEndToEnd()
	{
		testcase = extent.startTest("Home Page Section 5 With Bell EndToEnd", "Section Five With Bell 2 Text validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Image URl");
		BellHomePage.sectionFiveEndToEnd();
	}
	@Test(priority=20)
	public static void HomePageLearnMoreFromBell() throws InterruptedException
	{
		testcase = extent.startTest("Home Page Section Learn More Link", "Learn More Link validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Page Redirection");
		BellHomePage.sectionFourLearnMoreFromBell();
	}
	@Test(priority=21)
	public static void HomePageSecOneReferralRequesButton() throws InterruptedException
	{
		testcase = extent.startTest("Home Page section One Referral Request", "Referral Request Link validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Page Redirection");
		BellHomePage.sectionOneReferralRequestvalidation();
	}
	@Test(priority=22)
	public static void HomePageM2MDotComvalidation() throws InterruptedException, IOException
	{
		testcase = extent.startTest("Home Page Section M2M.com Link", "M2M.com Link validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Page Redirection");
		BellHomePage.sectionTwoM2MDotCom();		
	}
	@Test(priority=23)
	public static void HomePageSectwoReferralRequestButton() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		testcase = extent.startTest("Home Page section Two Referral Request", "Referral Request Link validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Page Redirection");
		BellHomePage.sectionTwoReferralRequestvalidation();
	}
	@Test(priority=24)
	public static void HomePageBellLogoValidation() throws InterruptedException
	{
		testcase = extent.startTest("Home Page Bell Logo Page Navigation", "Bell Logo Link validation");
		testcase.log(LogStatus.INFO, "String Validation,Enabled,Displayed,Page Redirection");
		BellHomePage.bellLogoValidation(); 

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
			testcase = extent.startTest("Page Redirection To Referral Request Page", "Referral Request Page validation");
			testcase.log(LogStatus.INFO, "Enabled,Displayed,Page Redirection");
			BellHomePage.ReferralRequestButtonRedirection();
			UtilityMethods.sleep(4000);
		}
		else
		{
			UtilityMethods.sleep(4000);
			testcase = extent.startTest("Page Redirection To Referral Request Page", "Referral Request Page validation");
			testcase.log(LogStatus.INFO, "Enabled,Displayed,Page Redirection");
			BellHomePage.ReferralRequestButtonRedirection();
			UtilityMethods.sleep(4000);
		}
	}
	@Test(priority=26)
	public static void ReferralRequestBellLogo() throws Exception
	{
		BellReferralRequestPage.BrowserIntilation();
		testcase = extent.startTest("Referral Request Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellReferralRequestPage.validateOperatorLogo();
	}

	@Test(priority=27)
	public static void ReferralRequestCompanyLogo()
	{
		testcase = extent.startTest("Referral Request Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellReferralRequestPage.validateCompanyLogo();
	}

	@Test(priority=28)
	public static void ReferralRequestTextValiadtion()
	{
		UtilityMethods.sleep(2000);
		testcase = extent.startTest("Referral Request Page ", "Text validation");
	 	testcase.log(LogStatus.INFO, "String Validation");
		BellReferralRequestPage.ReferralRequestTextValidation();

	}
	@Test(priority=29)
	public static void ReferralrequestTextBoxDisplayedAndEnabled()
	{
		testcase = extent.startTest("Referral Request Page TextBox,DropDown Button,Radio Button", "Displayed and Enabled Validation");
	 	testcase.log(LogStatus.INFO, "Validating All Text Box,Radio Button,Drop Down Button Displayed and Enabled");
		BellReferralRequestPage.RequestReferralCodeTextBoxDisplayedAndEnabled();
	}

	@Test(priority=30)
	public static void ReferralrequestLabelDisplayedAndEnabled()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		testcase = extent.startTest("Referral Request Page Label Text", "Displayed and Enabled,String Validation");
	 	testcase.log(LogStatus.INFO, "String Validation, Displayed and Enabled ");
		BellReferralRequestPage.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@Test(priority=31)
	public static void ReferralRequestPlaceHolderValidation()
	{
		testcase = extent.startTest("Referral Request Page TextBox,DropDown Button", "Place Holder Validation");
	 	testcase.log(LogStatus.INFO, "PlaceHolder Validation");
		BellReferralRequestPage.RequestReferralCodePlaceholderValidation();
	}
	@Test(priority=32)
	public static void ReferralRequestValidInputValidation()
	{
		testcase = extent.startTest("Referral Request Page TextBox,DropDown Button", "Input Validation");
	 	testcase.log(LogStatus.INFO, "Error Message Should not be displayed For Valid Input");
		BellReferralRequestPage.ReferralRequestCodeValidInputValidation();
	}

	@Test(priority=33)
	public static void ReferrakRequestRequiredFieldValidation()
	{
		testcase = extent.startTest("Referral Request Page TextBox,DropDown Button,Radio Button", "Required Filed Error Message Validation");
	 	testcase.log(LogStatus.INFO, "Required Field Error Message Should be displayed FOr All TextBox,DropDown Button,Radio Button");
		BellReferralRequestPage.ReferralRequestRequiredFieldValidation();
	}

	@Test(priority=34)
	public static void ReferralrequestSpaceNotAllowedValiadation()
	{		
		testcase = extent.startTest("Referral Request Page TextBox", "Space Not Allowed Error Message Validation");
		testcase.log(LogStatus.INFO, "Space Not Allowed Error Message Should be displayed For TextBox");
		BellReferralRequestPage.ReferralRequestSpaceNotAllowedValidation();
	}
	@Test(priority=35)
	public static void ReferralRequestMaximumInputValidation()
	{
		BellReferralRequestPage.ReferralRequestMaximumInputValidation();
	}

	@Test(priority=36)
	public static void ReferralRequestMinimumInputValidation()
	{
		BellReferralRequestPage.ReferralRequestMinimumInputValidation();
	}

	@Test(priority=37)
	public static void ReferralRequestEmailValidation()
	{
		BellReferralRequestPage.ReferralRequestEmailValidation();
	}

	@Test(priority=38)
	public static void ReferralRequestNumericFeild()
	{
		BellReferralRequestPage.ReferralRequestNumericFieldValidation();
	}

	@Test(priority=39)
	public static void ReferralRequestBellLogoValidation() throws InterruptedException
	{
		BellReferralRequestPage.BellLogoValidation();
	}

	@Test(priority=40)
	public static void ReferralRequestBellCaLinkvalidation() throws InterruptedException
	{
		BellReferralRequestPage.BellCALinkValidation();
	}

	@Test(priority=41)
	public static void RferrralRequestcancelButton() throws InterruptedException
	{
		BellReferralRequestPage.ReferralrequestCancelButton();
	}

	@Test(priority=42)
	public static void ReferralRequestButtonvalidation() throws InterruptedException
	{
		BellReferralRequestPage.RequestButtonValidation();	
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
		BellReferralRequestThankYou.BrowserIntilation();
		testcase = extent.startTest("Referral Request Thank You Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellReferralRequestThankYou.validateOperatorLogo();
	}
	@Test(priority=44)
	public static void ThankYouCiscoLogo()
	{
		testcase = extent.startTest("HReferral Request Thank You Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellReferralRequestThankYou.validateCompanyLogo();
	}
	@Test(priority=45)
	public static void ThankYouTextvalidation()
	{
		BellReferralRequestThankYou.ThankYouTextValidation();
	}
	@Test(priority=46)
	public static void ThankYouIOTvalidation() throws InterruptedException 
	{
		BellReferralRequestThankYou.backToIOT();
	}
	@Test(priority=47)

	public static void ThankYouBellPageRedirection() throws InterruptedException
	{
		BellReferralRequestThankYou.bellLogoValidation();
	}

	@Test(priority=48)
	public static void ThankYouIOTPagevalidation() throws InterruptedException
	{
		BellReferralRequestThankYou.backToIOTPageValidation();
	}

	@Test(priority=49)

	public static void CheckingReferralRequest()
	{
		EmailIntegration.CheckEmailReceived();
	}
	@Test(priority=50)

	public static void DeletingPrevEmail()
	{
		EmailIntegration.DeleteAllEmail();
	}

	@Test(priority=51)
	public static void ReferralRequestAdminApproval() throws InterruptedException
	{
		AdminOperation.AdminApproval();	
	}

	@Test(priority=52)
	public static void CheckingReferralCodeEmail()
	{
		EmailIntegration.CheckEmailReceived();	
	}

	@Test(priority=53)
	public static void VerifyingControlCenterURL() throws Exception
	{
		driver = BellControlCenter.start();
	}

	@Test(priority=54)
	public static void CCDisplayedAndEnabledValidation()
	{
		BellControlCenter.CCDisplayedAndEnabledValidation();
	}

	@Test(priority=55)
	public static void CCContentValidation()
	{
		BellControlCenter.CCContentValidation();
	}

	@Test(priority=56)
	public static void CCPlaceHolderValidation()
	{
		BellControlCenter.CCPlaceHolderValidation();
	}

	@Test(priority=57)
	public static void CCRequiredFieldValidation()
	{
		BellControlCenter.CCRequiredFieldValidation();
	}

	@Test(priority=58)
	public static void CCUserNameMinMaxValidation()
	{
		BellControlCenter.CCUserNameMinMaxValidation();
	}

	@Test(priority=59)	
	public static void CCPasswordValidation()		

	{
		BellControlCenter.CCPasswordValidation();
	}

	@Test(priority=60)
	public static void InputValidation()
	{
		BellControlCenter.InputValidation();
	}


	@Test(priority=61)
	public static void referralRequestDataValidation()
	{
		driver.navigate().refresh();
		UtilityMethods.sleep(4000);
		try {BellYourInfo.intial();} catch (IOException e) {e.printStackTrace();}
		UtilityMethods.sleep(2000);
		BellYourInfo.referralRequestDataValidation();
	}

	@Test(priority=62)
	public static void TermsOfServiceTextValidation()
	{
		BellYourInfo.TermsOfServiceTextValidation();
	}

	@Test(priority=63)
	public static void TermsOfServicePopUpCloseIcon()
	{
		BellYourInfo.TermsOfServicePopUpCloseIcon();
	}

	@Test(priority=64)
	public static void TermsOfServicePopUpCloseButton()
	{
		BellYourInfo.TermsOfServicePopUpCloseButton();
	}

	@Test(priority=65)
	public static void TermsOfServicePDFDownload() throws AWTException
	{
		BellYourInfo.TermsOfServicePDFDownload();
	}

	@Test(priority=66)
	public static void YourInfoBellLogo()
	{
		testcase = extent.startTest("Your Info Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellYourInfo.validateOperatorLogo();
	}

	@Test(priority=67)
	public static void YourInfoCompanyLogo()
	{
		testcase = extent.startTest("Your Info Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellYourInfo.validateCompanyLogo();
	}

	@Test(priority=68)
	public static void YourInfoTextValiadtion()
	{
		UtilityMethods.sleep(2000);
		BellYourInfo.ReferralRequestTextValidation();
	}

	@Test(priority=69)
	public static void YourInfoTextBoxDisplayedAndEnabled()
	{
		BellYourInfo.RequestReferralCodeTextBoxDisplayedAndEnabled();
	}

	@Test(priority=70)
	public static void YourInfoLabelDisplayedAndEnabled()
	{
		UtilityMethods.sleep(2000);
		BellYourInfo.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@Test(priority=71)
	public static void YourInfoValidInputValidation()
	{
		BellYourInfo.ReferralRequestCodeValidInputValidation();
	}

	@Test(priority=72)
	public static void YourInfoRequiredFieldValidation()
	{
		BellYourInfo.ReferralRequestRequiredFieldValidation();
	}

	@Test(priority=73)
	public static void YourInfoSpaceNotAllowedValiadation()
	{
		BellYourInfo.ReferralRequestSpaceNotAllowedValidation();
	}

	@Test(priority=74)
	public static void YourInfoMaximumInputValidation()
	{
		BellYourInfo.ReferralRequestMaximumInputValidation();
	}

	@Test(priority=75)
	public static void YourInfoMinimumInputValidation()
	{
		BellYourInfo.ReferralRequestMinimumInputValidation();
	}

	@Test(priority=76)
	public static void YourInfoEmailValidation()
	{
		BellYourInfo.ReferralRequestEmailValidation();
	}

	@Test(priority=77)
	public static void YourInfoNumericFeild()
	{
		BellYourInfo.ReferralRequestNumericFieldValidation();
	}

	@Test(priority=78)
	public static void YourInfoBellLogoValidation() throws InterruptedException
	{
		BellYourInfo.BellLogoValidation();
	}

	@Test(priority=79)
	public static void YourInfoBellCaLinkvalidation() throws InterruptedException
	{
		BellYourInfo.BellCALinkValidation();
	}

	@Test(priority=80)
	public static void YourInfocancelButton() throws InterruptedException
	{
		BellYourInfo.ReferralrequestCancelButton();
	}

	@Test(priority=81)
	public static void YourInfocontinueButton() throws InterruptedException, IOException
	{
		BellYourInfo.RequestButtonValidation();
		UtilityMethods.sleep(4000);
	}

	@Test(priority=82)
	public static void ShippingInfovalidateOperatorLogo() throws Exception
	{	
		driver.navigate().refresh();
		UtilityMethods.sleep(4000);
		try {BellShippingInfo.Start();} catch (IOException e) {e.printStackTrace();}
		//driver.navigate().refresh();
		UtilityMethods.sleep(5000);
		testcase = extent.startTest("Shipping Info Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellShippingInfo.validateOperatorLogo();
	} 

	@Test(priority=83)
	public static void ShippingInfovalidateCompanyLogo()
	{	
		testcase = extent.startTest("Shipping Info Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellShippingInfo.validateCompanyLogo();	
	}

	@Test(priority=84)
	public static void ShippingInfoTextvalidation()
	{
		BellShippingInfo.ShippingInfoTextvalidation();
	}

	@Test(priority=85)
	public static void shippingInfoLabelText()
	{
		BellShippingInfo.shippingInfoLabelText();
	}

	@Test(priority=86)
	public static void shippingInfoInputField()
	{
		BellShippingInfo.shippingInfoInputField();
	}

	@Test(priority=87)
	public static void ShippingInfoLinkButton()
	{
		BellShippingInfo.ShippingInfoLinkButton();
	}

	@Test(priority=88)
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		BellShippingInfo.ShippingInfoRequiredFieldvalidatoin();
	}

	@Test(priority=89)
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		BellShippingInfo.ShippingInfoSpaceNotAllowedvalidatoin();
	}

	@Test(priority=90)
	public static void ShippingInfoMaximumInputValidation()
	{
		BellShippingInfo.ShippingInfoMaximumInputValidation();
	}

	@Test(priority=91)
	public static void  ShippingInfoMinimumInputValidation()
	{
		BellShippingInfo.ShippingInfoMinimumInputValidation();
	}

	@Test(priority=92)	
	public static void ShippingInfoBellLogoValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingBellLogoValidation();
	}

	@Test(priority=93)
	public static void ShippingInfoCancelButtonValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingCancelButtonValidation();
	}

	@Test(priority=94)	
	public static void ShippingInfoBackButtonValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingBackButtonValidation();
	}

	@Test(priority=95)	
	public static void ShippingInfoSendInputs()
	{
		BellShippingInfo.ShippingInfoSendInputs();
	}

	@Test(priority=96)
	public static void BillingInfovalidateOperatorLogo()
	{	
		UtilityMethods.sleep(4000);
		try {BellBillingInfo.Start();} catch (Exception e) {e.printStackTrace();}
		UtilityMethods.sleep(2000);
		testcase = extent.startTest("Billing Info Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellBillingInfo.validateOperatorLogo();
	} 

	@Test(priority=97)
	public static void BillingInfovalidateCompanyLogo()
	{	
		testcase = extent.startTest("Billing Info Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellBillingInfo.validateCompanyLogo();
	}

	@Test(priority=98)
	public static void BillingInfoTextvalidation()
	{	
		BellBillingInfo.BillingInfoTextvalidation();
	}

	@Test(priority=99)
	public static void BillingCardDetailsLabelText()
	{	
		BellBillingInfo.BillingCardDetailsLabelText();
	}

	@Test(priority=100)
	public static void BillingCardDetailsInputFieldValidation()
	{	
		BellBillingInfo.BillingCardDetailsInputFieldValidation();
	}

	@Test(priority=101)
	public static void BillingCheckBoxVaildation()
	{
		BellBillingInfo.BillingCheckBoxVaildation();
	}

	@Test(priority=102)
	public static void BillingInfoLabelText()
	{
		BellBillingInfo.BillingInfoLabelText();
	}

	@Test(priority=103)
	public static void BillingInfoInputField()
	{
		BellBillingInfo.BillingInfoInputField();
	}

	@Test(priority=104)
	public static void BillingInfoRequiredFieldvalidatoin()
	{	
		BellBillingInfo.BillingInfoRequiredFieldvalidatoin();
	}

	@Test(priority=105)
	public static void BillingInfoSpaceNotAllowedvalidatoin()
	{
		BellBillingInfo.BillingInfoSpaceNotAllowedvalidatoin();
	}

	@Test(priority=106)
	public static void BillingInfoMaximumInputValidation()
	{	
		BellBillingInfo.BillingInfoMaximumInputValidation();
	}

	@Test(priority=107)
	public static void  BillingInfoMinimumInputValidation()
	{
		BellBillingInfo.BillingInfoMinimumInputValidation();	
	}

	@Test(priority=108)
	public static void BellLogoValidation() throws InterruptedException
	{
		BellBillingInfo.BellLogoValidation();
	}

	@Test(priority=109)
	public static void CancelButtonValidation() throws InterruptedException
	{
		BellBillingInfo.CancelButtonValidation();
	}

	@Test(priority=110)
	public static void BackButtonValidation() throws InterruptedException
	{
		BellBillingInfo.BackButtonValidation();
	}

	@Test(priority=111)
	public static void BillingInfoSendInputs()
	{
		BellBillingInfo.BillingInfoSendInputs();
	}

	@Test(priority=112)
	public static void ReviewConfirmOperatorLogo()
	{
		try {
			BellReviewConfirm.Start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		UtilityMethods.sleep(4000);
		testcase = extent.startTest("Review and Confirm Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellReviewConfirm.validateOperatorLogo();
	} 

	@Test(priority=113)
	public static void ReviewConfirmCompanyLogo()
	{	
		testcase = extent.startTest("Review and Confirm Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellReviewConfirm.validateCompanyLogo();
	}

	@Test(priority=114)
	public static void ReviewConfirmHeadertextValidation()
	{
		BellReviewConfirm.HeadertextValidation();
	}

	@Test(priority=115)
	public static void ReviewConfirmSectionOneTextValidation()
	{
		BellReviewConfirm.SectionOneTextValidation();
	}

	@Test(priority=116)
	public static void ReviewConfirmShippingBillingAddressValidation()
	{
		BellReviewConfirm.ShippingBillingAddressValidation();
	}

	@Test(priority=117)
	public static void ReviewConfirmEditButtons()
	{
		BellReviewConfirm.EditButtonsValidation();
	}

	@Test(priority=118)
	public static void ReviewConfirmBellLogo() throws InterruptedException
	{
		BellReviewConfirm.BellLogoValidation();
	}

	@Test(priority=119)
	public static void ReviewConfirmCancelButton() throws InterruptedException
	{
		BellReviewConfirm.CancelButtonValidation();
	}

	@Test(priority=120)
	public static void ShippingEditButtonValidation() throws InterruptedException
	{
		BellReviewConfirm.ShippingEditButtonValidation();
	}
	@Test(priority=121)
	public static void BillingEditButtonValidation() throws InterruptedException
	{
		BellReviewConfirm.BillingEditButtonValidation();
	}

	@Test(priority=122)
	public static void ReviewConfirmButton()
	{
		BellReviewConfirm.ConfirmButtonClick();
	}

	@Test(priority=123)
	public static void OrderSummaryBellLogo()
	{
		UtilityMethods.sleep(4000);
		try {BellOrderSummary.Start();} catch (Exception e) {e.printStackTrace();}
		UtilityMethods.sleep(4000);
		testcase = extent.startTest("Order Summary Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellOrderSummary.validateOperatorLogo();
	}

	@Test(priority=124)
	public static void OrderSummaryCompanyLogo()
	{	
		testcase = extent.startTest("Order Summary Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellOrderSummary.validateCompanyLogo();
	}

	@Test(priority=125)
	public static void OrderSummaryHeadertextValidation()
	{
		BellOrderSummary.HeadertextValidation();
	}
	@Test(priority=126)
	public static void orderSummaryShipBillAddressVAlidation()
	{
		BellOrderSummary.ShipBillAddressValidation();
	}

	@Test(priority=127)
	public static void OrderSummarysectionTwoTextValidation()
	{
		BellOrderSummary.sectionTwoTextValidation();
	}

	@Test(priority=128)
	public static void OrderSummarysectionThreeTextValidation()
	{
		BellOrderSummary.sectionThreeTextValidation();
	}

	@Test(priority=129)
	public static void OrderSummaryBellLogoValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneBellLogoValidation();
	}

	@Test(priority=130)
	public static void OrderSummaryBackToIOTValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneBackToIOTValidation();
	}

	@Test(priority=131)
	public static void OrderSummaryTrackOrderValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneTrackOrderValidation();
	}

	@Test(priority=132)
	public static void OrderSummaryhomePageLinkvalidation() throws InterruptedException
	{
		BellOrderSummary.homePageLinkvalidation();
	}

	@Test(priority=133)
	public static void CheckingOrderSucessEmail()
	{
		EmailIntegration.CheckEmailReceived(); 
	}
	@Test(priority=134)
	public static void AdminOrderFulFilling() throws InterruptedException
	{	
		AdminOperation.AdminOrderFulfill();
	}
	@Test(priority=135)
	public static void DeletingOrderSucessEmail()
	{
		EmailIntegration.DeleteAllEmail();
	}

	@Test(priority=136)
	public static void TrackOrderPage() throws Exception
	{
		driver = BellTrackOrder.start();
	}

	@Test(priority=137)
	public static void Trackorderpageredirection() throws InterruptedException
	{
		BellTrackOrder.TrackOrderValidPageRedirection();
	}

	@Test(priority=138)
	public static void TrackOrderOperatorLogo()
	{
		testcase = extent.startTest("Track Order Page Bell Logo", "Validating Bell logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellTrackOrder.validateOperatorLogo();
	}

	@Test(priority=139)
	public static void TrackOrderComapnyLogo()
	{
		testcase = extent.startTest("Track Order Page Cisco Logo", "Validating Cisco logo");
	 	testcase.log(LogStatus.INFO, "Validating Image URl,Displayed and Enabled");
		BellTrackOrder.validateCompanyLogo();
	}

	@Test(priority=140)
	public static void TrackOrderSectionOneText()
	{
		BellTrackOrder.SectionOneTextValidaion();
	}

	@Test(priority=141)
	public static void TrackOrderSectionTwoText()
	{
		BellTrackOrder.SectionTwoTextvalidation();
	}

	@Test(priority=142)
	public static void BackToIOT()
	{
		BellTrackOrder.BackToIOT();
	}

	@Test(priority=143)
	public static void TrackOrderBellLogoHomePage()
	{
		BellTrackOrder.BellLogoHomePage();
	}

	@Test(priority=144)
	public static void TrackOrderResendButton()
	{
		BellTrackOrder.ResendConfirmationButton();
	}

	@Test(priority=145)
	public static void TrackOrderResendEmailVerification()
	{
		BellTrackOrder.CheckingOrderSuccessEmail();
	}

}
