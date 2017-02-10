package driver;

import org.openqa.selenium.firefox.FirefoxDriver;


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
		driver.get("http://post.devm2m.com/form/referral/request");
		return driver;
	}

}
