package driver;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import bell.BellBillingInfo;
import bell.BellControlCenter;
import bell.BellHomePage;
import bell.BellOrderSummary;
import bell.BellReferralRequestPage;
import bell.BellReferralRequestThankYou;
import bell.BellReviewConfirm;
import bell.BellShippingInfo;
import bell.BellTrackOrder;
import bell.BellYourInfo;
import pages.AdminOperation;
import pages.EmailIntegration;
import utilitymethods.UtilityMethods;

public class Test extends BaseDriver
{
	public static WebDriver driver;
	static Properties allInputValue;

	@org.testng.annotations.BeforeTest
	public static void DeletingPreviousEmail()
	{
		EmailIntegration.DeleteAllEmail();
	}

	@org.testng.annotations.Test(priority=1)
	public static void BrowserIntilation() throws Exception
	{
		driver = BellHomePage.start();
	}

	@org.testng.annotations.Test(priority=2)
	public static void HomePageBellLogo() 
	{
		BellHomePage.validateOperatorLogo();
	}
	@org.testng.annotations.Test(priority=3)
	public static void HomePageCiscoLogo()
	{
		BellHomePage.validateCompanyLogo();
	}
	@org.testng.annotations.Test(priority=4)
	public static void HomePageSecOneTextValidation()
	{
		BellHomePage.sectionOneIotStarterKitBellValidation();
	}
	@org.testng.annotations.Test(priority=5)
	public static void HomePageTrackOrderValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitTrackOrderValidation();	
	}
	@org.testng.annotations.Test(priority=6)
	public static void HomePageReferralCodeValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitEnterReferralCodeValidation();
	}
	@org.testng.annotations.Test(priority=7)
	public static void HomePageTrackOrderErrorValidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitTrackOrderErrorValidation();
	}
	@org.testng.annotations.Test(priority=8)
	public static void HomePageEnterrefrralCodeErrorvalidation() throws InterruptedException
	{
		BellHomePage.sectionOneIotStarterKitReferralCodeErrorValidation();
	}
	@org.testng.annotations.Test(priority=9)
	public static void HomePageSecTwoContentValidation()
	{
		BellHomePage.sectionTwoWhatThekitIncludesContentvalidation();
	} 
	@org.testng.annotations.Test(priority=10)
	public static void HomePageSecTwoWhatThekitIncludesToolsvalidation()
	{
		BellHomePage.sectionTwoWhatThekitIncludesToolsvalidation();
	}	
	@org.testng.annotations.Test(priority=11)
	public static void HomePageSecTwoWhatThekitIncludesCentervalidation()  
	{	
		BellHomePage.sectionTwoWhatThekitIncludesCentervalidation();
	}
	@org.testng.annotations.Test(priority=12)
	public static void HomePagesectionTwoWhatThekitIncludesSuppportvalidation()
	{	
		BellHomePage.sectionTwoWhatThekitIncludesSuppportvalidation();
	}
	@org.testng.annotations.Test(priority=13)
	public static void HomePagesectionThreeHowItWorksValidation()
	{	
		BellHomePage.sectionThreeHowItWorksValidation();
	}	
	@org.testng.annotations.Test(priority=14)
	public static void HomePagesectionFourWhatIsIotValidation()
	{		
		BellHomePage.sectionFourWhatIsIotValidation();
	}
	@org.testng.annotations.Test(priority=15)
	public static void HomePagesectionOneLinkvalidation() throws Exception
	{		
		BellHomePage.sectionOneLinkvalidation();
	}
	@org.testng.annotations.Test(priority=16)
	public static void HomePagesectionFiveWithBell()
	{	
		BellHomePage.sectionFiveWithBell();
	}
	@org.testng.annotations.Test(priority=17)
	public static void HomePagesectionFiveLTE()
	{	
		BellHomePage.sectionFiveLTE();
	}
	@org.testng.annotations.Test(priority=18)
	public static void HomePagesectionFivePartners()
	{	
		BellHomePage.sectionFivePartners();
	}
	@org.testng.annotations.Test(priority=19)
	public static void HomePagesectionFiveEndToEnd()
	{
		BellHomePage.sectionFiveEndToEnd();
	}
	@org.testng.annotations.Test(priority=20)
	public static void HomePageLearnMoreFromBell() throws InterruptedException
	{
		BellHomePage.sectionFourLearnMoreFromBell();
	}
	@org.testng.annotations.Test(priority=21)
	public static void HomePageSecOneReferralRequesButton() throws InterruptedException
	{
		BellHomePage.sectionOneReferralRequestvalidation();
	}
	@org.testng.annotations.Test(priority=22)
	public static void HomePageM2MDotComvalidation() throws InterruptedException, IOException
	{
		BellHomePage.sectionTwoM2MDotCom();		
	}
	@org.testng.annotations.Test(priority=23)
	public static void HomePageSectwoReferralRequestButton() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		BellHomePage.sectionTwoReferralRequestvalidation();
	}
	@org.testng.annotations.Test(priority=24)
	public static void HomePageBellLogoValidation() throws InterruptedException
	{
		BellHomePage.bellLogoValidation(); 

	}
	@org.testng.annotations.Test(priority=25)
	public static void sectionOneReferralRequestvalidation() throws Exception
	{
		UtilityMethods.sleep(4000);
		try {allInputValue=UtilityMethods.getBellPropValues();} catch (IOException e) {e.printStackTrace();}
		BrowserForUse=allInputValue.getProperty("Broswer");
		if(BrowserForUse.equals("Chrome")||BrowserForUse.equals("IE"))
		{
			driver.navigate().forward();
			UtilityMethods.sleep(4000);
			BellHomePage.ReferralRequestButtonRedirection();
			UtilityMethods.sleep(4000);
		}
		else
		{
			UtilityMethods.sleep(4000);
			BellHomePage.ReferralRequestButtonRedirection();
			UtilityMethods.sleep(4000);
		}
	}
	@org.testng.annotations.Test(priority=26)
	public static void ReferralRequestBellLogo() throws Exception
	{
		BellReferralRequestPage.BrowserIntilation();
		BellReferralRequestPage.validateOperatorLogo();
	}

	@org.testng.annotations.Test(priority=27)
	public static void ReferralRequestCompanyLogo()
	{
		BellReferralRequestPage.validateCompanyLogo();
	}

	@org.testng.annotations.Test(priority=28)
	public static void ReferralRequestTextValiadtion()
	{
		UtilityMethods.sleep(2000);
		BellReferralRequestPage.ReferralRequestTextValidation();

	}
	@org.testng.annotations.Test(priority=29)
	public static void ReferralrequestTextBoxDisplayedAndEnabled()
	{
		BellReferralRequestPage.RequestReferralCodeTextBoxDisplayedAndEnabled();
	}

	@org.testng.annotations.Test(priority=30)
	public static void ReferralrequestLabelDisplayedAndEnabled()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BellReferralRequestPage.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@org.testng.annotations.Test(priority=31)
	public static void ReferralRequestPlaceHolderValidation()
	{
		BellReferralRequestPage.RequestReferralCodePlaceholderValidation();
	}
	@org.testng.annotations.Test(priority=32)
	public static void ReferralRequestValidInputValidation()
	{
		BellReferralRequestPage.ReferralRequestCodeValidInputValidation();
	}

	@org.testng.annotations.Test(priority=33)
	public static void ReferrakRequestRequiredFieldValidation()
	{
		BellReferralRequestPage.ReferralRequestRequiredFieldValidation();
	}

	@org.testng.annotations.Test(priority=34)
	public static void ReferralrequestSpaceNotAllowedValiadation()
	{
		BellReferralRequestPage.ReferralRequestSpaceNotAllowedValidation();
	}
	@org.testng.annotations.Test(priority=35)
	public static void ReferralRequestMaximumInputValidation()
	{
		BellReferralRequestPage.ReferralRequestMaximumInputValidation();
	}

	@org.testng.annotations.Test(priority=36)
	public static void ReferralRequestMinimumInputValidation()
	{
		BellReferralRequestPage.ReferralRequestMinimumInputValidation();
	}

	@org.testng.annotations.Test(priority=37)
	public static void ReferralRequestEmailValidation()
	{
		BellReferralRequestPage.ReferralRequestEmailValidation();
	}

	@org.testng.annotations.Test(priority=38)
	public static void ReferralRequestNumericFeild()
	{
		BellReferralRequestPage.ReferralRequestNumericFieldValidation();
	}

	@org.testng.annotations.Test(priority=39)
	public static void ReferralRequestBellLogoValidation() throws InterruptedException
	{
		BellReferralRequestPage.BellLogoValidation();
	}

	@org.testng.annotations.Test(priority=40)
	public static void ReferralRequestBellCaLinkvalidation() throws InterruptedException
	{
		BellReferralRequestPage.BellCALinkValidation();
	}

	@org.testng.annotations.Test(priority=41)
	public static void RferrralRequestcancelButton() throws InterruptedException
	{
		BellReferralRequestPage.ReferralrequestCancelButton();
	}

	@org.testng.annotations.Test(priority=42)
	public static void ReferralRequestButtonvalidation() throws InterruptedException
	{
		BellReferralRequestPage.RequestButtonValidation();	
		Thread.sleep(3000);

	}
	@org.testng.annotations.Test(priority=43)
	public static void ThankYouBellLogo() throws Exception
	{
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BellReferralRequestThankYou.BrowserIntilation();
		BellReferralRequestThankYou.validateOperatorLogo();
	}
	@org.testng.annotations.Test(priority=44)
	public static void ThankYouCiscoLogo()
	{
		BellReferralRequestThankYou.validateCompanyLogo();
	}
	@org.testng.annotations.Test(priority=45)
	public static void ThankYouTextvalidation()
	{
		BellReferralRequestThankYou.ThankYouTextValidation();
	}
	@org.testng.annotations.Test(priority=46)
	public static void ThankYouIOTvalidation() throws InterruptedException 
	{
		BellReferralRequestThankYou.backToIOT();
	}
	@org.testng.annotations.Test(priority=47)

	public static void ThankYouBellPageRedirection() throws InterruptedException
	{
		BellReferralRequestThankYou.bellLogoValidation();
	}

	@org.testng.annotations.Test(priority=48)
	public static void ThankYouIOTPagevalidation() throws InterruptedException
	{
		BellReferralRequestThankYou.backToIOTPageValidation();
	}

	@org.testng.annotations.Test(priority=49)

	public static void CheckingReferralRequest()
	{
		EmailIntegration.CheckEmailReceived();
	}
	@org.testng.annotations.Test(priority=50)

	public static void DeletingPrevEmail()
	{
		EmailIntegration.DeleteAllEmail();
	}

	@org.testng.annotations.Test(priority=51)
	public static void ReferralRequestAdminApproval() throws InterruptedException
	{
		AdminOperation.AdminApproval();	
	}

	@org.testng.annotations.Test(priority=52)
	public static void CheckingReferralCodeEmail()
	{
		EmailIntegration.CheckEmailReceived();	
	}

	@org.testng.annotations.Test(priority=53)
	public static void VerifyingControlCenterURL() throws Exception
	{
		driver = BellControlCenter.start();
	}

	@org.testng.annotations.Test(priority=54)
	public static void CCDisplayedAndEnabledValidation()
	{
		BellControlCenter.CCDisplayedAndEnabledValidation();
	}

	@org.testng.annotations.Test(priority=55)
	public static void CCContentValidation()
	{
		BellControlCenter.CCContentValidation();
	}

	@org.testng.annotations.Test(priority=56)
	public static void CCPlaceHolderValidation()
	{
		BellControlCenter.CCPlaceHolderValidation();
	}

	@org.testng.annotations.Test(priority=57)
	public static void CCRequiredFieldValidation()
	{
		BellControlCenter.CCRequiredFieldValidation();
	}

	@org.testng.annotations.Test(priority=58)
	public static void CCUserNameMinMaxValidation()
	{
		BellControlCenter.CCUserNameMinMaxValidation();
	}

	@org.testng.annotations.Test(priority=59)	
	public static void CCPasswordValidation()		

	{
		BellControlCenter.CCPasswordValidation();
	}

	@org.testng.annotations.Test(priority=60)
	public static void InputValidation()
	{
		BellControlCenter.InputValidation();
	}


	@org.testng.annotations.Test(priority=61)
	public static void referralRequestDataValidation()
	{
		driver.navigate().refresh();
		UtilityMethods.sleep(4000);
		try {BellYourInfo.intial();} catch (IOException e) {e.printStackTrace();}
		UtilityMethods.sleep(2000);
		BellYourInfo.referralRequestDataValidation();
	}

	@org.testng.annotations.Test(priority=62)
	public static void TermsOfServiceTextValidation()
	{
		BellYourInfo.TermsOfServiceTextValidation();
	}

	@org.testng.annotations.Test(priority=63)
	public static void TermsOfServicePopUpCloseIcon()
	{
		BellYourInfo.TermsOfServicePopUpCloseIcon();
	}

	@org.testng.annotations.Test(priority=64)
	public static void TermsOfServicePopUpCloseButton()
	{
		BellYourInfo.TermsOfServicePopUpCloseButton();
	}

	@org.testng.annotations.Test(priority=65)
	public static void TermsOfServicePDFDownload() throws AWTException
	{
		BellYourInfo.TermsOfServicePDFDownload();
	}

	@org.testng.annotations.Test(priority=66)
	public static void YourInfoBellLogo()
	{
		BellYourInfo.validateOperatorLogo();
	}

	@org.testng.annotations.Test(priority=67)
	public static void YourInfoCompanyLogo()
	{
		BellYourInfo.validateCompanyLogo();
	}

	@org.testng.annotations.Test(priority=68)
	public static void YourInfoTextValiadtion()
	{
		UtilityMethods.sleep(2000);
		BellYourInfo.ReferralRequestTextValidation();
	}

	@org.testng.annotations.Test(priority=69)
	public static void YourInfoTextBoxDisplayedAndEnabled()
	{
		BellYourInfo.RequestReferralCodeTextBoxDisplayedAndEnabled();
	}

	@org.testng.annotations.Test(priority=70)
	public static void YourInfoLabelDisplayedAndEnabled()
	{
		UtilityMethods.sleep(2000);
		BellYourInfo.RequestReferralCodeLabelTextDisplayedAndEnabled();
	}

	@org.testng.annotations.Test(priority=71)
	public static void YourInfoValidInputValidation()
	{
		BellYourInfo.ReferralRequestCodeValidInputValidation();
	}

	@org.testng.annotations.Test(priority=72)
	public static void YourInfoRequiredFieldValidation()
	{
		BellYourInfo.ReferralRequestRequiredFieldValidation();
	}

	@org.testng.annotations.Test(priority=73)
	public static void YourInfoSpaceNotAllowedValiadation()
	{
		BellYourInfo.ReferralRequestSpaceNotAllowedValidation();
	}

	@org.testng.annotations.Test(priority=74)
	public static void YourInfoMaximumInputValidation()
	{
		BellYourInfo.ReferralRequestMaximumInputValidation();
	}

	@org.testng.annotations.Test(priority=75)
	public static void YourInfoMinimumInputValidation()
	{
		BellYourInfo.ReferralRequestMinimumInputValidation();
	}

	@org.testng.annotations.Test(priority=76)
	public static void YourInfoEmailValidation()
	{
		BellYourInfo.ReferralRequestEmailValidation();
	}

	@org.testng.annotations.Test(priority=77)
	public static void YourInfoNumericFeild()
	{
		BellYourInfo.ReferralRequestNumericFieldValidation();
	}

	@org.testng.annotations.Test(priority=78)
	public static void YourInfoBellLogoValidation() throws InterruptedException
	{
		BellYourInfo.BellLogoValidation();
	}

	@org.testng.annotations.Test(priority=79)
	public static void YourInfoBellCaLinkvalidation() throws InterruptedException
	{
		BellYourInfo.BellCALinkValidation();
	}

	@org.testng.annotations.Test(priority=80)
	public static void YourInfocancelButton() throws InterruptedException
	{
		BellYourInfo.ReferralrequestCancelButton();
	}

	@org.testng.annotations.Test(priority=81)
	public static void YourInfocontinueButton() throws InterruptedException, IOException
	{
		BellYourInfo.RequestButtonValidation();
		UtilityMethods.sleep(4000);
	}

	@org.testng.annotations.Test(priority=82)
	public static void ShippingInfovalidateOperatorLogo() throws Exception
	{	
		driver.navigate().refresh();
		UtilityMethods.sleep(4000);
		try {BellShippingInfo.Start();} catch (IOException e) {e.printStackTrace();}
		//driver.navigate().refresh();
		UtilityMethods.sleep(5000);
		BellShippingInfo.validateOperatorLogo();
	} 

	@org.testng.annotations.Test(priority=83)
	public static void ShippingInfovalidateCompanyLogo()
	{	
		BellShippingInfo.validateCompanyLogo();	
	}

	@org.testng.annotations.Test(priority=84)
	public static void ShippingInfoTextvalidation()
	{
		BellShippingInfo.ShippingInfoTextvalidation();
	}

	@org.testng.annotations.Test(priority=85)
	public static void shippingInfoLabelText()
	{
		BellShippingInfo.shippingInfoLabelText();
	}

	@org.testng.annotations.Test(priority=86)
	public static void shippingInfoInputField()
	{
		BellShippingInfo.shippingInfoInputField();
	}

	@org.testng.annotations.Test(priority=87)
	public static void ShippingInfoLinkButton()
	{
		BellShippingInfo.ShippingInfoLinkButton();
	}

	@org.testng.annotations.Test(priority=88)
	public static void ShippingInfoRequiredFieldvalidatoin()
	{
		BellShippingInfo.ShippingInfoRequiredFieldvalidatoin();
	}

	@org.testng.annotations.Test(priority=89)
	public static void ShippingInfoSpaceNotAllowedvalidatoin()
	{
		BellShippingInfo.ShippingInfoSpaceNotAllowedvalidatoin();
	}

	@org.testng.annotations.Test(priority=90)
	public static void ShippingInfoMaximumInputValidation()
	{
		BellShippingInfo.ShippingInfoMaximumInputValidation();
	}

	@org.testng.annotations.Test(priority=91)
	public static void  ShippingInfoMinimumInputValidation()
	{
		BellShippingInfo.ShippingInfoMinimumInputValidation();
	}

	@org.testng.annotations.Test(priority=92)	
	public static void ShippingInfoBellLogoValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingBellLogoValidation();
	}

	@org.testng.annotations.Test(priority=93)
	public static void ShippingInfoCancelButtonValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingCancelButtonValidation();
	}

	@org.testng.annotations.Test(priority=94)	
	public static void ShippingInfoBackButtonValidation() throws InterruptedException
	{
		BellShippingInfo.ShippingBackButtonValidation();
	}

	@org.testng.annotations.Test(priority=95)	
	public static void ShippingInfoSendInputs()
	{
		BellShippingInfo.ShippingInfoSendInputs();
	}

	@org.testng.annotations.Test(priority=96)
	public static void BillingInfovalidateOperatorLogo()
	{	
		UtilityMethods.sleep(4000);
		try {BellBillingInfo.Start();} catch (Exception e) {e.printStackTrace();}
		UtilityMethods.sleep(2000);
		BellBillingInfo.validateOperatorLogo();

	} 

	@org.testng.annotations.Test(priority=97)
	public static void BillingInfovalidateCompanyLogo()
	{	
		BellBillingInfo.validateCompanyLogo();
	}

	@org.testng.annotations.Test(priority=98)
	public static void BillingInfoTextvalidation()
	{	
		BellBillingInfo.BillingInfoTextvalidation();
	}

	@org.testng.annotations.Test(priority=99)
	public static void BillingCardDetailsLabelText()
	{	
		BellBillingInfo.BillingCardDetailsLabelText();
	}

	@org.testng.annotations.Test(priority=100)
	public static void BillingCardDetailsInputFieldValidation()
	{	
		BellBillingInfo.BillingCardDetailsInputFieldValidation();
	}

	@org.testng.annotations.Test(priority=101)
	public static void BillingCheckBoxVaildation()
	{
		BellBillingInfo.BillingCheckBoxVaildation();
	}

	@org.testng.annotations.Test(priority=102)
	public static void BillingInfoLabelText()
	{
		BellBillingInfo.BillingInfoLabelText();
	}

	@org.testng.annotations.Test(priority=103)
	public static void BillingInfoInputField()
	{
		BellBillingInfo.BillingInfoInputField();
	}

	@org.testng.annotations.Test(priority=104)
	public static void BillingInfoRequiredFieldvalidatoin()
	{	
		BellBillingInfo.BillingInfoRequiredFieldvalidatoin();
	}

	@org.testng.annotations.Test(priority=105)
	public static void BillingInfoSpaceNotAllowedvalidatoin()
	{
		BellBillingInfo.BillingInfoSpaceNotAllowedvalidatoin();
	}

	@org.testng.annotations.Test(priority=106)
	public static void BillingInfoMaximumInputValidation()
	{	
		BellBillingInfo.BillingInfoMaximumInputValidation();
	}

	@org.testng.annotations.Test(priority=107)
	public static void  BillingInfoMinimumInputValidation()
	{
		BellBillingInfo.BillingInfoMinimumInputValidation();	
	}

	@org.testng.annotations.Test(priority=108)
	public static void BellLogoValidation() throws InterruptedException
	{
		BellBillingInfo.BellLogoValidation();
	}

	@org.testng.annotations.Test(priority=109)
	public static void CancelButtonValidation() throws InterruptedException
	{
		BellBillingInfo.CancelButtonValidation();
	}

	@org.testng.annotations.Test(priority=110)
	public static void BackButtonValidation() throws InterruptedException
	{
		BellBillingInfo.BackButtonValidation();
	}

	@org.testng.annotations.Test(priority=111)
	public static void BillingInfoSendInputs()
	{
		BellBillingInfo.BillingInfoSendInputs();
	}

	@org.testng.annotations.Test(priority=112)
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

	@org.testng.annotations.Test(priority=113)
	public static void ReviewConfirmCompanyLogo()
	{	
		BellReviewConfirm.validateCompanyLogo();
	}

	@org.testng.annotations.Test(priority=114)
	public static void ReviewConfirmHeadertextValidation()
	{
		BellReviewConfirm.HeadertextValidation();
	}

	@org.testng.annotations.Test(priority=115)
	public static void ReviewConfirmSectionOneTextValidation()
	{
		BellReviewConfirm.SectionOneTextValidation();
	}

	@org.testng.annotations.Test(priority=116)
	public static void ReviewConfirmShippingBillingAddressValidation()
	{
		BellReviewConfirm.ShippingBillingAddressValidation();
	}

	@org.testng.annotations.Test(priority=117)
	public static void ReviewConfirmEditButtons()
	{
		BellReviewConfirm.EditButtonsValidation();
	}

	@org.testng.annotations.Test(priority=118)
	public static void ReviewConfirmBellLogo() throws InterruptedException
	{
		BellReviewConfirm.BellLogoValidation();
	}

	@org.testng.annotations.Test(priority=119)
	public static void ReviewConfirmCancelButton() throws InterruptedException
	{
		BellReviewConfirm.CancelButtonValidation();
	}

	@org.testng.annotations.Test(priority=120)
	public static void ShippingEditButtonValidation() throws InterruptedException
	{
		BellReviewConfirm.ShippingEditButtonValidation();
	}
	@org.testng.annotations.Test(priority=121)
	public static void BillingEditButtonValidation() throws InterruptedException
	{
		BellReviewConfirm.BillingEditButtonValidation();
	}

	@org.testng.annotations.Test(priority=122)
	public static void ReviewConfirmButton()
	{
		BellReviewConfirm.ConfirmButtonClick();
	}

	@org.testng.annotations.Test(priority=123)
	public static void OrderSummaryBellLogo()
	{
		UtilityMethods.sleep(4000);
		try {BellOrderSummary.Start();} catch (Exception e) {e.printStackTrace();}
		UtilityMethods.sleep(4000);
		BellOrderSummary.validateOperatorLogo();
	}

	@org.testng.annotations.Test(priority=124)
	public static void OrderSummaryCompanyLogo()
	{	
		BellOrderSummary.validateCompanyLogo();
	}

	@org.testng.annotations.Test(priority=125)
	public static void OrderSummaryHeadertextValidation()
	{
		BellOrderSummary.HeadertextValidation();
	}
	@org.testng.annotations.Test(priority=126)
	public static void orderSummaryShipBillAddressVAlidation()
	{
		BellOrderSummary.ShipBillAddressValidation();
	}

	@org.testng.annotations.Test(priority=127)
	public static void OrderSummarysectionTwoTextValidation()
	{
		BellOrderSummary.sectionTwoTextValidation();
	}

	@org.testng.annotations.Test(priority=128)
	public static void OrderSummarysectionThreeTextValidation()
	{
		BellOrderSummary.sectionThreeTextValidation();
	}

	@org.testng.annotations.Test(priority=129)
	public static void OrderSummaryBellLogoValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneBellLogoValidation();
	}

	@org.testng.annotations.Test(priority=130)
	public static void OrderSummaryBackToIOTValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneBackToIOTValidation();
	}

	@org.testng.annotations.Test(priority=131)
	public static void OrderSummaryTrackOrderValidation() throws InterruptedException
	{
		BellOrderSummary.sectionOneTrackOrderValidation();
	}

	@org.testng.annotations.Test(priority=132)
	public static void OrderSummaryhomePageLinkvalidation() throws InterruptedException
	{
		BellOrderSummary.homePageLinkvalidation();
	}

	@org.testng.annotations.Test(priority=133)
	public static void CheckingOrderSucessEmail()
	{
		EmailIntegration.CheckEmailReceived(); 
	}
	@org.testng.annotations.Test(priority=134)
	public static void AdminOrderFulFilling() throws InterruptedException
	{	
		AdminOperation.AdminOrderFulfill();
	}
	@org.testng.annotations.Test(priority=135)
	public static void DeletingOrderSucessEmail()
	{
		EmailIntegration.DeleteAllEmail();
	}

	@org.testng.annotations.Test(priority=136)
	public static void TrackOrderPage() throws Exception
	{
		driver = BellTrackOrder.start();
	}

	@org.testng.annotations.Test(priority=137)
	public static void Trackorderpageredirection() throws InterruptedException
	{
		BellTrackOrder.TrackOrderValidPageRedirection();
	}

	@org.testng.annotations.Test(priority=138)
	public static void TrackOrderOperatorLogo()
	{
		BellTrackOrder.validateOperatorLogo();
	}

	@org.testng.annotations.Test(priority=139)
	public static void TrackOrderComapnyLogo()
	{
		BellTrackOrder.validateCompanyLogo();
	}

	@org.testng.annotations.Test(priority=140)
	public static void TrackOrderSectionOneText()
	{
		BellTrackOrder.SectionOneTextValidaion();
	}

	@org.testng.annotations.Test(priority=141)
	public static void TrackOrderSectionTwoText()
	{
		BellTrackOrder.SectionTwoTextvalidation();
	}

	@org.testng.annotations.Test(priority=142)
	public static void BackToIOT()
	{
		BellTrackOrder.BackToIOT();
	}

	@org.testng.annotations.Test(priority=143)
	public static void TrackOrderBellLogoHomePage()
	{
		BellTrackOrder.BellLogoHomePage();
	}

	@org.testng.annotations.Test(priority=144)
	public static void TrackOrderResendButton()
	{
		BellTrackOrder.ResendConfirmationButton();
	}

	@org.testng.annotations.Test(priority=145)
	public static void TrackOrderResendEmailVerification()
	{
		BellTrackOrder.CheckingOrderSuccessEmail();
	}

}
