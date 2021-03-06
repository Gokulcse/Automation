package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.BellTrackOrderPO;
import driver.BaseDriver;
import utilitymethods.UtilityMethods;

public class BellTrackOrder extends BaseDriver
{
	public static WebDriver driver;
	static Properties allInputValue;
	
	@BeforeTest
	public static WebDriver start() throws Exception
	{	
		allInputValue = UtilityMethods.getBellPropValues();
		driver = launchApp(allInputValue.getProperty("BaseURl"));
		return driver;
	}
	
	@Test(priority=1)
	public static void TrackOrderValidPageRedirection() throws InterruptedException
	{
		PageFactory.initElements(driver, BellTrackOrderPO.class);
		BellTrackOrderPO.SectionOneTrackOrderButton.click();
		UtilityMethods.sleep(2000);
		BellTrackOrderPO.TrackOrderEmailID.sendKeys(allInputValue.getProperty("TrackOrder.validTrackOrderEmailID"));
		BellTrackOrderPO.SectionOneTrackOrderPRButton.click();
		UtilityMethods.sleep(2000);
		System.out.println("TO001");
	}

	@Test(priority=2)
	public static void validateOperatorLogo() 
	{		
		PageFactory.initElements(driver, BellTrackOrderPO.class);	
		UtilityMethods.DisplayEnableValidator(BellTrackOrderPO.BellLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(BellTrackOrderPO.BellLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");
		System.out.println("TO002");
	} 
		
	@Test(priority=3)
	public static void validateCompanyLogo() 
	{
		PageFactory.initElements(driver, BellTrackOrderPO.class);	
		UtilityMethods.DisplayEnableValidator(BellTrackOrderPO.CiscoLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(BellTrackOrderPO.CiscoLogo,"src",allInputValue.getProperty("ciscoLogo"),"Cisco Jasper Company Logo");
		System.out.println("TO003");
	}
	
	@Test(priority=4)
	public static void SectionOneTextValidaion()
	{
		PageFactory.initElements(driver, BellTrackOrderPO.class);	
		UtilityMethods.StringValidation(BellTrackOrderPO.Headertext.getText(), "Track Your Order", "equalsignorecase");
		UtilityMethods.StringValidation(BellTrackOrderPO.OrderdateText.getText(), "Order Date:", "equalsignorecase");
		UtilityMethods.StringValidation(BellTrackOrderPO.Tracking_NOtext.getText(), "Tracking Number:", "equalsignorecase");
		UtilityMethods.StringValidation(BellTrackOrderPO.EDDText.getText(), "Expected Delivery:", "equalsignorecase");
		System.out.println("TO004");
	}
	
	@Test(priority=5)
	public static void SectionTwoTextvalidation()
	{
		PageFactory.initElements(driver, BellTrackOrderPO.class);	
		UtilityMethods.StringValidation(BellTrackOrderPO.OrderReceivedtext.getText(), "Order Received", "equalsignorecase");
		UtilityMethods.StringValidation(BellTrackOrderPO.ProcessingText.getText(), "Processing", "equalsignorecase");
		UtilityMethods.StringValidation(BellTrackOrderPO.Shippedtext.getText(), "Shipped", "equalsignorecase");
		System.out.println("TO005");
	}
	
	@Test(priority=6)
	public static void BackToIOT()
	{
		PageFactory.initElements(driver, BellTrackOrderPO.class);	
		UtilityMethods.DisplayEnableValidator(BellTrackOrderPO.BackToIOT, "NotEqual","resend Confirmation Button");
		UtilityMethods.ThankYouPageRedirection(BellTrackOrderPO.BackToIOT, BellTrackOrderPO.HomePageFindElement);
		System.out.println("TO006");
	}
	
	@Test(priority=7)
	public static void BellLogoHomePage()
	{
		PageFactory.initElements(driver, BellTrackOrderPO.class);	
		UtilityMethods.DisplayEnableValidator(BellTrackOrderPO.BellLogo, "NotEqual","resend Confirmation Button");
		UtilityMethods.ThankYouPageRedirection(BellTrackOrderPO.BellLogo, BellTrackOrderPO.HomePageFindElement);
		System.out.println("TO007");
	}
	
	@Test(priority=8)
	public static void ResendConfirmationButton()
	{
		PageFactory.initElements(driver, BellTrackOrderPO.class);	
		UtilityMethods.DisplayEnableValidator(BellTrackOrderPO.ResendConfirmation, "NotEqual","resend Confirmation Button");
		BellTrackOrderPO.ResendConfirmation.click();
		UtilityMethods.sleep(2000);
		String SuccessMessage= BellTrackOrderPO.ResendConfirmationSucessMessage.getText();
		if(SuccessMessage.equals("Email sent successfully"))
		{
			System.out.println("Email Send Successfully");
		}
		else if (SuccessMessage.equals("Sorry Email not sent successfully"))
		{
			System.out.println("Sorry Email not sent successfully"); 
		}
		else
		{
			System.out.println("Message not displayed");
		}
		System.out.println("TO008");
		driver.close();
	}
	
	@Test(priority=9)
	public static void CheckingOrderSuccessEmail()
	{
		EmailIntegration.CheckEmailReceived();
		System.out.println("TO009");
	}

	
}
