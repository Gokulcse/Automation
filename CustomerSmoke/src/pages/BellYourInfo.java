package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;

import javafx.scene.control.Alert;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;
import pageobjects.BellControlCenterPO;
import pageobjects.BellReferralRequestPO;
import pageobjects.BellYourInfoPO;

public class BellYourInfo extends BaseDriver
{
	public static FirefoxDriver driver=BaseDriver.driver;
	public static Properties allInputValue = BellHomePage.allInputValue;
	@BeforeTest
	public static void BrowserIntilation() throws Exception
	{
		driver = launchApp();
		allInputValue = UtilityMethods.getBellPropValues();
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		//driver.navigate().refresh();
	}
	@Test(priority=1)
	public static void inputDta()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);
		UtilityMethods.SendInputValues(BellControlCenterPO.UserNameInput, allInputValue.getProperty("ccUserName"), "TextBox");
		UtilityMethods.SendInputValues(BellControlCenterPO.PasswordInput, allInputValue.getProperty("ccPassword"), "TextBox");
		UtilityMethods.SendInputValues(BellControlCenterPO.ConfirmPasswordInput, allInputValue.getProperty("ccConfirmPassword"), "TextBox");
		BellControlCenterPO.CreateButton.click();
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("TS007");
	}
	
	@Test(priority=2)
	public static void referralRequestDataValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		UtilityMethods.InputDataValidation(BellYourInfoPO.FirstNameInput, allInputValue.getProperty("FirstName"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.LastNameInput, allInputValue.getProperty("LastName"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.CompanyNameInput, allInputValue.getProperty("CompanyName"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.PositionRoleInput, allInputValue.getProperty("Position"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.PhoneNumberInput, allInputValue.getProperty("PhoneNumber"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.EmailInput, allInputValue.getProperty("E-mailAddress"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.ModuleInput, allInputValue.getProperty("ModuleData"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.SimNanolabel, allInputValue.getProperty("SimType"),"radiobutton");
		UtilityMethods.InputDataValidation(BellYourInfoPO.VolumetoDeployInput, allInputValue.getProperty("VolumeToDeploy"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.IN12MonthLabel, allInputValue.getProperty("TimeFrame"),"radiobutton");
		UtilityMethods.InputDataValidation(BellYourInfoPO.Description, allInputValue.getProperty("Description"),"textbox");
		System.out.println("TS001");
	}
	
	@Test(priority=3)
	public static void TermsOfServiceTextValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.checkBoxTerms, "NotEqual","Terms Of Services");
		UtilityMethods.StringValidation(BellYourInfoPO.checkBoxTerms.getText(), allInputValue.getProperty("TermsOfService"), "equalsignorecase");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.checkBoxTerms, BellYourInfoPO.TermsOfServicesError,"radiobutton");	
		System.out.println("TS002");
	}
	
	@Test(priority=4)
	public static void TermsOfServicePopUpCloseIcon()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		BellYourInfoPO.TermsOfServicesLink.click();
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CloseIcon, "NotEqual","Terms Of Services Icon");
		BellYourInfoPO.CloseIcon.click();
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("TS003");
	}
	
	@Test(priority=5)
	public static void TermsOfServicePopUpCloseButton()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		BellYourInfoPO.TermsOfServicesLink.click();
		try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CloseButton, "NotEqual","Terms Of Services Button");
		BellYourInfoPO.CloseButton.click();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("TS004");
	}
	
	
	//@Test(priority=6)
	public static void TermsOfServicePDFDownload() throws AWTException
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		BellYourInfoPO.TermsOfServicesLink.click();
		System.out.println("TS005.1");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.TermsOfServicesDownload, "NotEqual","Terms Of Services Download");
		System.out.println("TS005.2");
		BellYourInfoPO.TermsOfServicesDownload.click();
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("TS005.3");
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		 alert.accept();
		 System.out.println("TS005.4");
		try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
		BellYourInfoPO.CloseButton.click();
		/*Robot object = new Robot();
		object.keyPress(KeyEvent.VK_ENTER);
		object.keyRelease(KeyEvent.VK_ENTER);*/
		System.out.println("TS005");
	}
	
	@Test(priority=7)
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellYourInfoPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("TS006");
	} 
	
	@Test(priority=8)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellYourInfoPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("TS007");
	}
 
	@Test(priority=9)
	public static void ReferralRequestTextValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.StringValidation(BellYourInfoPO.ContactInfoText.getText(), "Contact Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.DeviceInfoText.getText(), "Device Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.checkBoxLabel.getText(), allInputValue.getProperty("referralrequestCheckBox"), "equalsignorecase");
		System.out.println("TS008");
	}

	@Test(priority=10)
	public static void RequestReferralCodeTextBoxDisplayedAndEnabled()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.FirstNameInput, "NotEqual", "First Name Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.LastNameInput, "NotEqual", "Last Name Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CompanyNameInput, "NotEqual", "Company Name Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.PositionRoleInput, "NotEqual", "Position/Role Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.PhoneNumberInput, "NotEqual", "Phone Number Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.EmailInput, "NotEqual", "E-mail Address Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.ModuleInput, "NotEqual", "Module Name Input Field");	
		//UtilityMethods.DisplayEnableValidator(BellYourInfoPO.BusinessInput, "NotEqual", "Business Type Drop Down Menu");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.Sim2FFInput, "NotEqual", "2FF Sim Type Radio Button");			
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.Sim3FFInput, "NotEqual", "3FF Sim Type Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.SimNanoInput, "NotEqual", "Nano Sim Type Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.VolumetoDeployInput, "NotEqual", "Volume to deploy Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.IN3MonthInput, "NotEqual", "Within 3 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.IN6MonthInput, "NotEqual", "3-6 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.IN12MonthInput, "NotEqual", "6-12 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.Morethan12MonthInput, "NotEqual", "More than 12 months/unknown Radio Button");
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.Description, "NotEqual", "Description Input Field");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.checkBoxLabel, "NotEqual", "Check Box Input Field");
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CancelButton, "NotEqual", "Cancel Button");	
		System.out.println("TS009");
	}
	
	@Test(priority=11)
	public static void RequestReferralCodeLabelTextDisplayedAndEnabled()
	{	
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.FirstNameLabel, "NotEqual", "First Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.LastNameLabel, "NotEqual", "Last Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CompanyNameLabel, "NotEqual", "Company Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.PositionRoleLabel, "NotEqual", "Position/Role Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.PhoneNumberLabel, "NotEqual", "Phone Number Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.EmailLabel, "NotEqual", "E-mail Address Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.ModuleLabel, "NotEqual", "Module Name Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.BusinessLabel, "NotEqual", "Business TypeLabel Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.SimLabel, "NotEqual", "Sim Type Label Text");
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.Sim2FFLabel, "NotEqual", "2FF Mini Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.Sim3FFlabel, "NotEqual", "3FF Micro Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.SimNanolabel, "NotEqual", "3FF Micro Label Text");		
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.VolumetoDeployLabel, "NotEqual", "Volume to deploy Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.LastNameLabel, "NotEqual", "Launch Timeframe Label Text");
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.IN3MonthLabel, "NotEqual", "Within 3 months Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.IN6Monthlabel, "NotEqual", "3-6 months Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.IN12MonthLabel, "NotEqual", "6-12 months Label Text");	
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.Morethan12Monthlabel, "NotEqual", "More than 12 months/unknown Label Text");
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.DescriptionLabel, "NotEqual", "Description Label Text");			
		System.out.println("TS010");
	}
	
	@Test(priority=12) 
	public static void ReferralRequestCodeValidInputValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.ValidInputValidation(BellYourInfoPO.FirstNameInput, allInputValue.getProperty("ValidFirstName"), BellYourInfoPO.FirstNameError);
		UtilityMethods.ValidInputValidation(BellYourInfoPO.LastNameInput, allInputValue.getProperty("ValidLastName"),BellYourInfoPO.LastNameError );
		UtilityMethods.ValidInputValidation(BellYourInfoPO.CompanyNameInput, allInputValue.getProperty("ValidCompanyName"), BellYourInfoPO.CompanyError);
		UtilityMethods.ValidInputValidation(BellYourInfoPO.PositionRoleInput, allInputValue.getProperty("ValidPosition"), BellYourInfoPO.PositionError);
		UtilityMethods.ValidInputValidation(BellYourInfoPO.PhoneNumberInput,allInputValue.getProperty("ValidPhoneNumber"),BellYourInfoPO.PhoneNumberError);
		UtilityMethods.ValidInputValidation(BellYourInfoPO.EmailInput,allInputValue.getProperty("ValidEmailId") , BellYourInfoPO.EmailError);
		UtilityMethods.ValidInputValidation(BellYourInfoPO.ModuleInput, allInputValue.getProperty("ValidModule"), BellYourInfoPO.ModuleError);	
		//UtilityMethods.ValidateDropDown(BellYourInfoPO.BusinessInput, "Consumer electronics - personal navigation", BellYourInfoPO.BusinessTypeError);	
		UtilityMethods.ValidInputValidation(BellYourInfoPO.VolumetoDeployInput, allInputValue.getProperty("ValidVolumeToDeploy"),BellYourInfoPO.VolumetoDeployError);
		UtilityMethods.ValidInputValidation(BellYourInfoPO.Description, allInputValue.getProperty("ValidDescription"), BellYourInfoPO.DescriptionError);
		//UtilityMethods.ValidateSimTypeRadioButton(2,driver.findElement(By.xpath("//div[@id='simTypeId-error']")));	
	   //driver.findElement(By.xpath("//label[text()='2FF/Ruggedized']")).click();
		System.out.println("TS011");
	}
	
	@Test(priority=13)
	public static void ReferralRequestRequiredFieldValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.FirstNameInput, BellYourInfoPO.FirstNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.LastNameInput, BellYourInfoPO.LastNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.CompanyNameInput, BellYourInfoPO.CompanyError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.PositionRoleInput, BellYourInfoPO.PositionError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.PhoneNumberInput, BellYourInfoPO.PhoneNumberError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.EmailInput, BellYourInfoPO.EmailError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.ModuleInput, BellYourInfoPO.ModuleError,"TextBox");
		//UtilityMethods.RequiredFieldValidation(BellYourInfoPO.BusinessInput, BellYourInfoPO.BusinessTypeError,"DropDown");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.VolumetoDeployInput, BellYourInfoPO.VolumetoDeployError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.LaunchTimeframeLabel, BellYourInfoPO.LastNameError,"RadioButton");
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.Description, BellYourInfoPO.DescriptionError,"TextBox");		
		System.out.println("TS012");
	}
	
	@Test(priority=14)
	public static void ReferralRequestSpaceNotAllowedValidation()
	 {
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.FirstNameInput, BellYourInfoPO.FirstNameError);
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.LastNameInput, BellYourInfoPO.LastNameError);
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.CompanyNameInput, BellYourInfoPO.CompanyError);
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.PositionRoleInput, BellYourInfoPO.PositionError);	
		System.out.println("TS013");
	 }
	@Test(priority=15)
	public static void ReferralRequestMaximumInputValidation()
	 {
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
	    UtilityMethods.MaximumInputValidation(BellYourInfoPO.FirstNameInput, BellYourInfoPO.FirstNameError, 49, allInputValue.getProperty("InvalidInput"));
	    UtilityMethods.MaximumInputValidation(BellYourInfoPO.LastNameInput, BellYourInfoPO.LastNameError, 49, allInputValue.getProperty("InvalidInput"));
	    UtilityMethods.MaximumInputValidation(BellYourInfoPO.CompanyNameInput, BellYourInfoPO.CompanyError, 25, allInputValue.getProperty("InvalidCompanyName"));
	    UtilityMethods.MaximumInputValidation(BellYourInfoPO.PositionRoleInput, BellYourInfoPO.PositionError, 25, allInputValue.getProperty("InvalidCompanyName"));
	    UtilityMethods.MaximumInputValidation(BellYourInfoPO.PhoneNumberInput, BellYourInfoPO.PhoneNumberError, 10, allInputValue.getProperty("Invalidphonenumber"));
	    UtilityMethods.MaximumInputValidation(BellYourInfoPO.Description, BellYourInfoPO.DescriptionError, 255, allInputValue.getProperty("InvalidDescription"));     
	    System.out.println("TS014");
	 }
	@Test(priority=16)
	public static void ReferralRequestMinimumInputValidation()
	 {
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.MinimumInputValidation(BellYourInfoPO.CompanyNameInput, BellYourInfoPO.CompanyError, 3, allInputValue.getProperty("InvalidMinInput"));
	    UtilityMethods.MinimumInputValidation(BellYourInfoPO.PhoneNumberInput, BellYourInfoPO.PhoneNumberError, 10, allInputValue.getProperty("InvalidMinphonenumber"));    	 
	    System.out.println("TS015");
	 }
	@Test(priority=17)
	public static void ReferralRequestEmailValidation()
	{	
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.EmailIdInvalidvalidation(BellYourInfoPO.EmailInput, BellYourInfoPO.EmailError, allInputValue.getProperty("InvalidEmailID"));
		System.out.println("TS016");
	}
	@Test(priority=18)
	public static void ReferralRequestNumericFieldValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.NumericFieldValidation(BellYourInfoPO.PhoneNumberInput, BellYourInfoPO.PhoneNumberError, allInputValue.getProperty("InvalidPhoneNumber"));
		UtilityMethods.NumericFieldValidation(BellYourInfoPO.VolumetoDeployInput, BellYourInfoPO.VolumetoDeployError, allInputValue.getProperty("InvadildNumbericField"));
		System.out.println("TS017");
	}
	@Test(priority=19)
	public static void BellLogoValidation() throws InterruptedException
	{
		UtilityMethods.pageRedirection(BellYourInfoPO.BellLogo, BellYourInfoPO.CancelButtonFindElement,"Others");
		System.out.println("TS018");
	}
	@Test(priority=20)
	public static void BellCALinkValidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.BellCaLink, "NotEqual","Bell Ca Link referral request page");	
		UtilityMethods.StringValidation(BellYourInfoPO.BellCaLink.getText(), "bell.ca/communicationpreferences", "equalsignorecase");
		UtilityMethods.PageNavigationValidation(BellYourInfoPO.BellCaLink, BellYourInfoPO.BellCaLinkFindElement, "Email updates from Bell Canada � manage your email preferences");	
		System.out.println("TS019");
	}
	@Test(priority=21)
	public static void ReferralrequestCancelButton() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CancelButton, "NotEqual","Bell Ca Link referral request page");	
		UtilityMethods.StringValidation(BellYourInfoPO.CancelButton.getText(), "Cancel", "equalsignorecase");
		UtilityMethods.pageRedirection(BellYourInfoPO.CancelButton, BellYourInfoPO.CancelButtonFindElement,"Others");
		System.out.println("TS020");
	}
	
	@Test(priority=22)
	public static void RequestButtonValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.SendInputValues(BellYourInfoPO.FirstNameInput, allInputValue.getProperty("FirstName"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.LastNameInput, allInputValue.getProperty("LastName"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.CompanyNameInput, allInputValue.getProperty("CompanyName"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.PositionRoleInput, allInputValue.getProperty("Position"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.PhoneNumberInput, allInputValue.getProperty("PhoneNumber"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.EmailInput, allInputValue.getProperty("E-mailAddress"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.ModuleInput, allInputValue.getProperty("ModuleData"), "TextBox");
		//UtilityMethods.SendInputValues(BellYourInfoPO.BusinessInput, allInputValue.getProperty("BusinessType"), "DropDown");
	    UtilityMethods.SendInputValues(BellYourInfoPO.SimNanolabel, "", "Radiobutton");
	    UtilityMethods.SendInputValues(BellYourInfoPO.VolumetoDeployInput, allInputValue.getProperty("VolumeToDeploy"), "TextBox");
	    UtilityMethods.SendInputValues(BellYourInfoPO.IN12MonthLabel, "", "Radiobutton");
	    UtilityMethods.SendInputValues(BellYourInfoPO.Description, allInputValue.getProperty("Description"), "TextBox");	
	    BellYourInfoPO.checkBoxTerms.click();
	    BellYourInfoPO.ContinueButton.click();
	    System.out.println(""+"TS021");
	}
	
}