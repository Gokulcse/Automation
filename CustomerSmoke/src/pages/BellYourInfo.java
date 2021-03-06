package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import utilitymethods.UtilityMethods;
import driver.BaseDriver;
import pageobjects.BellYourInfoPO;

public class BellYourInfo extends BaseDriver
{
	public static WebDriver driver;
	public static Properties allInputValue ;


	//@Test(priority=1)
	public static void intial() throws IOException
	{
		driver=BaseDriver.driver;
		allInputValue = UtilityMethods.getBellPropValues();
	}

	//@Test(priority=2)
	public static void referralRequestDataValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		UtilityMethods.sleep(3000);
		UtilityMethods.InputDataValidation(BellYourInfoPO.FirstNameInput, allInputValue.getProperty("FirstName"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.LastNameInput, allInputValue.getProperty("LastName"),"textbox");
		//UtilityMethods.InputDataValidation(BellYourInfoPO.CompanyNameInput, allInputValue.getProperty("CompanyName"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.PositionRoleInput, allInputValue.getProperty("Position"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.PhoneNumberInput, allInputValue.getProperty("PhoneNumber"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.EmailInput, allInputValue.getProperty("E-mailAddress"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.ModuleInput, allInputValue.getProperty("ModuleData"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.SimNanolabel, allInputValue.getProperty("SimType"),"radiobutton");
		UtilityMethods.InputDataValidation(BellYourInfoPO.VolumetoDeployInput, allInputValue.getProperty("VolumeToDeploy"),"textbox");
		UtilityMethods.InputDataValidation(BellYourInfoPO.IN12MonthLabel, allInputValue.getProperty("TimeFrame"),"radiobutton");
		UtilityMethods.InputDataValidation(BellYourInfoPO.Description, allInputValue.getProperty("Description"),"textbox");
		System.out.println("YI001");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=3)
	public static void TermsOfServiceTextValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(5000);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.checkBoxTerms, "NotEqual","Terms Of Services");
		UtilityMethods.StringValidation(BellYourInfoPO.checkBoxTerms.getText(), allInputValue.getProperty("TermsOfService"), "equalsignorecase");
		UtilityMethods.sleep(5000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
		UtilityMethods.RequiredFieldValidation(BellYourInfoPO.checkBoxTerms, BellYourInfoPO.TermsOfServicesError,"radiobutton");	
		System.out.println("YI002");
		UtilityMethods.sleep(5000);
	}

	//@Test(priority=4)
	public static void TermsOfServicePopUpCloseIcon()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		UtilityMethods.sleep(4000);
		BellYourInfoPO.TermsOfServicesLink.click();
		UtilityMethods.sleep(4000);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CloseIcon, "NotEqual","Terms Of Services Icon");
		BellYourInfoPO.CloseIcon.click();
		System.out.println("YI003");
		UtilityMethods.sleep(2000);
	}
	//@Test(priority=5)
	public static void TermsOfServicePopUpCloseButton()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		UtilityMethods.sleep(2000);
		BellYourInfoPO.TermsOfServicesLink.click();
		UtilityMethods.sleep(4000);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CloseButton, "NotEqual","Terms Of Services Button");
		BellYourInfoPO.CloseButton.click();
		UtilityMethods.sleep(2000);
		System.out.println("YI004");
		UtilityMethods.sleep(2000);
	}
	//@Test(priority=6)
	public static void TermsOfServicePDFDownload() throws AWTException
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);	
		BellYourInfoPO.TermsOfServicesLink.click();
		System.out.println("TS005.1");
		UtilityMethods.sleep(2000);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.TermsOfServicesDownload, "NotEqual","Terms Of Services Download");
		System.out.println("TS005.2");

		if(allInputValue.getProperty("Broswer").equals("Firefox"))
		{	
			BellYourInfoPO.TermsOfServicesDownload.click();
			UtilityMethods.sleep(2000);
			System.out.println("File Downloaded");
			Robot rb =new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			System.out.println("Pop up Closed");
			UtilityMethods.sleep(1000);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		else if(allInputValue.getProperty("Broswer").equals("IE"))
		{
			String PdfUrl = BellYourInfoPO.TermsOfServicesDownload.getAttribute("href"); 
			System.out.println("The URL is: "+PdfUrl+"");
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\libs\\IEDriverServer.exe");
			InternetExplorerDriver driver1 = new InternetExplorerDriver();
			driver1.get(PdfUrl);
			UtilityMethods.sleep(5000);
			Robot rb =new Robot();
			rb.keyPress(KeyEvent.VK_ALT);
			rb.keyPress(KeyEvent.VK_S);
			rb.keyRelease(KeyEvent.VK_ALT);
			rb.keyRelease(KeyEvent.VK_S);
			UtilityMethods.sleep(5000);
			System.out.println("File Downloaded");
			driver1.close();
		}
		else
		{
			BellYourInfoPO.TermsOfServicesDownload.click();
			UtilityMethods.sleep(2000);
			System.out.println("File Downloaded");
			System.out.println("Pop up Closed");
		}
		BellYourInfoPO.CloseButton.click();
		System.out.println("YI005");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=7)
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellYourInfoPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("YI006");
		UtilityMethods.sleep(2000);
	} 

	//@Test(priority=8)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellYourInfoPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("YI007");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=9)
	public static void ReferralRequestTextValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.StringValidation(BellYourInfoPO.ContactInfoText.getText(), "Contact Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.DeviceInfoText.getText(), "Device Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.checkBoxLabel.getText(), allInputValue.getProperty("referralrequestCheckBox"), "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.YourInfoText.getText(), "Your Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.ShppingText.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.PaymentText.getText(), "Payment", "equalsignorecase");
		UtilityMethods.StringValidation(BellYourInfoPO.ReviewConfirmText.getText(), "Review & Confirm", "equalsignorecase");
		System.out.println("YI008");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=10)
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
		System.out.println("YI009");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=11)
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
		System.out.println("YI010");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=12) 
	public static void ReferralRequestCodeValidInputValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
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
		System.out.println("YI011");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=13)
	public static void ReferralRequestRequiredFieldValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
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
		System.out.println("YI012");
		UtilityMethods.sleep(2000);
	}

	//@Test(priority=14)
	public static void ReferralRequestSpaceNotAllowedValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.FirstNameInput, BellYourInfoPO.FirstNameError);
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.LastNameInput, BellYourInfoPO.LastNameError);
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.CompanyNameInput, BellYourInfoPO.CompanyError);
		UtilityMethods.SpaceNotAllowedvalidation(BellYourInfoPO.PositionRoleInput, BellYourInfoPO.PositionError);	
		System.out.println("YI013");
		UtilityMethods.sleep(2000);
	}
	//@Test(priority=15)
	public static void ReferralRequestMaximumInputValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
		UtilityMethods.MaximumInputValidation(BellYourInfoPO.FirstNameInput, BellYourInfoPO.FirstNameError, 49, allInputValue.getProperty("InvalidInput"));
		UtilityMethods.MaximumInputValidation(BellYourInfoPO.LastNameInput, BellYourInfoPO.LastNameError, 49, allInputValue.getProperty("InvalidInput"));
		UtilityMethods.MaximumInputValidation(BellYourInfoPO.CompanyNameInput, BellYourInfoPO.CompanyError, 25, allInputValue.getProperty("InvalidCompanyName"));
		UtilityMethods.MaximumInputValidation(BellYourInfoPO.PositionRoleInput, BellYourInfoPO.PositionError, 25, allInputValue.getProperty("InvalidCompanyName"));
		UtilityMethods.MaximumInputValidation(BellYourInfoPO.PhoneNumberInput, BellYourInfoPO.PhoneNumberError, 25, allInputValue.getProperty("Invalidphonenumber"));
		UtilityMethods.MaximumInputValidation(BellYourInfoPO.Description, BellYourInfoPO.DescriptionError, 255, allInputValue.getProperty("InvalidDescription"));     
		System.out.println("YI014");
		UtilityMethods.sleep(2000);
	}
	//@Test(priority=16)
	public static void ReferralRequestMinimumInputValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
		UtilityMethods.MinimumInputValidation(BellYourInfoPO.CompanyNameInput, BellYourInfoPO.CompanyError, 3, allInputValue.getProperty("InvalidMinInput"));
		UtilityMethods.MinimumInputValidation(BellYourInfoPO.PhoneNumberInput, BellYourInfoPO.PhoneNumberError, 10, allInputValue.getProperty("InvalidMinphonenumber"));    	 
		System.out.println("YI015");
		UtilityMethods.sleep(2000);

	}
	//@Test(priority=17)
	public static void ReferralRequestEmailValidation()
	{	
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
		UtilityMethods.EmailIdInvalidvalidation(BellYourInfoPO.EmailInput, BellYourInfoPO.EmailError, allInputValue.getProperty("InvalidEmailID"));
		System.out.println("YI016");
		UtilityMethods.sleep(2000);

	}
	//@Test(priority=18)
	public static void ReferralRequestNumericFieldValidation()
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		UtilityMethods.sleep(5000);
		UtilityMethods.NumericFieldValidation(BellYourInfoPO.PhoneNumberInput, BellYourInfoPO.PhoneNumberError, allInputValue.getProperty("InvalidPhoneNumber"));
		UtilityMethods.NumericFieldValidation(BellYourInfoPO.VolumetoDeployInput, BellYourInfoPO.VolumetoDeployError, allInputValue.getProperty("InvadildNumbericField"));
		System.out.println("YI017");
		UtilityMethods.sleep(2000);

	}
	//@Test(priority=19)
	public static void BellLogoValidation() throws InterruptedException
	{
		UtilityMethods.sleep(2000);
		UtilityMethods.pageRedirection(BellYourInfoPO.BellLogo, BellYourInfoPO.CancelButtonFindElement,"HomePage");
		System.out.println("YI018");
		UtilityMethods.sleep(2000);

	}
	//@Test(priority=20)
	public static void BellCALinkValidation() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.BellCaLink, "NotEqual","Bell Ca Link referral request page");	
		UtilityMethods.StringValidation(BellYourInfoPO.BellCaLink.getText(), "bell.ca/communicationpreferences", "equalsignorecase");
		UtilityMethods.sleep(2000);
		UtilityMethods.PageNavigationValidation(BellYourInfoPO.BellCaLink, BellYourInfoPO.BellCaLinkFindElement, "Email updates from Bell Canada � manage your email preferences");	
		System.out.println("YI019");
		UtilityMethods.sleep(2000);

	}
	//@Test(priority=21)
	public static void ReferralrequestCancelButton() throws InterruptedException
	{
		UtilityMethods.DisplayEnableValidator(BellYourInfoPO.CancelButton, "NotEqual","Your Info Cancel Button");	
		UtilityMethods.StringValidation(BellYourInfoPO.CancelButton.getText(), "Cancel", "equalsignorecase");
		UtilityMethods.sleep(2000);
		UtilityMethods.pageRedirection(BellYourInfoPO.CancelButton, BellYourInfoPO.CancelButtonFindElement,"HomePage");
		System.out.println("YI020");
		UtilityMethods.sleep(2000);

	}

	//@Test(priority=22)
	public static void RequestButtonValidation() throws IOException
	{
		PageFactory.initElements(driver, BellYourInfoPO.class);
		UtilityMethods.sleep(2000);
		UtilityMethods.SendInputValues(BellYourInfoPO.FirstNameInput, allInputValue.getProperty("FirstName"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.LastNameInput, allInputValue.getProperty("LastName"), "TextBox");
		UtilityMethods.sleep(1000);
		UtilityMethods.SendInputValues(BellYourInfoPO.CompanyNameInput, allInputValue.getProperty("CompanyName")+UtilityMethods.GenerateRandomNum(5), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.PositionRoleInput, allInputValue.getProperty("Position"), "TextBox");
		UtilityMethods.sleep(1000);
		UtilityMethods.SendInputValues(BellYourInfoPO.PhoneNumberInput, allInputValue.getProperty("PhoneNumber"), "TextBox");
		UtilityMethods.SendInputValues(BellYourInfoPO.EmailInput, allInputValue.getProperty("E-mailAddress"), "TextBox");
		UtilityMethods.sleep(1000);
		UtilityMethods.SendInputValues(BellYourInfoPO.ModuleInput, allInputValue.getProperty("ModuleData"), "TextBox");
		//UtilityMethods.SendInputValues(BellYourInfoPO.BusinessInput, allInputValue.getProperty("BusinessType"), "DropDown");
		UtilityMethods.sleep(1000);
		UtilityMethods.SendInputValues(BellYourInfoPO.SimNanolabel, "", "Radiobutton");
		UtilityMethods.SendInputValues(BellYourInfoPO.VolumetoDeployInput, allInputValue.getProperty("VolumeToDeploy"), "TextBox");
		UtilityMethods.sleep(1000);
		UtilityMethods.SendInputValues(BellYourInfoPO.IN12MonthLabel, "", "Radiobutton");
		UtilityMethods.SendInputValues(BellYourInfoPO.Description, allInputValue.getProperty("Description"), "TextBox");	
		UtilityMethods.sleep(2000);
		BellYourInfoPO.checkBoxTerms.click();
		UtilityMethods.sleep(2000);
		BellYourInfoPO.ContinueButton.click();
		System.out.println("YI021");
		UtilityMethods.sleep(2000);

	}

}
