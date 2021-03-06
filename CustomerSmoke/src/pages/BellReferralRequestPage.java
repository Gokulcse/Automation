package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.BellReferralRequestPO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class BellReferralRequestPage extends BaseDriver
{
	public static WebDriver driver ;
	public static Properties allInputValue;
	//@BeforeTest
	public static void BrowserIntilation() throws Exception
	{
		allInputValue = UtilityMethods.getBellPropValues();
		driver = BaseDriver.driver;
		driver.navigate().refresh();
	}
	//@Test(priority=1)
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellReferralRequestPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("RR001");
	} 
	
	//@Test(priority=2)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellReferralRequestPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("RR002");
	}
 
	//@Test(priority=3)
	public static void ReferralRequestTextValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		UtilityMethods.StringValidation(BellReferralRequestPO.SectionOneHead1.getText(), "Request a Referral Code", "equalsignorecase");
		UtilityMethods.StringValidation(BellReferralRequestPO.ParagraphText.getText(), allInputValue.getProperty("ReferralRequestSectionOne"), "equalsignorecase");
		UtilityMethods.StringValidation(BellReferralRequestPO.ContactInfoText.getText(), "Contact Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellReferralRequestPO.DeviceInfoText.getText(), "Device Information", "equalsignorecase");
	//	UtilityMethods.StringValidation(BellReferralRequestPO.legalText.getText().replace("\n", " "), allInputValue.getProperty("ReferralRequestLegaltext"), "equalsignorecase");
		UtilityMethods.StringValidation(BellReferralRequestPO.checkBoxLabel.getText(), allInputValue.getProperty("referralrequestCheckBox"), "equalsignorecase");
		System.out.println("RR003");
	}

	//@Test(priority=4)
	public static void RequestReferralCodeTextBoxDisplayedAndEnabled()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.FirstNameInput, "NotEqual", "First Name Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.LastNameInput, "NotEqual", "Last Name Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.CompanyNameInput, "NotEqual", "Company Name Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.PositionRoleInput, "NotEqual", "Position/Role Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.PhoneNumberInput, "NotEqual", "Phone Number Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.EmailInput, "NotEqual", "E-mail Address Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.ModuleInput, "NotEqual", "Module Name Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.BusinessInput, "NotEqual", "Business Type Drop Down Menu");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.Sim2FFInput, "NotEqual", "2FF Sim Type Radio Button");			
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.Sim3FFInput, "NotEqual", "3FF Sim Type Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.SimNanoInput, "NotEqual", "Nano Sim Type Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.VolumetoDeployInput, "NotEqual", "Volume to deploy Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.IN3MonthInput, "NotEqual", "Within 3 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.IN6MonthInput, "NotEqual", "3-6 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.IN12MonthInput, "NotEqual", "6-12 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.Morethan12MonthInput, "NotEqual", "More than 12 months/unknown Radio Button");
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.Description, "NotEqual", "Description Input Field");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.checkBoxLabel, "NotEqual", "Check Box Input Field");
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.CancelButton, "NotEqual", "Cancel Button");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.RequestButton, "NotEqual", "Request Button");	
		System.out.println("RR004");
	}
	
	//@Test(priority=5)
	public static void RequestReferralCodeLabelTextDisplayedAndEnabled()
	{	
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.FirstNameLabel, "NotEqual", "First Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.LastNameLabel, "NotEqual", "Last Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.CompanyNameLabel, "NotEqual", "Company Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.PositionRoleLabel, "NotEqual", "Position/Role Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.PhoneNumberLabel, "NotEqual", "Phone Number Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.EmailLabel, "NotEqual", "E-mail Address Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.ModuleLabel, "NotEqual", "Module Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.BusinessLabel, "NotEqual", "Business TypeLabel Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.SimLabel, "NotEqual", "Sim Type Label Text");
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.Sim2FFLabel, "NotEqual", "2FF Mini Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.Sim3FFlabel, "NotEqual", "3FF Micro Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.SimNanolabel, "NotEqual", "3FF Micro Label Text");		
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.VolumetoDeployLabel, "NotEqual", "Volume to deploy Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.LastNameLabel, "NotEqual", "Launch Timeframe Label Text");
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.IN3MonthLabel, "NotEqual", "Within 3 months Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.IN6Monthlabel, "NotEqual", "3-6 months Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.IN12MonthLabel, "NotEqual", "6-12 months Label Text");	
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.Morethan12Monthlabel, "NotEqual", "More than 12 months/unknown Label Text");
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.DescriptionLabel, "NotEqual", "Description Label Text");			
		System.out.println("RR005");
	}
	
	//@Test(priority=6)
	public static void RequestReferralCodePlaceholderValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.FirstNameInput, "Enter your first name", "First Name");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.LastNameInput, "Enter your last name", "Last Name");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.CompanyNameInput, "Enter your company name", "Company Name");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.PositionRoleInput, "Enter your position/role", "position/role");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.PhoneNumberInput, "Enter your contact number", "Phone Number");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.EmailInput, "Enter email", "Email-ID");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.ModuleInput, "Enter the module used in your device", "Module");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.VolumetoDeployInput, "Enter first year quantity", "Volume to deploy");
		UtilityMethods.PlaceholderValidation(BellReferralRequestPO.Description, "Tell us a little about your device, target audience, and how we can help.", "Description");
		System.out.println("RR006");
	}
	//@Test(priority=7) 
	public static void ReferralRequestCodeValidInputValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		BellReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.FirstNameInput, allInputValue.getProperty("ValidFirstName"), BellReferralRequestPO.FirstNameError);
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.LastNameInput, allInputValue.getProperty("ValidLastName"),BellReferralRequestPO.LastNameError );
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.CompanyNameInput, allInputValue.getProperty("ValidCompanyName"), BellReferralRequestPO.CompanyError);
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.PositionRoleInput, allInputValue.getProperty("ValidPosition"), BellReferralRequestPO.PositionError);
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.PhoneNumberInput,allInputValue.getProperty("ValidPhoneNumber"),BellReferralRequestPO.PhoneNumberError);
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.EmailInput,allInputValue.getProperty("ValidEmailId") , BellReferralRequestPO.EmailError);
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.ModuleInput, allInputValue.getProperty("ValidModule"), BellReferralRequestPO.ModuleError);	
		UtilityMethods.ValidateDropDown(BellReferralRequestPO.BusinessInput, "Consumer electronics - personal navigation", BellReferralRequestPO.BusinessTypeError);	
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.VolumetoDeployInput, allInputValue.getProperty("ValidVolumeToDeploy"),BellReferralRequestPO.VolumetoDeployError);
		UtilityMethods.ValidInputValidation(BellReferralRequestPO.Description, allInputValue.getProperty("ValidDescription"), BellReferralRequestPO.DescriptionError);
		System.out.println("RR007");
	}
	
	//@Test(priority=8)
	public static void ReferralRequestRequiredFieldValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		BellReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.FirstNameInput, BellReferralRequestPO.FirstNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.LastNameInput, BellReferralRequestPO.LastNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.CompanyNameInput, BellReferralRequestPO.CompanyError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.PositionRoleInput, BellReferralRequestPO.PositionError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.PhoneNumberInput, BellReferralRequestPO.PhoneNumberError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.EmailInput, BellReferralRequestPO.EmailError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.ModuleInput, BellReferralRequestPO.ModuleError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.BusinessInput, BellReferralRequestPO.BusinessTypeError,"DropDown");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.SimLabel, BellReferralRequestPO.SimTypeError,"RadioButton");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.VolumetoDeployInput, BellReferralRequestPO.VolumetoDeployError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.LaunchTimeframeLabel, BellReferralRequestPO.LastNameError,"RadioButton");
		UtilityMethods.RequiredFieldValidation(BellReferralRequestPO.Description, BellReferralRequestPO.DescriptionError,"TextBox");		
		System.out.println("RR008");
	}
	
	//@Test(priority=9)
	public static void ReferralRequestSpaceNotAllowedValidation()
	 {
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		BellReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.SpaceNotAllowedvalidation(BellReferralRequestPO.FirstNameInput, BellReferralRequestPO.FirstNameError);
		UtilityMethods.SpaceNotAllowedvalidation(BellReferralRequestPO.LastNameInput, BellReferralRequestPO.LastNameError);
		UtilityMethods.SpaceNotAllowedvalidation(BellReferralRequestPO.CompanyNameInput, BellReferralRequestPO.CompanyError);
		UtilityMethods.SpaceNotAllowedvalidation(BellReferralRequestPO.PositionRoleInput, BellReferralRequestPO.PositionError);	
		System.out.println("RR009");
	 }
	//@Test(priority=10)
	public static void ReferralRequestMaximumInputValidation()
	 {
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		BellReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.MaximumInputValidation(BellReferralRequestPO.FirstNameInput, BellReferralRequestPO.FirstNameError, 49, allInputValue.getProperty("InvalidInput"));
	    UtilityMethods.MaximumInputValidation(BellReferralRequestPO.LastNameInput, BellReferralRequestPO.LastNameError, 49, allInputValue.getProperty("InvalidInput"));
	    UtilityMethods.MaximumInputValidation(BellReferralRequestPO.CompanyNameInput, BellReferralRequestPO.CompanyError, 25, allInputValue.getProperty("InvalidCompanyName"));
	    UtilityMethods.MaximumInputValidation(BellReferralRequestPO.PositionRoleInput, BellReferralRequestPO.PositionError, 25, allInputValue.getProperty("InvalidCompanyName"));
	    UtilityMethods.MaximumInputValidation(BellReferralRequestPO.PhoneNumberInput, BellReferralRequestPO.PhoneNumberError, 10, allInputValue.getProperty("Invalidphonenumber"));
	    UtilityMethods.MaximumInputValidation(BellReferralRequestPO.Description, BellReferralRequestPO.DescriptionError, 255, allInputValue.getProperty("InvalidDescription"));     
	    System.out.println("RR010");
	 }
	//@Test(priority=11)
	public static void ReferralRequestMinimumInputValidation()
	 {
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		BellReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.MinimumInputValidation(BellReferralRequestPO.CompanyNameInput, BellReferralRequestPO.CompanyError, 3, allInputValue.getProperty("InvalidMinInput"));
	    UtilityMethods.MinimumInputValidation(BellReferralRequestPO.PhoneNumberInput, BellReferralRequestPO.PhoneNumberError, 10, allInputValue.getProperty("InvalidMinphonenumber"));    	 
	    System.out.println("RR011");
	 }
	//@Test(priority=12)
	public static void ReferralRequestEmailValidation()
	{	
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		BellReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.EmailIdInvalidvalidation(BellReferralRequestPO.EmailInput, BellReferralRequestPO.EmailError, allInputValue.getProperty("InvalidEmailID"));
		System.out.println("RR012");
	}
	//@Test(priority=13)
	public static void ReferralRequestNumericFieldValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		BellReferralRequestPO.RequestButton.click();
		UtilityMethods.sleep(2000);
		UtilityMethods.NumericFieldValidation(BellReferralRequestPO.PhoneNumberInput, BellReferralRequestPO.PhoneNumberError, allInputValue.getProperty("InvalidPhoneNumber"));
		UtilityMethods.NumericFieldValidation(BellReferralRequestPO.VolumetoDeployInput, BellReferralRequestPO.VolumetoDeployError, allInputValue.getProperty("InvadildNumbericField"));
		System.out.println("RR013");
	}
	//@Test(priority=14)
	public static void BellLogoValidation() throws InterruptedException
	{
		UtilityMethods.pageRedirection(BellReferralRequestPO.BellLogo, BellReferralRequestPO.CancelButtonFindElement,"Others");
		System.out.println("RR014");
	}
	//@Test(priority=15)
	public static void BellCALinkValidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.BellCaLink, "NotEqual","Bell Ca Link referral request page");	
		UtilityMethods.StringValidation(BellReferralRequestPO.BellCaLink.getText(), "bell.ca/communicationpreferences.", "equalsignorecase");
		UtilityMethods.PageNavigationValidation(BellReferralRequestPO.BellCaLink, BellReferralRequestPO.BellCaLinkFindElement, "Email updates from Bell Canada � manage your email preferences");	
		System.out.println("RR015");
	}
	//@Test(priority=16)
	public static void ReferralrequestCancelButton() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellReferralRequestPO.CancelButton, "NotEqual","Bell Ca Link referral request page");	
		UtilityMethods.StringValidation(BellReferralRequestPO.CancelButton.getText(), "Cancel", "equalsignorecase");
		UtilityMethods.pageRedirection(BellReferralRequestPO.CancelButton, BellReferralRequestPO.CancelButtonFindElement,"Others");
		System.out.println("RR016");
	}
	
	//@Test(priority=17)
	public static void RequestButtonValidation()
	{
		PageFactory.initElements(driver, BellReferralRequestPO.class);
		UtilityMethods.SendInputValues(BellReferralRequestPO.FirstNameInput, allInputValue.getProperty("FirstName"), "TextBox");
		UtilityMethods.SendInputValues(BellReferralRequestPO.LastNameInput, allInputValue.getProperty("LastName"), "TextBox");
		UtilityMethods.SendInputValues(BellReferralRequestPO.CompanyNameInput, allInputValue.getProperty("CompanyName"), "TextBox");
		UtilityMethods.SendInputValues(BellReferralRequestPO.PositionRoleInput, allInputValue.getProperty("Position"), "TextBox");
		UtilityMethods.SendInputValues(BellReferralRequestPO.PhoneNumberInput, allInputValue.getProperty("PhoneNumber"), "TextBox");
		UtilityMethods.SendInputValues(BellReferralRequestPO.EmailInput, allInputValue.getProperty("E-mailAddress"), "TextBox");
		UtilityMethods.SendInputValues(BellReferralRequestPO.ModuleInput, allInputValue.getProperty("Module"), "TextBox");
		UtilityMethods.SendInputValues(BellReferralRequestPO.BusinessInput, allInputValue.getProperty("BusinessType"), "DropDown");
	    UtilityMethods.SendInputValues(BellReferralRequestPO.SimNanolabel, "", "Radiobutton");
	    UtilityMethods.SendInputValues(BellReferralRequestPO.VolumetoDeployInput, allInputValue.getProperty("VolumeToDeploy"), "TextBox");
	    UtilityMethods.SendInputValues(BellReferralRequestPO.IN12MonthLabel, "", "Radiobutton");
	    UtilityMethods.SendInputValues(BellReferralRequestPO.Description, allInputValue.getProperty("Description"), "TextBox");	
	    //UtilityMethods.PageRedirection(driver.findElement(By.xpath("//input[@value='Request']")), driver.findElement(By.xpath("//a[text()='Back to IoT Starter Kit Page']")));
	   // UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//input[@value='Request']")), driver.findElement(By.xpath("//a[text()='Back to IoT Starter Kit Page']")));
	    BellReferralRequestPO.RequestButton.click();
	    System.out.println("RR017");
	}

	//@AfterTest
	public static void Exit()
	{
		driver.close();
	}
}

