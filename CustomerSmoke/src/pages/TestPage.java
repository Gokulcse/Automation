package pages;


import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import utilitymethods.UtilityMethods;

public class TestPage {

	 public void LaunchChrome_Method1()
	    {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\libs\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-infobars");
	        
	        WebDriver driver = new ChromeDriver(options);
	        driver.get("https://www.facebook.com/");
	    }

	public static void main(String[] args) throws InterruptedException
	{
		TestPage test = new TestPage();
		test.LaunchChrome_Method1();
	/*	System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://chinaun9c0nd.devm2m.com/");
		System.out.println(""+driver.getTitle());
		String temp =driver.findElement(By.tagName("body")).getText();
		try
		{
			PrintWriter writer = new PrintWriter("China UnicomPublicSite.doc", "UTF-8");
			writer.println(temp);
			writer.close();
		} 
		catch (IOException e) {}
		System.out.println(""+temp);*/
		/*UtilityMethods.sleep(5000);
		driver.findElement(By.id("Email")).sendKeys("automateselenium1");
		driver.findElement(By.id("next")).click();
		UtilityMethods.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("Automation@Selenium");
		driver.findElement(By.id("signIn")).click();
		UtilityMethods.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		UtilityMethods.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='gb23']/span[text()='Gmail']")).click();
		UtilityMethods.sleep(20000);
		System.out.println("INBOX Opened");
		List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));
		String MyMailer = "orders";
		for(int i=0;i<unreademeil.size();i++)
		{
		    if(unreademeil.get(i).isDisplayed()==true)
		    {
		        if(unreademeil.get(i).getText().equals(MyMailer))
		        {
		            System.out.println("Yes we have got mail form " + MyMailer);
		        }
		        else
		        {
		            System.out.println("No mail form " + MyMailer);
		        }
		    }
		}*/
		/*System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?");
		Thread.sleep(3500);
		driver.findElement(By.id("Email")).sendKeys("automateselenium1");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3500);
		driver.findElement(By.id("Passwd")).sendKeys("Automation@Selenium");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath(".//*[@id='gb23']/span[text()='Gmail']")).click();
		Thread.sleep(20000);
		System.out.println("Mail Opened");
		System.out.println("Order Mail is displayed :: "+driver.findElement(By.xpath("//div[@class='UI']")).isDisplayed()+"");
		System.out.println("Order Mail is Enabled   :: "+driver.findElement(By.xpath("//div[@class='UI']")).isEnabled()+"");
		driver.findElement(By.xpath("//div[@class='UI']")).click();
		Thread.sleep(5000);
		System.out.println("sub Mail is displayed :: "+driver.findElement(By.xpath("//a[text()='http://bell.m2m.com ']")).isDisplayed()+"");
		System.out.println("sub Mail is Enabled   :: "+driver.findElement(By.xpath("//a[text()='http://bell.m2m.com ']")).isEnabled()+"");
		String CCURL = driver.findElement(By.xpath("//a[text()='http://bell.m2m.com ']")).getAttribute("href");
		System.out.println("Control Center URL ::"+CCURL+"");		
	*/	
		//div[@role='presentation']
		/*Thread.sleep(20000);
		System.out.println("Delete all check box is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isDisplayed()+"");
		System.out.println("Delete all check box is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isEnabled()+"");
		driver.findElement(By.xpath("//div[@aria-label='Select']")).click();
		Thread.sleep(5000);
		System.out.println("Check box selected");
		//div[@aria-label='Delete']
		System.out.println("Delete button is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isDisplayed()+"");
		System.out.println("Delete button is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isEnabled()+"");
		driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();
		Thread.sleep(5000);
		System.out.println("Delete Button Clicked");
		*/
		/*
		List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));
		List<WebElement> unreademeilText = driver.findElements(By.xpath("//div[@class='afn']/b"));
		String MyMailer = "orders";
		String MyMailerHeader = "Your referral code to order a Bell IoT Starter Kit";
		
		
		if(unreademeil.get(13).isDisplayed()==true)
		    {
		        if(unreademeil.get(13).getText().equals(MyMailer))
		        {
		        	if()
		        	System.out.println("The text is : "+unreademeilText.get(13).getText()+"");
		            System.out.println("Yes we have got mail form " + MyMailer);
		            unreademeil.get(11).click();
		            Thread.sleep(5000);
		            {
		            	System.out.println("Mail Opened");
		            }
		        }
		        else
		        {
		            System.out.println("No mail form " + MyMailer);
		        }
		    }*/
		/*driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("automation1");
		driver.findElement(By.xpath("//input[@value='Check Inbox']")).click();
		Thread.sleep(3500);
		
		
		//driver.findElement(By.xpath("//a[@id='lrefr']/span")).click();
		//Thread.sleep(3500);
		driver.findElement(By.xpath(".//*[@id='m1']//a[@class='lm']")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath(".//*[@id='mailmillieu']//a[@rel='nofollow']")).click();
		Thread.sleep(3500);
*/
		/*System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://starterkit-dev.devm2m.com/"); 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("venkatesh.s");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);

		System.out.println(""+driver.getTitle());
String temp =driver.findElement(By.tagName("body")).getText();
		
		try
		{
		PrintWriter writer = new PrintWriter("AdminDashBoard.doc", "UTF-8");
		writer.println(temp);
		writer.close();
		} 
	catch (IOException e) {}
		   System.out.println(""+temp);
		*/
		
		/* String parentHandle = driver.getWindowHandle();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("automation1");
		driver.findElement(By.xpath("//input[@value='Check Inbox']")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath(".//*[@id='m1']//span[contains(.,'Your referral code to order a Post IoT M2M Developer Kit')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(".//*[@id='mailmillieu']//a[@rel='nofollow']")).click();		/*PageFactory.initElements(driver, Tele2ReferralRequestpagePO.class);
		UtilityMethods.PageNavigationValidation(Tele2ReferralRequestpagePO.M2MDotCom,Tele2ReferralRequestpagePO.selectKit,""); 
		*/
		   
		
		 
	
		   

		   
	}	   

	

}
