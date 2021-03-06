
package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
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
	public static WebDriver driver =BaseDriver.driver;
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
		UtilityMethods.sleep(2000);
	} 
	
	public static void validateCompanyLogo()
	{	
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellOrderSummaryPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("OS002");
		UtilityMethods.sleep(2000);
	}
	
	public static void HeadertextValidation()
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.StringValidation(BellOrderSummaryPO.SectionOneHead1.getText(), "Thank you for your order!", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.Para1Text.getText(), "Please print or save this page for you records.", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.Para2Text.getText().replace("\n", " "), "You can always review the status of your order at bell.devm2m.com", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.Para3Text.getText(), "If you have any questions, please contact us at devkitsupport@bell.ca.", "equalsignorecase");
		System.out.println("OS003");
		UtilityMethods.sleep(2000);

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
		UtilityMethods.sleep(2000);
	}
	
	public static void sectionThreeTextValidation()
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.StringValidation(BellOrderSummaryPO.IncludeText.getText(), "Included", "equalsignorecase");
		UtilityMethods.StringValidation(BellOrderSummaryPO.ShippingTotalText.getText(), "Shipping", "equalsignorecase");
		System.out.println("OS005");
		UtilityMethods.sleep(2000);

	}
	
	public static void ShipBillAddressValidation()
	{
		if(allInputValue.getProperty("sameShippBillAddress").equals("Yes"))
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			System.out.println("OS006");
			UtilityMethods.sleep(2000);
		}
		else if (allInputValue.getProperty("sameShippBillAddress").equals("No"))
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("billingAddress"), "equalsignorecase");
			System.out.println("OS006");
			UtilityMethods.sleep(2000);
		}
		else
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			System.out.println("OS006");
			UtilityMethods.sleep(2000);
		}
	}
	
	public static void sectionOneBellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.BellLogo, "NotEqual", "Bell Logo");
		UtilityMethods.ThankYouPageRedirection(BellOrderSummaryPO.BellLogo, BellOrderSummaryPO.BactToIOTFindElement);
		System.out.println("OS007");
		UtilityMethods.sleep(2000);
	}
	
	public static void sectionOneBackToIOTValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.BactToIOTButton, "NotEqual", "Back to IOt Starter Kit Button");
		UtilityMethods.ThankYouPageRedirection(BellOrderSummaryPO.BactToIOTButton, BellOrderSummaryPO.BactToIOTFindElement);
		System.out.println("OS008");
		UtilityMethods.sleep(2000);
	}
	
	public static void sectionOneTrackOrderValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.TrackOrderButton, "NotEqual", "Track Order Button");
		UtilityMethods.ThankYouPageRedirection(BellOrderSummaryPO.TrackOrderButton, BellOrderSummaryPO.TrackOrderFindElement);
		System.out.println("OS009");
		UtilityMethods.sleep(2000);
	}
	
	public static void homePageLinkvalidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellOrderSummaryPO.class);
		UtilityMethods.DisplayEnableValidator(BellOrderSummaryPO.HomePageLink, "NotEqual", "Home Page Link Button");
		UtilityMethods.ThankYouPageRedirection(BellOrderSummaryPO.HomePageLink, BellOrderSummaryPO.homepageLinkFindElement);
		System.out.println("OS010");
		UtilityMethods.sleep(2000);
		driver.close();
	}
	
}
