package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilitymethods.*;
public class AdminOperation 
{
	static Properties allInputValue;
	public static	String BrowserForUse;
	public static WebDriver driver;	
	//@Test(priority=1)
	public static void AdminApproval() throws InterruptedException
	{
		try {allInputValue=UtilityMethods.getBellPropValues();} catch (IOException e) {e.printStackTrace();}
		BrowserForUse=allInputValue.getProperty("Broswer");
		if (BrowserForUse.equals("FireFox"))
		{
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
			driver = new FirefoxDriver();
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
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Default browser is Mozilla FireFox is launched");
		}
		driver.get("http://starterkit-dev.devm2m.com/admin/internal/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("venkatesh.s");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='blpr-menu blpr-dsk-menu']//span[text()='Referrals']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='approve0']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='aprCode']//button[@type='submit']")).click();
		driver.close();
		System.out.println("Referral request Approved");
	}
	
	//@BeforeTest
	public static void AdminOrderFulfill() throws InterruptedException
	{
		try {allInputValue=UtilityMethods.getBellPropValues();} catch (IOException e) {e.printStackTrace();}
		BrowserForUse=allInputValue.getProperty("Broswer");
		if (BrowserForUse.equals("FireFox"))
		{
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
			driver = new FirefoxDriver();
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
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Default browser is Mozilla FireFox is launched");
		}
		driver.get("http://starterkit-dev.devm2m.com/admin/internal/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("venkatesh.s");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='blpr-menu blpr-dsk-menu']//span[text()='Orders']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='order0']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='tracking_no']")).sendKeys(UtilityMethods.GenerateRandomAlphaNumeric(8));
		driver.findElement(By.xpath("//input[@name='delivery_date']")).sendKeys("2017/10/10");
		driver.findElement(By.xpath("//button[@id='create_fulfill']")).click();
		driver.close();
		System.out.println("Order Fulfilled");
	}

}
