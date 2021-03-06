package pages;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import utilitymethods.UtilityMethods;
import pageobjects.PostReferralRequestPO;
public class PostReferralRequest extends BaseDriver
{
	public static FirefoxDriver driver;
	static Properties allInputValue;

	@BeforeTest
	public static void Start() throws Exception 
	{
		driver = launchApp();
		allInputValue = UtilityMethods.getPostPropValues();
	}
	
/*	public static void headerValidation()
	{
		validateOperatorLogo();
		validateCompanyLogo();
		//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//img[@alt='Tele2']")), driver.findElement(By.xpath("//img[@title='What is IoT']")));
	}*/
	
	private static FirefoxDriver launchApp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, PostReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.PostLogo, "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(PostReferralRequestPO.PostLogo,"src",allInputValue.getProperty("postLogo"),"Post Operator Logo");		
		
	} 
	@Test(priority=1)
	public static void validateCompanyLogo()
	{PageFactory.initElements(driver, PostReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(PostReferralRequestPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
	}
	 
	public static void sectionOneValidation()
	{
		ReferralRequestTextValidation();
		RequestReferralCodeTextBoxDisplayedAndEnabled();
		RequestReferralCodeLabelTextDisplayedAndEnabled();
		RequestReferralCodePlaceholderValidation();
		ReferralRequestCodeValidInputValidation();
		ReferralRequestRequiredFieldValidation();
		ReferralRequestSpaceNotAllowedValidation();
		ReferralRequestMaximumInputValidation();
		ReferralRequestMinimumInputValidation();
		ReferralRequestOtherValidation();
		RequestButtonValidation();
	}
	
	@Test(priority=2)
	public static void ReferralRequestTextValidation()
	{
		PageFactory.initElements(driver, PostReferralRequestPO.class);
		UtilityMethods.StringValidation(PostReferralRequestPO.SectionOneHead1.getText(), "Request a Referral Code", "equalsignorecase");
		UtilityMethods.StringValidation(PostReferralRequestPO.ParagraphText.getText(), allInputValue.getProperty("ReferralRequest.sectionOne"), "equalsignorecase");
		allInputValue.setProperty("WhatIsIot", "");
		
		UtilityMethods.StringValidation(PostReferralRequestPO.ContactInfoText.getText(), "Contact Information", "equalsignorecase");
		UtilityMethods.StringValidation(PostReferralRequestPO.DeviceInfoText.getText(), "Device Information", "equalsignorecase");
	}
	
	@Test(priority=3)
	public static void RequestReferralCodeTextBoxDisplayedAndEnabled()
	{
		PageFactory.initElements(driver, PostReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.FirstNameInput, "NotEqual", "First Name Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.LastNameInput, "NotEqual", "Last Name Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.CompanyNameInput, "NotEqual", "Company Name Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.PositionRoleInput, "NotEqual", "Position/Role Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.PhoneNumberInput, "NotEqual", "Phone Number Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.EmailInput, "NotEqual", "E-mail Address Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.ModuleInput, "NotEqual", "Module Name Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.BusinessInput, "NotEqual", "Business Type Drop Down Menu");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.Sim2FFInput, "NotEqual", "2FF Sim Type Radio Button");			
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.Sim3FFInput, "NotEqual", "3FF Sim Type Radio Button");			
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.VolumetoDeployInput, "NotEqual", "Volume to deploy Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.IN3MonthInput, "NotEqual", "Within 3 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.IN6MonthInput, "NotEqual", "3-6 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.IN12MonthInput, "NotEqual", "6-12 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.Morethan12MonthInput, "NotEqual", "More than 12 months/unknown Radio Button");
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.Description, "NotEqual", "Description Input Field");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.CancelButton, "NotEqual", "Cancel Button");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.RequestButton, "NotEqual", "Request Button");	
	}
	@Test(priority=4)
	public static void RequestReferralCodeLabelTextDisplayedAndEnabled()
	{	
		PageFactory.initElements(driver, PostReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.FirstNameLabel, "NotEqual", "First Name Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.LastNameLabel, "NotEqual", "Last Name Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.CompanyNameLabel, "NotEqual", "Company Name Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.PositionRoleLabel, "NotEqual", "Position/Role Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.PhoneNumberLabel, "NotEqual", "Phone Number Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.EmailLabel, "NotEqual", "E-mail Address Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.ModuleLabel, "NotEqual", "Module Name Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.BusinessLabel, "NotEqual", "Business TypeLabel Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.SimLabel, "NotEqual", "Sim Type Label Text");
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.Sim2FFLabel, "NotEqual", "2FF Mini Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.Sim3FFlabel, "NotEqual", "3FF Micro Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.VolumetoDeployLabel, "NotEqual", "Volume to deploy Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.LastNameLabel, "NotEqual", "Launch Timeframe Label Text");
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.IN3MonthLabel, "NotEqual", "Within 3 months Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.IN6Monthlabel, "NotEqual", "3-6 months Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.IN12MonthLabel, "NotEqual", "6-12 months Label Text");	
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.Morethan12Monthlabel, "NotEqual", "More than 12 months/unknown Label Text");
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.DescriptionLabel, "NotEqual", "Description Label Text");			
	}
	@Test(priority=5)
	public static void RequestReferralCodePlaceholderValidation()
	{
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.FirstNameInput, "Enter your first name", "First Name");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.LastNameInput, "Enter your last name", "Last Name");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.CompanyNameInput, "Enter your company name", "Company Name");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.PositionRoleInput, "Enter your position/role", "position/role");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.PhoneNumberInput, "", "Phone Number");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.EmailInput, "Enter e-mail", "Email-ID");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.ModuleInput, "Enter the module used in your device", "Module");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.VolumetoDeployInput, "Enter first year quantity", "Volume to deploy");
		UtilityMethods.PlaceholderValidation(PostReferralRequestPO.Description, "Tell us a little about your device, target audience, and how we can help.", "Description");
		
	}
	@Test(priority=6) 
	public static void ReferralRequestCodeValidInputValidation()
	{
		PostReferralRequestPO.RequestButton.click();
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.FirstNameInput, allInputValue.getProperty("ValidFirstName"), PostReferralRequestPO.FirstNameError);
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.LastNameInput, allInputValue.getProperty("ValidLastName"),PostReferralRequestPO.LastNameError );
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.CompanyNameInput, allInputValue.getProperty("ValidCompanyName"), PostReferralRequestPO.CompanyError);
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.PositionRoleInput, allInputValue.getProperty("ValidPosition"), PostReferralRequestPO.PositionError);
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.PhoneNumberInput,allInputValue.getProperty("ValidPhoneNumber"),PostReferralRequestPO.PhoneNumberError);
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.EmailInput,allInputValue.getProperty("ValidEmailId") , PostReferralRequestPO.EmailError);
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.ModuleInput, allInputValue.getProperty("ValidModule"), PostReferralRequestPO.ModuleError);	
		UtilityMethods.ValidateDropDown(PostReferralRequestPO.BusinessInput, "Consumer electronics - personal navigation", PostReferralRequestPO.BusinessTypeError);
		//UtilityMethods.ValidateSimTypeRadioButton(2,driver.findElement(By.xpath("//div[@id='simTypeId-error']")));	
		//driver.findElement(By.xpath("//label[text()='2FF/Ruggedized']")).click();
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.VolumetoDeployInput, allInputValue.getProperty("ValidVolumeToDeploy"),PostReferralRequestPO.VolumetoDeployError);
		UtilityMethods.ValidInputValidation(PostReferralRequestPO.Description, allInputValue.getProperty("ValidDescription"), PostReferralRequestPO.DescriptionError);
	
	}
	@Test(priority=7)
	public static void ReferralRequestRequiredFieldValidation()
	{
		PostReferralRequestPO.RequestButton.click();
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.FirstNameInput, PostReferralRequestPO.FirstNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.LastNameInput, PostReferralRequestPO.LastNameError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.CompanyNameInput, PostReferralRequestPO.CompanyError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.PositionRoleInput, PostReferralRequestPO.PositionError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.PhoneNumberInput, PostReferralRequestPO.PhoneNumberError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.EmailInput, PostReferralRequestPO.EmailError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.ModuleInput, PostReferralRequestPO.ModuleError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.BusinessInput, PostReferralRequestPO.BusinessTypeError,"DropDown");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.SimLabel, PostReferralRequestPO.SimTypeError,"RadioButton");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.VolumetoDeployInput, PostReferralRequestPO.VolumetoDeployError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.LaunchTimeframeLabel, PostReferralRequestPO.LastNameError,"RadioButton");
		UtilityMethods.RequiredFieldValidation(PostReferralRequestPO.Description, PostReferralRequestPO.DescriptionError,"TextBox");		
	}
	@Test(priority=8)
	public static void ReferralRequestSpaceNotAllowedValidation()
	 {	
		PostReferralRequestPO.RequestButton.click();
		 UtilityMethods.SpaceNotAllowedvalidation(PostReferralRequestPO.FirstNameInput, PostReferralRequestPO.FirstNameError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostReferralRequestPO.LastNameInput, PostReferralRequestPO.LastNameError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostReferralRequestPO.CompanyNameInput, PostReferralRequestPO.CompanyError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostReferralRequestPO.PositionRoleInput, PostReferralRequestPO.PositionError);
		
	 }
	@Test(priority=9)
	public static void ReferralRequestMaximumInputValidation()
	 {
		PostReferralRequestPO.RequestButton.click();
        UtilityMethods.MaximumInputValidation(PostReferralRequestPO.FirstNameInput, PostReferralRequestPO.FirstNameError, 49, allInputValue.getProperty("InvalidInput"));
        UtilityMethods.MaximumInputValidation(PostReferralRequestPO.LastNameInput, PostReferralRequestPO.LastNameError, 49, allInputValue.getProperty("InvalidInput"));
        UtilityMethods.MaximumInputValidation(PostReferralRequestPO.CompanyNameInput, PostReferralRequestPO.CompanyError, 25, allInputValue.getProperty("InvalidCompanyName"));
        UtilityMethods.MaximumInputValidation(PostReferralRequestPO.PositionRoleInput, PostReferralRequestPO.PositionError, 25, allInputValue.getProperty("InvalidCompanyName"));
        UtilityMethods.MaximumInputValidation(PostReferralRequestPO.PhoneNumberInput, PostReferralRequestPO.PhoneNumberError, 10, allInputValue.getProperty("Invalidphonenumber"));
        UtilityMethods.MaximumInputValidation(PostReferralRequestPO.Description, PostReferralRequestPO.DescriptionError, 255, allInputValue.getProperty("InvalidDescription"));     
       	 
	 }
	@Test(priority=10)
	public static void ReferralRequestMinimumInputValidation()
	 {
		PostReferralRequestPO.RequestButton.click();
		UtilityMethods.MinimumInputValidation(PostReferralRequestPO.CompanyNameInput, PostReferralRequestPO.CompanyError, 3, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(PostReferralRequestPO.PhoneNumberInput, PostReferralRequestPO.PhoneNumberError, 10, allInputValue.getProperty("InvalidMinphonenumber"));    	 

	 }
	@Test(priority=11)
	public static void ReferralRequestOtherValidation()
	{	
		PostReferralRequestPO.RequestButton.click();
		UtilityMethods.EmailIdInvalidvalidation(PostReferralRequestPO.EmailInput, PostReferralRequestPO.EmailError, allInputValue.getProperty("InvalidEmailID"));
		UtilityMethods.NumericFieldValidation(PostReferralRequestPO.PhoneNumberInput, PostReferralRequestPO.PhoneNumberError, allInputValue.getProperty("InvalidPhoneNumber"));
		UtilityMethods.NumericFieldValidation(PostReferralRequestPO.VolumetoDeployInput, PostReferralRequestPO.VolumetoDeployError, allInputValue.getProperty("InvadildNumbericField"));
	}
	
	@Test(priority=12)
	public static void RequestButtonValidation()
	{
		UtilityMethods.SendInputValues(PostReferralRequestPO.FirstNameInput, "Test", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.LastNameInput, "Data 1", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.CompanyNameInput, "CTELA TEST 1.1", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.PositionRoleInput, "ELP", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.PhoneNumberInput, "8220119412", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.EmailInput, "gokularamanancse@gmail.com.com", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.ModuleInput, "Test Entry", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.BusinessInput, "Telematics - passenger vehicles, aftermarket", "DropDown");
	    UtilityMethods.SendInputValues(PostReferralRequestPO.Sim2FFInput, "", "Radiobutton");
	    UtilityMethods.SendInputValues(PostReferralRequestPO.VolumetoDeployInput, "001", "TextBox");
	    UtilityMethods.SendInputValues(PostReferralRequestPO.IN6MonthInput, "", "Radiobutton");
	    UtilityMethods.SendInputValues(PostReferralRequestPO.Description, "Test Data value", "TextBox");	
	    //UtilityMethods.PageRedirection(driver.findElement(By.xpath("//input[@value='Request']")), driver.findElement(By.xpath("//a[text()='Back to IoT Starter Kit Page']")));
	   // UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//input[@value='Request']")), driver.findElement(By.xpath("//a[text()='Back to IoT Starter Kit Page']")));
	    PostReferralRequestPO.RequestButton.click();
	    driver.navigate().back();
	  /*  driver.findElement(By.xpath("//input[@value='Request']")).click();	
	    try{ Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
	//	UtilityMethods.waitForElement(driver.findElement(By.xpath("//img[@title='What is IoT']")));	
		boolean Result = true;
		
		Result= driver.findElement(By.xpath("//a[text()='Back to IoT Starter Kit Page']")).isDisplayed();
		System.out.println("The Result is "+Result);
		if(Result==false)
	    {
		System.out.println("Page Navigation Error in "+driver.findElement(By.xpath("//img[@alt='Tele2']")).getText());	
		}
	*/
	}
	
	//@Test(priority=13)
	public static void AdminApproval() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://starterkit-dev.devm2m.com/admin/internal/login");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("prasanna.v");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='blpr-menu blpr-dsk-menu']//span[text()='Referrals']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='approve0']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='aprCode']//button[@type='submit']")).click();
	}
	
	
	@AfterTest
	public static void Exit()
	{
		driver.close();
	}
	
}
