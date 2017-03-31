package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import driver.BaseDriver;

public class BellHomePagePO extends BaseDriver
{
	@FindBy(how=How.XPATH,using="//img[@alt='Bell']")
	public static WebElement BellLogo;
	
	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;

	@FindBy(how=How.XPATH,using="//section[@id='hero-wrp']//h1")
	public static WebElement TextBannerh1;
	
	@FindBy(how=How.XPATH,using="//section[@id='hero-wrp']//h3")
	public static WebElement TextBannerh3;
	
	@FindBy(how=How.XPATH,using="//div[@class='pb5 br-none-md']//p[contains(.,'Bell')]")
	public static WebElement TextBannerp1;
	
	@FindBy(how=How.XPATH,using="//div[@class='pb5 br-none-md']//p[contains(.,'code')]")
	public static WebElement TextBannerp2; 
	
	@FindBy(how=How.XPATH,using="//section[@id='hero-wrp']//a[contains(.,'Request Referral Code')]")
	public static WebElement SectionOneReferralRrequestButton;
	//section[@id='hero-wrp']//button
	
	@FindBy(how=How.XPATH,using="//input[@value='Request']")
	public static WebElement ReferrralRequestFindElement; //Referral Request Find Element in next page

	@FindBy(how=How.XPATH,using="//div[@class='bl-val-chnge pb30']//a[text()='Track Order']")
	public static WebElement SectionOneTrackOrderButton;
	
	@FindBy(how=How.XPATH,using="//form[@id='hmeRefTrack']//h4")
	public static WebElement SectionOneTrackOrderText;
	
	@FindBy(how=How.XPATH,using="//form[@id='hmeRefTrack']//a")
	public static WebElement SectionOneTrackOrderPRButton;
	
	@FindBy(how=How.XPATH,using="//form[@id='hmeRefTrack']//a")
	public static WebElement SectionOneTrackOrderFindElement;//Section Find Element in next page
	
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
	
	@FindBy(how=How.XPATH,using="//a[text()='Request Referral Code']")
	public static WebElement SectionTwoReferralRrequestButton;
	
	@FindBy(how=How.XPATH,using="//img[@alt='sim']")
	public static WebElement SimIcon;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-inn-cnt pt20']//h3")
	public static WebElement TextSimh1;
	
	@FindBy(how=How.XPATH,using=".//*[@id='kit-inc']//h3[contains(.,'30')]")
	public static WebElement TextSimh2;
	
	@FindBy(how=How.XPATH,using="//div[@class='bl-kit-inn-cnt']//h3[contains(.,'50')]")
	public static WebElement TextSimh3;
	
	@FindBy(how=How.XPATH,using=".//*[@id='kit-inc']//span[contains(text(),'199')]")
	public static WebElement TextSimh4; //new Element
	
	@FindBy(how=How.XPATH,using="//section[@id='kit-inc']//p[contains(.,'Bell')]")
	public static WebElement TextSimp1;
	
	@FindBy(how=How.XPATH,using="//section[@id='kit-inc']//p[contains(.,'3 month')]")
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
	
	@FindBy(how=How.XPATH,using="//div[@class='abtinfo pt10 col-xs-12']//p")
	public static WebElement PleaseNoteText;
	
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

	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement WhatIsIotImage;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-md-5 col-xs-12']//h2")
	public static WebElement WhatIsIotText;
	
	@FindBy(how=How.XPATH,using="//section[@id='what-iot']//p")
	public static WebElement WhatIsIotParaText1;
		
	@FindBy(how=How.XPATH,using="//a[text()='M2M.com']")
	public static WebElement M2MDotCom;
	
	@FindBy(how=How.XPATH,using="//div[@id='footer_wrap']")
	public static WebElement M2MDotComFindElement;
	
	@FindBy(how=How.XPATH,using="//a[text()='Learn more from your Bell representative.']")
	public static WebElement LearnMoreFromBell;
	
	@FindBy(how=How.XPATH,using="//h2[text()='Request a call back']")
	public static WebElement LearnMoreFromBellFindElement;

	@FindBy(how=How.XPATH,using="//ul[@class='list-inline bl-whw']//li[contains(.,'Kit')]")
	public static WebElement WhattheKitIncludeLink;

	@FindBy(how=How.XPATH,using="//ul[@class='list-inline bl-whw']//li[contains(.,'Works')]")
	public static WebElement HowItWorkslink;
	
	@FindBy(how=How.XPATH,using="//ul[@class='list-inline bl-whw']//li[contains(.,'IoT')]")
	public static WebElement WhatIsIotLink;

	@FindBy(how=How.XPATH,using="//div[@id='trackOrderErr']/p")
	public static WebElement TrackOrderError; //Invalid track Order Email	
	
	@FindBy(how=How.XPATH,using="//label[@id='emailId-error']")
	public static WebElement TrackOrderInValidEmailError; //Invalid emial ID
	
	@FindBy(how=How.XPATH,using="//div[@id='referralErr']/p")
	public static WebElement ReferralCodeError;  //Invalid referral Code
	
	@FindBy(how=How.XPATH,using="//div[@class='text-center']//h3")
	public static WebElement WithBellTexth3;
	
	@FindBy(how=How.XPATH,using="//div[@class='text-center']//p[contains(text(),'LTE')]")
	public static WebElement WithBellTextp1;
	
	@FindBy(how=How.XPATH,using="//div[@class='text-center']//p[contains(text(),'3,000')]")
	public static WebElement WithBellTextp2;
	
	@FindBy(how=How.XPATH,using="//img[@alt='4G LTE']")
	public static WebElement LTENetworkIcon;
	
	@FindBy(how=How.XPATH,using="//h3[contains(.,'LTE')]")
	public static WebElement LTENetworkTexth3;
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'32')]")
	public static WebElement LTENetworkTextP;

	@FindBy(how=How.XPATH,using="//img[@alt='A Variety of Hardware image']")
	public static WebElement PartnerIcon;
	
	@FindBy(how=How.XPATH,using="//h3[contains(.,'partners')]")
	public static WebElement PartnerTexth3;
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'closely')]")
	public static WebElement PartnerTextP;
	
	@FindBy(how=How.XPATH,using="//img[@alt='A team of certified professional image']")
	public static WebElement EndToEndIcon;
	
	@FindBy(how=How.XPATH,using="//h3[contains(.,'help you')]")
	public static WebElement EndToEndyTexth3;
	
	@FindBy(how=How.XPATH,using="//p[contains(.,'focused')]")
	public static WebElement EndToEndTextP;
	
}

