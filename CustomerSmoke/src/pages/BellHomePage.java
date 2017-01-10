package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class BellHomePage extends BaseDriver{
	
	public static FirefoxDriver driver = launchApp();
	static Properties allInputValue;
	public static void main(String[] args) throws IOException 
	{
		System.out.println("done");
		allInputValue = UtilityMethods.getPropValues();
		headearValidation();
		sectionOne();
		sectionTwo();
		sectionThree();
		sectionFour();
		sectionFive();
		//driver.findElement(By.xpath("//section[@id='hero-wrp']//a/button[text()='Request Referral Code']")).click();
	//	UtilityMethods.ErrorValidation(driver.findElement(By.xpath(".//*[@id='fname']")), "4", "Valid", driver.findElement(By.xpath(".//*[@id='blrequestForm']/div[12]/div[1]/input")));

		 
		driver.close();
	}
	
	public static void headearValidation() 
	{
		validateOperatorLogo();
		validateCompanyLogo();
		//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//img[@alt='Bell']")), driver.findElement(By.xpath("//img[@title='What is IoT']")));
		System.out.println("Header Section is Completed");
	}
	
	public static void sectionOne()  
	{
		sectionOneIotStarterKitErrorMessageValidation();
		sectionOneIotStarterKitValidation();
		sectionOneIotStarterKitTrackOrderValidation(); 
		sectionOneIotStarterKitEnterReferralCodeValidation();
		sectionOneIotStarterKitBellValidation();	
		sectionOneIotStarterKitPageNavigation();
		
		//UtilityMethods.Imagevalidation(driver.findElement(By.xpath("//div/img[@alt='']")), "src",allInputValue.getProperty("bellBanner"),"Bell Banner");E		
	}
	public static void sectionTwo() 
	{
		sectionTwoImageValidation();
		sectionTwoContentValidation();	
		//sectionTwoValidation();
		System.out.println("Section 2 is Completed");
	}
	public static void sectionThree()
	{
		sectionThreeValidations();
		System.out.println("Section 3 is Completed");
	}
	public static void sectionFour()
	{
		sectionFourValidation();
		System.out.println("Section 4 is Completed");
	}
	public static void sectionFive()
	{
		sectionFiveContentValidation();
		sectionFiveimageValidation();
		System.out.println("Section 5 is Completed");
	}

public static void validateOperatorLogo()
{
	WebElement operatorLogo = driver.findElement(By.xpath("//img[@alt='Bell']"));
	UtilityMethods.DisplayEnableValidator(operatorLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
	UtilityMethods.Imagevalidation(operatorLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");
	
} 

public static void validateCompanyLogo()
{
	WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));
	UtilityMethods.DisplayEnableValidator(companyLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
	UtilityMethods.Imagevalidation(companyLogo,"src",allInputValue.getProperty("companyLogo"),"Cisco Jasper Company Logo");
	
}

public static void sectionOneIotStarterKitValidation()
{
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//section[@id='hero-wrp']//a/button[text()='Request Referral Code']")), "NotEqual","Request Referral Code Button in IoT Starter Kit");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div/a[text()='Track Order'][@class='btn-cus-bdr btn btn-cs-sm bl-en-trk-cd f12']")), "NotEqual","Track Order Button  in IoT Starter Kit");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form[@id='hmeRefTrack']//a")), "NotEqual","Track Order on Click Button in IoT Starter Kit");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Enter Referral Code']")), "NotEqual","Enter Referral Code Button in IoT Starter Kit");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Order Kit']")), "NotEqual","Order kit on Click Button in IoT Starter Kit");
}


public static void sectionOneIotStarterKitTrackOrderValidation() 
{
	UtilityMethods.DisplayEnableValidator(driver.findElements(By.xpath("//div/a[text()='Track Order']")).get(0), "NotEqual","Track Order Button  in IoT Starter Kit");
	driver.findElement(By.xpath("//div[@class='bl-val-chnge pb30']/a[text()='Track Order']")).click();
	try 
	{
		Thread.sleep(3000);
	} 
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
	
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//form[@id='hmeRefTrack']//a")), "NotEqual","Track Order on click Button in IoT Starter Kit Track Order");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//h4[text()='Track Order']")), "NotEqual","Track Order on Click Text in IoT Starter Kit Track Order");
	WebElement trackOrderEmailId= driver.findElement(By.id("emailId"));
	UtilityMethods.DisplayEnableValidator(trackOrderEmailId, "NotEqual","Enter Email ID Text Box in IoT Starter Kit Track Order");
	UtilityMethods.StringValidation("Enter Email Address", trackOrderEmailId.getAttribute("placeholder"),"equals");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='bl-ref-inpt-grp bl-email']//span")), "NotEqual","Track Order Close Button in IoT Starter Kit");
	driver.findElement(By.xpath("//div[@class='bl-ref-inpt-grp bl-email']//span")).click();

	
}

public static void sectionOneIotStarterKitEnterReferralCodeValidation()
{

	WebElement enterReferralCode= driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Enter Referral Code']"));
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Enter Referral Code']")), "NotEqual","Enter Referral Code Button in IoT Starter Kit");	
	enterReferralCode.click();
	try 
	{
		Thread.sleep(3000);
	} 
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
	
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Order Kit']")), "NotEqual","OrderKit Button in IoT Starter Kit ");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//h4[text()='Enter Referral Code']")), "NotEqual","Enter Referral Code Text in IoT Starter Kit ");
	WebElement enterReferralCodeTextBox= driver.findElement(By.id("referral"));
	UtilityMethods.DisplayEnableValidator(enterReferralCodeTextBox, "NotEqual","Enter Referral Code Text Box in IoT Starter Kit Track Order");
	UtilityMethods.StringValidation("Enter Referral Code", enterReferralCodeTextBox.getAttribute("placeholder"),"equals");
	UtilityMethods.DisplayEnableValidator(driver.findElements(By.xpath("//span[@class='bl-close ion-android-close']")).get(1), "NotEqual","Enter Referral Code Close Button in IoT Starter Kit");
	WebElement enterReferralCodeCloseIcon=driver.findElements(By.xpath("//span[@class='bl-close ion-android-close']")).get(0);
	enterReferralCodeCloseIcon.click();
	
}

public static void sectionOneIotStarterKitBellValidation()
{
	UtilityMethods.StringValidation(driver.findElement(By.xpath("//h1")).getText().replace("\n", " "), "Discover Internet of Things from Bell.", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElement(By.xpath(".//*[@id='hero-wrp']//h3")).getText(), "IoT Starter Kit", "equalsignorecase");	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//div//p")).get(0).getText().replace("\n", " "), "Growth opportunities are everywhere, and IoT technologies from Bell can help you uncover them.", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//div//p")).get(1).getText().replace("\n", " "), "To order a kit that includes 3 test SIM cards (retail value: $199) you must have a referral code.", "equalsignorecase");
}
public static void sectionOneIotStarterKitPageNavigation()
{
	//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//section[@id='hero-wrp']//button")), driver.findElement(By.xpath("//input[@type='submit']")));
	
	driver.findElement(By.xpath("//div[@class='bl-val-chnge pb30']/a[text()='Track Order']")).click();
	try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
	driver.findElement(By.xpath("//input[@id='emailId']")).clear();
	driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("basheer.ahamed@ctela.com");
	//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//form[@id='hmeRefTrack']//a")), driver.findElement(By.xpath("//div[@class='text-center']/a")));
	driver.findElement(By.xpath("//form[@id='hmeRefTrack']//a")).click();
	try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='text-center']/a")), "NotEquals", "page navigation Error");
	driver.navigate().back();
	
	driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Enter Referral Code']")).click();
	try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
	driver.findElement(By.xpath("//input[@id='referral']")).clear();
	driver.findElement(By.xpath("//input[@id='referral']")).sendKeys("Bell7640");
	//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Order Kit']")), driver.findElement(By.xpath("//input[@id='create_cc']")));
	//driver.findElement(By.xpath("//section[@id='hero-wrp']//a[text()='Order Kit']")).click();
	//try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
	//UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='create_cc']")), "NotEquals", "page navigation Error");
	driver.findElement(By.xpath("//div[@id='ctrlAcc']//button")).click();
	
	
	
}
public static void sectionOneIotStarterKitErrorMessageValidation() 
{
   //UtilityMethods.InputValidation(driver.findElement(By.xpath("//div[@class='bl-val-chnge pb30']/a[text()='Track Order']")), driver.findElement(By.xpath("//input[@id='emailId']")), "basheer.ahamed@ctela.com,gokularamanancse@gmail.com,vsubram4@cisco.com", driver.findElement(By.xpath("//form[@id='hmeRefTrack']//a")));
	
	
	/*for (String retval: TrackOrderValidInput.split(","))
	{
		System.out.println("The Valid Email Id Is"+retval);
		driver.findElement(By.xpath("//div[@class='bl-val-chnge pb25']/a[text()='Track Order']")).click();
		try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.xpath("//input[@id='emailId']")).clear();
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys(retval);
		driver.findElement(By.xpath("//form[@id='hmeRefTrack']//a")).click();
		try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='text-center']/a")), "NotEquals", "page navigation Error");
		driver.navigate().back();
	}*/
}


