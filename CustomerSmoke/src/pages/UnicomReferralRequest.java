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
		driver = BaseDriver.driver; // need to be verfifed
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
	public static void ReferralRequestRequiredFieldValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UnicomReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.FirstNameInput, UnicomReferralRequestPO.FirstNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.LastNameInput, UnicomReferralRequestPO.LastNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.CompanyNameInput, UnicomReferralRequestPO.CompanyError,"TextBox");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.PositionRoleInput, UnicomReferralRequestPO.PositionError,"TextBox");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.PhoneNumberInput, UnicomReferralRequestPO.PhoneNumberError,"TextBox");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.EmailInput, UnicomReferralRequestPO.EmailError,"TextBox");
		//UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.ProvincesInput, UnicomReferralRequestPO.ProvincesError,"DropDown");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.ModuleInput, UnicomReferralRequestPO.ModuleError,"TextBox");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.BusinessInput, UnicomReferralRequestPO.BusinessTypeError,"DropDown");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.SimLabel, UnicomReferralRequestPO.SimTypeError,"RadioButton");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.VolumetoDeployInput, UnicomReferralRequestPO.VolumetoDeployError,"TextBox");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.LaunchTimeframeLabel, UnicomReferralRequestPO.LastNameError,"RadioButton");
		UtilityMethods.RequiredFieldValidation(UnicomReferralRequestPO.Description, UnicomReferralRequestPO.DescriptionError,"TextBox");		
		System.out.println("RR007");
	}
	@Test(priority=8)
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
		System.out.println("RR008");
	}

	@Test(priority=9)
	public static void ReferralRequestSpaceNotAllowedValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UnicomReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.SpaceNotAllowedvalidation(UnicomReferralRequestPO.FirstNameInput, UnicomReferralRequestPO.FirstNameError);
		UtilityMethods.SpaceNotAllowedvalidation(UnicomReferralRequestPO.LastNameInput, UnicomReferralRequestPO.LastNameError);
		UtilityMethods.SpaceNotAllowedvalidation(UnicomReferralRequestPO.CompanyNameInput, UnicomReferralRequestPO.CompanyError);
		UtilityMethods.SpaceNotAllowedvalidation(UnicomReferralRequestPO.PositionRoleInput, UnicomReferralRequestPO.PositionError);	
		System.out.println("RR009");
	}
	@Test(priority=10)
	public static void ReferralRequestMaximumInputValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UnicomReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.MaximumInputValidation(UnicomReferralRequestPO.FirstNameInput, UnicomReferralRequestPO.FirstNameError, 49, allInputValue.getProperty("InvalidInput"));
		UtilityMethods.MaximumInputValidation(UnicomReferralRequestPO.LastNameInput, UnicomReferralRequestPO.LastNameError, 49, allInputValue.getProperty("InvalidInput"));
		UtilityMethods.MaximumInputValidation(UnicomReferralRequestPO.CompanyNameInput, UnicomReferralRequestPO.CompanyError, 25, allInputValue.getProperty("InvalidCompanyName"));
		UtilityMethods.MaximumInputValidation(UnicomReferralRequestPO.PositionRoleInput, UnicomReferralRequestPO.PositionError, 25, allInputValue.getProperty("InvalidCompanyName"));
		UtilityMethods.MaximumInputValidation(UnicomReferralRequestPO.PhoneNumberInput, UnicomReferralRequestPO.PhoneNumberError, 10, allInputValue.getProperty("Invalidphonenumber"));
		UtilityMethods.MaximumInputValidation(UnicomReferralRequestPO.Description, UnicomReferralRequestPO.DescriptionError, 255, allInputValue.getProperty("InvalidDescription"));     
		System.out.println("RR010");
	}
	@Test(priority=11)
	public static void ReferralRequestMinimumInputValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UnicomReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.MinimumInputValidation(UnicomReferralRequestPO.CompanyNameInput, UnicomReferralRequestPO.CompanyError, 3, allInputValue.getProperty("InvalidMinInput"));
		UtilityMethods.MinimumInputValidation(UnicomReferralRequestPO.PhoneNumberInput, UnicomReferralRequestPO.PhoneNumberError, 10, allInputValue.getProperty("InvalidMinphonenumber"));    	 
		System.out.println("RR011");
	}
	@Test(priority=12)
	public static void ReferralRequestEmailValidation()
	{	
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UnicomReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.EmailIdInvalidvalidation(UnicomReferralRequestPO.EmailInput, UnicomReferralRequestPO.EmailError, allInputValue.getProperty("InvalidEmailID"));
		System.out.println("RR012");
	}
	@Test(priority=13)
	public static void ReferralRequestNumericFieldValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UnicomReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.NumericFieldValidation(UnicomReferralRequestPO.PhoneNumberInput, UnicomReferralRequestPO.PhoneNumberError, allInputValue.getProperty("InvalidPhoneNumber"));
		UtilityMethods.NumericFieldValidation(UnicomReferralRequestPO.VolumetoDeployInput, UnicomReferralRequestPO.VolumetoDeployError, allInputValue.getProperty("InvadildNumbericField"));
		System.out.println("RR013");
	}
	//@Test(priority=14)
	public static void UnicomLogoValidation() throws InterruptedException
	{
		UtilityMethods.pageRedirection(UnicomReferralRequestPO.UnicomLogo, UnicomReferralRequestPO.CancelButtonFindElement,"Others");
		System.out.println("RR014");
	}
	//@Test(priority=15)
	public static void ReferralrequestCancelButton() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(UnicomReferralRequestPO.CancelButton, "NotEqual","Bell Ca Link referral request page");	
		UtilityMethods.StringValidation(UnicomReferralRequestPO.CancelButton.getText(), "Cancel", "equalsignorecase");
		UtilityMethods.pageRedirection(UnicomReferralRequestPO.CancelButton, UnicomReferralRequestPO.CancelButtonFindElement,"Others");
		System.out.println("RR015");
	}
	@Test(priority=16)
	public static void RequestButtonValidation()
	{
		PageFactory.initElements(driver, UnicomReferralRequestPO.class);
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.FirstNameInput, allInputValue.getProperty("FirstName"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.LastNameInput, allInputValue.getProperty("LastName"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.CompanyNameInput, allInputValue.getProperty("CompanyName"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.PositionRoleInput, allInputValue.getProperty("Position"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.PhoneNumberInput, allInputValue.getProperty("PhoneNumber"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.EmailInput, allInputValue.getProperty("E-mailAddress"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.ProvincesInput, allInputValue.getProperty("Provinces"), "DropDown");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.ModuleInput, allInputValue.getProperty("Module"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.BusinessInput, allInputValue.getProperty("BusinessType"), "DropDown");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.SimNanolabel, "", "Radiobutton");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.VolumetoDeployInput, allInputValue.getProperty("VolumeToDeploy"), "TextBox");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.IN12MonthLabel, "", "Radiobutton");
		UtilityMethods.SendInputValues(UnicomReferralRequestPO.Description, allInputValue.getProperty("Description"), "TextBox");	
		UnicomReferralRequestPO.RequestButton.click();
		System.out.println("RR016");
	}

}
