package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import pageobjects.BellBillingInfoPO;
import pageobjects.BellReviewConfirmPO;
import utilitymethods.UtilityMethods;

public class BellReviewConfirm 
{

	public static FirefoxDriver driver ;
	static Properties allInputValue;
	
	@BeforeTest
	public static void Start() throws Exception 
	{
		allInputValue = UtilityMethods.getBellPropValues();
		PageFactory.initElements(driver, BellReviewConfirmPO.class);
	}
	
	public static void validateOperatorLogo()
	{
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellReviewConfirmPO.BellLogo,"src",allInputValue.getProperty("BellLogo"),"Bell Operator Logo");		
	} 
	
	public static void validateCompanyLogo()
	{	
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellReviewConfirmPO.CiscoLogo,"src",allInputValue.getProperty("CiscoLogo"),"Cisco Jasper Company Logo");		
	}
	
	public static void HeadertextValidation()
	{
		UtilityMethods.StringValidation(BellReviewConfirmPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.SectionOneHead4.getText(), "Order Summary", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.YourInfoText.getText(), "Your Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.ShppingText.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.PaymentText.getText(), "Payment", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.ReviewConfirmText.getText(), "Shipping", "equalsignorecase");

	}
	
	public static void SectionOneTextValidation()
	{
		UtilityMethods.StringValidation(BellReviewConfirmPO.IOTText.getText(), "IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.TestSimText.getText(), "3 Test SIMs", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.MBPerSimTextl.getText(), "30MB per SIM per month", "equalsignorecase");	
		UtilityMethods.StringValidation(BellReviewConfirmPO.SMSPerSimText.getText(), "50 SMS per SIM per month", "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.FullAcessText.getText(), "Full access to Post Control Centre", "equalsignorecase");
	}
	
	public static void ShippingBillingAddressValidation()
	{
		UtilityMethods.StringValidation(BellReviewConfirmPO.ShippingAddress.getText().replace("\n", " "), allInputValue.getProperty("shippindAddress"), "equalsignorecase");
		UtilityMethods.StringValidation(BellReviewConfirmPO.BillingAddress.getText().replace("\n", " "), allInputValue.getProperty("billingAddress"), "equalsignorecase");
	}
	
	
	public static void shippingEditButton()
	{
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.ShippingEdit, "NotEqual", "Edit button in shipping");
	}
	
	public static void billingEditButton()
	{
		UtilityMethods.DisplayEnableValidator(BellReviewConfirmPO.BillingEdit, "NotEqual", "Edit button in Billing");
	}
	
}
