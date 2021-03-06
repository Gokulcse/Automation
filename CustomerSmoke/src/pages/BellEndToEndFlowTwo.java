package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class BellEndToEndFlowTwo extends BaseDriver
{
	public static WebDriver driver;
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
		UtilityMethods.sleep(4000);
		try {BellYourInfo.intial();} catch (IOException e) {e.printStackTrace();}
		UtilityMethods.sleep(2000);
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
		BellYourInfo.TermsOfServicePDFDownload();
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
		UtilityMethods.sleep(2000);
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
		UtilityMethods.sleep(2000);
		BellYourInfo.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@Test(priority=18)
	public static void YourInfoValidInputValidation()
	{
		BellYourInfo.ReferralRequestCodeValidInputValidation();
	}

	@Test(priority=19)
	public static void YourInfoRequiredFieldValidation()
	{
		BellYourInfo.ReferralRequestRequiredFieldValidation();
	}
		
	@Test(priority=20)
	public static void YourInfoSpaceNotAllowedValiadation()
	{
		BellYourInfo.ReferralRequestSpaceNotAllowedValidation();
	}
	
	@Test(priority=21)
	public static void YourInfoMaximumInputValidation()
	{
		BellYourInfo.ReferralRequestMaximumInputValidation();
	}

	@Test(priority=22)
	public static void YourInfoMinimumInputValidation()
	{
		BellYourInfo.ReferralRequestMinimumInputValidation();
	}
	
	@Test(priority=23)
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
	public static void YourInfocontinueButton() throws InterruptedException, IOException
	{
		BellYourInfo.RequestButtonValidation();
		UtilityMethods.sleep(4000);
	}
	
	@Test(priority=30)
	public static void ShippingInfovalidateOperatorLogo() throws Exception
	{	
		driver.navigate().refresh();
		UtilityMethods.sleep(4000);
		try {BellShippingInfo.Start();} catch (IOException e) {e.printStackTrace();}
		//driver.navigate().refresh();
		UtilityMethods.sleep(5000);
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
		BellShippingInfo.ShippingBellLogoValidation();
	}
	
	@Test(priority=41)
	public static void ShippingInfoCancelButtonValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingCancelButtonValidation();
	}
	
	@Test(priority=42)	
	public static void ShippingInfoBackButtonValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingBackButtonValidation();
	}
	
	@Test(priority=43)	
	public static void ShippingInfoSendInputs()
	{
		BellShippingInfo.ShippingInfoSendInputs();
	}
	
	@Test(priority=44)
	public static void BillingInfovalidateOperatorLogo()
	{	
		UtilityMethods.sleep(4000);
		try {BellBillingInfo.Start();} catch (Exception e) {e.printStackTrace();}
		UtilityMethods.sleep(2000);
		BellBillingInfo.validateOperatorLogo();
		
	} 
	
	@Test(priority=45)
	public static void BillingInfovalidateCompanyLogo()
	{	
		BellBillingInfo.validateCompanyLogo();
	}
	
	@Test(priority=46)
	public static void BillingInfoTextvalidation()
	{	
		BellBillingInfo.BillingInfoTextvalidation();
	}
	
	@Test(priority=47)
	public static void BillingCardDetailsLabelText()
	{	
		BellBillingInfo.BillingCardDetailsLabelText();
	}
	
	@Test(priority=48)
	public static void BillingCardDetailsInputFieldValidation()
	{	
		BellBillingInfo.BillingCardDetailsInputFieldValidation();
	}
	
	@Test(priority=49)
	public static void BillingCheckBoxVaildation()
	{
		BellBillingInfo.BillingCheckBoxVaildation();
	}
	
	@Test(priority=50)
	public static void BillingInfoLabelText()
	{
		BellBillingInfo.BillingInfoLabelText();
	}
	
	@Test(priority=51)
	public static void BillingInfoInputField()
	{
		BellBillingInfo.BillingInfoInputField();
	}
	
	@Test(priority=52)
	public static void BillingInfoRequiredFieldvalidatoin()
	{	
		BellBillingInfo.BillingInfoRequiredFieldvalidatoin();
	}
	
	@Test(priority=53)
	public static void BillingInfoSpaceNotAllowedvalidatoin()
	{
		BellBillingInfo.BillingInfoSpaceNotAllowedvalidatoin();
	}
	
	@Test(priority=54)
	public static void BillingInfoMaximumInputValidation()
	{	
		BellBillingInfo.BillingInfoMaximumInputValidation();
	}
	
	@Test(priority=55)
	public static void  BillingInfoMinimumInputValidation()
	{
		BellBillingInfo.BillingInfoMinimumInputValidation();	
	}
	
	@Test(priority=56)
	public static void BellLogoValidation() throws InterruptedException
	{
		BellBillingInfo.BellLogoValidation();
	}
	
	@Test(priority=57)
	public static void CancelButtonValidation() throws InterruptedException
	{
		BellBillingInfo.CancelButtonValidation();
	}
	
	@Test(priority=58)
	public static void BackButtonValidation() throws InterruptedException
	{
		BellBillingInfo.BackButtonValidation();
	}
	
	@Test(priority=59)
	public static void BillingInfoSendInputs()
	{
		BellBillingInfo.BillingInfoSendInputs();
	}
	
	@Test(priority=60)
	public static void ReviewConfirmOperatorLogo()
	{
		try {
			BellReviewConfirm.Start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		UtilityMethods.sleep(4000);
		BellReviewConfirm.validateOperatorLogo();
	} 
	
	@Test(priority=61)
	public static void ReviewConfirmCompanyLogo()
	{	
		BellReviewConfirm.validateCompanyLogo();
	}
	
	@Test(priority=62)
	public static void ReviewConfirmHeadertextValidation()
	{
		BellReviewConfirm.HeadertextValidation();
	}
	
	@Test(priority=63)
	public static void ReviewConfirmSectionOneTextValidation()
	{
		BellReviewConfirm.SectionOneTextValidation();
	}
	
	@Test(priority=64)
	public static void ReviewConfirmShippingBillingAddressValidation()
	{
		BellReviewConfirm.ShippingBillingAddressValidation();
	}
	
	@Test(priority=65)
	public static void ReviewConfirmEditButtons()
	{
		BellReviewConfirm.EditButtonsValidation();
	}
	
	@Test(priority=66)
	public static void ReviewConfirmBellLogo() throws InterruptedException
	{
		BellReviewConfirm.BellLogoValidation();
	}
	
	@Test(priority=67)
	public static void ReviewConfirmCancelButton() throws InterruptedException
	{
		BellReviewConfirm.CancelButtonValidation();
	}
	
	@Test(priority=68)
	public static void ShippingEditButtonValidation() throws InterruptedException
	{
		BellReviewConfirm.ShippingEditButtonValidation();
	}
	//@Test(priority=69)
	public static void BillingEditButtonValidation() throws InterruptedException
	{
		BellReviewConfirm.BillingEditButtonValidation();
	}

	@Test(priority=70)
	public static void ReviewConfirmButton()
	{
		BellReviewConfirm.ConfirmButtonClick();
	
	}
	
	@Test(priority=71)
	public static void OrderSummaryBellLogo()
	{
		UtilityMethods.sleep(4000);
		try {BellOrderSummary.Start();} catch (Exception e) {e.printStackTrace();}
		UtilityMethods.sleep(4000);
		BellOrderSummary.validateOperatorLogo();
	}
	
	@Test(priority=72)
	public static void OrderSummaryCompanyLogo()
	{	
		BellOrderSummary.validateCompanyLogo();
	}
	
	@Test(priority=73)
	public static void OrderSummaryHeadertextValidation()
	{
		BellOrderSummary.HeadertextValidation();
	}
	@Test(priority=74)
	public static void orderSummaryShipBillAddressVAlidation()
	{
		BellOrderSummary.ShipBillAddressValidation();
	}
	
	@Test(priority=75)
	public static void OrderSummarysectionTwoTextValidation()
	{
		BellOrderSummary.sectionTwoTextValidation();
	}
	
	@Test(priority=76)
	public static void OrderSummarysectionThreeTextValidation()
	{
		BellOrderSummary.sectionThreeTextValidation();
	}
	
	@Test(priority=77)
	public static void OrderSummaryBellLogoValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneBellLogoValidation();
	}
	
	@Test(priority=78)
	public static void OrderSummaryBackToIOTValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneBackToIOTValidation();
	}
	
	@Test(priority=79)
	public static void OrderSummaryTrackOrderValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneTrackOrderValidation();
	}
	
	@Test(priority=80)
	public static void OrderSummaryhomePageLinkvalidation() throws InterruptedException
	{
		BellOrderSummary.homePageLinkvalidation();
	}
	
}
