package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import driver.BaseDriver;
import pageobjects.BellReferralRequestThankYouPO;
import utilitymethods.UtilityMethods;

public class BellReferralRequestThankYou extends BaseDriver
{
	public static WebDriver driver;
	public static Properties allInputValue;
	//@BeforeTest
	public static void BrowserIntilation() throws Exception
	{
		allInputValue = UtilityMethods.getBellPropValues();
		driver = BaseDriver.driver;
		
	}
	
	@Test(priority=1)
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellReferralRequestThankYouPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestThankYouPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellReferralRequestThankYouPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("RRTY001");
	} 
	
	@Test(priority=2)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, BellReferralRequestThankYouPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestThankYouPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellReferralRequestThankYouPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
	
		System.out.println("RRTY002");}
 
	@Test(priority=3)
	public static void ThankYouTextValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestThankYouPO.class);
		UtilityMethods.StringValidation(BellReferralRequestThankYouPO.SectionOneHead1.getText(), "Thank you for your request!", "equalsignorecase");
		UtilityMethods.StringValidation(BellReferralRequestThankYouPO.ParagraphText.getText(), allInputValue.getProperty("ReferralRequestThankYouPara"), "equalsignorecase");	
		System.out.println("RRTY003");
	}
	
	@Test(priority=4)
	public static void bellLogoValidation() throws InterruptedException
	{
		UtilityMethods.ThankYouPageRedirection(BellReferralRequestThankYouPO.BellLogo, BellReferralRequestThankYouPO.WhatIsIotImage);		
		System.out.println("RRTY004");
	}
	
	@Test(priority=5)
	public static void backToIOT() throws InterruptedException
	{
		UtilityMethods.StringValidation(BellReferralRequestThankYouPO.BackToIOT.getText(), "Back to IoT Starter Kit Page", "equalsignorecase");
		UtilityMethods.DisplayEnableValidator(BellReferralRequestThankYouPO.BackToIOT, "NotEqual","Back To IoT Starter Kit");	
		System.out.println("RRTY005");
	}
	
	@Test(priority=6)
	public static void backToIOTPageValidation() throws InterruptedException
	{
		UtilityMethods.ThankYouPageRedirection(BellReferralRequestThankYouPO.BackToIOT,BellReferralRequestThankYouPO.WhatIsIotImage);		
		System.out.println("RRTY006");
		
	}
}
