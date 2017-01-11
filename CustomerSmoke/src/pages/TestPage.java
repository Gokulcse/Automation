package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Tele2ReferralRequestpagePO;
import utilitymethods.UtilityMethods;


public class TestPage {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jasper.com/"); 
		System.out.println(""+driver.getTitle());
		String parentHandle = driver.getWindowHandle();
		
		/*PageFactory.initElements(driver, Tele2ReferralRequestpagePO.class);
		UtilityMethods.PageNavigationValidation(Tele2ReferralRequestpagePO.M2MDotCom,Tele2ReferralRequestpagePO.selectKit,""); 
		*/
		
		driver.switchTo().window(parentHandle);
		
	}

}
