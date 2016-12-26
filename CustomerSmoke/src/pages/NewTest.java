package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import pages.Tele2HomePage;
import pages.Tele2ReferralRequestpage;
import pages.Tele2ReferalRequestThankYouPage;
import driver.BaseDriver;
import utilitymethods.UtilityMethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class NewTest {

  @BeforeSuite
  public void beforeClass() throws IOException {
	  
	  
	  FirefoxDriver driver = BaseDriver.launchApp();
		Properties allInputValue=UtilityMethods.getTele2PropValues();;
	  System.out.println("Broswer open");
  }
@AfterClass
public void last()
{
	System.out.println("Browser Close ");
	}
 
  @Test
  public void g() {
	  Tele2HomePage.validateCompanyLogo();
  }
  @Test
  public void h() {
	  Tele2HomePage.validateOperatorLogo();
  }
  
  @Test
  public void i() {
	  Tele2HomePage.sectionOneIotStarterKitTele2Validation();
  }
 
  
}
