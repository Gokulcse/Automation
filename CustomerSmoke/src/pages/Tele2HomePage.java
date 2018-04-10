package pages;

import java.util.Properties;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




import pageobjects.PostHomePagePO;
import pageobjects.Tele2HomePagePO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

	public class Tele2HomePage extends BaseDriver {
	public static FirefoxDriver driver; 
	static Properties allInputValue;
	public static ExtentReports extent;
	public static ExtentTest testcase;
	
	@BeforeTest
	public static void Start() throws IOException
	{
		driver = launchApp();
		System.out.println("done");
		allInputValue = UtilityMethods.getTele2PropValues();
		PageFactory.initElements(driver, Tele2HomePagePO.class);	
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/Advanced.html", true );	
	}
	private static FirefoxDriver launchApp() {
		// TODO Auto-generated method stub
		return null;
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
	public static void validateOperatorLogo() throws InterruptedException
	{	
		testcase = extent.startTest("Check Operator Logo", "Checking Wether The Operator Logo is Diplayed,Enabled.");
	 	testcase.log(LogStatus.INFO, "Validaion Operator Logo is displayed properly");
	 	UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.Tele2Logo, "NotEqual","Tele2 Operator Logo in IoT Starter Kit");	
		testcase.log(LogStatus.PASS, "Validaion Operator Logo is displayed,enabled is sucessfull");
		testcase.log(LogStatus.INFO, "Validaion Operator Logo is displayed from correct source path");
		UtilityMethods.Imagevalidation(Tele2HomePagePO.Tele2Logo,"src",allInputValue.getProperty("tele2Logo"),"Tele2 Operator Logo");
		testcase.log(LogStatus.PASS, "Validaion Operator Logo is displayed from correct source path is sucessfull");	
	} 
	
	
	@Test(priority=2)
	public static void operatorLogoPageRedirection() throws Exception
	{
		testcase = extent.startTest("Check Operator Logo", "Checking Wether The Operator Logo Page Navigation");
	 	testcase.log(LogStatus.INFO, "on button Click same Page to be loaded");
		UtilityMethods.PageNavigationValidation(Tele2HomePagePO.Tele2Logo,Tele2HomePagePO.WhatIsIotImage,"Tele2"); 
		testcase.log(LogStatus.PASS, "Operator logo page redirection is sucessfull");
	
	}
	

	public static void companyLogoPageRedirection() throws Exception
	{	
		testcase = extent.startTest("Check company Logo", "Checking Wether The company Logo Page Navigation");
 		testcase.log(LogStatus.INFO, "On button Click page should be redirected to jasper home page");
		UtilityMethods.PageNavigationValidation(Tele2HomePagePO.CiscoLogo,Tele2HomePagePO.JasperDotComFindElement,"IoT Connectivity Management Platform | Cisco Jasper"); 
		testcase.log(LogStatus.PASS, "company logo page redirection Failed");
		
	}
	
	@Test(priority=3)
	public static void validateCompanyLogo()
	{
		testcase = extent.startTest("Check Company Logo", "Checking Wether The Company Logo is Diplayed & Enabled.");
	 	testcase.log(LogStatus.INFO, "Validaion Company Logo is displayed properly");
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		testcase.log(LogStatus.PASS, "Validaion Company Logo is displayed,enabled is sucessfull");
		testcase.log(LogStatus.INFO, "Validaion Company Logo is displayed from correct source path");
		UtilityMethods.Imagevalidation(Tele2HomePagePO.CiscoLogo,"src",allInputValue.getProperty("tele2CompanyLogo"),"Cisco Jasper Company Logo");	
		testcase.log(LogStatus.PASS, "Validaion Company Logo is displayed from correct source path is sucessfull");
		
	}
 
	@Test(priority=4)
	public static void sectionOneIotStarterKitTele2Validation()
	{
		testcase = extent.startTest("Section 1 Banner text 1", "Text Displayed and content Validation");
	 	testcase.log(LogStatus.INFO, "check Section one Banner text is displayed properly");
		UtilityMethods.StringValidation(Tele2HomePagePO.TextBannerh1.getText().replace("\n", " "), allInputValue.getProperty("HomePage.Bannerh1"), "equalsignorecase");
		testcase.log(LogStatus.PASS, "Section one Banner text is displayed properly");

		UtilityMethods.StringValidation(Tele2HomePagePO.TextBannerh2.getText(), allInputValue.getProperty("HomePage.Bannerh2"), "equalsignorecase");
		testcase.log(LogStatus.PASS, "Section one Banner text is displayed properly");

		UtilityMethods.StringValidation(Tele2HomePagePO.TextBannerp1.getText().replace("\n", " "),allInputValue.getProperty("HomePage.Bannerp1"), "equalsignorecase");
		testcase.log(LogStatus.PASS, "Section one Banner text is displayed properly");

		UtilityMethods.StringValidation(Tele2HomePagePO.TextBannerp2.getText(), allInputValue.getProperty("HomePage.Bannerp2"), "equalsignorecase");
		testcase.log(LogStatus.PASS, "Section one Banner text is displayed properly");
	
	}
	
	
	public static void sectionOneIotStarterKitTrackOrderValidation() throws InterruptedException
	{
		Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionOneTrackOrderButton, "NotEqual","Track Order Button in IoT Starter Kit banner");
		Tele2HomePagePO.SectionOneTrackOrderButton.click();
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionOneTrackOrderPRButton, "NotEqual","Track Order on click Button in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionOneTrackOrderText, "NotEqual","Track Order on Click Text in IoT Starter Kit Track Order");
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.TrackOrderEmailID, "NotEqual","Enter Email ID Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(Tele2HomePagePO.TrackOrderEmailID, "Enter Email Address", "Track Order Email ID");
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.TrackOrderCloseIcon, "NotEqual","Track Order Close Button in IoT Starter Kit");
		Tele2HomePagePO.TrackOrderCloseIcon.click();		
	}
	
	
	public static void sectionOneIotStarterKitEnterReferralCodeValidation() throws InterruptedException
	{Thread.sleep(3000);
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionOneEnterReferralCodeButton, "NotEqual","Enter Referral Code Button in IoT Starter Kit");
		Tele2HomePagePO.SectionOneTrackOrderButton.click();
		try {	Thread.sleep(3000);	} 	catch (InterruptedException e)	{	e.printStackTrace();}	
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionOneOrderKitButton, "NotEqual","OrderKit Button in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionOneEnterReferralCodeText, "NotEqual","Enter Referral Code Text in IoT Starter Kit ");
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.EnterReferralCode, "NotEqual","Enter Referral Code Text Box in IoT Starter Kit Track Order");
		UtilityMethods.PlaceholderValidation(Tele2HomePagePO.EnterReferralCode, "Enter Referral Code", "Enter Referral Code");
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.EnterReferralCodeCloseIcon, "NotEqual","Enter Referral Code Close Button in IoT Starter Kit");
		//Tele2HomePagePO.EnterReferralCodeCloseIcon.click();		
	}

	
	public static void sectionTwoWhatThekitIncludesContentvalidation()
	{
		UtilityMethods.Imagevalidation(Tele2HomePagePO.SimIcon, "src",allInputValue.getProperty("tele2SimIcon"), "Tele2 Sim Icon");
		UtilityMethods.StringValidation(Tele2HomePagePO.TextSimh1.getText(), "5 SIMS", "equalsignorecase");
		UtilityMethods.StringValidation(Tele2HomePagePO.TextSimh2.getText(), "30 MB per SIM", "equalsignorecase");
		UtilityMethods.StringValidation(Tele2HomePagePO.TextSimh3.getText(), "50 SMS", "equalsignorecase");
		UtilityMethods.StringValidation(Tele2HomePagePO.TextSimp1.getText(), "with Tele2 Connectivity", "equalsignorecase");
		UtilityMethods.StringValidation(Tele2HomePagePO.TextSimp2.getText(), "per month for 6 months", "equalsignorecase");
		UtilityMethods.StringValidation(Tele2HomePagePO.TextSimp3.getText(), "messages per SIM per month", "equalsignorecase");
	}
	
	
	public static void sectionTwoWhatThekitIncludesToolsvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(Tele2HomePagePO.ToolIcon, allInputValue.getProperty("tele2ToolIcon"), Tele2HomePagePO.ToolText, "Real-Time Testing Tool");
		UtilityMethods.whatThekitIncludesTextValidation(Tele2HomePagePO.ToolListText,"Test-as-you-build for fast, quality development","Visibility into device and network behavior","Diagnostics and troubleshooting help");		
	}
	
	
	public static void sectionTwoWhatThekitIncludesCentervalidation()
	{	
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(Tele2HomePagePO.CenterIcon, allInputValue.getProperty("tele2CenterIcon"), Tele2HomePagePO.CenterText,"Full Access to Tele2 M2M Control Center");
		UtilityMethods.whatThekitIncludesTextValidation(Tele2HomePagePO.CenterListText, "Complete suite of developer tools", "User logins for everyone on your team","Same environment for testing and deployment");		
	}

	
	public static void sectionTwoWhatThekitIncludesSuppportvalidation()
	{
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(Tele2HomePagePO.SupportIcon, allInputValue.getProperty("tele2SupportIcon"), Tele2HomePagePO.SupportText,"Exceptional Developer Support");
		UtilityMethods.whatThekitIncludesTextValidation(Tele2HomePagePO.SupportListText, "Developer guidelines", "Full access to APIs","M2M.com forum");
	}

	
	public static void sectionThreeHowItWorksValidation()
	{
		UtilityMethods.StringValidation(Tele2HomePagePO.HowItWorksText.getText(), "How it Works", "equalsignorecase");
		UtilityMethods.howItWorksValidation(Tele2HomePagePO.HowItWorksOrder, "1", "Order", "Enter your Referral Code and order a kit.");
		UtilityMethods.howItWorksValidation(Tele2HomePagePO.HowItWorksActivate, "2", "Activate", "Follow the steps and activate your kit.");
		UtilityMethods.howItWorksValidation(Tele2HomePagePO.HowItWorksExplore, "3", "Explore", "Amaze yourself with the possibilities.");
		UtilityMethods.howItWorksValidation(Tele2HomePagePO.HowItWorksMonetize, "4", "Monetize", "Start your IoT journey.");	
	}
	
	
	public static void sectionFourWhatIsIotValidation()
	{
		UtilityMethods.Imagevalidation(Tele2HomePagePO.WhatIsIotImage, "src" , "http://tele2.devm2m.com/img/tele2/whatisiot.png", "What is IoT?");
		UtilityMethods.StringValidation(Tele2HomePagePO.WhatIsIotText.getText(), "What is IoT?", "equalsignorecase");
		UtilityMethods.StringValidation(Tele2HomePagePO.WhatIsIotParaText1.getText(), "As connected devices proliferate, industry leaders understand that the real value of the Internet of Thinks (IoT) is not in the devices themselves, it's in the services they enable — and the new, often recurring sources of revenue these services generate.", "equalsignorecase");
		UtilityMethods.StringValidation(Tele2HomePagePO.WhatIsIotParaText2.getText(), "Learn more at jasper.com", "equalsignorecase");	
	}

	public static void sectionOneLinkvalidation() throws Exception
	{
		UtilityMethods.sectionOneLinkvalidation(PostHomePagePO.WhattheKitIncludeLink);
		UtilityMethods.sectionOneLinkvalidation(PostHomePagePO.HowItWorkslink);
		UtilityMethods.sectionOneLinkvalidation(PostHomePagePO.WhatIsIotLink);
	}
		
	public static void SectionThreeLearnMore() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.HowItWorksLearnMore, "NotEqual", "M2MDotCom Link Button");
		UtilityMethods.PageNavigationValidation(Tele2HomePagePO.HowItWorksLearnMore,Tele2HomePagePO.M2MDotComFindElement,"Tel"); 	
	}
	
	public static void TrackOrderValidPageRedirection() throws InterruptedException
	{
	Tele2HomePagePO.SectionOneTrackOrderButton.click();
	Tele2HomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.validTrackOrderEmailID"));
	UtilityMethods.PageNavigationValidation(Tele2HomePagePO.SectionOneTrackOrderPRButton, Tele2HomePagePO.SectionOneTrackOrderFindElement, "Tele2");
	}
	
	public static void TrackOrderInValidPageRedirection() throws InterruptedException
	{
		Tele2HomePagePO.SectionOneTrackOrderButton.click();
		Tele2HomePagePO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.InvalidTrackOrderEmailID"));
		UtilityMethods.PageNavigationValidation(Tele2HomePagePO.SectionOneTrackOrderPRButton, Tele2HomePagePO.WhatIsIotImage, "Tele2");	
	}

	public static void SectionOTwoReferralRequestvalidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionTwoReferralRrequestButton, "NotEqual", "Section Two Referral Request Button");
		UtilityMethods.PageNavigationValidation(Tele2HomePagePO.SectionTwoReferralRrequestButton,Tele2HomePagePO.ReferrralRequestFindElement,"Tele2"); 
	}

	public static void SectionOneReferralRequestvalidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.SectionOneReferralRrequestButton, "NotEqual", "Section One Referral Request Button");
		UtilityMethods.PageNavigationValidation(Tele2HomePagePO.SectionOneReferralRrequestButton,Tele2HomePagePO.ReferrralRequestFindElement,"Tele2"); 
	}
	
	
	public static void sectionTwoM2MDotCom() throws InterruptedException
	{
	UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.M2mDotCom, "NotEqual", "M2MDotCom Link Button");
	UtilityMethods.PageNavigationValidation(Tele2HomePagePO.M2mDotCom,Tele2HomePagePO.M2MDotComFindElement,"M2M Developer Kits from the World’s Leading Mobile Operators"); 
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
		UtilityMethods.DisplayEnableValidator(Tele2HomePagePO.JasperDotCom, "NotEqual", "JasperDotCom Link Button");
		UtilityMethods.PageNavigationValidation(Tele2HomePagePO.JasperDotCom, Tele2HomePagePO.JasperDotComFindElement, "IoT Connectivity Management Platform | Cisco Jasper");
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
