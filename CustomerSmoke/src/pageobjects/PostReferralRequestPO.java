package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import driver.BaseDriver;
public class PostReferralRequestPO extends BaseDriver 
{
	@FindBy(how=How.XPATH,using="//img[@alt='Post']")
	public static WebElement PostLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;
	
	@FindBy(how=How.XPATH,using="//h2")
	public static WebElement SectionOneHead1;
	
	@FindBy(how=How.XPATH,using="//p")
	public static WebElement ParagraphText;
	
	@FindBy(how=How.XPATH,using="//h4[contains(.,'Contact')]")
	public static WebElement ContactInfoText;
	
	@FindBy(how=How.XPATH,using="//h4[contains(.,'Device ')]")
	public static WebElement DeviceInfoText;
	
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
	
	@FindBy(how=How.XPATH,using="//label[text()='E-mail Address']")
	public static WebElement EmailLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public static WebElement EmailInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Module']")
	public static WebElement ModuleLabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='device']")
	public static WebElement ModuleInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Business Type']")
	public static WebElement BusinessLabel;
	
	@FindBy(how=How.XPATH,using="//select[@id='industryId']")
	public static WebElement BusinessInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Business Type']")
	public static WebElement SimLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='2FF Mini']")
	public static WebElement Sim2FFLabel;
	
	@FindBy(how=How.XPATH,using="//label[text()='3FF Micro']")
	public static WebElement Sim3FFlabel;
	
	@FindBy(how=How.XPATH,using="//input[@id='mini0']")
	public static WebElement Sim2FFInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='mini1']")
	public static WebElement Sim3FFInput;
	
	@FindBy(how=How.XPATH,using="//label[text()='Volume to deploy']")
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
	
	@FindBy(how=How.XPATH,using="//img[@alt='Post']")
	public static WebElement CancelButton;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement RequestButton;	
	
}
