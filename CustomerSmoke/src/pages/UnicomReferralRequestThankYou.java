package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.UnicomReferralRequestThankYouPO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class UnicomReferralRequestThankYou extends BaseDriver
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
		PageFactory.initElements(driver, UnicomReferralRequestThankYouPO.class);
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestThankYouPO.UnicomLogo, "NotEqual","China Unicom Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(UnicomReferralRequestThankYouPO.UnicomLogo,"src",allInputValue.getProperty("UnicomLogo"),"China Unicom Operator Logo");		
		System.out.println("RRTY001");
	} 

	@Test(priority=2)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, UnicomReferralRequestThankYouPO.class);
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestThankYouPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(UnicomReferralRequestThankYouPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		

		System.out.println("RRTY002");}

	@Test(priority=3)
	public static void ThankYouTextValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestThankYouPO.class);
		UtilityMethods.StringValidation(UnicomReferralRequestThankYouPO.SectionOneHead1.getText(), allInputValue.getProperty("ReferralRequestThankYouHeader"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomReferralRequestThankYouPO.ParagraphText.getText(), allInputValue.getProperty("ReferralRequestThankYouPara"), "equalsignorecase");	
		System.out.println("RRTY003");
	}

	@Test(priority=4)
	public static void UnicomLogoValidation() throws InterruptedException
	{
		UtilityMethods.ThankYouPageRedirection(UnicomReferralRequestThankYouPO.UnicomLogo, UnicomReferralRequestThankYouPO.WhatIsIotImage);		
		System.out.println("RRTY004");
	}

	@Test(priority=5)
	public static void backToIOT() throws InterruptedException
	{
		UtilityMethods.StringValidation(UnicomReferralRequestThankYouPO.BackToIOT.getText(), "Back to IoT Starter Kit Page", "equalsignorecase");
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestThankYouPO.BackToIOT, "NotEqual","Back To IoT Starter Kit");	
		System.out.println("RRTY005");
	}

	@Test(priority=6)
	public static void backToIOTPageValidation() throws InterruptedException
	{
		UtilityMethods.ThankYouPageRedirection(UnicomReferralRequestThankYouPO.BackToIOT,UnicomReferralRequestThankYouPO.WhatIsIotImage);		
		System.out.println("RRTY006");

	}
}
