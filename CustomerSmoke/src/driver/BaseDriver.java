package driver;

import java.io.IOException;

import javafx.scene.control.Alert;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.PostReferralRequestPO;
import utilitymethods.UtilityMethods;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseDriver {
	public static ExtentReports extent;
	public static ExtentTest testcase;
	
	public static FirefoxDriver driver;
	
	//public static InternetExplorerDriver driver;
	
	
	//public static ChromeDriver driver;
	
	public static FirefoxDriver launchApp() throws IOException, Exception
	{	
		
		/*System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\libs\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();*/
		
	/*	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\libs\\chromedriver.exe");
		driver = new ChromeDriver();*/
		
		
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		Thread.sleep(1000);
		driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://bell.devm2m.com/form/referral/request");
		
		//driver.get("http://skotni:dkt123@postdevfortesting.devm2m.com/");	 to be used if windows server authentication is used
	
		return driver;
	}

}
