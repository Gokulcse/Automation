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
		   
		
		 
		     private WebDriver driver;
		     private String baseUrl;
		     private boolean acceptNextAlert = true;
		     private StringBuffer verificationErrors = new StringBuffer();

		     @BeforeClass(alwaysRun = true)
		     public void setUp() throws Exception {
		       driver = new FirefoxDriver();
		       baseUrl = "http://bell.devm2m.com/";
		       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     }

		     @Test
		     public void testTrstNG() throws Exception {
		       driver.get(baseUrl + "/");
		       driver.findElement(By.cssSelector("img[alt=\"Bell\"]")).click();
		       driver.findElement(By.cssSelector("em.ion-chevron-down")).click();
		       driver.findElement(By.cssSelector("em.ion-chevron-down")).click();
		       driver.findElement(By.cssSelector("img[alt=\"Cisco Jasper\"]")).click();
		       driver.findElement(By.xpath("//section[@id='hero-wrp']/div/div[2]/div[3]/div/div/a/button")).click();
		       driver.findElement(By.xpath("(//a[contains(text(),'Track Order')])[2]")).click();
		       driver.findElement(By.linkText("Track Order")).click();
		       driver.findElement(By.cssSelector("div.bl-ref-inpt-grp.bl-email > div.bl-ref-inpt-frm.text-left > span.bl-close.ion-android-close")).click();
		       driver.findElement(By.linkText("Enter Referral Code")).click();
		       driver.findElement(By.linkText("Order Kit")).click();
		       driver.findElement(By.cssSelector("span.bl-close.ion-android-close")).click();
		       driver.findElement(By.linkText("What the Kit Includes")).click();
		       driver.findElement(By.linkText("How it Works")).click();
		       driver.findElement(By.linkText("IoT from Bell")).click();
		       driver.findElement(By.linkText("How it Works")).click();
		       driver.findElement(By.linkText("What the Kit Includes")).click();
		       driver.findElement(By.xpath("//a[contains(text(),'Request Referral Code')]")).click();
		       driver.findElement(By.linkText("Learn more from your Bell representative.")).click();
		       driver.findElement(By.linkText("M2M.com")).click();
		     }

		     @AfterClass(alwaysRun = true)
		     public void tearDown() throws Exception {
		       driver.quit();
		       String verificationErrorString = verificationErrors.toString();
		       if (!"".equals(verificationErrorString)) {
		         fail(verificationErrorString);
		       }
		     }

		     private boolean isElementPresent(By by) {
		       try {
		         driver.findElement(by);
		         return true;
		       } catch (NoSuchElementException e) {
		         return false;
		       }
		     }

		     private boolean isAlertPresent() {
		       try {
		         driver.switchTo().alert();
		         return true;
		       } catch (NoAlertPresentException e) {
		         return false;
		       }
		     }

		     private String closeAlertAndGetItsText() {
		       try {
		         Alert alert = driver.switchTo().alert();
		         String alertText = alert.getText();
		         if (acceptNextAlert) {
		           alert.accept();
		         } else {
		           alert.dismiss();
		         }
		         return alertText;
		       } finally {
		         acceptNextAlert = true;
		       }
		     }
		   

		   
		   

	

}
