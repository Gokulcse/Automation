package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.PostReferralRequestPO;
import pageobjects.PostShippingInfoPO;
import driver.BaseDriver;
import utilitymethods.UtilityMethods;

public class PostShippingInfo extends BaseDriver
{
	public static FirefoxDriver driver ;
	static Properties allInputValue;
	@BeforeTest
	public static void Start() throws Exception 
	{
		driver = launchApp();
		allInputValue = UtilityMethods.getPostPropValues();
		PageFactory.initElements(driver, PostReferralRequestPO.class);
	}
	@Test(priority=1)
	public static void EnterReffCode() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Enter Referral Code']")).click();
		
		driver.findElement(By.xpath("//input[@id='referral']")).sendKeys("FgLSMxOO");
		
		driver.findElement(By.xpath("//a[text()='Order Kit']")).click();
		
		Thread.sleep(3000);
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("Testuop5534re");
		        driver.findElement(By.xpath("//input[@id='psswrd']")).sendKeys("Testuop5534re");
		        driver.findElement(By.xpath("//input[@id='cpsswrd']")).sendKeys("Testuop5534re");
		        driver.findElement(By.xpath("//input[@id='create_cc']")).click();
		    }
		  
	}
	@Test(priority=2)
	public static void sec2() throws InterruptedException
	{
		    Thread.sleep(3000);
		    for(String winHandle : driver.getWindowHandles())
		    {
		    	 Thread.sleep(3000);
		    	 driver.switchTo().window(winHandle);
				 driver.findElement(By.xpath("//label[@for='blcheck']")).click();	
				 driver.findElement(By.xpath("//input[@value='Continue']")).click();	
				 Thread.sleep(3000);
		    }
	}	
		
	@Test(priority=3)
	public static void sec3() throws InterruptedException
	{
	    Thread.sleep(3000);
	    for(String winHandle : driver.getWindowHandles())
	    {
	    	 driver.switchTo().window(winHandle);
	    }
	}
	
	
	public static void validateOperatorLogo()
	{
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.PostLogo, "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(PostShippingInfoPO.PostLogo,"src",allInputValue.getProperty("PostLogo"),"Post Operator Logo");		
	} 
	
	public static void validateCompanyLogo()
	{	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(PostShippingInfoPO.CiscoLogo,"src",allInputValue.getProperty("CiscoLogo"),"Cisco Jasper Company Logo");		
	}
	@Test(priority=4)
	public static void ShippingInfoTextvalidation()
	{
		UtilityMethods.StringValidation(PostShippingInfoPO.SectionOneHead1.getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(PostShippingInfoPO.SectionOneHead4.getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(PostShippingInfoPO.ParagraphText.getText(), allInputValue.getProperty("Shipping.SectionOne"), "equalsignorecase");
		UtilityMethods.StringValidation(PostShippingInfoPO.SameBillAndShipLabel.getText(), allInputValue.getProperty("Shipping.BillandShip"), "equalsignorecase");
	}
	@Test(priority=5)
	public static void shippingInfoLabelText()
	{
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipAddressLabel, "NotEqual", "Address Label Text");
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipAptLabel, "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipCityLabel, "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipProvinceLabel, "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipPostLabel, "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipCountryLabel, "NotEqual", "Country Label Text");	
	}
	@Test(priority=6)
	public static void shippingInfoInputField()
	{
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipAddressInput, "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipAptInput, "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipCityInput, "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipProvinceInput, "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipPostInput, "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.ShipCountryInput, "NotEqual", "Country Drop Down");	
	}
	@Test(priority=7)
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.ShipAddressInput, PostShippingInfoPO.ShipAddressError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.ShipCityInput, PostShippingInfoPO.ShipCityError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.ShipProvinceInput, PostShippingInfoPO.ShipProvinceError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.ShipPostInput, PostShippingInfoPO.ShipPostError,"TextBox");
		UtilityMethods.RequiredFieldShippingDropDown(PostShippingInfoPO.ShipCountryInput, PostShippingInfoPO.ShipCountryError);
	}
	@Test(priority=8)
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		 driver.findElement(By.xpath("//input[@value='Continue']")).click();
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.ShipAddressInput, PostShippingInfoPO.ShipAddressError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.ShipCityInput, PostShippingInfoPO.ShipCityError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.ShipProvinceInput, PostShippingInfoPO.ShipProvinceError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.ShipPostInput, PostShippingInfoPO.ShipPostError);
	}
	
	@Test(priority=9)
	public static void ShippingInfoMaximumInputValidation()
	 {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
        UtilityMethods.MaximumInputValidation(PostShippingInfoPO.ShipAddressInput, PostShippingInfoPO.ShipAddressError,100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(PostShippingInfoPO.ShipCityInput, PostShippingInfoPO.ShipCityError, 100, allInputValue.getProperty("InvalidCity")); 
        UtilityMethods.MaximumInputValidation(PostShippingInfoPO.ShipProvinceInput, PostShippingInfoPO.ShipProvinceError, 25, allInputValue.getProperty("InvalidCompanyName"));
     
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
	 }
	@Test(priority=10)
	public static void  ShippingInfoMinimumInputValidation()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.MinimumInputValidation(PostShippingInfoPO.ShipProvinceInput, PostShippingInfoPO.ShipProvinceError, 2, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(PostShippingInfoPO.ShipPostInput,PostShippingInfoPO.ShipPostError, 3, allInputValue.getProperty("InvalidMinInput"));    	 
	}
	@Test(priority=11)
	public static void CheckBoxVaildation()
	{
		PostShippingInfoPO.SameBillAndShipLabel.click();
	}
	
	@Test(priority=12)
	public static void BillingInfoLabelText()
	{
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillAddressLabel, "NotEqual", "Address Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillAptLabel, "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillCityLabel, "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillProvinceLabel, "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillPostLabel, "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillCountryLabel, "NotEqual", "Country Label Text");	
	}

	@Test(priority=13)
	public static void BillingInfoInputField()
	{
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillAddressInput, "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillAptInput, "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillCityInput, "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillProvinceInput, "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillPostInput, "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(PostShippingInfoPO.BillCountryInput, "NotEqual", "Country Drop Down");		
	}
	@Test(priority=14)
	public static void BillingInfoRequiredFieldvalidatoin()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.BillAddressInput, PostShippingInfoPO.BillAddressError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.BillCityInput, PostShippingInfoPO.BillCityError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.BillProvinceInput, PostShippingInfoPO.BillProvinceError,"TextBox");
		UtilityMethods.RequiredFieldValidation(PostShippingInfoPO.BillPostInput, PostShippingInfoPO.BillPostError,"TextBox");
		UtilityMethods.RequiredFieldShippingDropDown(PostShippingInfoPO.BillCountryInput, PostShippingInfoPO.BillCountryError);
	}
	@Test(priority=15)
	public static void BillingInfoSpaceNotAllowedvalidatoin()
	{
		 driver.findElement(By.xpath("//input[@value='Continue']")).click();
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.BillAddressInput, PostShippingInfoPO.BillAddressError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.BillCityInput, PostShippingInfoPO.BillCityError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.BillProvinceInput, PostShippingInfoPO.BillProvinceError);
		 UtilityMethods.SpaceNotAllowedvalidation(PostShippingInfoPO.BillPostInput, PostShippingInfoPO.BillPostError);
	}
	
	@Test(priority=14)
	public static void BillingInfoMaximumInputValidation()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
        UtilityMethods.MaximumInputValidation(PostShippingInfoPO.BillAddressInput, PostShippingInfoPO.BillAddressError,100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(PostShippingInfoPO.BillCityInput, PostShippingInfoPO.BillCityError, 100, allInputValue.getProperty("InvalidCity")); 
        UtilityMethods.MaximumInputValidation(PostShippingInfoPO.BillProvinceInput, PostShippingInfoPO.BillProvinceError, 25, allInputValue.getProperty("InvalidCompanyName"));
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
	 }
	
	@Test(priority=16)
	public static void  BillingInfoMinimumInputValidation()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.MinimumInputValidation(PostShippingInfoPO.BillProvinceInput, PostShippingInfoPO.BillProvinceError, 2, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(PostShippingInfoPO.BillPostInput, PostShippingInfoPO.BillPostError, 3, allInputValue.getProperty("InvalidMinInput"));    	 
	}
	@AfterTest
	public static void Exit()
	{
		driver.close();
	}
	
}
