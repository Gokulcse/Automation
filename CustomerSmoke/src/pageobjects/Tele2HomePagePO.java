package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import driver.BaseDriver;


public class Tele2HomePagePO extends BaseDriver
{

	@FindBy(how=How.XPATH,using="//img[@alt='Tele2']")
	public static WebElement Tele2Logo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;
	
	@FindBy(how=How.XPATH,using="//section[@id='hero-wrp']//h1")
	public static WebElement TextBannerh1;
	
	@FindBy(how=How.XPATH,using="//section[@id='hero-wrp']//h2")
	public static WebElement TextBannerh2;
	
	@FindBy(how=How.XPATH,using="//div[@class='pb5 br-none-md clr-white']//p[1]")
	public static WebElement TextBannerp1;
	
	@FindBy(how=How.XPATH,using="//div[@class='pb5 br-none-md clr-white']//p[@class='pt10']")
	public static WebElement TextBannerp2;
	
	@FindBy(how=How.XPATH,using="//section[@id='hero-wrp']//a[text()='Request Referral Code']")
	public static WebElement SectionOneReferralRrequestButton;
	
	@FindBy(how=How.XPATH,using="//input[@value='Request']")
	public static WebElement ReferrralRequestFindElement;
	
	@FindBy(how=How.XPATH,using="//div[@class='pb5']//a[text()='Track Order']")
	public static WebElement SectionOneTrackOrderButton;
	
	@FindBy(how=How.XPATH,using="//form[@id='hmeRefTrack']//h4")
	public static WebElement SectionOneTrackOrderText;
	
	@FindBy(how=How.XPATH,using="//form[@id='hmeRefTrack']//a")
	public static WebElement SectionOneTrackOrderPRButton;
	
	@FindBy(how=How.XPATH,using="//form[@id='hmeRefTrack']//a")
	public static WebElement SectionOneTrackOrderFindElement;
	
	
	@FindBy(how=How.ID,using="emailId")
	public static WebElement TrackOrderEmailID;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-ref-inpt-grp bl-email']//span")
	public static WebElement TrackOrderCloseIcon;
	
	@FindBy(how=How.XPATH,using="//a[text()='Enter Referral Code']")
	public static WebElement SectionOneEnterReferralCodeButton;
	
	@FindBy(how=How.XPATH,using="//h4[text()='Enter Referral Code']")
	public static WebElement SectionOneEnterReferralCodeText;
	
	@FindBy(how=How.XPATH,using="//section[@id='hero-wrp']//a[text()='Order Kit']")
	public static WebElement SectionOneOrderKitButton;
	
	@FindBy(how=How.ID,using="referral")
	public static WebElement EnterReferralCode;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-ref-inpt-grp bl-ref-odr']//span")
	public static WebElement EnterReferralCodeCloseIcon;
	
	@FindBy(how=How.XPATH,using="//section[@id='kit-inc']//a[text()='Request Referral Code']")
	public static WebElement SectionTwoReferralRrequestButton;
	
	
	@FindBy(how=How.XPATH,using="//img[@alt='sim']")
	public static WebElement SimIcon;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-inn-cnt pt20']//h3")
	public static WebElement TextSimh1;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-inn-cnt']//h3[contains(text(),'30')]")
	public static WebElement TextSimh2;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-inn-cnt']//h3[contains(text(),'50')]")
	public static WebElement TextSimh3;
	
	@FindBy(how=How.XPATH,using="//section[@id='kit-inc']//p[contains(.,'Tele2')]")
	public static WebElement TextSimp1;
	
	@FindBy(how=How.XPATH,using="//section[@id='kit-inc']//p[contains(.,'6 month')]")
	public static WebElement TextSimp2;
	
	@FindBy(how=How.XPATH,using="//section[@id='kit-inc']//p[contains(.,'messages')]")
	public static WebElement TextSimp3;
	
	@FindBy(how=How.XPATH,using="//img[@alt='tool']")
	public static WebElement ToolIcon;
	
	@FindBy(how=How.XPATH,using="//div[@class='pt15 bl-kit-mn-hgt']//h4[contains(.,'Real-Time')]")
	public static WebElement ToolText;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-bdr bl-kit-first']//ul[@class='pt5']")
	public static WebElement ToolListText;
	
	@FindBy(how=How.XPATH,using="//img[@alt='center']")
	public static WebElement CenterIcon;
	
	@FindBy(how=How.XPATH,using="//div[@class='pt15 bl-kit-mn-hgt']//h4[contains(.,'Full Access')]")
	public static WebElement CenterText;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-bdr']//ul[@class='pt5']")
	public static WebElement CenterListText;
	
	@FindBy(how=How.XPATH,using="//img[@alt='support']")
	public static WebElement SupportIcon;
	
	@FindBy(how=How.XPATH,using="//div[@class='pt15 bl-kit-mn-hgt']//h4[contains(.,' Support')]")
	public static WebElement SupportText;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-bdr bl-kit-last']//ul[@class='pt5']")
	public static WebElement SupportListText;
	
	@FindBy(how=How.XPATH,using="//section[@id='how-works']//h2")
	public static WebElement HowItWorksText;

	@FindBy(how=How.XPATH,using="//div[@class='col-sm-3 col-xs-6']//div[contains(.,'1')]")
	public static WebElement HowItWorksOrder;

	@FindBy(how=How.XPATH,using="//div[@class='col-sm-3 col-xs-6']//div[contains(.,'2')]")
	public static WebElement HowItWorksActivate;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-sm-3 col-xs-6']//div[contains(.,'3')]")
	public static WebElement HowItWorksExplore;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-sm-3 col-xs-6']//div[contains(.,'4')]")
	public static WebElement HowItWorksMonetize;
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Learn More']")
	public static WebElement HowItWorksLearnMore;
	
	
	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement WhatIsIotImage;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-md-5 col-xs-12']//h2")
	public static WebElement WhatIsIotText;
	
	@FindBy(how=How.XPATH,using="//section[@id='what-iot']//p")
	public static WebElement WhatIsIotParaText1;
	
	@FindBy(how=How.XPATH,using="//section[@id='what-iot']//p[@class='pt20']")
	public static WebElement WhatIsIotParaText2;
	
	@FindBy(how=How.XPATH,using="//a[text()='M2M.com']")
	public static WebElement M2mDotCom;
	
	@FindBy(how=How.XPATH,using="//div[@id='footer_wrap']")
	public static WebElement M2MDotComFindElement;
	
	@FindBy(how=How.XPATH,using="//section[@id='what-iot']//a")
	public static WebElement JasperDotCom;
	
	@FindBy(how=How.XPATH,using="//a[text()='Blog']")
	public static WebElement JasperDotComFindElement;
	
	
	
	
}
