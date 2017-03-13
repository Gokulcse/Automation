package pages;

import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.BellShippingInfoPO;
import utilitymethods.UtilityMethods;

public class BellShippingInfo 
{
	public static FirefoxDriver driver ;
	static Properties allInputValue;
	@BeforeTest
	public static void Start() throws Exception 
	{
		allInputValue = UtilityMethods.getBellPropValues();
		PageFactory.initElements(driver, BellShippingInfoPO.class);
	}
	public static void validateOperatorLogo()
	{
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.BellLogo, "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellShippingInfoPO.BellLogo,"src",allInputValue.getProperty("PostLogo"),"Post Operator Logo");		
	} 
	
	public static void validateCompanyLogo()
	{	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellShippingInfoPO.CiscoLogo,"src",allInputValue.getProperty("CiscoLogo"),"Cisco Jasper Company Logo");		
	}
	@Test(priority=4)
	public static void ShippingInfoTextvalidation()
	{
		UtilityMethods.StringValidation(BellShippingInfoPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.SectionOneHead4.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.ParagraphText.getText(), allInputValue.getProperty("Shipping.SectionOne"), "equalsignorecase");
	}
	@Test(priority=5)
	public static void shippingInfoLabelText()
	{
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAddressLabel, "NotEqual", "Address Label Text");
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAptLabel, "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCityLabel, "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipProvinceLabel, "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipPostLabel, "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCountryLabel, "NotEqual", "Country Label Text");	
	}
	@Test(priority=6)
	public static void shippingInfoInputField()
	{
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAddressInput, "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAptInput, "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCityInput, "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipProvinceInput, "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipPostInput, "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCountryInput, "NotEqual", "Country Drop Down");	
	}
	
	public static void ShippingInfoLinkButton()
	{
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.BackButton, "NotEqual", "Back Button");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ContinueButton, "NotEqual", "Continue Button");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.CancelButton, "NotEqual", "Cancel Button");	
	}
	@Test(priority=7)
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipPostInput, BellShippingInfoPO.ShipPostError,"TextBox");

		UtilityMethods.RequiredFieldShippingDropDown(BellShippingInfoPO.ShipProvinceInput, BellShippingInfoPO.ShipProvinceError);
		UtilityMethods.RequiredFieldShippingDropDown(BellShippingInfoPO.ShipCountryInput, BellShippingInfoPO.ShipCountryError);
	}
	@Test(priority=8)
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError);
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError);
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipPostInput, BellShippingInfoPO.ShipPostError);
	}
	
	@Test(priority=9)
	public static void ShippingInfoMaximumInputValidation()
	 {
		BellShippingInfoPO.ContinueButton.click();
        UtilityMethods.MaximumInputValidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError,100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError, 100, allInputValue.getProperty("InvalidCity")); 
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
	 }
	@Test(priority=10)
	public static void  ShippingInfoMinimumInputValidation()
	{
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.MinimumInputValidation(BellShippingInfoPO.ShipProvinceInput, BellShippingInfoPO.ShipProvinceError, 2, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(BellShippingInfoPO.ShipPostInput,BellShippingInfoPO.ShipPostError, 3, allInputValue.getProperty("InvalidMinInput"));    	 
	}
	
	public static void ShippingInfoSendInputs()
	{
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipAddressInput, allInputValue.getProperty("shippingAddress1"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipAptInput, allInputValue.getProperty("shippingAddress2"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipCityInput, allInputValue.getProperty("ShippingCity"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipProvinceInput, allInputValue.getProperty("ShippingState"), "DropDown");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipPostInput, allInputValue.getProperty("ShippingPostalCode"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipCountryInput, allInputValue.getProperty("ShippingCountry"), "DropDown");
		BellShippingInfoPO.ContinueButton.click();
	}
	
}
