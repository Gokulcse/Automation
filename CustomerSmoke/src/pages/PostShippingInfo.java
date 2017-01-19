package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.PostReferralRequestPO;
import pageobjects.Tele2HomePagePO;
import driver.BaseDriver;
import utilitymethods.UtilityMethods;

public class PostShippingInfo extends BaseDriver
{
	public static FirefoxDriver driver = launchApp();
	static Properties allInputValue;
	@BeforeTest
	public static void Start() throws IOException 
	{
		allInputValue = UtilityMethods.getPostPropValues();
		PageFactory.initElements(driver, PostReferralRequestPO.class);
	}
	@Test(priority=1)
	public static void EnterReffCode() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Enter Referral Code']")).click();
		
		driver.findElement(By.xpath("//input[@id='referral']")).sendKeys("rKvEcRDP");
		
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
		    	 driver.switchTo().window(winHandle);
				 driver.findElement(By.xpath("//label[@for='blcheck']")).click();	
				 driver.findElement(By.xpath("//input[@value='Request']")).click();	
				 Thread.sleep(3000);
		    }
	}	
		
	
	
	
	
	public static void validateOperatorLogo()
	{
		WebElement operatorLogo = driver.findElement(By.xpath("//img[@alt='post']"));
		UtilityMethods.DisplayEnableValidator(operatorLogo, "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(operatorLogo,"src",allInputValue.getProperty("tele2Logo"),"Post Operator Logo");		
	} 
	@Test(priority=3)
	public static void validateCompanyLogo()
	{
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));
		UtilityMethods.DisplayEnableValidator(companyLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(companyLogo,"src",allInputValue.getProperty("tele2CompanyLogo"),"Cisco Jasper Company Logo");		
	}
	@Test(priority=4)
	public static void ShippingInfoTextvalidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//h2")).getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//h4")).getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//p")).getText(), "Please provide us with the details of your shipping address. Once your order has been completed, your IoT Starter Kit will be shipped to you at no charge.", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//label[@for='smebilling']")).getText(), "My shipping and billing information are the same.", "equalsignorecase");
	}
	@Test(priority=5)
	public static void shippingInfoLabelText()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form/div[@class='clearfix frm-in-field']//label[text()='Address']")), "NotEqual", "Address Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form/div[@class='clearfix frm-in-field']//label[text()='Apt/Suite']")), "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form/div[@class='clearfix frm-in-field']//label[text()='City']")), "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form/div[@class='clearfix frm-in-field']//label[text()='Province']")), "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form/div[@class='clearfix frm-in-field']//label[text()='Postal Code']")), "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form/div[@class='clearfix frm-in-field']//label[text()='Country']")), "NotEqual", "Country Label Text");	
	}
	@Test(priority=6)
	public static void shippingInfoInputField()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='shipAddress.addressLine1']")), "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='shipAddress.addressLine2']")), "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='shipAddress.cityTown']']")), "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='shipAddress.state']")), "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//select[@id='country']")), "NotEqual", "Country Drop Down");	

	}
	@Test(priority=7)
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='shipAddress.addressLine1']")), driver.findElement(By.xpath("//div[@id='address-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='shipAddress.cityTown']")), driver.findElement(By.xpath("//div[@id='citydown-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='shipAddress.state']")), driver.findElement(By.xpath("//div[@id='province-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//select[@id='country']")), driver.findElement(By.xpath("//div[@id=''country-error']")),"DropDown");
	}
	@Test(priority=8)
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		 driver.findElement(By.xpath("//input[@value='Continue']")).click();
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='shipAddress.addressLine1']")), driver.findElement(By.xpath("//div[@id='address-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='shipAddress.cityTown']")), driver.findElement(By.xpath("//div[@id='citydown-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='shipAddress.state']")), driver.findElement(By.xpath("//div[@id='province-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")));
	}
	
	@Test(priority=9)
	public static void ShippingInfoMaximumInputValidation()
	 {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.addressLine1']")), driver.findElement(By.xpath("//div[@id='address-error']")),100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.cityTown']")), driver.findElement(By.xpath("//div[@id='citydown-error']")), 100, allInputValue.getProperty("InvalidCity")); 
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.state']")), driver.findElement(By.xpath("//div[@id='province-error']")), 25, allInputValue.getProperty("InvalidCompanyName"));
     
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
	 }
	@Test(priority=10)
	public static void  ShippingInfoMinimumInputValidation()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.MinimumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.state']")), driver.findElement(By.xpath("//div[@id='province-error']")), 2, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 3, allInputValue.getProperty("InvalidMinInput"));    	 
	}
	@Test(priority=11)
	public static void CheckBoxVaildation()
	{
		driver.findElement(By.xpath("//label[@for='smebilling']")).click();
	}
	
	@Test(priority=12)
	public static void BillingInfoLabelText()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='bl-hid-pp']//label[text()='Address']")), "NotEqual", "Address Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='bl-hid-pp']//label[text()='Apt/Suite']")), "NotEqual", "Apt/Suite Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='bl-hid-pp']//label[text()='City']")), "NotEqual", "City Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='bl-hid-pp']//label[text()='Province']")), "NotEqual", "Province Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='bl-hid-pp']//label[text()='Postal Code']")), "NotEqual", "Postal Code Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='bl-hid-pp']//label[text()='Country']")), "NotEqual", "Country Label Text");	
	}

	@Test(priority=13)
	public static void BillingInfoInputField()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='billAddress.addressLine1']")), "NotEqual", "Address Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='billAddress.addressLine2']")), "NotEqual", "Apt/Suite Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='billAddress.cityTown']")), "NotEqual", "City Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='billAddress.state']")), "NotEqual", "Province Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@name='billAddress.zipPostalCode']")), "NotEqual", "Postal Code Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//select[@id='bcountry']")), "NotEqual", "Country Drop Down");	

	}
	@Test(priority=14)
	public static void BillingInfoRequiredFieldvalidatoin()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='billAddress.addressLine1']")), driver.findElement(By.xpath("//div[@id='address1-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='billAddress.cityTown']")), driver.findElement(By.xpath("//div[@id='citytown-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='billAddress.state']")), driver.findElement(By.xpath("//div[@id='provinces-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@name='billAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id='poscode-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//select[@id='bcountry']")), driver.findElement(By.xpath("//div[@id=''country-error']")),"DropDown");
	}
	@Test(priority=15)
	public static void BillingInfoSpaceNotAllowedvalidatoin()
	{
		 driver.findElement(By.xpath("//input[@value='Continue']")).click();
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='billAddress.addressLine1']")), driver.findElement(By.xpath("//div[@id='address1-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='billAddress.cityTown']")), driver.findElement(By.xpath("//div[@id='citytown-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='billAddress.state']")), driver.findElement(By.xpath("//div[@id='provinces-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@name='billAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id='poscode-error']")));
	}
	
	@Test(priority=14)
	public static void BillingInfoMaximumInputValidation()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='billAddress.addressLine1']")), driver.findElement(By.xpath("//div[@id='address1-error']")),100, allInputValue.getProperty("InvalidCity"));
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='billAddress.cityTown']")), driver.findElement(By.xpath("//div[@id='citytown-error']")), 100, allInputValue.getProperty("InvalidCity")); 
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='billAddress.state']")), driver.findElement(By.xpath("//div[@id='provinces-error']")), 25, allInputValue.getProperty("InvalidCompanyName"));
        //UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@name='shipAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id=''pscode-error']")), 6, allInputValue.getProperty("InvalidCompanyName"));
        //postal Code Maximum Input validation need to be verified 	 
	 }
	@Test(priority=16)
	public static void  BillingInfoMinimumInputValidation()
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		UtilityMethods.MinimumInputValidation(driver.findElement(By.xpath("//input[@name='billAddress.state']")), driver.findElement(By.xpath("//div[@id='provinces-error']")), 2, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(driver.findElement(By.xpath("//input[@name='billAddress.zipPostalCode']")), driver.findElement(By.xpath("//div[@id='poscode-error']")), 3, allInputValue.getProperty("InvalidMinInput"));    	 
	}
	@AfterTest
	public static void Exit()
	{
		driver.close();
	}
	
}