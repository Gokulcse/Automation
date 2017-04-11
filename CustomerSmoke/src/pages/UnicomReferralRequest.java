package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.UnicomReferralRequestPO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class UnicomReferralRequest extends BaseDriver
{
	public static WebDriver driver ;
	public static Properties allInputValue;
	@BeforeTest
	public static void BrowserIntilation() throws Exception
	{
		allInputValue = UtilityMethods.getUnicomPropValues();
		driver = launchApp(allInputValue.getProperty("BaseURl")); // need to be verfifed
		driver.navigate().refresh();
	}
	@Test(priority=1)
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.UnicomLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(UnicomReferralRequestPO.UnicomLogo,"src",allInputValue.getProperty("UnicomLogo"),"Bell Operator Logo");		
		System.out.println("RR001");
	} 
	
	@Test(priority=2)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(UnicomReferralRequestPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("RR002");
	}
 
	@Test(priority=3)
	public static void ReferralRequestTextValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UtilityMethods.StringValidation(UnicomReferralRequestPO.SectionOneHead1.getText(), "Request a Referral Code", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomReferralRequestPO.ParagraphText.getText(), allInputValue.getProperty("ReferralRequestSectionOne"), "equalsignorecase");
		UtilityMethods.StringValidation(UnicomReferralRequestPO.ContactInfoText.getText(), "Contact Information", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomReferralRequestPO.DeviceInfoText.getText(), "Device Information", "equalsignorecase");
		System.out.println("RR003");
	}
	@Test(priority=4)
	public static void RequestReferralCodeTextBoxDisplayedAndEnabled()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.FirstNameInput, "NotEqual", "First Name Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.LastNameInput, "NotEqual", "Last Name Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.CompanyNameInput, "NotEqual", "Company Name Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.PositionRoleInput, "NotEqual", "Position/Role Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.PhoneNumberInput, "NotEqual", "Phone Number Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.EmailInput, "NotEqual", "E-mail Address Input Field");
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.ProvincesInput, "NotEqual", "Porvinces Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.ModuleInput, "NotEqual", "Module Name Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.BusinessInput, "NotEqual", "Business Type Drop Down Menu");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.Sim2FFInput, "NotEqual", "Nano Sim Type Radio Button");			
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.Sim3FFInput, "NotEqual", "micro Sim Type Radio Button");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.SimNanoInput, "NotEqual", "Standard Sim Type Radio Button");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.VolumetoDeployInput, "NotEqual", "Volume to deploy Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.IN3MonthInput, "NotEqual", "Within 3 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.IN6MonthInput, "NotEqual", "3-6 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.IN12MonthInput, "NotEqual", "6-12 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.Morethan12MonthInput, "NotEqual", "More than 12 months/unknown Radio Button");
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.Description, "NotEqual", "Description Input Field");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.CancelButton, "NotEqual", "Cancel Button");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.RequestButton, "NotEqual", "Request Button");	
		System.out.println("RR004");
	}

	@Test(priority=5)
	public static void RequestReferralCodeLabelTextDisplayedAndEnabled()
	{	
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.FirstNameLabel, "NotEqual", "First Name Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.LastNameLabel, "NotEqual", "Last Name Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.CompanyNameLabel, "NotEqual", "Company Name Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.PositionRoleLabel, "NotEqual", "Position/Role Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.PhoneNumberLabel, "NotEqual", "Phone Number Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.EmailLabel, "NotEqual", "E-mail Address Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.ProvincesLabel, "NotEqual", "Provinces Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.ModuleLabel, "NotEqual", "Module Name Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.BusinessLabel, "NotEqual", "Business TypeLabel Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.SimLabel, "NotEqual", "Sim Type Label Text");
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.Sim2FFLabel, "NotEqual", "Nano Sim Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.Sim3FFlabel, "NotEqual", "Micro Sim Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.SimNanolabel, "NotEqual", "Standard Sim Label Text");		
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.VolumetoDeployLabel, "NotEqual", "Volume to deploy Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.LastNameLabel, "NotEqual", "Launch Timeframe Label Text");
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.IN3MonthLabel, "NotEqual", "Within 3 months Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.IN6Monthlabel, "NotEqual", "3-6 months Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.IN12MonthLabel, "NotEqual", "6-12 months Label Text");	
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.Morethan12Monthlabel, "NotEqual", "More than 12 months/unknown Label Text");
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.DescriptionLabel, "NotEqual", "Description Label Text");			
		System.out.println("RR005");
	}
	@Test(priority=6)
	public static void RequestReferralCodePlaceholderValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.FirstNameInput, "Enter your first name", "First Name");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.LastNameInput, "Enter your last name", "Last Name");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.CompanyNameInput, "Enter your company name", "Company Name");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.PositionRoleInput, "Enter your position/role", "position/role");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.PhoneNumberInput, "Enter your contact number", "Phone Number");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.EmailInput, "Enter your email", "Email-ID");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.ModuleInput, "Enter the module used in your device", "Module");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.VolumetoDeployInput, "Enter first year quantity", "Volume to deploy");
		UtilityMethods.PlaceholderValidation(UnicomReferralRequestPO.Description, "Tell us a little about your device, target audience, and how we can help.", "Description");
		System.out.println("RR006");
	}
	@Test(priority=7) 
	public static void ReferralRequestCodeValidInputValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UnicomReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.FirstNameInput, allInputValue.getProperty("ValidFirstName"), UnicomReferralRequestPO.FirstNameError);
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.LastNameInput, allInputValue.getProperty("ValidLastName"),UnicomReferralRequestPO.LastNameError );
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.CompanyNameInput, allInputValue.getProperty("ValidCompanyName"), UnicomReferralRequestPO.CompanyError);
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.PositionRoleInput, allInputValue.getProperty("ValidPosition"), UnicomReferralRequestPO.PositionError);
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.PhoneNumberInput,allInputValue.getProperty("ValidPhoneNumber"),UnicomReferralRequestPO.PhoneNumberError);
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.EmailInput,allInputValue.getProperty("ValidEmailId") , UnicomReferralRequestPO.EmailError);
		UtilityMethods.ValidateDropDown(UnicomReferralRequestPO.ProvincesInput, "CU SC", UnicomReferralRequestPO.ProvincesError);
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.ModuleInput, allInputValue.getProperty("ValidModule"), UnicomReferralRequestPO.ModuleError);	
		UtilityMethods.ValidateDropDown(UnicomReferralRequestPO.BusinessInput, "Consumer electronics - personal navigation", UnicomReferralRequestPO.BusinessTypeError);	
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.VolumetoDeployInput, allInputValue.getProperty("ValidVolumeToDeploy"),UnicomReferralRequestPO.VolumetoDeployError);
		UtilityMethods.ValidInputValidation(UnicomReferralRequestPO.Description, allInputValue.getProperty("ValidDescription"), UnicomReferralRequestPO.DescriptionError);
		System.out.println("RR007");
	}
}