public static void sectionFiveContentValidation()
{
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//h3")).get(0).getText(), "You get more with Bell", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//p")).get(0).getText(), "With Canada�s largest LTE network, your business is covered from coast to coast. We also work with a robust network IoT partners and hardware providers to meet your unique business needs.", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//p")).get(1).getText(), "With the largest support team in Canada, Bell has more than 3,000 certified professionals ready to help you design, implement and manage a mobile solution that best fits your needs, all backed by 24/7 bilingual support.", "equalsignorecase");	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//h3")).get(1).getText(), "1. Dependable coverage with Canada�s largest LTE network", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//p")).get(2).getText(), "Canada�s largest LTE network. Bell covers over 32 million Canadians from coast to coast ensuring you can stay connected to your business, employees and customers wherever you are.", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//h3")).get(2).getText(), "2. A network of partners to address your needs", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//p")).get(3).getText(), "We work closely with a robust network of partners to provide the full range of IoT solutions.", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//h3")).get(3).getText(), "3. Expertise from end-to-end to help you stay connected", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@class='clearfix']//p")).get(4).getText(), "Our professionals and solution experts are focused on providing you with tailor-made IoT solutions that fit your unique business needs.", "equalsignorecase");	
}
public static void sectionFiveimageValidation()
{

    UtilityMethods.Imagevalidation(driver.findElements(By.xpath("//section[@class='clearfix']//img[@alt='4G LTE']")).get(0), "src", "http://bell.devm2m.com/img/bell/4gLTE.jpg", "LTE Network Image");
    UtilityMethods.Imagevalidation(driver.findElements(By.xpath("//section[@class='clearfix']//img[@alt='A Variety of Hardware image']")).get(0), "src", "http://bell.devm2m.com/img/bell/hardwaresol.jpg", "Network of partners to address your needs");
	UtilityMethods.Imagevalidation(driver.findElements(By.xpath("//section[@class='clearfix']//img[@alt='A team of certified professional image']")).get(0), "src", "http://bell.devm2m.com/img/bell/experts.jpg", "end-to-end to help");
}
public static void sectionFourValidation()
{
	
	UtilityMethods.Imagevalidation(driver.findElement(By.xpath("//img[@title='What is IoT']")), "src" , "http://bell.devm2m.com/img/bell/whatisiot.png", "What is IoT?");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='what-iot']//h2")).get(1).getText(), "What is IoT?", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElement(By.xpath("//section[@id='what-iot']//p//strong")).getText(), "Internet of Things (IoT) enables machines and devices to talk to each other directly or through a cloud solution in order to deliver actionable data quickly.", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElement(By.xpath("//section[@id='what-iot']//p//a")).getText(), "Learn more from your Bell representative.", "equalsignorecase");
	

	driver.findElement(By.xpath("//section[@id='what-iot']//a")).click();
	String BaseURl="https://business.bell.ca/shop/enterprise/forms/mobile-business-solutions-request-callback";
	try {

	    for(String winHandle : driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	        String actualURl = driver.getCurrentUrl();
	        if (BaseURl.equals(actualURl))
	        {
	        System.out.println("The page is navigated correctly");
	       // driver.close();
	        //driver.navigate().back();
	        driver.navigate().to("http://bell.devm2m.com/");
	        }
	        
	    }
	    }
	
	catch(Exception e)
	{
	   System.out.println("Condition fail");
	}	
	
}
public static void sectionThreeValidations()
{
	UtilityMethods.StringValidation(driver.findElement(By.xpath("//section[@id='how-works']//h2")).getText(), "How it Works", "equalsignorecase");
	UtilityMethods.howItWorksValidation(driver.findElements(By.xpath("//div[@class='col-sm-3 col-xs-6']")).get(0), "1", "Buy", "Place an order for your IoT Starter Kit (retail value: $199) using your referral code.");
	UtilityMethods.howItWorksValidation(driver.findElements(By.xpath("//div[@class='col-sm-3 col-xs-6']")).get(1), "2", "Activate", "Receive access credentials to the Bell Control Center platform to manage device connectivity.");
	UtilityMethods.howItWorksValidation(driver.findElements(By.xpath("//div[@class='col-sm-3 col-xs-6']")).get(2), "3", "Create", "Install your SIMs in your test devices and use Control Center to connect them to Bell's network and your IoT applications.");
	UtilityMethods.howItWorksValidation(driver.findElements(By.xpath("//div[@class='col-sm-3 col-xs-6']")).get(3), "4", "Launch", "After completing your tests, you are now ready to launch your connected device services with Bell on Canada�s fastest network.");	
}
public static void sectionTwoImageValidation()
{
	UtilityMethods.Imagevalidation(driver.findElement(By.xpath("//img[@alt='sim']")), "src" , allInputValue.getProperty("simImage"), "Sim Icon");
	UtilityMethods.Imagevalidation(driver.findElement(By.xpath("//img[@alt='tool']")), "src" , allInputValue.getProperty("toolImage"), "Tools Icon");
	UtilityMethods.Imagevalidation(driver.findElement(By.xpath("//img[@alt='center']")), "src" , allInputValue.getProperty("acessImage"), "Access Icon");
	UtilityMethods.Imagevalidation(driver.findElement(By.xpath("//img[@alt='support']")), "src" , allInputValue.getProperty("supportImage"), "support Icon");
}
public static void sectionTwoContentValidation()
{
	//UtilityMethods.whatTheKitIncludesValidation(driver.findElements(By.xpath("//div[contains(@class,'col-sm-6 col-md-4 col-xs-12')]")).get(0), driver.findElements(By.xpath("//div[contains(@class,'col-sm-6 col-md-4 col-xs-12')]//img")).get(0), allInputValue.getProperty("toolImage"),allInputValue.getProperty("kitIncludesCol1"));
	
	
	
	UtilityMethods.StringValidation(driver.findElement(By.xpath("//section[@id='kit-inc']//h2")).getText(), "What the Kit Includes", "equalsignorecase");
	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//h3")).get(0).getText(), "3 SIMS", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//h3")).get(1).getText(), "30 MB/SIM", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//h3")).get(2).getText(), "50 SMS", "equalsignorecase");
	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//p")).get(0).getText(), "with Bell Connectivity", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//p")).get(1).getText(), "per month for 3 months", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//p")).get(2).getText(), "messages per SIM per month", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//p")).get(3).getText(), "Please note: You must be using a Bell certified device or module to order the Bell M2M IoT starter kit. The IoT starter kit is currently not available outside of Canada.", "equalsignorecase");
	
	 
	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//h4")).get(0).getText(), "Real-Time Testing Tool", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//h4")).get(1).getText().replace("\n", " "), "Full Access to Control Center", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//h4")).get(2).getText().replace("\n", " "), "Exceptional Developer Support", "equalsignorecase");
	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(0).getText(), "Test-as-you-build for fast, quality development", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(1).getText(), "Visibility into device and network behavior", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(2).getText(), "Diagnostics and troubleshooting help", "equalsignorecase");
	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(3).getText(), "Complete suite of developer tools", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(4).getText(), "User logins for everyone on your team", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(5).getText(), "Same environment for testing and deployment", "equalsignorecase");
	
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(6).getText(), "Developer guidelines and M2M.comforum", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(7).getText(), "Access to APIs", "equalsignorecase");
	UtilityMethods.StringValidation(driver.findElements(By.xpath("//section[@id='kit-inc']//li")).get(8).getText(), "Accelerated device certification", "equalsignorecase");
	
}
public static void sectionTwoValidation()
{
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//section[@id='kit-inc']//a[text()='M2M.com']")), "NotEqual", "M2M.com Link");
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//section[@id='kit-inc']//a[text()='Request Referral Code']")), "NotEqual", "Request Referral Code Link");
    
	UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@id='fixedTab']//a[text()='What the Kit Includes']")), "NotEquals", "What the Kit Includes");
    UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@id='fixedTab']//a[text()='How it Works']")), "NotEquals", "How it Works");
    UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@id='fixedTab']//a[text()='What is IoT ?']")), "NotEquals", "What is IoT ?");
	
//	UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//section[@id='kit-inc']//a[text()='M2M.com']")), "http://devkit.m2m.com/");
	//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//section[@id='kit-inc']//a[text()='Request Referral Code']")), "http://bell.devm2m.com/form/referral/request");

	//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//div[@id='fixedTab']//a[text()='What the Kit Includes']")), "http://bell.devm2m.com/");
   // UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//div[@id='fixedTab']//a[text()='How it Works']")), "http://bell.devm2m.com/");
   // UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//div[@id='fixedTab']//a[text()='What is IoT ?']")), "http://bell.devm2m.com/");
}
}

