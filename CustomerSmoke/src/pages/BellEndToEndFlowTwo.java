package pages;

import java.awt.AWTException;
import java.io.IOException;
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
	@Test(priority=8)
	public static void referralRequestDataValidation()
	{
		driver.navigate().refresh();
		try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
		try {
			BellYourInfo.intial();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

		BellYourInfo.referralRequestDataValidation();
	}
	@Test(priority=9)
	public static void TermsOfServiceTextValidation()
	{
		BellYourInfo.TermsOfServiceTextValidation();
	}
	@Test(priority=10)
	public static void TermsOfServicePopUpCloseIcon()
	{
		BellYourInfo.TermsOfServicePopUpCloseIcon();
	}
	@Test(priority=11)
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
	@Test(priority=29)
	public static void YourInfocontinueButton() throws InterruptedException
	{
		BellYourInfo.RequestButtonValidation();
		try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	@Test(priority=30)
	public static void ShippingInfovalidateOperatorLogo() throws Exception
	{	
		driver.navigate().refresh();
		try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
		try {BellShippingInfo.Start();} catch (IOException e) {e.printStackTrace();}
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		BellShippingInfo.validateOperatorLogo();
	} 
	@Test(priority=31)
	public static void ShippingInfovalidateCompanyLogo()
	{	
		BellShippingInfo.validateCompanyLogo();	
	}
	@Test(priority=32)
	public static void ShippingInfoTextvalidation()
	{
		BellShippingInfo.ShippingInfoTextvalidation();
	}
	@Test(priority=33)
	public static void shippingInfoLabelText()
	{
		BellShippingInfo.shippingInfoLabelText();
	}
	@Test(priority=34)
	public static void shippingInfoInputField()
	{
		BellShippingInfo.shippingInfoInputField();
	}
	@Test(priority=35)
	public static void ShippingInfoLinkButton()
	{
		BellShippingInfo.ShippingInfoLinkButton();
	}
	@Test(priority=36)
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		BellShippingInfo.ShippingInfoRequiredFieldvalidatoin();
	}
	@Test(priority=37)
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		BellShippingInfo.ShippingInfoSpaceNotAllowedvalidatoin();
	}
	@Test(priority=38)
	public static void ShippingInfoMaximumInputValidation()
	 {
		BellShippingInfo.ShippingInfoMaximumInputValidation();
	 }
	@Test(priority=39)
	public static void  ShippingInfoMinimumInputValidation()
	{
		BellShippingInfo.ShippingInfoMinimumInputValidation();
	}
	@Test(priority=40)	
	public static void ShippingInfoBellLogoValidation() throws InterruptedException
	{
		BellShippingInfo.BellLogoValidation();
	}
	@Test(priority=41)
	public static void ShippingInfoCancelButtonValidation() throws InterruptedException
	{
		BellShippingInfo.CancelButtonValidation();
	}
	@Test(priority=42)	
	public static void ShippingInfoBackButtonValidation() throws InterruptedException
	{
		BellShippingInfo.BackButtonValidation();
	}
	@Test(priority=43)	
	public static void ShippingInfoSendInputs()
	{
		BellShippingInfo.ShippingInfoSendInputs();
	}
	
}
