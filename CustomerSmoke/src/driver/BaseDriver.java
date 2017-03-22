package driver;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseDriver {

	public static FirefoxDriver driver;
	
	//public static InternetExplorerDriver driver;
	
	
	//public static ChromeDriver driver;
	
	public static String downloadPath = "F:\\pdf";
	public static FirefoxDriver launchApp(String URL) throws IOException, Exception
	{	
		
		
	/*	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\libs\\IEDriverServer.exe");
		Thread.sleep(1000);
		driver = new InternetExplorerDriver();
	*/
	
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\libs\\chromedriver.exe");
		Thread.sleep(1000);
		driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		Thread.sleep(1000);
		driver = new FirefoxDriver(FirefoxDriverProfile());
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get(URL);
		
		//driver.get("http://skotni:dkt123@postdevfortesting.devm2m.com/");	 to be used if windows server authentication is used
	
		return driver;
	}
	 public static FirefoxProfile FirefoxDriverProfile() throws Exception 
	 {
		 FirefoxProfile profile = new FirefoxProfile();
		 profile.setPreference("browser.download.folderList", 2);
		 profile.setPreference("browser.download.dir", "F:\\pdf");
		 profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		 /*profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		 profile.setPreference("browser.download.manager.showWhenStarting",false);
		 profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		 profile.setPreference("pdfjs.disabled", false);*/ 
		 return profile;
	 }
}
