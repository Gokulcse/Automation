package pages;

import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import pageobjects.BellControlCenterPO;
import driver.BaseDriver;
import utilitymethods.UtilityMethods;

public class BellControlCenter extends BaseDriver
{
	public static FirefoxDriver driver;
	static Properties allInputValue;
	
	
	/*public static void start() throws Exception
	{	 
		driver = launchApp();
		allInputValue = UtilityMethods.getBellPropValues();	
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		PageFactory.initElements(driver, BellControlCenterPO.class);	
	}*/
	@BeforeTest
	public static FirefoxDriver start() throws Exception
	{	 
		driver = launchApp();
		allInputValue = UtilityMethods.getBellPropValues();
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		//return driver;
		return driver;
	}
	//@Test(priority=1)
	public static void CCDisplayedAndEnabledValidation()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);	
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.UserNameInput, "NotEqual", "Control Center user name input Field");
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.PasswordInput, "NotEqual", "Control Center Password input Field");
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.ConfirmPasswordInput, "NotEqual", "Control Center Confirm password input Field");
		UtilityMethods.DisplayEnableValidator(BellControlCenterPO.CreateButton, "NotEqual", "Control Center Create link button");
		//UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//button")), "NotEqual", "Control Center Close icon");
		System.out.println("TS001");
	}
	
	//@Test(priority=2)
	public static void CCContentValidation()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);	
		UtilityMethods.StringValidation(BellControlCenterPO.UserNameLabel.getText(), "Username", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.PasswordLabel.getText(), "Password", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.ConfrimPasswordlabel.getText(), "Confirm Password", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.Header1.getText(), "Create Your Control Center Account", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.Para1.getText().replace("\n", " "),"To order a kit you must first create an account. This account will give you access to the tools to develop, test, deploy and manage your device.", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.UserNamePara.getText(), "6-25 letters and/or numbers, no spaces", "equalsignorecase");
		UtilityMethods.StringValidation(BellControlCenterPO.PasswordPara.getText(), "Include at least 8 characters with at least two numbers and one upper case letter.", "equalsignorecase");
		System.out.println("TS002");
	}
	
	//@Test(priority=3)
	public static void CCPlaceHolderValidation()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);	
		UtilityMethods.PlaceholderValidation(BellControlCenterPO.UserNameInput, "Create a username", "User Name Input Field");
		UtilityMethods.PlaceholderValidation(BellControlCenterPO.PasswordInput, "Create a password", "password Input Field");
		UtilityMethods.PlaceholderValidation(BellControlCenterPO.ConfirmPasswordInput, "", "Confirm password Input Field");
		System.out.println("TS003");
	}
	
	//@Test(priority=4)
	public static void CCRequiredFieldValidation()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);	
		BellControlCenterPO.CreateButton.click();
		UtilityMethods.ControlCenterRequiredFieldValidation(BellControlCenterPO.UserNameInput,BellControlCenterPO.UserNameError, "Username.");
		UtilityMethods.ControlCenterRequiredFieldValidation(BellControlCenterPO.PasswordInput, BellControlCenterPO.PasswordError, "Password");
		UtilityMethods.ControlCenterRequiredFieldValidation(BellControlCenterPO.ConfirmPasswordInput,BellControlCenterPO.ConfirmPasswordError, "Confirm Password");		
		System.out.println("TS004");
	}
	
	//@Test(priority=5)
	public static void CCUserNameMinMaxValidation()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);	
		BellControlCenterPO.CreateButton.click();
		UtilityMethods.MinimumInputValidation(BellControlCenterPO.UserNameInput, BellControlCenterPO.UserNameError,6, "a,ab,abc,abcd,abcde,1,12,123,1234,12345");
		UtilityMethods.MaximumInputValidation(BellControlCenterPO.UserNameInput, BellControlCenterPO.UserNameError,25, "abcdefghijklmnopqrsturwxyz,ababcdefghijklmnopqrsturwxyz,abcabcdefghijklmnopqrsturwxyz,01234567890123456789012345,012345678901234567890123456,0123456789012345678901234567");
		System.out.println("TS005");
	}
	
	//@Test(priority=6)
	public static void CCPasswordValidation()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);	
		BellControlCenterPO.CreateButton.click();
		UtilityMethods.ControlCenterPasswordValidation(BellControlCenterPO.PasswordInput,BellControlCenterPO.PasswordError,"a,123,   ,acd123,Abc123,ABCDabcd,!@#$$123@$");
		UtilityMethods.CCPasswordAndConfirmPasswordValidation(BellControlCenterPO.PasswordInput, BellControlCenterPO.ConfirmPasswordInput, BellControlCenterPO.PasswordError, BellControlCenterPO.ConfirmPasswordError, "Test123Adbc,TEst123!@#$ABC");
		UtilityMethods.CCConfirmPasswordValidation(BellControlCenterPO.PasswordInput, BellControlCenterPO.ConfirmPasswordInput,BellControlCenterPO.ConfirmPasswordError, "Test123Adbc,TEst123!@#$ABC");	
		System.out.println("TS006");
	}
	
	//@Test(priority=7)
	public static void InputValidation()
	{
		PageFactory.initElements(driver, BellControlCenterPO.class);
		UtilityMethods.SendInputValues(BellControlCenterPO.UserNameInput, allInputValue.getProperty("ccUserName"), "TextBox");
		UtilityMethods.SendInputValues(BellControlCenterPO.PasswordInput, allInputValue.getProperty("ccPassword"), "TextBox");
		UtilityMethods.SendInputValues(BellControlCenterPO.ConfirmPasswordInput, allInputValue.getProperty("ccConfirmPassword"), "TextBox");
		BellControlCenterPO.CreateButton.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("TS007");
	}

}
