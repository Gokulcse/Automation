package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;
import pageobjects.PostReferralRequestPO;
import utilitymethods.UtilityMethods;

public class PostReferralrequestThankYou extends BaseDriver
{

	public static FirefoxDriver driver;
	static Properties allInputValue;

	@BeforeTest
	public static void Start() throws IOException 
	{
		driver = launchApp();
		allInputValue = UtilityMethods.getPostPropValues();
	}
	
	@Test(priority=1)
	public static void validateOperatorLogo()
	{
		PageFactory.initElements(driver, PostReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.PostLogo, "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(PostReferralRequestPO.PostLogo,"src",allInputValue.getProperty("postLogo"),"Post Operator Logo");		
		
	}
	
	@Test(priority=2)
	public static void validateCompanyLogo()
	{
		PageFactory.initElements(driver, PostReferralRequestPO.class);
		UtilityMethods.DisplayEnableValidator(PostReferralRequestPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(PostReferralRequestPO.CiscoLogo,"src",allInputValue.getProperty("CompanyLogo"),"Cisco Jasper Company Logo");		
	}
	
	@Test(priority=3)
	public static void sectionOneValidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//h2")).getText(), "Thank you for your request!", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//p")).getText(), "An e-mail has been sent to you to confirm your request has been received. You will receive a response within 3 business days.", "equalsignorecase");

	}
	@Test(priority=4)
	public static void backToIotSatrterKit()
	{ 	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@Class='text-center']//a")), "NotEqual","Post Operator Logo in IoT Starter Kit");	
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@Class='text-center']//a")).getText(), "Back to IoT Starter Kit Page", "equalsignorecase");

	}
	
	@Test(priority=5)
	public static void backToIotSatrterKitRedirection()
	{
		
	}
	
	
}
