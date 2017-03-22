package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilitymethods.UtilityMethods;

public class EmailIntegration 

{

public static void DeleteAllEmail()
{
	System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/ServiceLogin?");
	 UtilityMethods.sleep(5000);
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
	System.out.println("Mail Opened");
	//div[@role='presentation']
	 UtilityMethods.sleep(20000);
	System.out.println("Delete all check box is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isDisplayed()+"");
	System.out.println("Delete all check box is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isEnabled()+"");
	driver.findElement(By.xpath("//div[@aria-label='Select']")).click();
	 UtilityMethods.sleep(20000);
	System.out.println("Check box selected");
	//div[@aria-label='Delete']
	System.out.println("Delete button is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isDisplayed()+"");
	System.out.println("Delete button is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isEnabled()+"");
	driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();
	 UtilityMethods.sleep(20000);
	System.out.println("Delete Button Clicked");
	System.out.println("Delete All Inbox Emails");
	driver.close();
}

public static void CheckEmailReceived()
{
	System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/ServiceLogin?");
	UtilityMethods.sleep(5000);
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
	}
	driver.close();
}



public static String ccURL() 
{
	System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/ServiceLogin?");
	UtilityMethods.sleep(5000);
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
	System.out.println("Order Mail is displayed :: "+driver.findElement(By.xpath("//div[@class='UI']")).isDisplayed()+"");
	System.out.println("Order Mail is Enabled   :: "+driver.findElement(By.xpath("//div[@class='UI']")).isEnabled()+"");
	driver.findElement(By.xpath("//div[@class='UI']")).click();
	System.out.println("Mail Opened");
	UtilityMethods.sleep(5000);
	System.out.println("sub Mail is displayed :: "+driver.findElement(By.xpath("//a[text()='http://bell.m2m.com ']")).isDisplayed()+"");
	System.out.println("sub Mail is Enabled   :: "+driver.findElement(By.xpath("//a[text()='http://bell.m2m.com ']")).isEnabled()+"");
	String CCURL = driver.findElement(By.xpath("//a[text()='http://bell.m2m.com ']")).getAttribute("href");
	System.out.println("Control Center URL ::"+CCURL+"");	
	driver.close();
    return CCURL;
}

}