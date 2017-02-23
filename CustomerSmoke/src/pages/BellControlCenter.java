package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import pageobjects.BellControlCenterPO;
import pageobjects.BellReferralRequestThankYouPO;
import driver.BaseDriver;
import utilitymethods.UtilityMethods;

public class BellControlCenter extends BaseDriver
{
	public static FirefoxDriver driver;
	static Properties allInputValue;
	
	@BeforeTest
	public static void start() throws Exception
	{	 
		driver = launchApp();
		allInputValue = UtilityMethods.getBellPropValues();	
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		PageFactory.initElements(driver, BellControlCenterPO.class);	
	}
	
	public static void CCDisplayedAndEnabledValidation()
	{
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.UserNameInput, "NotEqual", "Control Center user name input Field");
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.PasswordInput, "NotEqual", "Control Center Password input Field");
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.ConfirmPasswordInput, "NotEqual", "Control Center Confirm password input Field");
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.CreateButton, "NotEqual", "Control Center Create link button");
		//UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//button")), "NotEqual", "Control Center Close icon");
	}
	
	public static void CCContentValidation()
	{
		UtilityMethods.StringValidation(BellControlCenterPO.UserNameLabel.getText(), "Username", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.PasswordLabel.getText(), "Password *", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.ConfrimPasswordlabel.getText(), "Confirm Password *", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.Header1.getText(), "Create Your Control Center Account", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.Para1.getText().replace("\n", " "),"To order a kit you must first create an account. This account will give you access to the tools to develop, test, deploy and manage your device.", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.UserNamePara.getText(), "6-25 letters and/or numbers, no spaces", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.PasswordPara.getText(), "Include at least 8 characters with at least two numbers and one upper case letter.", "equalsignorecase");
	
	}
	
	public static void CCPlaceHolderValidation()
	{
		UtilityMethods.PlaceholderValidation(BellControlCenterPO.UserNameInput, "Create a username", "User Name Input Field");
		UtilityMethods.PlaceholderValidation(BellControlCenterPO.PasswordInput, "Create a password", "password Input Field");
		UtilityMethods.PlaceholderValidation(BellControlCenterPO.ConfirmPasswordInput, "", "Confirm password Input Field");
	}
	
	public static void CCRequiredFieldValidation()
	{
		BellControlCenterPO.CreateButton.click();
		UtilityMethods.ControlCenterRequiredFieldValidation(BellControlCenterPO.UserNameInput,BellControlCenterPO.UserNameError, "Username.");
		UtilityMethods.ControlCenterRequiredFieldValidation(BellControlCenterPO.PasswordInput, BellControlCenterPO.PasswordError, "Password");
		UtilityMethods.ControlCenterRequiredFieldValidation(BellControlCenterPO.ConfirmPasswordError,BellControlCenterPO.ConfirmPasswordError, "Confirm Password");		
	}
	
	public static void CCUserNameMinMaxValidation()
	{
		BellControlCenterPO.CreateButton.click();
		UtilityMethods.MinimumInputValidation(BellControlCenterPO.UserNameInput, BellControlCenterPO.UserNameError,6, "a,ab,abc,abcd,abcde,1,12,123,1234,12345");
		UtilityMethods.MaximumInputValidation(BellControlCenterPO.UserNameInput, BellControlCenterPO.UserNameError,25, "abcdefghijklmnopqrsturwxyz,ababcdefghijklmnopqrsturwxyz,abcabcdefghijklmnopqrsturwxyz,01234567890123456789012345,012345678901234567890123456,0123456789012345678901234567");
	}
	
	
	public static void CCPasswordValidation()
	{
		BellControlCenterPO.CreateButton.click();
		UtilityMethods.ControlCenterPasswordValidation(BellControlCenterPO.PasswordInput,BellControlCenterPO.PasswordError,"a,123,   ,acd123,Abc123,ABCDabcd,!@#$$123@$");
		UtilityMethods.CCPasswordAndConfirmPasswordValidation(BellControlCenterPO.PasswordInput, BellControlCenterPO.ConfirmPasswordInput, BellControlCenterPO.PasswordError, BellControlCenterPO.ConfirmPasswordError, "Test123Adbc,TEst123!@#$ABC");
		UtilityMethods.CCConfirmPasswordValidation(BellControlCenterPO.PasswordInput, BellControlCenterPO.ConfirmPasswordInput,BellControlCenterPO.ConfirmPasswordError, "Test123Adbc,TEst123!@#$ABC");	
	}

}
