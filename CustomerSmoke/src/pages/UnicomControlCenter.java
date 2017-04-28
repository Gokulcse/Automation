package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.UnicomControlCenrterPO;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class UnicomControlCenter  extends BaseDriver
{
	public static WebDriver driver;
	static Properties allInputValue;
	
	//@BeforeTest
	public static WebDriver start() throws Exception
	{	 
		driver = launchApp(EmailIntegration.ccURL());
		allInputValue = UtilityMethods.getUnicomPropValues();
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		return driver;
	}
	
	//@Test(priority=1)
	public static void CCDisplayedAndEnabledValidation()
	{
		PageFactory.initElements(driver, UnicomControlCenrterPO.class);	
		UtilityMethods.DisplayEnableValidator(UnicomControlCenrterPO.UserNameInput, "NotEqual", "Control Center user name input Field");
		UtilityMethods.DisplayEnableValidator(UnicomControlCenrterPO.PasswordInput, "NotEqual", "Control Center Password input Field");
		UtilityMethods.DisplayEnableValidator(UnicomControlCenrterPO.ConfirmPasswordInput, "NotEqual", "Control Center Confirm password input Field");
		UtilityMethods.DisplayEnableValidator(UnicomControlCenrterPO.CreateButton, "NotEqual", "Control Center Create link button");
		System.out.println("CC001");
		UtilityMethods.sleep(2000);
	}
	
	//@Test(priority=2)
	public static void CCContentValidation()
	{
		PageFactory.initElements(driver, UnicomControlCenrterPO.class);	
		UtilityMethods.StringValidation(UnicomControlCenrterPO.UserNameLabel.getText(), "Username", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomControlCenrterPO.PasswordLabel.getText(), "Password", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomControlCenrterPO.ConfrimPasswordlabel.getText(), "Confirm Password", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomControlCenrterPO.Header1.getText(), "Create Your Control Center Account", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomControlCenrterPO.Para1.getText().replace("\n", " "),"To order a kit you must first create an account. This account will give you access to the tools to develop, test, deploy and manage your device.", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomControlCenrterPO.UserNamePara.getText(), "6-25 letters and/or numbers, no spaces", "equalsignorecase");
		UtilityMethods.StringValidation(UnicomControlCenrterPO.PasswordPara.getText(), "Include at least 8 characters with at least two numbers and one upper case letter.", "equalsignorecase");
		System.out.println("CC002");
		UtilityMethods.sleep(2000);
	}
	
	//@Test(priority=3)
	public static void CCPlaceHolderValidation()
	{
		PageFactory.initElements(driver, UnicomControlCenrterPO.class);	
		UtilityMethods.PlaceholderValidation(UnicomControlCenrterPO.UserNameInput, "Create a username", "User Name Input Field");
		UtilityMethods.PlaceholderValidation(UnicomControlCenrterPO.PasswordInput, "Create a password", "password Input Field");
		UtilityMethods.PlaceholderValidation(UnicomControlCenrterPO.ConfirmPasswordInput, "", "Confirm password Input Field");
		System.out.println("CC003");
		UtilityMethods.sleep(4000);
	}
	
	//@Test(priority=4)
	public static void CCRequiredFieldValidation()
	{
		PageFactory.initElements(driver, UnicomControlCenrterPO.class);	
		UtilityMethods.sleep(3000);
		UnicomControlCenrterPO.CreateButton.click();
		UtilityMethods.sleep(3000);
 		BrowserForUse=allInputValue.getProperty("Broswer");
 		if(BrowserForUse.equals("IE"))
 		{
 			UnicomControlCenrterPO.CreateButton.click();
 			UtilityMethods.sleep(3000);
 		}
		UtilityMethods.ControlCenterRequiredFieldValidation(UnicomControlCenrterPO.UserNameInput,UnicomControlCenrterPO.UserNameError, "Username.");
		UtilityMethods.sleep(2000);
		UtilityMethods.ControlCenterRequiredFieldValidation(UnicomControlCenrterPO.PasswordInput, UnicomControlCenrterPO.PasswordError, "Password");
		System.out.println("CC004");
		UtilityMethods.sleep(2000);
	}
	
	//@Test(priority=5)
	public static void CCUserNameMinMaxValidation()
	{
		PageFactory.initElements(driver, UnicomControlCenrterPO.class);
		UtilityMethods.sleep(3000);
		UnicomControlCenrterPO.CreateButton.click();
		UtilityMethods.sleep(3000);
		UtilityMethods.MinimumInputValidation(UnicomControlCenrterPO.UserNameInput, UnicomControlCenrterPO.UserNameError,6, "a,ab,abc,abcd,abcde,1,12,123,1234,12345");
		UtilityMethods.sleep(3000);
		UtilityMethods.MaximumInputValidation(UnicomControlCenrterPO.UserNameInput, UnicomControlCenrterPO.UserNameError,25, "abcdefghijklmnopqrsturwxyz,ababcdefghijklmnopqrsturwxyz,abcabcdefghijklmnopqrsturwxyz,01234567890123456789012345,012345678901234567890123456,0123456789012345678901234567");
		System.out.println("CC005");
		UtilityMethods.sleep(3000);
	}
	
	//@Test(priority=6)
	public static void CCPasswordValidation()
	{
		PageFactory.initElements(driver, UnicomControlCenrterPO.class);	
		UnicomControlCenrterPO.CreateButton.click();
		UtilityMethods.ControlCenterPasswordValidation(UnicomControlCenrterPO.PasswordInput,UnicomControlCenrterPO.PasswordError,"a,123,   ,acd123,Abc123,ABCDabcd,!@#$$123@$");
		UtilityMethods.CCPasswordAndConfirmPasswordValidation(UnicomControlCenrterPO.PasswordInput, UnicomControlCenrterPO.ConfirmPasswordInput, UnicomControlCenrterPO.PasswordError, UnicomControlCenrterPO.ConfirmPasswordError, "Test123Adbc,TEst123!@#$ABC");
		UtilityMethods.CCConfirmPasswordValidation(UnicomControlCenrterPO.PasswordInput, UnicomControlCenrterPO.ConfirmPasswordInput,UnicomControlCenrterPO.ConfirmPasswordError, "Test123Adbc,TEst123!@#$ABC");	
		System.out.println("CC006");
		UtilityMethods.sleep(2000);
	}
	
	//@Test(priority=7)
	public static void InputValidation()
	{
		PageFactory.initElements(driver, UnicomControlCenrterPO.class);
		UtilityMethods.SendInputValues(UnicomControlCenrterPO.UserNameInput, allInputValue.getProperty("ccUserName")+UtilityMethods.GenerateRandomNum(3), "TextBox");
		UtilityMethods.SendInputValues(UnicomControlCenrterPO.PasswordInput, allInputValue.getProperty("ccPassword"), "TextBox");
		UtilityMethods.SendInputValues(UnicomControlCenrterPO.ConfirmPasswordInput, allInputValue.getProperty("ccConfirmPassword"), "TextBox");
		UnicomControlCenrterPO.CreateButton.click();
		UtilityMethods.sleep(5000);
		System.out.println("CC007");
		
	}

}
