package pages;

import java.io.IOException;
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
	public static FirefoxDriver driver = launchApp();
	static Properties allInputValue;
	
	@BeforeTest
	public static void Start() throws IOException 
	{
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

}
