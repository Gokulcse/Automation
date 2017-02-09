package pages;


import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPage {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
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
		driver.findElement(By.xpath(".//*[@id='mailmillieu']//a[@rel='nofollow']")).click();
		
		
		
		
		/*PageFactory.initElements(driver, Tele2ReferralRequestpagePO.class);
		UtilityMethods.PageNavigationValidation(Tele2ReferralRequestpagePO.M2MDotCom,Tele2ReferralRequestpagePO.selectKit,""); 
		*/
		
		
		
	}

}
