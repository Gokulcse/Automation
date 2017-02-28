package pages;


import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
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

public class TestPage {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?");
		Thread.sleep(3500);
		
		driver.findElement(By.id("Email")).sendKeys("automateselenium1");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("Automation@Selenium");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3500);

		List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));
		String MyMailer = "orders";
		for(int i=0;i<unreademeil.size();i++){
		    if(unreademeil.get(i).isDisplayed()==true){
		        if(unreademeil.get(i).getText().equals(MyMailer)){
		            System.out.println("Yes we have got mail form " + MyMailer);
		            break;
		        }else{
		            System.out.println("No mail form " + MyMailer);
		        }
		    }
		}
		
		
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
