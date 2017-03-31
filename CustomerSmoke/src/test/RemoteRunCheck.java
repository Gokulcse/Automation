package test;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Properties;

import pageobjects.*;
import pages.*;
import utilitymethods.UtilityMethods;

public class RemoteRunCheck 
{
	static WebDriver driver;
	static Properties allInputValue;
	@BeforeTest
	public static void Setup() throws MalformedURLException
	{
		String NodeURL="http://192.168.1.2:5566/wd/hub";
		//System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		//capability.setCapability("marionette", true);
		capability.setPlatform(Platform.WIN10);
		//capability.setVersion("47");
		driver = new RemoteWebDriver(new URL(NodeURL), capability);
		
	}
	@Test(priority=1)
	public static void LaunchURL() throws IOException
	{
		allInputValue = UtilityMethods.getBellPropValues();
		driver.get(allInputValue.getProperty("BaseURl"));
	}
	@Test(priority=2)
	public static void validateOperatorLogo() 
	{		
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.DisplayEnableValidator(BellHomePagePO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellHomePagePO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");
		System.out.println("HP001");
	} 
	
	@Test(priority=3)
	public static void sectionOneIotStarterKitBellValidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);	
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerh1.getText(), allInputValue.getProperty("sectionOneH1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerh3.getText(), allInputValue.getProperty("sectionOneH3"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerp1.getText(), allInputValue.getProperty("sectionOneP1"), "equalsignorecase");
		UtilityMethods.StringValidation(BellHomePagePO.TextBannerp2.getText(), allInputValue.getProperty("sectionOneP2"), "equalsignorecase");
		System.out.println("HP003");
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
		System.out.println("HP004");
	}
	
	@Test(priority=5)
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
	@Test(priority=6)	
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
	@Test(priority=7)
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
				 
	@Test(priority=8)
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
				 
	@Test(priority=9)
	public static void sectionTwoWhatThekitIncludesToolsvalidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.ToolIcon, allInputValue.getProperty("bellToolIcon"), BellHomePagePO.ToolText, allInputValue.getProperty("whatTheKitIncludesToolc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.ToolListText,allInputValue.getProperty("whatTheKitIncludesToolc2"),allInputValue.getProperty("whatTheKitIncludesToolc3"),allInputValue.getProperty("whatTheKitIncludesToolc4"));		
		System.out.println("HP009");
	}
		
	@Test(priority=10)
	public static void sectionTwoWhatThekitIncludesCentervalidation()  
	{	
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.CenterIcon, allInputValue.getProperty("bellCenterIcon"), BellHomePagePO.CenterText,allInputValue.getProperty("whatTheKitIncludescenterc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.CenterListText, allInputValue.getProperty("whatTheKitIncludescenterc2"), allInputValue.getProperty("whatTheKitIncludescenterc3"),allInputValue.getProperty("whatTheKitIncludescenterc4"));		
		System.out.println("HP010");
	}
	
	@Test(priority=11)
	public static void sectionTwoWhatThekitIncludesSuppportvalidation()
	{
		PageFactory.initElements(driver, BellHomePagePO.class);
		UtilityMethods.whatTheKitIncludesImageAndTextValidation(BellHomePagePO.SupportIcon, allInputValue.getProperty("bellSupportIcon"), BellHomePagePO.SupportText,allInputValue.getProperty("whatTheKitIncludesSupportc1"));
		UtilityMethods.whatThekitIncludesTextValidation(BellHomePagePO.SupportListText, allInputValue.getProperty("whatTheKitIncludesSupportc2"), allInputValue.getProperty("whatTheKitIncludesSupportc3"),allInputValue.getProperty("whatTheKitIncludesSupportc4"));
		UtilityMethods.StringValidation(BellHomePagePO.PleaseNoteText.getText(), allInputValue.getProperty("pleaseNote"), "equalsignorecase");
		System.out.println("HP011");
	}
	
	
}
