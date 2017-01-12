package driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import pageobjects.Tele2HomePagePO;
import utilitymethods.UtilityMethods;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseDriver {
	public static ExtentReports extent;
	public static ExtentTest testcase;
	
	public static FirefoxDriver driver;
	
	
	public static FirefoxDriver launchApp() 
	{	
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://tele2.devm2m.com/");
		return driver;
	}

}
