package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import driver.BaseDriver;
import pageobjects.BellBillingInfoPO;
import pageobjects.BellReviewConfirmPO;
import utilitymethods.UtilityMethods;

public class BellReviewConfirm extends BaseDriver
{
	public static InternetExplorerDriver driver =BaseDriver.driver;
	static Properties allInputValue;
	//@BeforeTest
	public static void Start() throws Exception 
	{
		allInputValue = UtilityMethods.getBellPropValues();
		PageFactory.initElements(driver, BellReviewConfirmPO.class);
	}
	
	public static void validateOperatorLogo()
	{
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellReviewConfirmPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("RC001");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	} 
	
	public static void validateCompanyLogo()
	{	
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellReviewConfirmPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("RC002");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	
	public static void HeadertextValidation()
	{
		UtilityMethods.StringValidation(BellReviewConfirmPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.SectionOneHead4.getText(), "Order Summary", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.YourInfoText.getText(), "Your Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.ShppingText.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.PaymentText.getText(), "Payment", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.ReviewConfirmText.getText(), "Review & Confirm", "equalsignorecase");
		System.out.println("RC003");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	
	public static void SectionOneTextValidation()
	{
		UtilityMethods.StringValidation(BellReviewConfirmPO.IOTText.getText(), "IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.TestSimText.getText(), "3 Test SIMs", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.MBPerSimTextl.getText(), "30MB per SIM per month", "equalsignorecase");	
		UtilityMethods.StringValidation(BellReviewConfirmPO.SMSPerSimText.getText(), "50 SMS per SIM per month", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.FullAcessText.getText(), "Full access to Bell Control Centre", "equalsignorecase");
		System.out.println("RC004");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	
	public static void ShippingBillingAddressValidation()
	{
		if(allInputValue.getProperty("sameShippBillAddress").equals("Yes"))
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			System.out.println("RC005");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		}
		else if (allInputValue.getProperty("sameShippBillAddress").equals("No"))
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("billingAddress"), "equalsignorecase");
			System.out.println("RC005");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		}
		else
		{
			UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
			System.out.println("RC005");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	
	public static void EditButtonsValidation()
	{
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.ShippingEdit, "NotEqual", "Edit button in shipping");
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.BillingEdit, "NotEqual", "Edit button in Billing");
		System.out.println("RC006");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

	}
	public static void BellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellReviewConfirmPO.class);
		UtilityMethods.pageRedirection(BellReviewConfirmPO.BellLogo, BellReviewConfirmPO.CancelButtonFindElement,"Others");
		System.out.println("RC007");
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public static void CancelButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellReviewConfirmPO.class);
		UtilityMethods.pageRedirection(BellReviewConfirmPO.CancelButton, BellReviewConfirmPO.CancelButtonFindElement,"Others");
		System.out.println("RC008");
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public static void ShippingEditButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellReviewConfirmPO.class);
		UtilityMethods.pageRedirection(BellReviewConfirmPO.ShippingEdit, BellReviewConfirmPO.ShipEditFindElement,"Others");
		System.out.println("RC009");
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public static void BillingEditButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellReviewConfirmPO.class);
		UtilityMethods.pageRedirection(BellReviewConfirmPO.BillingEdit, BellReviewConfirmPO.BillEditFindElement,"Others");
		System.out.println("RC010");
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	}

	public static void ConfirmButtonClick()
	{
		PageFactory.initElements(driver, BellReviewConfirmPO.class);
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.ConfirmButton, "NotEqual", "Edit button in Billing");
		BellReviewConfirmPO.ConfirmButton.click();
		System.out.println("RC011");
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
		
	}

}
