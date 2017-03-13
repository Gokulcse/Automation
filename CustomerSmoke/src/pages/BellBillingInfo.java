package pages;

import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import pageobjects.BellBillingInfoPO;
import pageobjects.BellShippingInfoPO;
import utilitymethods.UtilityMethods;

public class BellBillingInfo 
{
	public static FirefoxDriver driver ;
	static Properties allInputValue;
	
	@BeforeTest
	public static void Start() throws Exception 
	{
	allInputValue = UtilityMethods.getBellPropValues();
	PageFactory.initElements(driver, BellBillingInfoPO.class);
	}
	
	public static void validateOperatorLogo()
	{
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellBillingInfoPO.BellLogo,"src",allInputValue.getProperty("BellLogo"),"Bell Operator Logo");		
	} 
	
	public static void validateCompanyLogo()
	{	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellBillingInfoPO.CiscoLogo,"src",allInputValue.getProperty("CiscoLogo"),"Cisco Jasper Company Logo");		
	}

	public static void ShippingInfoTextvalidation()
	{
		UtilityMethods.StringValidation(BellBillingInfoPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.SectionOneHead4.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.ParagraphText.getText(), allInputValue.getProperty("Billing.SectionOne"), "equalsignorecase");
	}
	public static void CardDetailsLabelText()
	{
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.NameOnCardLabel, "NotEqual", "Name On Card Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CardNumberLabel, "NotEqual", "Card Number Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.ExpiryDateLabel, "NotEqual", "Expiry Date Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CVVCodeLabel, "NotEqual", "CVV Code Label Text");	
		
	}
	public static void CardDetailsInputFieldValidation()
	{
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.NameOnCardInput, "Equal", "Name On Card input Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CardNumberInput, "Equal", "Card Number input Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.ExpiryDate, "Equal", "Expiry Date input Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CVVCodeInput, "Equal", "CVV Code input Text");	
	}
	
	public static void CheckBoxVaildation()
	{
		BellBillingInfoPO.SameBillAndShipLabel.click();
	}
	
	public static void BillingInfoLabelText()
	{
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAddressLabel, "NotEqual", "Address Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAptLabel, "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCityLabel, "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillProvinceLabel, "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillPostLabel, "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCountryLabel, "NotEqual", "Country Label Text");	
	}

	public static void BillingInfoInputField()
	{
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAddressInput, "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAptInput, "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCityInput, "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillProvinceInput, "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillPostInput, "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCountryInput, "NotEqual", "Country Drop Down");		
	}
	
	public static void BillingInfoRequiredFieldvalidatoin()
	{
		BellBillingInfoPO.ReviewButton.click();
		UtilityMethods.RequiredFieldValidation(BellBillingInfoPO.BillAddressInput, BellBillingInfoPO.BillAddressError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellBillingInfoPO.BillCityInput, BellBillingInfoPO.BillCityError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellBillingInfoPO.BillPostInput, BellBillingInfoPO.BillPostError,"TextBox");
		UtilityMethods.RequiredFieldShippingDropDown(BellBillingInfoPO.BillProvinceInput, BellBillingInfoPO.BillProvinceError);
		UtilityMethods.RequiredFieldShippingDropDown(BellBillingInfoPO.BillCountryInput, BellBillingInfoPO.BillCountryError);
	}
	
	public static void BillingInfoSpaceNotAllowedvalidatoin()
	{
		BellBillingInfoPO.ReviewButton.click();
		 UtilityMethods.SpaceNotAllowedvalidation(BellBillingInfoPO.BillAddressInput, BellBillingInfoPO.BillAddressError);
		 UtilityMethods.SpaceNotAllowedvalidation(BellBillingInfoPO.BillCityInput, BellBillingInfoPO.BillCityError);
		 UtilityMethods.SpaceNotAllowedvalidation(BellBillingInfoPO.BillPostInput, BellBillingInfoPO.BillPostError);
	}
	
	public static void BillingInfoMaximumInputValidation()
	{
		BellBillingInfoPO.ReviewButton.click();
        UtilityMethods.MaximumInputValidation(BellBillingInfoPO.BillAddressInput, BellBillingInfoPO.BillAddressError,100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(BellBillingInfoPO.BillCityInput, BellBillingInfoPO.BillCityError, 100, allInputValue.getProperty("InvalidCity")); 
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
	 }
	
	public static void  BillingInfoMinimumInputValidation()
	{
		BellBillingInfoPO.ReviewButton.click();
		UtilityMethods.MinimumInputValidation(BellBillingInfoPO.BillProvinceInput, BellBillingInfoPO.BillProvinceError, 2, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(BellBillingInfoPO.BillPostInput, BellBillingInfoPO.BillPostError, 3, allInputValue.getProperty("InvalidMinInput"));    	 
	}
	
	public static void BillingInfoSendInputs()
	{
		UtilityMethods.SendInputValues(BellBillingInfoPO.BillAddressInput, allInputValue.getProperty("billingAddress1"), "TextBox");
		UtilityMethods.SendInputValues(BellBillingInfoPO.BillAptInput, allInputValue.getProperty("billingAddress2"), "TextBox");
		UtilityMethods.SendInputValues(BellBillingInfoPO.BillCityInput, allInputValue.getProperty("billingCity"), "TextBox");
		UtilityMethods.SendInputValues(BellBillingInfoPO.BillProvinceInput, allInputValue.getProperty("billingState"), "DropDown");
		UtilityMethods.SendInputValues(BellBillingInfoPO.BillPostInput, allInputValue.getProperty("billingPostalCode"), "TextBox");
		UtilityMethods.SendInputValues(BellBillingInfoPO.BillCountryInput, allInputValue.getProperty("billingCountry"), "DropDown");
		BellBillingInfoPO.ReviewButton.click();
	}
	
}