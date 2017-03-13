package pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseDriver;

public class BellEndToEndFlowTwo extends BaseDriver
{
	public static FirefoxDriver driver;
	static Properties allInputValue;

	@BeforeTest
	public static void BrowserIntilation() throws Exception
	{
		driver = BellControlCenter.start();
	}
	@Test(priority=1)
	public static void CCDisplayedAndEnabledValidation()
	{
		BellControlCenter.CCDisplayedAndEnabledValidation();
	}
	@Test(priority=2)
	public static void CCContentValidation()
	{
		BellControlCenter.CCContentValidation();
	}
	@Test(priority=3)
	public static void CCPlaceHolderValidation()
	{
		BellControlCenter.CCPlaceHolderValidation();
	}
	@Test(priority=4)
	public static void CCRequiredFieldValidation()
	{
		BellControlCenter.CCRequiredFieldValidation();
	}
	@Test(priority=5)
	public static void CCUserNameMinMaxValidation()
	{
		BellControlCenter.CCUserNameMinMaxValidation();
	}
	@Test(priority=6)
	public static void CCPasswordValidation()
	{
		BellControlCenter.CCPasswordValidation();
	}
	@Test(priority=7)
	public static void InputValidation()
	{
		BellControlCenter.InputValidation();
	}
	@Test(priority=11)
	public static void referralRequestDataValidation()
	{
		BellYourInfo.referralRequestDataValidation();
	}
	@Test(priority=10)
	public static void TermsOfServiceTextValidation()
	{
		BellYourInfo.TermsOfServiceTextValidation();
	}
	@Test(priority=9)
	public static void TermsOfServicePopUpCloseIcon()
	{
		BellYourInfo.TermsOfServicePopUpCloseIcon();
	}
	@Test(priority=8)
	public static void TermsOfServicePopUpCloseButton()
	{
		BellYourInfo.TermsOfServicePopUpCloseButton();
	}
	@Test(priority=12)
	public static void TermsOfServicePDFDownload() throws AWTException
	{
		//BellYourInfo.TermsOfServicePDFDownload();
	}
	@Test(priority=13)
	public static void YourInfoBellLogo()
	{
		BellYourInfo.validateOperatorLogo();
	}
	
	@Test(priority=14)
	public static void YourInfoCompanyLogo()
	{
		BellYourInfo.validateCompanyLogo();
	}
	
	@Test(priority=15)
	public static void YourInfoTextValiadtion()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BellYourInfo.ReferralRequestTextValidation();

	}
	
	@Test(priority=16)
	public static void YourInfoTextBoxDisplayedAndEnabled()
	{
		BellYourInfo.RequestReferralCodeTextBoxDisplayedAndEnabled();
	}
	
	@Test(priority=17)
	public static void YourInfoLabelDisplayedAndEnabled()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BellYourInfo.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@Test(priority=19)
	public static void YourInfoValidInputValidation()
	{
		BellYourInfo.ReferralRequestCodeValidInputValidation();
	}

	@Test(priority=20)
	public static void YourInfoRequiredFieldValidation()
	{
		BellYourInfo.ReferralRequestRequiredFieldValidation();
	}
		
	@Test(priority=21)
	public static void YourInfoSpaceNotAllowedValiadation()
	{
		BellYourInfo.ReferralRequestSpaceNotAllowedValidation();
	}
	@Test(priority=22)
	public static void YourInfoMaximumInputValidation()
	{
		BellYourInfo.ReferralRequestMaximumInputValidation();
	}

	@Test(priority=23)
	public static void YourInfoMinimumInputValidation()
	{
		BellYourInfo.ReferralRequestMinimumInputValidation();
	}
	
	@Test(priority=24)
	public static void YourInfoEmailValidation()
	{
		BellYourInfo.ReferralRequestEmailValidation();
	}
	
	@Test(priority=25)
	public static void YourInfoNumericFeild()
	{
		BellYourInfo.ReferralRequestNumericFieldValidation();
	}
	
	@Test(priority=26)
	public static void YourInfoBellLogoValidation() throws InterruptedException
	{
		BellYourInfo.BellLogoValidation();
	}
	
	@Test(priority=27)
	public static void YourInfoBellCaLinkvalidation() throws InterruptedException
	{
		BellYourInfo.BellCALinkValidation();
	}
	
	@Test(priority=28)
	public static void YourInfocancelButton() throws InterruptedException
	{
		BellYourInfo.ReferralrequestCancelButton();
	}
	
}