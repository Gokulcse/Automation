package driver;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseDriver {

	public static FirefoxDriver driver;
	
	//public static InternetExplorerDriver driver;
	
	
	//public static ChromeDriver driver;
	
	public static String downloadPath = "F:\\pdf";
	public static FirefoxDriver launchApp() throws IOException, Exception
	{	
		
	/*	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\libs\\IEDriverServer.exe");
		Thread.sleep(1000);
		driver = new InternetExplorerDriver();
	
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\libs\\chromedriver.exe");
		Thread.sleep(1000);
		driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		Thread.sleep(1000);
		driver = new FirefoxDriver();
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://bell.devm2m.com/bell/home/NiTFUgY3");
		
		//driver.get("http://skotni:dkt123@postdevfortesting.devm2m.com/");	 to be used if windows server authentication is used
	
		return driver;
	}
	 public static FirefoxProfile FirefoxDriverProfile() throws Exception {
	        FirefoxProfile profile = new FirefoxProfile();
	        profile.setPreference("browser.download.folderList", 2);
	        profile.setPreference("browser.download.manager.showWhenStarting", false);
	        profile.setPreference("browser.download.dir", downloadPath);
	        profile.setPreference("browser.helperApps.neverAsk.openFile",
	                "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
	        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
	"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
	        profile.setPreference("browser.helperApps.alwaysAsk.force", false);
	        profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
	        profile.setPreference("browser.download.manager.focusWhenStarting", false);
	        profile.setPreference("browser.download.manager.useWindow", false);
	        profile.setPreference("browser.download.manager.showAlertOnComplete", false);
	        profile.setPreference("browser.download.manager.closeWhenDone", false);
	        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	            return profile;
	        }
}
