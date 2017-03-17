package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import driver.BaseDriver;

public class BellShippingInfoPO extends BaseDriver
{
	@FindBy(how=How.XPATH,using="//img[@alt='Bell']")
	public static WebElement BellLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;
	
	@FindBy(how=How.XPATH,using="//h4")
	public static WebElement SectionOneHead4;
	
	@FindBy(how=How.XPATH,using="//p")
	public static WebElement ParagraphText;
	
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
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='Address']")
	public static WebElement ShipAddressLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='Apt/Suite']")
	public static WebElement ShipAptLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='City']")
	public static WebElement ShipCityLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='State/Province']")
	public static WebElement ShipProvinceLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='Postal Code']")
	public static WebElement ShipPostLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='Country']")
	public static WebElement ShipCountryLabel;
	
	@FindBy(how=How.XPATH,using="//input[@name='shipAddress.addressLine1']")
	public static WebElement ShipAddressInput;
	
	@FindBy(how=How.XPATH,using="//input[@name='shipAddress.addressLine2']")
	public static WebElement ShipAptInput;
	
	@FindBy(how=How.XPATH,using="//input[@name='shipAddress.cityTown']")
	public static WebElement ShipCityInput;
	
	@FindBy(how=How.XPATH,using="//select[@id='state']")
	public static WebElement ShipProvinceInput;

	@FindBy(how=How.XPATH,using="//input[@name='shipAddress.zipPostalCode']")
	public static WebElement ShipPostInput;
	
	@FindBy(how=How.XPATH,using="//select[@id='country']")
	public static WebElement ShipCountryInput;
	
	@FindBy(how=How.XPATH,using="//div[@id='address-error']")
	public static WebElement ShipAddressError;
	
	@FindBy(how=How.XPATH,using="//div[@id='citydown-error']")
	public static WebElement ShipCityError;
	
	@FindBy(how=How.XPATH,using="//div[@id='state-error']")
	public static WebElement ShipProvinceError;
	
	@FindBy(how=How.XPATH,using="//div[@id='pscode-error']")
	public static WebElement ShipPostError;
	
	@FindBy(how=How.XPATH,using="//div[@id='country-error']")
	public static WebElement ShipCountryError;

	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	public static WebElement ContinueButton;
	
	@FindBy(how=How.XPATH,using="//a[@value='Cancel']")
	public static WebElement CancelButton;
	
	@FindBy(how=How.XPATH,using="//a[text()='Back']")
	public static WebElement BackButton;
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement CancelButtonFindElement;
	
	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	public static WebElement BackFindElement;

	
}
