package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilitymethods.UtilityMethods;
import driver.BaseDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Tele2ShippingInfo extends BaseDriver
{
	public static FirefoxDriver driver = launchApp();
	static Properties allInputValue;
	@BeforeTest
	public static void Start() throws IOException 
	{
		allInputValue = UtilityMethods.getTele2PropValues();
	}
	
	@Test
	public static void validateOperatorLogo()
	{
		WebElement operatorLogo = driver.findElement(By.xpath("//img[@alt='Tele2']"));
		UtilityMethods.DisplayEnableValidator(operatorLogo, "NotEqual","Tele2 Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(operatorLogo,"src",allInputValue.getProperty("tele2Logo"),"Tele2 Operator Logo");		
	} 
	@Test(priority=1)
	public static void validateCompanyLogo()
	{
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));
		UtilityMethods.DisplayEnableValidator(companyLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(companyLogo,"src",allInputValue.getProperty("tele2CompanyLogo"),"Cisco Jasper Company Logo");		
	}
	public static void HearTextvalidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//section[@id='hero-wrp']//h2")).getText(), allInputValue.getProperty("HomePage.Bannerh2"), "equalsignorecase");

	}
	
}
