package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import driver.BaseDriver;
import pageobjects.BellBillingInfoPO;
import pageobjects.BellShippingInfoPO;
import pageobjects.BellYourInfoPO;
import utilitymethods.UtilityMethods;

public class BellBillingInfo extends BaseDriver
{
	public static WebDriver driver =BaseDriver.driver ;
	static Properties allInputValue;
	
	public static void Start() throws Exception 
	{
		allInputValue = UtilityMethods.getBellPropValues();
		PageFactory.initElements(driver, BellBillingInfoPO.class);
	}
	
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellBillingInfoPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
		System.out.println("BI001");
		UtilityMethods.sleep(2000);

	} 
	
	public static void validateCompanyLogo()
	{	
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellBillingInfoPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");		
		System.out.println("BI002");
		UtilityMethods.sleep(2000);

	}

	public static void BillingInfoTextvalidation()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.StringValidation(BellBillingInfoPO.OrderIotHeaderText.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.SectionOneHead4.getText(), "Payment", "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.ParagraphText.getText(), allInputValue.getProperty("Billing.SectionOne"), "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.YourInfoText.getText(), "Your Information", "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.ShppingText.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.PaymentText.getText(), "Payment", "equalsignorecase");
		UtilityMethods.StringValidation(BellBillingInfoPO.ReviewConfirmText.getText(), "Review & Confirm", "equalsignorecase");
		System.out.println("BI003");
		UtilityMethods.sleep(2000);

	}
	public static void BillingCardDetailsLabelText()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.NameOnCardLabel, "NotEqual", "Name On Card Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CardNumberLabel, "NotEqual", "Card Number Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.ExpiryDateLabel, "NotEqual", "Expiry Date Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.CVVCodeLabel, "NotEqual", "CVV Code Label Text");	
		System.out.println("BI004");
		UtilityMethods.sleep(2000);

	}
	public static void BillingCardDetailsInputFieldValidation()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.sleep(2000);
		UtilityMethods.DisabledValidation(BellBillingInfoPO.NameOnCardInput,"Name On Card input Text");	
		UtilityMethods.DisabledValidation(BellBillingInfoPO.CardNumberInput, "Card Number input Text");	
		UtilityMethods.DisabledValidation(BellBillingInfoPO.ExpiryDate, "Expiry Date input Text");	
		UtilityMethods.DisabledValidation(BellBillingInfoPO.CVVCodeInput, "CVV Code input Text");	
		System.out.println("BI005");
	}
	
	public static void BillingCheckBoxVaildation()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.sleep(2000);
		BellBillingInfoPO.SameBillAndShipLabel.click();
		UtilityMethods.sleep(5000);
		System.out.println("BI006");
	}
	
	public static void BillingInfoLabelText()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAddressLabel, "NotEqual", "Address Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAptLabel, "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCityLabel, "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillProvinceLabel, "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillPostLabel, "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCountryLabel, "NotEqual", "Country Label Text");	
		System.out.println("BI007");
		UtilityMethods.sleep(2000);
		}

	public static void BillingInfoInputField()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAddressInput, "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillAptInput, "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCityInput, "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillProvinceInput, "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillPostInput, "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(BellBillingInfoPO.BillCountryInput, "NotEqual", "Country Drop Down");		
		System.out.println("BI008");
		UtilityMethods.sleep(2000);
	}
	
	public static void BillingInfoRequiredFieldvalidatoin()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.sleep(3000);
		BellBillingInfoPO.BillAddressInput.clear();
		UtilityMethods.sleep(1000);
		BellBillingInfoPO.ReviewButton.click();
		UtilityMethods.sleep(3000);
		UtilityMethods.RequiredFieldValidation(BellBillingInfoPO.BillAddressInput, BellBillingInfoPO.BillAddressError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellBillingInfoPO.BillCityInput, BellBillingInfoPO.BillCityError,"TextBox");
		UtilityMethods.RequiredFieldValidation(BellBillingInfoPO.BillPostInput, BellBillingInfoPO.BillPostError,"TextBox");
		UtilityMethods.RequiredFieldShippingDropDown(BellBillingInfoPO.BillProvinceInput, BellBillingInfoPO.BillProvinceError);
		UtilityMethods.RequiredFieldShippingDropDown(BellBillingInfoPO.BillCountryInput, BellBillingInfoPO.BillCountryError);
		System.out.println("BI009");
		UtilityMethods.sleep(2000);
	}
	
	public static void BillingInfoSpaceNotAllowedvalidatoin()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		BellBillingInfoPO.BillAddressInput.clear();UtilityMethods.sleep(1000);
		BellBillingInfoPO.ReviewButton.click();
		UtilityMethods.SpaceNotAllowedvalidation(BellBillingInfoPO.BillAddressInput, BellBillingInfoPO.BillAddressError);
		UtilityMethods.SpaceNotAllowedvalidation(BellBillingInfoPO.BillCityInput, BellBillingInfoPO.BillCityError);
		System.out.println("BI010");
		UtilityMethods.sleep(2000);
	}
	
	public static void BillingInfoMaximumInputValidation()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		BellBillingInfoPO.BillAddressInput.clear();UtilityMethods.sleep(1000);
		BellBillingInfoPO.ReviewButton.click();
        UtilityMethods.MaximumInputValidation(BellBillingInfoPO.BillAddressInput, BellBillingInfoPO.BillAddressError,100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(BellBillingInfoPO.BillCityInput, BellBillingInfoPO.BillCityError, 100, allInputValue.getProperty("InvalidCity")); 
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
        System.out.println("BI011");
        UtilityMethods.sleep(2000);
	}
	
	public static void  BillingInfoMinimumInputValidation()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		BellBillingInfoPO.BillAddressInput.clear();UtilityMethods.sleep(1000);
		BellBillingInfoPO.ReviewButton.click();
		BellBillingInfoPO.ReviewButton.click();
        UtilityMethods.MinimumInputValidation(BellBillingInfoPO.BillPostInput, BellBillingInfoPO.BillPostError, 3, allInputValue.getProperty("InvalidMinInput"));    	 
        System.out.println("BI012");
        UtilityMethods.sleep(2000);
	}
	public static void BellLogoValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		UtilityMethods.pageRedirection(BellBillingInfoPO.BellLogo, BellBillingInfoPO.CancelButtonFindElement,"Home");
		System.out.println("BI013");
		UtilityMethods.sleep(2000);
	}
	
	public static void CancelButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		//UtilityMethods.sleep(5000);
		UtilityMethods.sleep(5000);
		UtilityMethods.pageRedirection(BellBillingInfoPO.CancelButton, BellBillingInfoPO.CancelButtonFindElement,"Others");
		System.out.println("BI014");
		UtilityMethods.sleep(5000);
	}
	
	public static void BackButtonValidation() throws InterruptedException
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		//UtilityMethods.sleep(5000);
		UtilityMethods.sleep(5000);
		UtilityMethods.pageRedirection(BellBillingInfoPO.BackButton, BellBillingInfoPO.BackFindElement,"Others");
		System.out.println("BI015");
		UtilityMethods.sleep(2000);
	}
	
	public static void BillingInfoSendInputs()
	{
		PageFactory.initElements(driver, BellBillingInfoPO.class);
		if(allInputValue.getProperty("sameShippBillAddress").equals("Yes"))
		{
			UtilityMethods.sleep(4000);	
			BellBillingInfoPO.SameBillAndShipLabel.click();
			UtilityMethods.sleep(3000);
			//System.out.println("The Xpath For Review button is :"+BellBillingInfoPO.ReviewButton+"");
			//System.out.println("The Xpath For Review button is Displayed:"+BellBillingInfoPO.ReviewButton.isDisplayed()+"");
			//System.out.println("The Xpath For Review button is Enabled:"+BellBillingInfoPO.ReviewButton.isEnabled()+"");
			driver.navigate().refresh();
			UtilityMethods.sleep(5000);
			//System.out.println("The Xpath For Review button is :"+BellBillingInfoPO.ReviewButton+"");
			//System.out.println("The Xpath For Review button is Displayed:"+BellBillingInfoPO.ReviewButton.isDisplayed()+"");
			//System.out.println("The Xpath For Review button is Enabled:"+BellBillingInfoPO.ReviewButton.isEnabled()+"");
			BellBillingInfoPO.ReviewButton.click();
			System.out.println("BI016");
			UtilityMethods.sleep(2000);
			
		}
		else if(allInputValue.getProperty("sameShippBillAddress").equals("No"))
		{
			UtilityMethods.sleep(4000);
			BellBillingInfoPO.SameBillAndShipLabel.click();
			UtilityMethods.sleep(4000);
			BellBillingInfoPO.SameBillAndShipLabel.click();
			UtilityMethods.sleep(4000);
			UtilityMethods.SendInputValues(BellBillingInfoPO.BillAddressInput, allInputValue.getProperty("billingAddress1"), "TextBox");
			UtilityMethods.SendInputValues(BellBillingInfoPO.BillAptInput, allInputValue.getProperty("billingAddress2"), "TextBox");
			UtilityMethods.sleep(2000);
			UtilityMethods.SendInputValues(BellBillingInfoPO.BillCityInput, allInputValue.getProperty("billingCity"), "TextBox");
			UtilityMethods.SendInputValues(BellBillingInfoPO.BillProvinceInput, allInputValue.getProperty("billingState"), "DropDown");
			UtilityMethods.sleep(2000);
			UtilityMethods.SendInputValues(BellBillingInfoPO.BillPostInput, allInputValue.getProperty("billingPostalCode"), "TextBox");
			UtilityMethods.SendInputValues(BellBillingInfoPO.BillCountryInput, allInputValue.getProperty("billingCountry"), "DropDown");
			BellBillingInfoPO.ReviewButton.click();
			System.out.println("BI016");
			UtilityMethods.sleep(4000);
		}
		else
		{
			BellBillingInfoPO.SameBillAndShipLabel.click();
			UtilityMethods.sleep(4000);	
			BellBillingInfoPO.ReviewButton.click();
			System.out.println("BI016");
			UtilityMethods.sleep(4000);
		}	
	}
	
}
