package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.BellShippingInfoPO;
import pageobjects.BellYourInfoPO;
import utilitymethods.UtilityMethods;

public class BellShippingInfo 
{
	public static FirefoxDriver driver ;
	static Properties allInputValue;
	//@BeforeTest
	public static void Start() throws Exception 
	{
		allInputValue = UtilityMethods.getBellPropValues();
		PageFactory.initElements(driver, BellShippingInfoPO.class);
	}
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellShippingInfoPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("TS001");
	} 
	
	public static void validateCompanyLogo()
	{	
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellShippingInfoPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("TS002");
	}
	
	public static void ShippingInfoTextvalidation()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.StringValidation(BellShippingInfoPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.SectionOneHead4.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.ParagraphText.getText(), allInputValue.getProperty("Shipping.SectionOne"), "equalsignorecase");
		System.out.println("TS003");
	}
	public static void shippingInfoLabelText()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAddressLabel, "NotEqual", "Address Label Text");
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAptLabel, "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCityLabel, "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipProvinceLabel, "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipPostLabel, "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCountryLabel, "NotEqual", "Country Label Text");	
		System.out.println("TS004");
	}
	public static void shippingInfoInputField()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAddressInput, "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipAptInput, "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCityInput, "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipProvinceInput, "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipPostInput, "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ShipCountryInput, "NotEqual", "Country Drop Down");	
		System.out.println("TS005");
	}
	
	public static void ShippingInfoLinkButton()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.BackButton, "NotEqual", "Back Button");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ContinueButton, "NotEqual", "Continue Button");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.CancelButton, "NotEqual", "Cancel Button");	
		System.out.println("TS006");
	}
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipPostInput, BellShippingInfoPO.ShipPostError,"TextBox");

		UtilityMethods.RequiredFieldShippingDropDown(BellShippingInfoPO.ShipProvinceInput, BellShippingInfoPO.ShipProvinceError);
		UtilityMethods.RequiredFieldShippingDropDown(BellShippingInfoPO.ShipCountryInput, BellShippingInfoPO.ShipCountryError);
		System.out.println("TS007");
	}
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError);
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError);
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipPostInput, BellShippingInfoPO.ShipPostError);
		System.out.println("TS008");
	}
	
	public static void ShippingInfoMaximumInputValidation()
	 {
		PageFactory.initElements(driver, BellShippingInfoPO.class);BellShippingInfoPO.ContinueButton.click();
        UtilityMethods.MaximumInputValidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError,100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError, 100, allInputValue.getProperty("InvalidCity")); 
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
        System.out.println("TS009");
	 }
	public static void  ShippingInfoMinimumInputValidation()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.MinimumInputValidation(BellShippingInfoPO.ShipProvinceInput, BellShippingInfoPO.ShipProvinceError, 2, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(BellShippingInfoPO.ShipPostInput,BellShippingInfoPO.ShipPostError, 3, allInputValue.getProperty("InvalidMinInput"));    	 
        System.out.println("TS010");
	}
	
	public static void BellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.pageRedirection(BellShippingInfoPO.BellLogo, BellShippingInfoPO.CancelButtonFindElement,"Others");
		System.out.println("TS011");
	}
	
	public static void CancelButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.pageRedirection(BellShippingInfoPO.CancelButton, BellShippingInfoPO.CancelButtonFindElement,"Others");
		System.out.println("TS012");
	}
	
	public static void BackButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.pageRedirection(BellShippingInfoPO.BackButton, BellShippingInfoPO.BackFindElement,"Others");
		System.out.println("TS013");
	}
	
	public static void ShippingInfoSendInputs()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipAddressInput, allInputValue.getProperty("shippingAddress1"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipAptInput, allInputValue.getProperty("shippingAddress2"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipCityInput, allInputValue.getProperty("ShippingCity"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipProvinceInput, allInputValue.getProperty("ShippingState"), "DropDown");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipPostInput, allInputValue.getProperty("ShippingPostalCode"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipCountryInput, allInputValue.getProperty("ShippingCountry"), "DropDown");
		BellShippingInfoPO.ContinueButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("TS014");
	}
	
}
