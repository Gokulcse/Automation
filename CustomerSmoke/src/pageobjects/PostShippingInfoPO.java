package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostShippingInfoPO 
{
	@FindBy(how=How.XPATH,using="//img[@alt='Post']")
	public static WebElement PostLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;
	
	@FindBy(how=How.XPATH,using="//h2")
	public static WebElement SectionOneHead1;
	
	@FindBy(how=How.XPATH,using="//h4")
	public static WebElement SectionOneHead4;
	
	@FindBy(how=How.XPATH,using="//p")
	public static WebElement ParagraphText;
	
	@FindBy(how=How.XPATH,using="//label[@for='smebilling']")
	public static WebElement SameBillAndShipLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='Address']")
	public static WebElement ShipAddressLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='Apt/Suite']")
	public static WebElement ShipAptLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='City']")
	public static WebElement ShipCityLabel;
	
	@FindBy(how=How.XPATH,using="//form/div[@class='clearfix frm-in-field']//label[text()='Province']")
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
	
	@FindBy(how=How.XPATH,using="//input[@name='shipAddress.state']")
	public static WebElement ShipProvinceInput;

	@FindBy(how=How.XPATH,using="//input[@name='shipAddress.zipPostalCode']")
	public static WebElement ShipPostInput;
	
	@FindBy(how=How.XPATH,using="//select[@id='country']")
	public static WebElement ShipCountryInput;
	
	@FindBy(how=How.XPATH,using="//div[@id='address-error']")
	public static WebElement ShipAddressError;
	
	@FindBy(how=How.XPATH,using="//div[@id='citydown-error']")
	public static WebElement ShipCityError;
	
	@FindBy(how=How.XPATH,using="//div[@id='province-error']")
	public static WebElement ShipProvinceError;
	
	@FindBy(how=How.XPATH,using="//div[@id='pscode-error']")
	public static WebElement ShipPostError;
	
	@FindBy(how=How.XPATH,using="//div[@id='country-error']")
	public static WebElement ShipCountryError;

	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='Address']")
	public static WebElement BillAddressLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='Apt/Suite']")
	public static WebElement BillAptLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='City']")
	public static WebElement BillCityLabel;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-hid-pp']//label[text()='Province']")
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
	
	@FindBy(how=How.XPATH,using="//input[@name='billAddress.state']")
	public static WebElement BillProvinceInput;

	@FindBy(how=How.XPATH,using="//input[@name='billAddress.zipPostalCode']")
	public static WebElement BillPostInput;
	
	@FindBy(how=How.XPATH,using="//select[@id='bcountry']")
	public static WebElement BillCountryInput;
	
	@FindBy(how=How.XPATH,using="//div[@id='address1-error']")
	public static WebElement BillAddressError;
	
	@FindBy(how=How.XPATH,using="//div[@id='citytown-error']")
	public static WebElement BillCityError;
	
	@FindBy(how=How.XPATH,using="//div[@id='provinces-error']")
	public static WebElement BillProvinceError;
	
	@FindBy(how=How.XPATH,using="//div[@id='poscode-error']")
	public static WebElement BillPostError;
	
	@FindBy(how=How.XPATH,using="//div[@id='country-error']")
	public static WebElement BillCountryError;
	
}
