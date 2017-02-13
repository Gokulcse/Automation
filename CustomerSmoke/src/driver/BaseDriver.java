package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;






import org.openqa.selenium.support.PageFactory;

import pageobjects.PostReferralRequestPO;
import utilitymethods.UtilityMethods;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseDriver {
	public static ExtentReports extent;
	public static ExtentTest testcase;
	
	public static FirefoxDriver driver;
	
	
	public static FirefoxDriver launchApp() 
	{	
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://postdevfortesting.devm2m.com/form/referral/request");
		/*PageFactory.initElements(driver, PostReferralRequestPO.class);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Testing");
		
		UtilityMethods.SendInputValues(PostReferralRequestPO.FirstNameInput, "Test", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.LastNameInput, "Data 1", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.CompanyNameInput, "CTELA TESTING", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.PositionRoleInput, "ELP", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.PhoneNumberInput, "8220119412", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.EmailInput, "automation1@yopmail.com", "TextBox");
		UtilityMethods.SendInputValues(PostReferralRequestPO.ModuleInput, "Test Entry", "TextBox");*/
		
		return driver;
	}

}
