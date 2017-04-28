package pages;


import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilitymethods.UtilityMethods;


public class EmailIntegration 
{
	static Properties allInputValue;
	public static	String BrowserForUse;
	public static WebDriver driver;	


	public static void DeleteAllEmail()
	{
		try {allInputValue=UtilityMethods.getPropValues();} catch (IOException e) {e.printStackTrace();}
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

		driver.get(allInputValue.getProperty("EmailURl"));
		UtilityMethods.sleep(4000);
		driver.findElement(By.id("Email")).sendKeys(allInputValue.getProperty("EmailID"));
		driver.findElement(By.id("next")).click();  
		UtilityMethods.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys(allInputValue.getProperty("EmailPassword"));
		driver.findElement(By.id("signIn")).click();
		UtilityMethods.sleep(20000);
		System.out.println("Mail Opened");
		System.out.println("Delete all check box is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isDisplayed()+"");
		System.out.println("Delete all check box is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Select']")).isEnabled()+"");
		List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));
		String MyMailer = "orders";
		for(int i=0;i<unreademeil.size();i++)
		{
			if(unreademeil.get(i).isDisplayed()==true)
			{
				if(unreademeil.get(i).getText().equals(MyMailer))
				{
					driver.findElement(By.xpath("//div[@aria-label='Select']")).click();
					UtilityMethods.sleep(4000);
					System.out.println("Check box selected");
					System.out.println("Yes we have got mail form " + MyMailer);
					System.out.println("Delet button is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isDisplayed()+"");
					System.out.println("Delete button is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isEnabled()+"");
					driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();
					UtilityMethods.sleep(4000);
					System.out.println("Delete Button Clicked");
					System.out.println("Deleted All Unread Inbox Emails");
				}
				else
				{
					System.out.println("No unread mail form " + MyMailer);
				}
			}
			else
			{
				//System.out.println("No unread mail form " + MyMailer);
			}
		}
		System.out.println("No unread mail form " + MyMailer);
		List<WebElement> reademeil = driver.findElements(By.xpath("//*[@class='yP']"));
		if(reademeil.size()>0)
		{
			driver.findElement(By.xpath("//div[@aria-label='Select']")).click();
			UtilityMethods.sleep(4000);
			System.out.println("Check box selected");
			System.out.println("Yes we have got mail form " + MyMailer);
			System.out.println("Delet button is displayed :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isDisplayed()+"");
			System.out.println("Delete button is Enabled   :: "+driver.findElement(By.xpath("//div[@aria-label='Delete']")).isEnabled()+"");
			driver.findElement(By.xpath("//div[@aria-label='Delete']")).click();
			UtilityMethods.sleep(4000);
			System.out.println("Delete Button Clicked");
			System.out.println("Deleted All read Inbox Emails");
			driver.close();
		}
		else
		{
			driver.close();
		}
	}

	@Test(priority=1)
	public static void CheckEmailReceived()
	{
		try {allInputValue=UtilityMethods.getPropValues();} catch (IOException e) {e.printStackTrace();}
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
		driver.get(allInputValue.getProperty("EmailURl"));
		UtilityMethods.sleep(4000);
		driver.findElement(By.id("Email")).sendKeys(allInputValue.getProperty("EmailID"));
		driver.findElement(By.id("next")).click();
		UtilityMethods.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys(allInputValue.getProperty("EmailPassword"));
		driver.findElement(By.id("signIn")).click();
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
			else
			{
				System.out.println("No mail form " + MyMailer);
			}
		}
		driver.close();
	}


	@BeforeTest
	public static String ccURL() 
	{
		try {allInputValue=UtilityMethods.getPropValues();} catch (IOException e) {e.printStackTrace();}
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
		driver.get(allInputValue.getProperty("EmailURl"));
		UtilityMethods.sleep(4000);
		driver.findElement(By.id("Email")).sendKeys(allInputValue.getProperty("EmailID"));
		driver.findElement(By.id("next")).click();
		UtilityMethods.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys(allInputValue.getProperty("EmailPassword"));
		driver.findElement(By.id("signIn")).click();
		UtilityMethods.sleep(20000);
		System.out.println("INBOX Opened");
		
		System.out.println("the Xpath is  33::"+allInputValue.getProperty("FindURL")+"");
		String Test=allInputValue.getProperty("FindURL");
		System.out.println("Order Mail is displayed :: "+driver.findElement(By.xpath("//div[@class='UI']")).isDisplayed()+"");
		System.out.println("Order Mail is Enabled   :: "+driver.findElement(By.xpath("//div[@class='UI']")).isEnabled()+"");
		driver.findElement(By.xpath("//div[@class='UI']")).click();
		System.out.println("Mail Opened");
		UtilityMethods.sleep(8000);
		
		System.out.println("the Xpath is ::"+driver.findElement(By.xpath(Test))+"");
		System.out.println("sub Mail is displayed :: "+driver.findElement(By.xpath(Test)).isDisplayed()+"");
		System.out.println("sub Mail is Enabled   :: "+driver.findElement(By.xpath(Test)).isEnabled()+"");
		String CCURL = driver.findElement(By.xpath(Test)).getAttribute("href");
		System.out.println("Control Center URL ::"+CCURL+"");	
		driver.close();
		return CCURL;
	}

}