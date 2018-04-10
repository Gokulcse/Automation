package driver;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import utilitymethods.UtilityMethods;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseDriver {

	static Properties allInputValue;
	public static	String BrowserForUse;
	public static WebDriver driver;	
	public static String downloadPath = "F:\\pdf";
	public static  WebDriver launchApp(String URL) throws IOException, Exception
	{	
		try {allInputValue=UtilityMethods.getUnicomPropValues();} catch (IOException e) {e.printStackTrace();}
		BrowserForUse=allInputValue.getProperty("Broswer");
		if (BrowserForUse.equals("FireFox"))
		{
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
			driver = new FirefoxDriver(FirefoxDriverProfile());
			driver.manage().window().maximize();
			System.out.println("Mozilla FireFox browser launched");
		}
		else if (BrowserForUse.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\libs\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			System.out.println("Chrome browser launched");
		}
		else if (BrowserForUse.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\libs\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			System.out.println("Internet Explorer browser launched");
		}
		else
		{
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
			driver = new FirefoxDriver(FirefoxDriverProfile());
			driver.manage().window().maximize();
			System.out.println("Default browser is Mozilla FireFox is launched");
		}
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get(URL);
		Thread.sleep(3000);
		
		return driver;
		//driver.get("http://skotni:dkt123@postdevfortesting.devm2m.com/");	 to be used if windows server authentication is used
	}
	public static FirefoxProfile FirefoxDriverProfile() throws Exception 
	{
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "F:\\pdf");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		profile.setPreference("pdfjs.disabled", false);
		profile.setPreference("xpinstall.signatures.required", false);
		return profile;
	}
}
