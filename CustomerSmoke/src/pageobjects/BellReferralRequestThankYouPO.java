package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import driver.BaseDriver;

public class BellReferralRequestThankYouPO extends BaseDriver
{

	@FindBy(how=How.XPATH,using="//img[@alt='Bell']")
	public static WebElement BellLogo;

	@FindBy(how=How.XPATH,using="//img[@alt='Cisco Jasper']")
	public static WebElement CiscoLogo;

	@FindBy(how=How.XPATH,using="//h2")
	public static WebElement SectionOneHead1;

	@FindBy(how=How.XPATH,using="//p")
	public static WebElement ParagraphText;

	@FindBy(how=How.XPATH,using="//img[@title='What is IoT']")
	public static WebElement WhatIsIotImage;

	@FindBy(how=How.XPATH,using="//div[@class='text-center']//a")
	public static WebElement BackToIOT;


}
