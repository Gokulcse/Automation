package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import driver.BaseDriver;

public class BellOrderSummaryPO extends BaseDriver
{
	@FindBy(how=How.XPATH,using="//img[@alt='Bell']")
	public static WebElement BellLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;
	
	@FindBy(how=How.XPATH,using="//h2")
	public static WebElement SectionOneHead1;
		
	@FindBy(how=How.XPATH,using="//p[contains(.,'Please')]")
	public static WebElement Para1Text;
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'review')]")
	public static WebElement Para2Text;
	
	@FindBy(how=How.XPATH,using="//span[text()='bell.devm2m.com']")
	public static WebElement HomePageLink;
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement homepageLinkFindElement;
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'contact')]")
	public static WebElement Para3Text;
	
	@FindBy(how=How.XPATH,using="//a[text()='Back to IoT Starter Kit Page']")
	public static WebElement BactToIOTButton;
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement BactToIOTFindElement;
	
	@FindBy(how=How.XPATH,using="//a[text()='Track Order']")
	public static WebElement TrackOrderButton;

	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement TrackOrderFindElement;
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'Date')]")
	public static WebElement DateText;
	
	@FindBy(how=How.XPATH,using="//h2")
	public static WebElement OrderSummaryHeaderText;
	
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
	
	@FindBy(how=How.XPATH,using="//div[@class='ship_wrap clearfix']//address")
	public static WebElement ShippingAddress;
	
	@FindBy(how=How.XPATH,using="//div[@class='payment_wrap clearfix']//address")
	public static WebElement BillingAddress;
}
