 package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BellTrackOrderPO 
{
	@FindBy(how=How.XPATH,using="//div[@class='bl-val-chnge pb30']//a[text()='Track Order']")
	public static WebElement SectionOneTrackOrderButton;
	
	@FindBy(how=How.XPATH,using="//form[@id='hmeRefTrack']//a")
	public static WebElement SectionOneTrackOrderPRButton;
	
	@FindBy(how=How.ID,using="emailId")
	public static WebElement TrackOrderEmailID;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Bell']")
	public static WebElement BellLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;

	@FindBy(how=How.XPATH,using="//h2")
	public static WebElement Headertext;
	
	@FindBy(how=How.XPATH,using="//span[contains(.,'Date')]")
	public static WebElement OrderdateText;
	
	@FindBy(how=How.XPATH,using="//span[contains(.,'Number')]")
	public static WebElement Tracking_NOtext;
	
	@FindBy(how=How.XPATH,using="//span[contains(.,'Delivery')]")
	public static WebElement EDDText;

	@FindBy(how=How.XPATH,using="//a[text()='Resend Confirmation']")
	public static WebElement ResendConfirmation;

	@FindBy(how=How.XPATH,using="//div[@id='trackOrderSucc']/p")
	public static WebElement ResendConfirmationSucessMessage;
	
	@FindBy(how=How.XPATH,using="//span[contains(.,'Received')]")
	public static WebElement OrderReceivedtext;
	
	@FindBy(how=How.XPATH,using="//span[contains(.,'Processing')]")
	public static WebElement ProcessingText;
	
	@FindBy(how=How.XPATH,using="//span[contains(.,'Shipped')]")
	public static WebElement Shippedtext;
	
	@FindBy(how=How.XPATH,using="//a[text()='Back to IoT Starter Kit Page']")
	public static WebElement BackToIOT;
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement HomePageFindElement;
}
