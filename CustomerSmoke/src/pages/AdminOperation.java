package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilitymethods.*;
public class AdminOperation 
{
	public static void AdminApproval() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://starterkit-dev.devm2m.com/admin/internal/login");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("venkatesh.s");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='blpr-menu blpr-dsk-menu']//span[text()='Referrals']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='approve0']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='aprCode']//button[@type='submit']")).click();
		driver.close();
		System.out.println("Referral request Approved");
	}
	
	public static void AdminOrderFulfill() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://starterkit-dev.devm2m.com/admin/internal/login");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("venkatesh.s");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='blpr-menu blpr-dsk-menu']//span[text()='Orders']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='order0']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='tracking_no']")).sendKeys(UtilityMethods.GenerateRandomAlphaNumeric(8));
		driver.findElement(By.xpath("//input[@name='delivery_date']")).sendKeys("10/10/2017");
		driver.findElement(By.xpath("//button[@id='create_fulfill']")).click();
		driver.close();
		System.out.println("Order Fulfilled");
	}
	
}
