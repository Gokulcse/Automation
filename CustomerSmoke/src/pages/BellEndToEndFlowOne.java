package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import pageobjects.BellHomePagePO;
import pages.BellHomePage;
import pages.BellReferralRequestPage;
import pages.BellReferralRequestThankYou;
import pages.AdminOperation;
import utilitymethods.UtilityMethods;

public class BellEndToEndFlowOne extends BaseDriver
{
public static WebDriver driver;

static Properties allInputValue;
	@BeforeTest
	public static void BrowserIntilation() throws Exception
	{
		driver = BellHomePage.start();
	}
	@Test(priority=1)
	public static void HomePageBellLogo() 
	{
		BellHomePage.validateOperatorLogo();
	}
	@Test(priority=2)
	public static void HomePageCiscoLogo()
	{
		BellHomePage.validateCompanyLogo();
	}
	@Test(priority=3)
	public static void HomePageSecOneTextValidation()
	{
		BellHomePage.sectionOneIotStarterKitBellValidation();
	}
	@Test(priority=4)
	public static void HomePageTrackOrderValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitTrackOrderValidation();	
	}
	@Test(priority=5)
	public static void HomePageReferralCodeValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitEnterReferralCodeValidation();
	}
	@Test(priority=6)
	public static void HomePageTrackOrderErrorValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitTrackOrderErrorValidation();
	}
	@Test(priority=7)
	public static void HomePageEnterrefrralCodeErrorvalidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitReferralCodeErrorValidation();
	}
	@Test(priority=8)
	public static void HomePageSecTwoContentValidation()
	{
		BellHomePage.sectionTwoWhatThekitIncludesContentvalidation();
	} 
	@Test(priority=9)
	public static void HomePageSecTwoWhatThekitIncludesToolsvalidation()
	{
		BellHomePage.sectionTwoWhatThekitIncludesToolsvalidation();
	}	
	@Test(priority=10)
	public static void HomePageSecTwoWhatThekitIncludesCentervalidation()  
	{	
		BellHomePage.sectionTwoWhatThekitIncludesCentervalidation();
	}
	@Test(priority=11)
	public static void HomePagesectionTwoWhatThekitIncludesSuppportvalidation()
	{	
		BellHomePage.sectionTwoWhatThekitIncludesSuppportvalidation();
	}
	@Test(priority=12)
	public static void HomePagesectionThreeHowItWorksValidation()
	{	
		BellHomePage.sectionThreeHowItWorksValidation();
	}	
	@Test(priority=13)
	public static void HomePagesectionFourWhatIsIotValidation()
	{		
		BellHomePage.sectionFourWhatIsIotValidation();
	}
	@Test(priority=14)
	public static void HomePagesectionOneLinkvalidation() throws Exception
	{		
		BellHomePage.sectionOneLinkvalidation();
	}
	@Test(priority=15)
	public static void HomePagesectionFiveWithBell()
	{	
		BellHomePage.sectionFiveWithBell();
	}
	@Test(priority=16)
	public static void HomePagesectionFiveLTE()
	{	
		BellHomePage.sectionFiveLTE();
	}
	@Test(priority=17)
	public static void HomePagesectionFivePartners()
	{	
		BellHomePage.sectionFivePartners();
	}
	@Test(priority=18)
	public static void HomePagesectionFiveEndToEnd()
	{
		BellHomePage.sectionFiveEndToEnd();
	}
	@Test(priority=19)
	public static void HomePageLearnMoreFromBell() throws InterruptedException
	{
		BellHomePage.sectionFourLearnMoreFromBell();
	}
	@Test(priority=21)
	public static void HomePageSecOneReferralRequesButton() throws InterruptedException
	{
		BellHomePage.sectionOneReferralRequestvalidation();
	}
	@Test(priority=20)
	public static void HomePageM2MDotComvalidation() throws InterruptedException, IOException
	{
	allInputValue= UtilityMethods.getBellPropValues();
	if(allInputValue.getProperty("Broswer").equals("Chme"))
	{
		//driver.navigate().refresh();
		driver.navigate().refresh();
		System.out.println(" The Linkbutton is displayed :"+driver.findElement(By.xpath("//a[text()='M2M.com']")).isDisplayed()+"");
		System.out.println(" The Linkbutton is enabled :"+driver.findElement(By.xpath("//a[text()='M2M.com']")).isEnabled()+"");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='M2M.com']")).click();	
		System.out.println("link button clicked");
		Thread.sleep(6000);
		String parentHandle = driver.getWindowHandle();
		try {
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        System.out.println("" +driver.getTitle());
		        if (driver.getTitle().equals("M2M Developer Kits from the World�s Leading Mobile Operators"))
			    {
		        	if(!BellHomePagePO.M2MDotComFindElement.isDisplayed())
		        	{
		        		System.out.println("Page Rredirection Failed for"+BellHomePagePO.M2MDotCom.getText()+"");
		        	}
		        	else
		        	{
		        		System.out.println("Page Redirection done");
		        		driver.close();
		        	}
			    }
		    }
		   driver.switchTo().window(parentHandle);
		    //driver.navigate().back();
		    }
		catch(Exception e)
		{
		   System.out.println("Condition fail :"+e+"");
		}	
	}
	else if(allInputValue.getProperty("Broswer").equals("InternetExplorer"))
	{
	}
	else
	{
		BellHomePage.sectionTwoM2MDotCom();		
	}
	}
	@Test(priority=22)
	public static void HomePageSectwoReferralRequestButton() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		BellHomePage.sectionTwoReferralRequestvalidation();
	}
	@Test(priority=23)
	public static void HomePageBellLogoValidation() throws InterruptedException
	{
		BellHomePage.bellLogoValidation();
		
	}
	@Test(priority=24)
	public static void sectionOneReferralRequestvalidation() throws Exception
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		BellHomePage.ReferralRequestButtonRedirection();
		Thread.sleep(3000);
		//driver.navigate().refresh();
		/*
		PageFactory.initElements(driver, BellHomePagePO.class);

		System.out.println(" The Ref Req Button is displayed :"+BellHomePagePO.SectionOneReferralRrequestButton.isDisplayed()+"");
		System.out.println(" The Ref Req Button is enabled :"+BellHomePagePO.SectionOneReferralRrequestButton.isEnabled()+"");		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		BellHomePagePO.SectionTwoReferralRrequestButton.click();*/
		
	}
	@Test(priority=25)
	public static void ReferralRequestBellLogo()
	{
		BellReferralRequestPage.validateOperatorLogo();
	}
	
	@Test(priority=26)
	public static void ReferralRequestCompanyLogo()
	{
		BellReferralRequestPage.validateCompanyLogo();
	}
	
	@Test(priority=27)
	public static void ReferralRequestTextValiadtion()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BellReferralRequestPage.ReferralRequestTextValidation();

	}
	
	@Test(priority=28)
	public static void ReferralrequestTextBoxDisplayedAndEnabled()
	{
		BellReferralRequestPage.RequestReferralCodeTextBoxDisplayedAndEnabled();
	}
	
	@Test(priority=29)
	public static void ReferralrequestLabelDisplayedAndEnabled()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BellReferralRequestPage.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@Test(priority=30)
	public static void ReferralRequestPlaceHolderValidation()
	{
		BellReferralRequestPage.RequestReferralCodePlaceholderValidation();
	}
	@Test(priority=31)
	public static void ReferralRequestValidInputValidation()
	{
		BellReferralRequestPage.ReferralRequestCodeValidInputValidation();
	}

	@Test(priority=32)
	public static void ReferrakRequestRequiredFieldValidation()
	{
		BellReferralRequestPage.ReferralRequestRequiredFieldValidation();
	}
		
	@Test(priority=33)
	public static void ReferralrequestSpaceNotAllowedValiadation()
	{
		BellReferralRequestPage.ReferralRequestSpaceNotAllowedValidation();
	}
	@Test(priority=34)
	public static void ReferralRequestMaximumInputValidation()
	{
		BellReferralRequestPage.ReferralRequestMaximumInputValidation();
	}

	@Test(priority=35)
	public static void ReferralRequestMinimumInputValidation()
	{
		BellReferralRequestPage.ReferralRequestMinimumInputValidation();
	}
	
	@Test(priority=36)
	public static void ReferralRequestEmailValidation()
	{
		BellReferralRequestPage.ReferralRequestEmailValidation();
	}
	
	@Test(priority=37)
	public static void ReferralRequestNumericFeild()
	{
		BellReferralRequestPage.ReferralRequestNumericFieldValidation();
	}
	
	@Test(priority=38)
	public static void ReferralRequestBellLogoValidation() throws InterruptedException
	{
		BellReferralRequestPage.BellLogoValidation();
	}
	
	@Test(priority=39)
	public static void ReferralRequestBellCaLinkvalidation() throws InterruptedException
	{
		BellReferralRequestPage.BellCALinkValidation();
	}
	
	@Test(priority=40)
	public static void RferrralRequestcancelButton() throws InterruptedException
	{
		BellReferralRequestPage.ReferralrequestCancelButton();
	}
			
	@Test(priority=41)
	public static void ReferralRequestButtonvalidation() throws InterruptedException
	{
		BellReferralRequestPage.RequestButtonValidation();	
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	@Test(priority=42)
	public static void ThankYouBellLogo()
	{
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BellReferralRequestThankYou.validateOperatorLogo();
	}
	@Test(priority=43)
	public static void ThankYouCiscoLogo()
	{
		BellReferralRequestThankYou.validateCompanyLogo();
	}
	@Test(priority=44)
	public static void ThankYouTextvalidation()
	{
		BellReferralRequestThankYou.ThankYouTextValidation();
	}
	@Test(priority=45)
	public static void ThankYouBellPageRedirection() throws InterruptedException
	{
		
		BellReferralRequestThankYou.bellLogoValidation();
	}
	@Test(priority=45)
	public static void ThankYouIOTvalidation() throws InterruptedException 
	{
		BellReferralRequestThankYou.backToIOT();
	}
	
	@Test(priority=46)
	public static void ThankYouIOTPagevalidation() throws InterruptedException
	{
		BellReferralRequestThankYou.backToIOTPageValidation();
	}
	
	@Test(priority=47)
	public static void ReferralRequestAdminApproval() throws InterruptedException
	{
		AdminOperation.AdminApproval();	
	}
}




	

