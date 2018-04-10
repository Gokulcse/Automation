package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnicomControlCenrterPO 
{
	@FindBy(how=How.XPATH,using="//input[@id='uname']")
	public static WebElement UserNameInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='psswrd']")
	public static WebElement PasswordInput;

	@FindBy(how=How.XPATH,using="//input[@id='cpsswrd']")
	public static WebElement ConfirmPasswordInput;
	
	@FindBy(how=How.XPATH,using="//input[@id='create_cc']")
	public static WebElement CreateButton;
	
	@FindBy(how=How.XPATH,using="//label[@for='uname']")
	public static WebElement UserNameLabel;
	
	@FindBy(how=How.XPATH,using="//label[@for='psswrd']")
	public static WebElement PasswordLabel; 
	
	@FindBy(how=How.XPATH,using="//label[@for='cpsswrd']")
	public static WebElement ConfrimPasswordlabel;
	
	@FindBy(how=How.XPATH,using="//input[@value='Request']")
	public static WebElement CreateFindElement; 

	@FindBy(how=How.XPATH,using="//div[@id='ctrlAcc']//h2")
	public static WebElement Header1;
	
	@FindBy(how=How.XPATH,using="//div[@class='text-center f16']//p")
	public static WebElement Para1;
	
	@FindBy(how=How.XPATH,using="//div[@class='uname form-group']//p")
	public static WebElement UserNamePara;
	
	@FindBy(how=How.XPATH,using="//div[@class='pword form-group']//p")
	public static WebElement PasswordPara;
	
	@FindBy(how=How.XPATH,using="//div[@id='psswrd-error']")
	public static WebElement PasswordError;
	
	@FindBy(how=How.XPATH,using="//div[@id='uname-error']")
	public static WebElement UserNameError;
	
	@FindBy(how=How.XPATH,using="//div[@id='cpsswrd-error']")
	public static WebElement ConfirmPasswordError;

	
}
