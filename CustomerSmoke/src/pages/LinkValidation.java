package pages;


import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobjects.BellHomePagePO;
import utilitymethods.UtilityMethods;

public class LinkValidation {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://chinaun9c0nd.devm2m.com/?clLocaleCode=en"); 
		System.out.println(""+driver.getTitle());
		String temp =driver.findElement(By.tagName("body")).getText();
		
		try
		{
		PrintWriter writer = new PrintWriter("China_Unicom_English.doc", "UTF-8");
		writer.println(temp);
		writer.close();
		} 
	catch (IOException e) {}
		   System.out.println(""+temp);
		
		/*
		System.out.println(""+GenerateRandomNum(5)+"");
		System.out.println(""+GenerateRandomString(5)+"");
		System.out.println(""+GenerateRandomAlphaNumeric(10)+"");*/
		/*System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://bell.devm2m.com/");
		Thread.sleep(5000);
		PageFactory.initElements(driver, BellHomePagePO.class);	
		LinkValidation.PageNavigationValidation(BellHomePagePO.M2MDotCom, BellHomePagePO.M2MDotComFindElement,"M2M Developer Kits from the World�s Leading Mobile Operators");		
		*/
		
		
		
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
		/*
		
		
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
	public static String GenerateRandomNum(int length)
	{
		String alphabet =  new String("0123456789"); 
		int n = alphabet.length(); 
		String result = new String(); 
		Random r = new Random(); 
		for (int i=0; i<length; i++) 
		result = result + alphabet.charAt(r.nextInt(n));
		return result;
	}
	
	public static String GenerateRandomString(int length)
	{
		String alphabet = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
		int n = alphabet.length(); 
		String result = new String(); 
		Random r = new Random(); 
		for (int i=0; i<length; i++) 
		result = result + alphabet.charAt(r.nextInt(n));
		return result;
	}
	
	public static String GenerateRandomAlphaNumeric(int length){
		String alphabet =new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
		int n = alphabet.length();
		String result = new String(); 
		Random r = new Random();
		for (int i=0; i<length; i++) 
		result = result + alphabet.charAt(r.nextInt(n));
		return result;
		}
	
	public static void PageNavigationValidation(WebElement linkbutton,WebElement targetElement, String PageTitile) throws InterruptedException 
	{
		System.out.println("The Link button xpath is :"+linkbutton+"");
		System.out.println("The Find button xpath is :"+targetElement+"");

		String parentHandle="";
		linkbutton.click();
		System.out.println("link button clicked");
		Thread.sleep(3000);
		parentHandle = driver.getWindowHandle();
		try {
		    for(String winHandle : driver.getWindowHandles())
		    {
		        driver.switchTo().window(winHandle);
		        System.out.println("" +driver.getTitle());
		       
		        if (driver.getTitle().equals(PageTitile))
			    {
		        	if(!targetElement.isDisplayed())
		        	{
		        		System.out.println("Page Rredirection Failed for"+linkbutton.getText()+"");
		        		//Assert.assertEquals(true, FindElement.isDisplayed());
		        	}
			    }
		       /* else
		        {
		        	 System.out.println("" +driver.getTitle());
		        	//Assert.assertEquals(driver.getTitle(), PageTitile);
		        }*/
		    }
		   // driver.navigate().back();
		   driver.switchTo().window(parentHandle);
			
		    }
		catch(Exception e)
		{
		   System.out.println("Condition fail");
		}	
	}

}
