package pages;

import java.util.Properties;
import java.io.IOException;

import org.testng.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class Tele2HomePage extends BaseDriver {
	public static FirefoxDriver driver = launchApp();
	static Properties allInputValue;
@BeforeTest
	public static void Start() throws IOException
	{
		System.out.println("done");
		allInputValue = UtilityMethods.getTele2PropValues();
	}
@Test
	public static void headearValidation() 
	{
		validateOperatorLogo();
		validateCompanyLogo();
		//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//img[@alt='Bell']")), driver.findElement(By.xpath("//img[@title='What is IoT']")));
		System.out.println("Header Section is Completed");
	}
	@Test
	public static void validateOperatorLogo()
	{
		WebElement operatorLogo = driver.findElement(By.xpath("//img[@alt='Te2']"));
		UtilityMethods.DisplayEnableValidator(operatorLogo, "NotEqual","Tele2 Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(operatorLogo,"src",allInputValue.getProperty("tele2Logo"),"Tele2 Operator Logo");	
	} 
	@Test
	public static void validateCompanyLogo()
	{
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));
		UtilityMethods.DisplayEnableValidator(companyLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(companyLogo,"src",allInputValue.getProperty("tele2CompanyLogo"),"Cisco Jasper Company Logo");	
	}
	@Test
	public static void sectionOne()
	{
		sectionOneIotStarterKitTele2Validation();
		
	}
	@Test
	public static void sectionOneIotStarterKitTele2Validation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//section[@id='hero-wrp']//h1")).getText().replace("\n", " "), allInputValue.getProperty("tele2Bannerh1"), "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//section[@id='hero-wrp']//h2")).getText(), allInputValue.getProperty("tele2Bannerh2"), "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElements(By.xpath("//div[@class='pb5 br-none-md clr-white']//p")).get(0).getText().replace("\n", " "),allInputValue.getProperty("tele2Bannerp1"), "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='pb5 br-none-md clr-white']//p[@class='pt10']")).getText(), allInputValue.getProperty("tele2Bannerp2"), "equalsignorecase");
	}
	@AfterTest
	public static void Exit()
	{
		driver.close();
	}
	
}
