package pages;


import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import driver.BaseDriver;
import pageobjects.PostReferralRequestPO;
import utilitymethods.UtilityMethods;

public class PostOrderConfirmPage extends BaseDriver
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
	
	public static void validateOperatorLogo()
	{
		WebElement operatorLogo = driver.findElement(By.xpath("//img[@alt='post']"));
		UtilityMethods.DisplayEnableValidator(operatorLogo, "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(operatorLogo,"src",allInputValue.getProperty("tele2Logo"),"Post Operator Logo");		
	} 
	
	public static void validateCompanyLogo()
	{
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));
		UtilityMethods.DisplayEnableValidator(companyLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(companyLogo,"src",allInputValue.getProperty("tele2CompanyLogo"),"Cisco Jasper Company Logo");		
	}
	
	public static void SectionOneTextValidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//h2")).getText(), "Order IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='order-status iot-kit-info']//span[@class='bl-status']")).getText(), "Your Information", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='order-status iot-kit-ship']//span[@class='bl-status']")).getText(), "Shipping", "equalsignorecase");	
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='order-status iot-kit-pay']//span[@class='bl-status']")).getText(), "Review & Confirm", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//h4")).getText(), "Order Summary", "equalsignorecase");
	}
	
	public static void SectionTwoTextValidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//p[contains(.,'IoT')]")).getText(), "IoT Starter Kit", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//li[contains(.,'Test')]")).getText(), "3 Test SIMs", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//li[contains(.,'30')]")).getText(), "30MB per SIM per month", "equalsignorecase");	
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//li[contains(.,'50')]")).getText(), "50 SMS per SIM per month", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//li[contains(.,'Post')]")).getText(), "Full access to Post Control Centre", "equalsignorecase");
	}
	
	public static void SectionThreeTextValidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='col-xs-8 clr-black']")).getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//p[text()='Included']")).getText(), "Included", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='ship_wrap clearfix']//h5")).getText(), "Shipping", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='payment_wrap clearfix']//h5")).getText(), "Billing", "equalsignorecase");		
	}
	
	
	public static void shippingEditButton()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='ship_wrap clearfix']//a")), "NotEqual", "Edit button in shipping");
	
	}
	
	public static void billingEditButton()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='payment_wrap clearfix']//a")), "NotEqual", "Edit button in Billing");
	}
	
}
