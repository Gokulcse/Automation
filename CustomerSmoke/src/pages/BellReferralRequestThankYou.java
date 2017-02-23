package pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import pageobjects.BellReferralRequestThankYouPO;
import utilitymethods.UtilityMethods;

public class BellReferralRequestThankYou extends BaseDriver
{
	public static FirefoxDriver driver;
	static Properties allInputValue;
	@BeforeTest
	public static void Start() throws Exception
	{
		driver = launchApp();
		allInputValue = UtilityMethods.getBellPropValues();
	}
	
	@Test
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellReferralRequestThankYouPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestThankYouPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellReferralRequestThankYouPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		
	} 
	
	@Test(priority=1)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, BellReferralRequestThankYouPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestThankYouPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellReferralRequestThankYouPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
	}
 
	@Test(priority=2)
	public static void ReferralRequestTextValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestThankYouPO.class);
		UtilityMethods.StringValidation(BellReferralRequestThankYouPO.SectionOneHead1.getText(), "Thank you for your request!", "equalsignorecase");
		UtilityMethods.StringValidation(BellReferralRequestThankYouPO.ParagraphText.getText(), allInputValue.getProperty("ReferralRequestThankYouPara"), "equalsignorecase");	
	}
	
	@Test(priority=3)
	public static void bellLogoValidation() throws InterruptedException
	{
		UtilityMethods.PageNavigationValidation(BellReferralRequestThankYouPO.BellLogo,BellReferralRequestThankYouPO.WhatIsIotImage,"Bell"); 
		
	}
	
	@Test(priority=4)
	public static void ciscoLogoValidation() throws InterruptedException
	{
		UtilityMethods.PageNavigationValidation(BellReferralRequestThankYouPO.CiscoLogo,BellReferralRequestThankYouPO.JasperDotComFindElement,"IoT Connectivity Management Platform | Cisco Jasper"); 
		
	}
	@Test(priority=5)
	public static void backToIOT() throws InterruptedException
	{
		UtilityMethods.StringValidation(BellReferralRequestThankYouPO.BackToIOT.getText(), "Back to IoT Starter Kit Page", "equalsignorecase");
		UtilityMethods.DisplayEnableValidator(BellReferralRequestThankYouPO.BackToIOT, "NotEqual","Back To IoT Starter Kit");	
		UtilityMethods.PageNavigationValidation(BellReferralRequestThankYouPO.BackToIOT,BellReferralRequestThankYouPO.WhatIsIotImage,"Bell"); 
	}

}
