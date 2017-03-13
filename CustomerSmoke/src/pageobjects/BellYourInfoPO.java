package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BellYourInfoPO
{
	@FindBy(how=How.XPATH,using="//img[@alt='Bell']")
	public static WebElement BellLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;
	
	@FindBy(how=How.XPATH,using="//h4[contains(.,'Contact')]")
	public static WebElement ContactInfoText;
	
	@FindBy(how=How.XPATH,using="//h4[contains(.,'Device ')]")
	public static WebElement DeviceInfoText;
	
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
	
	@FindBy(how=How.XPATH,using="//label[text()='First Name']")
	public static WebElement FirstNameLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='fname']")
	public static WebElement FirstNameInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Last Name']")
	public static WebElement LastNameLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='lname']")
	public static WebElement LastNameInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Company Name']")
	public static WebElement CompanyNameLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='company']")
	public static WebElement CompanyNameInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Position/Role']")
	public static WebElement PositionRoleLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='postion']")
	public static WebElement PositionRoleInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Phone Number']")
	public static WebElement PhoneNumberLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='phoneNumber']")
	public static WebElement PhoneNumberInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Email Address']")
	public static WebElement EmailLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public static WebElement EmailInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Module']")
	public static WebElement ModuleLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='moduleDeviceInfo']")
	public static WebElement ModuleInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Type of device you are developing']")
	public static WebElement BusinessLabel;
	
	@FindBy(how=How.XPATH,using="//select[@id='industryId']")
	public static WebElement BusinessInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='SIM Type']")
	public static WebElement SimLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='2FF/Ruggedized']")
	public static WebElement Sim2FFLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='3FF/Ruggedized Micro']")
	public static WebElement Sim3FFlabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='Nano SIM']")
	public static WebElement SimNanolabel;
	
	@FindBy(how=How.XPATH,using="//label[@for='mini0']")
	public static WebElement Sim2FFInput;
	
	@FindBy(how=How.XPATH,using="//label[@for='mini1']")
	public static WebElement Sim3FFInput;
	
	@FindBy(how=How.XPATH,using="//label[@for='mini2']")
	public static WebElement SimNanoInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Volume to Deploy']")
	public static WebElement VolumetoDeployLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='deviceVolume']")
	public static WebElement VolumetoDeployInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Launch Timeframe']")
	public static WebElement LaunchTimeframeLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='Within 3 months']")
	public static WebElement IN3MonthLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='3-6 months']")
	public static WebElement IN6Monthlabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='6-12 months']")
	public static WebElement IN12MonthLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='More than 12 months/unknown']")
	public static WebElement Morethan12Monthlabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='with3mn00']")
	public static WebElement IN3MonthInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='with3mn01']")
	public static WebElement IN6MonthInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='with3mn02']")
	public static WebElement IN12MonthInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='with3mn03']")
	public static WebElement Morethan12MonthInput;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='targetAudience']")
	public static WebElement Description;
	
	@FindBy(how=How.XPATH,using="//label[text()='Description']")
	public static WebElement DescriptionLabel;
	
	@FindBy(how=How.XPATH,using="//label[@for='bellcheck']")
	public static WebElement checkBoxLabel;
	
	@FindBy(how=How.XPATH,using="//label[@for='blcheck']")
	public static WebElement checkBoxTerms;
	
	@FindBy(how=How.XPATH,using="//label[@for='blcheck']//a")
	public static WebElement TermsOfServicesLink;

	@FindBy(how=How.XPATH,using="//label[@for='bellcheck']//a")
	public static WebElement BellCaLink;
	
	@FindBy(how=How.XPATH,using="//h1")
	public static WebElement BellCaLinkFindElement;
	
	@FindBy(how=How.XPATH,using="//a[@value='Cancel']")
	public static WebElement CancelButton;
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement CancelButtonFindElement;
	
	@FindBy(how=How.XPATH,using="//input[@value='Continue']")
	public static WebElement ContinueButton;	
	
	@FindBy(how=How.XPATH,using="//div[@id='fname-error']")
	public static WebElement FirstNameError;
	
	@FindBy(how=How.XPATH,using="//div[@id='lname-error']")
	public static WebElement LastNameError;
	
	@FindBy(how=How.XPATH,using="//div[@id='company-error']")
	public static WebElement CompanyError;
	
	@FindBy(how=How.XPATH,using="//div[@id='postion-error']")
	public static WebElement PositionError;
	
	@FindBy(how=How.XPATH,using="//div[@id='phoneNumber-error']")
	public static WebElement PhoneNumberError;
	
	@FindBy(how=How.XPATH,using="//div[@id='email-error']")
	public static WebElement EmailError;
	
	@FindBy(how=How.XPATH,using="//div[@id='moduleDeviceInfo-error']")
	public static WebElement ModuleError;
	
	@FindBy(how=How.XPATH,using="//div[@id='industryId-error']")
	public static WebElement BusinessTypeError;
	
	@FindBy(how=How.XPATH,using="//div[@id='simTypeId-error']")
	public static WebElement SimTypeError;
	
	@FindBy(how=How.XPATH,using="//div[@id='deviceVolume-error']")
	public static WebElement VolumetoDeployError;
	
	@FindBy(how=How.XPATH,using="//div[@id='launchTimeFrameId-error']")
	public static WebElement LaunchTimeError;
	
	@FindBy(how=How.XPATH,using="//div[@id='targetAudience-error']")
	public static WebElement DescriptionError;
	
	@FindBy(how=How.XPATH,using="//div[@id='blcheck-error']")
	public static WebElement TermsOfServicesError;
	
	@FindBy(how=How.XPATH,using="//button[@class='close']")
	public static WebElement CloseIcon;
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default']")
	public static WebElement CloseButton;
	
	@FindBy(how=How.XPATH,using="//div[@id='terms']//a/img")
	public static WebElement TermsOfServicesDownload;
	
}
