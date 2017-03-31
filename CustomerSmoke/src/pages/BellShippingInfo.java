package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import pageobjects.BellShippingInfoPO;
import pageobjects.BellYourInfoPO;
import utilitymethods.UtilityMethods;

public class BellShippingInfo extends BaseDriver
{
	public static WebDriver driver =BaseDriver.driver;
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
		System.out.println("SI001");
		UtilityMethods.sleep(2000);

	} 
	
	public static void validateCompanyLogo()
	{	
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellShippingInfoPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("SI002");
		UtilityMethods.sleep(2000);

	}
	
	public static void ShippingInfoTextvalidation()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.StringValidation(BellShippingInfoPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.YourInfoText.getText(), "Your Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.ShppingText.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.PaymentText.getText(), "Payment", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.ReviewConfirmText.getText(), "Review & Confirm", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.SectionOneHead4.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellShippingInfoPO.ParagraphText.getText(), allInputValue.getProperty("Shipping.SectionOne"), "equalsignorecase");
		System.out.println("SI003");
		UtilityMethods.sleep(2000);

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
		System.out.println("SI004");
		UtilityMethods.sleep(2000);

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
		System.out.println("SI005");
		UtilityMethods.sleep(2000);

	}
	
	public static void ShippingInfoLinkButton()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.BackButton, "NotEqual", "Back Button");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.ContinueButton, "NotEqual", "Continue Button");	
		UtilityMethods.DisplayEnableValidator(BellShippingInfoPO.CancelButton, "NotEqual", "Cancel Button");	
		System.out.println("SI006");
		UtilityMethods.sleep(2000);

	}
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		BellShippingInfoPO.ShipAddressInput.clear();
		UtilityMethods.sleep(2000);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.sleep(3000);
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellShippingInfoPO.ShipPostInput, BellShippingInfoPO.ShipPostError,"TextBox");
		UtilityMethods.RequiredFieldShippingDropDown(BellShippingInfoPO.ShipProvinceInput, BellShippingInfoPO.ShipProvinceError);
		UtilityMethods.RequiredFieldShippingDropDown(BellShippingInfoPO.ShipCountryInput, BellShippingInfoPO.ShipCountryError);
		System.out.println("SI007");
		UtilityMethods.sleep(2000);
	}
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		BellShippingInfoPO.ShipAddressInput.clear();
		UtilityMethods.sleep(2000);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.sleep(3000);
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError);
		UtilityMethods.SpaceNotAllowedvalidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError);
		System.out.println("SI008");
		UtilityMethods.sleep(2000);
	}
	
	public static void ShippingInfoMaximumInputValidation()
	 {
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		BellShippingInfoPO.ShipAddressInput.clear();
		UtilityMethods.sleep(2000);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.sleep(3000);
		UtilityMethods.MaximumInputValidation(BellShippingInfoPO.ShipAddressInput, BellShippingInfoPO.ShipAddressError,100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(BellShippingInfoPO.ShipCityInput, BellShippingInfoPO.ShipCityError, 100, allInputValue.getProperty("InvalidCity")); 
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
        System.out.println("SI009");
        UtilityMethods.sleep(2000);
	 }
	public static void  ShippingInfoMinimumInputValidation()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		BellShippingInfoPO.ShipAddressInput.clear();
		UtilityMethods.sleep(2000);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.sleep(3000);
        UtilityMethods.MinimumInputValidation(BellShippingInfoPO.ShipPostInput,BellShippingInfoPO.ShipPostError, 6, allInputValue.getProperty("InvalidMinInput"));    	 
        System.out.println("SI010");
        UtilityMethods.sleep(2000);
	}
	
	public static void ShippingBellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.pageRedirection(BellShippingInfoPO.BellLogo, BellShippingInfoPO.CancelButtonFindElement,"Others");
		System.out.println("SI011");
		UtilityMethods.sleep(2000);
	}
	
	public static void ShippingCancelButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.pageRedirection(BellShippingInfoPO.CancelButton, BellShippingInfoPO.CancelButtonFindElement,"Others");
		System.out.println("SI012");
		UtilityMethods.sleep(2000);
	}
	
	public static void ShippingBackButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.pageRedirection(BellShippingInfoPO.BackButton, BellShippingInfoPO.BackFindElement,"Others");
		System.out.println("SI013");
		UtilityMethods.sleep(2000);
	}
	
	public static void ShippingInfoSendInputs()
	{
		PageFactory.initElements(driver, BellShippingInfoPO.class);
		UtilityMethods.sleep(2000);
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipAddressInput, allInputValue.getProperty("shippingAddress1"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipAptInput, allInputValue.getProperty("shippingAddress2"), "TextBox");
		UtilityMethods.sleep(2000);
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipCityInput, allInputValue.getProperty("ShippingCity"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipProvinceInput, allInputValue.getProperty("ShippingState"), "DropDown");
		UtilityMethods.sleep(2000);
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipPostInput, allInputValue.getProperty("ShippingPostalCode"), "TextBox");
		UtilityMethods.SendInputValues(BellShippingInfoPO.ShipCountryInput, allInputValue.getProperty("ShippingCountry"), "DropDown");
		UtilityMethods.sleep(2000);
		BellShippingInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
		System.out.println("SI014");
	}
	
}
