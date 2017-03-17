package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import driver.BaseDriver;

public class BellReviewConfirmPO extends BaseDriver
{
	@FindBy(how=How.XPATH,using="//img[@alt='Bell']")
	public static WebElement BellLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;
	
	@FindBy(how=How.XPATH,using="//h4")
	public static WebElement SectionOneHead4;
		
	@FindBy(how=How.XPATH,using="//h2")
	public static WebElement OrderIotHeaderText;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-info']//span[@class='bl-status']")
	public static WebElement YourInfoText;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-ship']//span[@class='bl-status']")
	public static WebElement ShppingText;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-pay']//span[@class='bl-status']")
	public static WebElement PaymentText;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-rc']//span[@class='bl-status']")
	public static WebElement ReviewConfirmText;
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'IoT')]")
	public static WebElement IOTText;
	
	@FindBy(how=How.XPATH,using="//li[contains(.,'Test')]")
	public static WebElement TestSimText;
	
	@FindBy(how=How.XPATH,using="//li[contains(.,'30')]")
	public static WebElement MBPerSimTextl;
	
	@FindBy(how=How.XPATH,using="//li[contains(.,'50')]")
	public static WebElement SMSPerSimText;
	
	@FindBy(how=How.XPATH,using="//li[contains(.,'Bell')]")
	public static WebElement FullAcessText;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-xs-8 clr-black']")
	public static WebElement ShippingTotalText;
	
	@FindBy(how=How.XPATH,using="//p[text()='Included']")
	public static WebElement IncludeText;
	
	@FindBy(how=How.XPATH,using="//div[@class='ship_wrap clearfix']//a")
	public static WebElement ShippingEdit;
	
	@FindBy(how=How.XPATH,using="//div[@class='payment_wrap clearfix']//a")
	public static WebElement BillingEdit;
	
	@FindBy(how=How.XPATH,using="//div[@class='ship_wrap clearfix']//address")
	public static WebElement ShippingAddress;
	
	@FindBy(how=How.XPATH,using="//div[@class='payment_wrap clearfix']//address")
	public static WebElement BillingAddress;
	
	@FindBy(how=How.XPATH,using="//input[@value='Confirm']")
	public static WebElement ConfirmButton;
	
	@FindBy(how=How.XPATH,using="//a[@value='Cancel']")
	public static WebElement CancelButton;
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement CancelButtonFindElement;
	
	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	public static WebElement BillEditFindElement;//to be modified

	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	public static WebElement ShipEditFindElement;
}
