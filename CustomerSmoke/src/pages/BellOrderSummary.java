package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.BellOrderSummaryPO;
import pageobjects.BellReviewConfirmPO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class BellOrderSummary extends BaseDriver
{
	public static InternetExplorerDriver driver =BaseDriver.driver;
	static Properties allInputValue;
	public static void Start() throws Exception 
	{
		allInputValue = UtilityMethods.getBellPropValues();
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
	}
	
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellOrderSummaryPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("OS001");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	} 
	
	public static void validateCompanyLogo()
	{	
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellOrderSummaryPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("OS002");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	
	public static void HeadertextValidation()
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.StringValidation(BellOrderSummaryPO.SectionOneHead1.getText(), "Thank you for your order!", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.Para1Text.getText(), "Please print or save this page for you records.", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.Para2Text.getText().replace("\n", " "), "You can always review the status of your order at bell.devm2m.com", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.Para3Text.getText(), "If you have any questions, please contact us at devkitsupport@bell.ca.", "equalsignorecase");
		System.out.println("OS003");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	
	public static void sectionTwoTextValidation()
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.StringValidation(BellOrderSummaryPO.DateText.getText(), "Date of order", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.IOTText.getText(), "IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.TestSimText.getText(), "3 Test SIMs", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.MBPerSimTextl.getText(), "30MB per SIM per month", "equalsignorecase");	
		UtilityMethods.StringValidation(BellOrderSummaryPO.SMSPerSimText.getText(), "50 SMS per SIM per month", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.FullAcessText.getText(), "Full access to Bell Control Centre", "equalsignorecase");
		System.out.println("OS004");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	
	public static void sectionThreeTextValidation()
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.StringValidation(BellOrderSummaryPO.IncludeText.getText(), "Included", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.ShippingTotalText.getText(), "Shipping", "equalsignorecase");
		System.out.println("OS005");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	
	public static void ShipBillAddressValidation()
	{
		if(allInputValue.getProperty("sameShippBillAddress").equals("Yes"))
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			System.out.println("OS006");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		}
		else if (allInputValue.getProperty("sameShippBillAddress").equals("No"))
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("billingAddress"), "equalsignorecase");
			System.out.println("OS006");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		}
		else
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			System.out.println("OS006");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		}
	}
	
	public static void sectionOneBellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.BellLogo, "NotEqual", "Bell Logo");
		UtilityMethods.pageRedirection(BellOrderSummaryPO.BellLogo, BellOrderSummaryPO.BactToIOTFindElement,"Others");
		System.out.println("OS007");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public static void sectionOneBackToIOTValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.BactToIOTButton, "NotEqual", "Back to IOt Starter Kit Button");
		UtilityMethods.pageRedirection(BellOrderSummaryPO.BactToIOTButton, BellOrderSummaryPO.BactToIOTFindElement,"Others");
		System.out.println("OS008");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public static void sectionOneTrackOrderValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.TrackOrderButton, "NotEqual", "Track Order Button");
		UtilityMethods.pageRedirection(BellOrderSummaryPO.TrackOrderButton, BellOrderSummaryPO.TrackOrderFindElement,"Others");
		System.out.println("OS009");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public static void homePageLinkvalidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.HomePageLink, "NotEqual", "THome Page Link Button");
		UtilityMethods.pageRedirection(BellOrderSummaryPO.HomePageLink, BellOrderSummaryPO.homepageLinkFindElement,"Others");
		System.out.println("OS010");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
}
