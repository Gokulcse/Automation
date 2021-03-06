package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import driver.BaseDriver;

public class BellBillingInfoPO extends BaseDriver
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
	//input[@id='smebilling']

	@FindBy(how=How.XPATH,using="//input[@id='smebilling']")
	public static WebElement SameBillAndShipcheckbox;
	
	@FindBy(how=How.XPATH,using="//label[@for='smebilling']")
	public static WebElement SameBillAndShipLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-info']//span[@class='bl-status']")
	public static WebElement YourInfoText;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-ship']//span[@class='bl-status']")
	public static WebElement ShppingText;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-pay']//span[@class='bl-status']")
	public static WebElement PaymentText;
	
	@FindBy(how=How.XPATH,using="//div[@class='order-status iot-kit-rc']//span[@class='bl-status']")
	public static WebElement ReviewConfirmText;
	
	@FindBy(how=How.XPATH,using="//label[@for='namecard']")
	public static WebElement NameOnCardLabel;
	
	@FindBy(how=How.XPATH,using="//label[@for='cardnum']")
	public static WebElement CardNumberLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='Expiry Date']")
	public static WebElement ExpiryDateLabel;
	
	@FindBy(how=How.XPATH,using="//label[@for='seccode']")
	public static WebElement CVVCodeLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='namecard']")
	public static WebElement NameOnCardInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='cardnum']")
	public static WebElement CardNumberInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='month']")
	public static WebElement ExpiryDate;
	
	@FindBy(how=How.XPATH,using="//input[@id='seccode']")
	public static WebElement CVVCodeInput;

	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='Address']")
	public static WebElement BillAddressLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='Apt/Suite']")
	public static WebElement BillAptLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='City']")
	public static WebElement BillCityLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='State/Province']")
	public static WebElement BillProvinceLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='Postal Code']")
	public static WebElement BillPostLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='Country']")
	public static WebElement BillCountryLabel;
	
	@FindBy(how=How.XPATH,using="//input[@name='billAddress.addressLine1']")
	public static WebElement BillAddressInput;
	
	@FindBy(how=How.XPATH,using="//input[@name='billAddress.addressLine2']")
	public static WebElement BillAptInput;
	
	@FindBy(how=How.XPATH,using="//input[@name='billAddress.cityTown']")
	public static WebElement BillCityInput;
	
	@FindBy(how=How.XPATH,using="//select[@id='state']")
	public static WebElement BillProvinceInput;

	@FindBy(how=How.XPATH,using="//input[@name='billAddress.zipPostalCode']")
	public static WebElement BillPostInput;
	
	@FindBy(how=How.XPATH,using="//select[@id='bcountry']")
	public static WebElement BillCountryInput;
	
	@FindBy(how=How.XPATH,using="//div[@id='address1-error']")
	public static WebElement BillAddressError;
	
	@FindBy(how=How.XPATH,using="//div[@id='citytown-error']")
	public static WebElement BillCityError;
	
	@FindBy(how=How.XPATH,using="//div[@id='state-error']")
	public static WebElement BillProvinceError;
	
	@FindBy(how=How.XPATH,using="//div[@id='poscode-error']")
	public static WebElement BillPostError;
	
	@FindBy(how=How.XPATH,using="//div[@id='bcountry-error']")
	public static WebElement BillCountryError;
	
	@FindBy(how=How.XPATH,using="//input[@value='Review']")
	public static WebElement ReviewButton;
	
	@FindBy(how=How.XPATH,using="//a[@value='Cancel']")
	public static WebElement CancelButton;
	
	@FindBy(how=How.XPATH,using="//a[text()='Back']")
	public static WebElement BackButton;
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement CancelButtonFindElement;
	
	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	public static WebElement BackFindElement;
}
