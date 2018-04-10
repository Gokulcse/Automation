package pages;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import driver.BaseDriver;
import utilitymethods.UtilityMethods;

public class PostContolCenter extends BaseDriver
{
	public static WebDriver driver;
	static Properties allInputValue;
	
	public static WebDriver start() throws Exception
	{	 
		driver = launchApp(EmailIntegration.ccURL());
		allInputValue = UtilityMethods.getBellPropValues();
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		return driver;
	}
	public static void ControlCenterAccountCreation()
	{
		CCDisplayedAndEnabledValidation();		
		CCTextValidation();
		CCErrorValidation();
	}
	public static void CCDisplayedAndEnabledValidation()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='uname']")), "NotEqual", "Control Center user name input Field");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='psswrd']")), "NotEqual", "Control Center Password input Field");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='cpsswrd']")), "NotEqual", "Control Center Confirm password input Field");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='create_cc']")), "NotEqual", "Control Center Create link button");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//button")), "NotEqual", "Control Center Close icon");
	}
	public static void CCTextValidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//label[@for='uname']")).getText(), "Username *", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//label[@for='psswrd']")).getText(), "Password *", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//label[@for='cpsswrd']")).getText(), "Confirm Password *", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@id='ctrlAcc']//h2")).getText(), "Create Your Control Center Account", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='text-center f16']//p")).getText().replace("\n", " "),"To order a kit you must first create an account. This account will give you access to the tools to develop, test, deploy and manage your device.", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='uname form-group']//p")).getText(), "6-25 letters and/or numbers, no spaces", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//div[@class='pword form-group']//p")).getText(), "Include at least 8 characters with at least two numbers and one upper case letter.", "equalsignorecase");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='uname']")), "Create a username", "User Name Input Field");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='psswrd']")), "Create a password", "password Input Field");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='cpsswrd']")), "", "Confirm password Input Field");

	}
	public static void CCErrorValidation()
	{
		driver.findElement(By.xpath("//input[@id='create_cc']")).click();
		UtilityMethods.ControlCenterRequiredFieldValidation(driver.findElement(By.xpath("//input[@id='uname']")), driver.findElement(By.xpath("//div[@id='uname-error']")), "Username.");
		UtilityMethods.ControlCenterRequiredFieldValidation(driver.findElement(By.xpath("//input[@id='psswrd']")), driver.findElement(By.xpath("//div[@id='psswrd-error']")), "Password");
		UtilityMethods.ControlCenterRequiredFieldValidation(driver.findElement(By.xpath("//input[@id='cpsswrd']")), driver.findElement(By.xpath("//div[@id='cpsswrd-error']")), "Confirm Password");
		UtilityMethods.MinimumInputValidation(driver.findElement(By.xpath("//input[@id='uname']")), driver.findElement(By.xpath("//div[@id='uname-error']")),6, "a,ab,abc,abcd,abcde,1,12,123,1234,12345");
		UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@id='uname']")), driver.findElement(By.xpath("//div[@id='uname-error']")),25, "abcdefghijklmnopqrsturwxyz,ababcdefghijklmnopqrsturwxyz,abcabcdefghijklmnopqrsturwxyz,01234567890123456789012345,012345678901234567890123456,0123456789012345678901234567");
		UtilityMethods.ControlCenterPasswordValidation(driver.findElement(By.xpath("//input[@id='psswrd']")),driver.findElement(By.xpath("//div[@id='psswrd-error']")),"a,123,   ,acd123,Abc123,ABCDabcd,!@#$$123@$");
		UtilityMethods.CCPasswordAndConfirmPasswordValidation(driver.findElement(By.xpath("//input[@id='psswrd']")), driver.findElement(By.xpath("//input[@id='cpsswrd']")), driver.findElement(By.xpath("//div[@id='psswrd-error']")), driver.findElement(By.xpath("//div[@id='cpsswrd-error']")), "Test123Adbc,TEst123!@#$ABC");
		UtilityMethods.CCConfirmPasswordValidation(driver.findElement(By.xpath("//input[@id='psswrd']")), driver.findElement(By.xpath("//input[@id='cpsswrd']")), driver.findElement(By.xpath("//div[@id='cpsswrd-error']")), "Test123Adbc,TEst123!@#$ABC");	
	
	}
	
}
