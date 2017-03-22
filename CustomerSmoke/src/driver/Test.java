package driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.SendKeys;

import pageobjects.BellYourInfoPO;
import utilitymethods.UtilityMethods;

public class Test {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		//http://bell.devm2m.com/pdf/Bell_Terms_of_Service.pdf
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yopmail.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys("automation1");
		driver.findElement(By.xpath("//input[@value='Check Inbox']")).click();
		System.out.println("Mail opened");
		Thread.sleep(3500);
		System.out.println("Delete button is displayed :: "+driver.findElement(By.xpath("//a[@class='igif lmenudelall']")).isDisplayed()+"");
		System.out.println("Delete button is Enabled   :: "+driver.findElement(By.xpath("//a[@class='igif lmenudelall']")).isEnabled()+"");
		
		driver.findElement(By.xpath("//a[@class='igif lmenudelall']")).click();
		Thread.sleep(3500);
		System.out.println("Delete Menu Clicked");
		driver.findElement(By.xpath("//a[@class='igif lmen_all']")).click();
		Thread.sleep(3500);
		System.out.println("Empty Inbox");
		
}

}