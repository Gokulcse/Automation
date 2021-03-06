package utilitymethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.List;
import java.util.Random;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.BaseDriver;

public class UtilityMethods extends BaseDriver 
{
	public static String GenerateRandomNum(int length)
	{
		String alphabet =  new String("0123456789"); 
		int n = alphabet.length(); 
		String result = new String(); 
		Random r = new Random(); 
		for (int i=0; i<length; i++) 
			result = result + alphabet.charAt(r.nextInt(n));
		return result;
	}

	public static String GenerateRandomString(int length)
	{
		String alphabet = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
		int n = alphabet.length(); 
		String result = new String(); 
		Random r = new Random(); 
		for (int i=0; i<length; i++) 
			result = result + alphabet.charAt(r.nextInt(n));
		return result;
	}

	public static String GenerateRandomAlphaNumeric(int length){
		String alphabet =new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
		int n = alphabet.length();
		String result = new String(); 
		Random r = new Random();
		for (int i=0; i<length; i++) 
			result = result + alphabet.charAt(r.nextInt(n));
		return result;
	}

	public static void InputDataValidation(WebElement InputField,String Compare,String fieldType)
	{
		switch (fieldType.toLowerCase()) {
		case "textbox":
			String Base =InputField.getAttribute("value");
			if(!Base.equals(Compare))
			{
				System.out.println("The Value given in referral request form: "+Compare+" is not equal to"+Base+" in Your Info");
			}
			break;
		case "dropdown":

			break;
		case "radiobutton":
			String BaseRB =InputField.getText();
			if(!BaseRB.equals(Compare))
			{
				System.out.println("The Value given in referral request form: "+Compare+" is not equal to"+BaseRB+" in Your Info");
			}
			break;
		}
	}
	
	public static void waitForWebElement(WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForWebElementdriver(WebDriver driver,WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void PageNavigationValidation(WebElement Linkbutton,WebElement FindElement, String PageTitile) throws InterruptedException 
	{
		waitForWebElement(Linkbutton);
		//driver.navigate().refresh();
		//System.out.println("The Link button xpath is :"+Linkbutton+"");
		//System.out.println("The Find button xpath is :"+FindElement+"");
		//System.out.println(""+ Linkbutton.getAttribute("href"));
		//System.out.println(" The Linkbutton is displayed :"+Linkbutton.isDisplayed()+"");
		//System.out.println(" The Linkbutton is enabled :"+Linkbutton.isEnabled()+"");
		//sleep(4000);
		Linkbutton.click();	
		//System.out.println("link button clicked");
		sleep(5000);
		String parentHandle = driver.getWindowHandle();
		try {
			for(String winHandle : driver.getWindowHandles())
			{
				driver.switchTo().window(winHandle);
				//System.out.println("" +driver.getTitle());
				if (driver.getTitle().equals(PageTitile))
				{
					waitForWebElement(FindElement);
					if(!FindElement.isDisplayed())
					{
						System.out.println("Page Rredirection Failed for"+Linkbutton.getText()+"");
					}
					else
					{
						System.out.println("Page Redirection done");
						driver.close();
					}
				}
			}
			driver.switchTo().window(parentHandle);
		}
		catch(Exception e)
		{
			System.out.println("Condition fail :"+e+"");
		}	
	}
	
	public static void ThankYouPageRedirection(WebElement Linkbutton,WebElement FindElement)
	{
		waitForWebElement(Linkbutton);
		Linkbutton.click();
		waitForWebElement(FindElement);
		if(FindElement.isDisplayed())
		{ 
			System.out.println("Page Redirection done");
			driver.navigate().back();
		}
		else if(!FindElement.isDisplayed())
		{
			sleep(5000);
			System.out.println("Page Redirection done");
			driver.navigate().back();
		}
		else
		{
			System.out.println("Page Rredirection Failed for"+Linkbutton.getText()+"");
			driver.navigate().back();
		}
	}

	public static void pageRedirection(WebElement Linkbutton,WebElement FindElement,String PageName) throws InterruptedException
	{
		driver.navigate().refresh();
		waitForWebElement(Linkbutton);
		Linkbutton.click();
		sleep(3000);
		driver.navigate().refresh();
		sleep(3000);
		waitForWebElement(FindElement);
		if(FindElement.isDisplayed())
		{ 
			driver.navigate().back();
			System.out.println("Page Redirection done");
		}
		else if(!FindElement.isDisplayed())
		{
			sleep(5000);
			driver.navigate().back();
			System.out.println("Page Redirection done");

		}
		else
		{
			driver.navigate().back();
			System.out.println("Page Rredirection Failed for"+Linkbutton.getText()+"");
		}


	}
	
	public static void howItWorksValidation(WebElement webObj,String str1,String str2,String str3)
	{
		String Temp = webObj.getText();
		//System.out.println(""+Temp+"");
		String[] result = Temp.split("\n");
		if((!result[0].equalsIgnoreCase(str1)))
		{
			System.out.println("Error in string validation "+result[0]);		
		}
		else if(!result[1].equalsIgnoreCase(str2))
		{
			System.out.println("Error in string validation "+result[1]);
		}
		else if (!result[2].equalsIgnoreCase(str3))
		{
			System.out.println("Error in string validation "+result[2]);
		}
	}

	public static void sectionOneLinkvalidation(WebElement webObj) throws Exception
	{
		webObj.click();
		sleep(1000);
		if(!webObj.getAttribute("class").equals("active"))
		{
			System.out.println("There is error in link validation "+webObj.getText()+"");
		}
	}

	public static void whatThekitIncludesTextValidation(WebElement webObj,String str1,String str2,String str3)
	{
		String Temp = webObj.getText();
		String[] result = Temp.split("\n");

		if((!result[0].equalsIgnoreCase(str1)))
		{
			System.out.println("Error in string validation "+result[0]);		
		}
		else if(!result[1].equalsIgnoreCase(str2))
		{
			System.out.println("Error in string validation "+result[1]);
		}
		else if (!result[2].equalsIgnoreCase(str3))
		{
			System.out.println("Error in string validation "+result[2]);
		}
	}

	public static void whatTheKitIncludesImageAndTextValidation(WebElement imgObj,String imgsrc,WebElement TextObj,String Stringsrc)
	{

		//System.out.println(""+imgObj.getAttribute("src"));
		if (!imgObj.getAttribute("src").equals(imgsrc))
		{
			//ScreenShot(driver, "Imagevalidation Source path "+imgsrc+"");
			System.out.println("The " + imgsrc +" is having wrong src Porperty");			
		}
		String Temp = TextObj.getText().replace("\n", " ");
		if((!Temp.equalsIgnoreCase(Stringsrc)))
		{
			System.out.println("Error in string validation "+Stringsrc);		
		}
	}	

	public static void InputValidation(WebElement Button1,WebElement InputElement,String Input,WebElement Button2)
	{
		for (String retval: Input.split(","))
		{
			sleep(2500);
			System.out.println("The Valid Email Id Is"+retval);
			//	driver.findElement(By.xpath("//div[@class='bl-val-chnge pb25']/a[text()='Track Order']")).click();
			Button1.click();
			sleep(2500);
			InputElement.clear();
			InputElement.sendKeys(retval);
			Button2.click();
			sleep(2500);
			//UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='text-center']/a")), "NotEquals", "page navigation Error");
			driver.navigate().back();
		}	
	}

	public static void SendInputValues(WebElement webObject,String Input,String type)
	{

		switch (type.toLowerCase()) 
		{
		case "textbox":
			webObject.clear();
			sleep(1000);
			webObject.sendKeys(Input);
			break;
		case "dropdown":
			sleep(1000);
			Select DropDown = new Select(webObject);
			DropDown.selectByVisibleText(Input);
			break;
		case "radiobutton":
			sleep(1000);
			webObject.click();
			break;
		case "checkbox":
			sleep(1000);
			webObject.click();
			break;	
		}
		sleep(1000);
	}

	public static void sleep(long milliseconds)
	{
		try 
		{
			Thread.sleep(milliseconds);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}


	public static void NumericFieldValidation(WebElement numericFieldObject,WebElement errorObject,String Input)
	{
		for (String retval: Input.split(","))
		{
			numericFieldObject.clear();
			numericFieldObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter a valid number."))
			{
				if(ErrorMessage.equals(" "))
				{
					//ScreenShot(driver, ""+numericFieldObject.getAttribute("id")+" "+retval+"");
					System.out.println("Error Message is not displayed near Text box ID "+numericFieldObject.getAttribute("id")+"for input value : '"+retval+" '");
				}
				else
				{
					//ScreenShot(driver, ""+numericFieldObject.getAttribute("id")+" "+retval+"");
					System.out.println("The Error Message displayed is "+ErrorMessage+" near Text Box ID "+numericFieldObject.getAttribute("id")+" for input value : '"+retval+" '");
				}	
			}
		}		
	}

	public static void CCConfirmPasswordValidation(WebElement PasswordObj,WebElement ConfirmPasswordObj,WebElement errorObject,String input)
	{
		sleep(1000);
		for (String pwd: input.split(","))
		{
			PasswordObj.clear();
			ConfirmPasswordObj.clear();	
			PasswordObj.sendKeys(pwd);
			ConfirmPasswordObj.sendKeys(pwd);
			String ErrorMessage=errorObject.getText();
			if(!ErrorMessage.equals("Please enter the same value again."))
			{
				//ScreenShot(driver, ""+PasswordObj.getAttribute("id")+" "+pwd+"");
				System.out.println("Please enter the same value again. error message is not displayed for input "+pwd+"");
			}
		}
	}

	public static void CCPasswordAndConfirmPasswordValidation(WebElement PasswordObj,WebElement ConfirmPasswordObj,WebElement errorObject1,WebElement errorObject2,String Passwordinput)
	{
		sleep(1000);
		String ErrorMessage1 = null,ErrorMessage2 = null;
		for (String pwd: Passwordinput.split(","))
		{

			PasswordObj.clear();
			ConfirmPasswordObj.clear(); 
			PasswordObj.sendKeys(pwd);
			ConfirmPasswordObj.sendKeys(pwd);
			ErrorMessage1=errorObject1.getText();	
			ErrorMessage2= errorObject2.getText();	
			if((!ErrorMessage1.equals(""))||(!ErrorMessage2.equals("")))
			{
				//ScreenShot(driver, ""+PasswordObj.getAttribute("id")+" "+pwd+"");
				System.out.println("The Error Message displayed near password textbox is "+ErrorMessage1+"for input "+pwd+"");
				System.out.println("The Error Message displayed near Confirmpassword textbox is "+ErrorMessage2+"for input "+pwd+"");
			}
		}
	}

	public static void ControlCenterPasswordValidation(WebElement textBoxObject,WebElement errorObject,String input)
	{
		sleep(1000);

		for (String retval: input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter a valid password."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+retval+"");
				System.out.println("Please enter a valid password error message is not displayed for input "+retval+"");
			}
		}
	}

	public static void ControlCenterRequiredFieldValidation(WebElement textBoxObject,WebElement errorObject,String Type)
	{

		textBoxObject.clear();
		sleep(2000);
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals("Please enter "+Type+""))
		{
			//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage+"");
			System.out.println("The Error Message displayed is "+ErrorMessage+" not equals to Please enter "+Type+"");
		}	
	}

	public static void EnterReferralCodeValidation(WebElement textBoxObject,WebElement errorObject)
	{
		textBoxObject.clear();
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals("Please enter Referral Code"))
		{
			System.out.println("Please enter Referral Code Error Message is Not Displayed");	
		}
	}

	public static void TrackOrderErrorValidation(WebElement textBoxObject,WebElement errorObject)
	{
		textBoxObject.clear();
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals("Please enter Email Address"))
		{
			System.out.println("Please enter Email Address Error Message is Not Displayed");	
		}
	}

	public static void EmailIdInvalidvalidation(WebElement textBoxObject,WebElement errorObject,String Input)
	{
		for (String retval: Input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter a valid email address."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage+"");
				System.out.println("The Error Message displayed is "+ErrorMessage+" near Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}	
	}

	public static void TrackEmailIdvalidation(WebElement textBoxObject,WebElement errorObject,String Input,WebElement linkButton)
	{
		for (String retval: Input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			linkButton.click();
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter a valid email address."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage+"");
				System.out.println("The Error Message displayed is "+ErrorMessage+" near Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}	
	}

	public static void MaximumInputValidation(WebElement textBoxObject,WebElement errorObject,int Maximumvalue,String Input)
	{
		for (String retval: Input.split(","))
		{
			sleep(1000);
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter no more than "+Maximumvalue+" characters."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+retval+"");
				System.out.println("The Error Message is "+ErrorMessage+" near Displayed Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}	

	}

	public static void MinimumInputValidation(WebElement textBoxObject,WebElement errorObject,int Minimumvalue,String Input)
	{
		for (String retval: Input.split(","))
		{
			sleep(1000);
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter at least "+Minimumvalue+" characters."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+retval+"");
				System.out.println("The Error Message is "+ErrorMessage+" near Displayed Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}		
	}

	public static void SpaceNotAllowedvalidation(WebElement textBoxObject,WebElement errorObject)
	{
		textBoxObject.clear();
		textBoxObject.sendKeys("    ");
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals("Spaces not allowed before text"))
		{
			//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage+"");
			System.out.println("The Error Message displayed is "+ErrorMessage+" not equals to 'Spaces not allowed before text'");
		}
	}

	public static void RequiredFieldValidation(WebElement textBoxObject,WebElement errorObject,String type)
	{
		switch(type.toLowerCase())
		{
		case "textbox":
			textBoxObject.clear();
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("This field is required."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage+"");
				System.out.println("The Error Message displayed is "+ErrorMessage+" not equals to 'This field is required.'");
			}
			break;
		case "dropdown":
			Select DropDown = new Select(textBoxObject);
			DropDown.selectByVisibleText("Choose device type");
			String ErrorMessage1= errorObject.getText();
			if(!ErrorMessage1.equals("This field is required."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage1+"");
				System.out.println("The Error Message displayed is "+ErrorMessage1+" not equals to 'This field is required.'");
			}
			break;
		case"radiobutton":
			String ErrorMessage2= errorObject.getText();
			if(!ErrorMessage2.equals("This field is required."))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage2+"");
				System.out.println("The Error Message displayed is "+ErrorMessage2+" not equals to 'This field is required.'");
			}
			break;
		}
	}
	//ScreenShot Not Used
	public static void ValidateSimTypeRadioButton(int InputValue,WebElement errorObject)
	{
		List<WebElement> radios = driver.findElements(By.name("simTypeId"));
		if (InputValue > 0 && InputValue <= radios.size()) {
			radios.get(InputValue - 1).click();
		} else {
			throw new NotFoundException("option " + InputValue + " not found");
		}

		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals(""))
		{
			System.out.println("The Error Message is "+ErrorMessage+" near Displayed Radio Button ");
		}

	}
	
	public static void RequiredFieldShippingDropDown(WebElement textBoxObject,WebElement errorObject)
	{
		Select DropDown = new Select(textBoxObject);
		DropDown.selectByVisibleText("Select");
		String ErrorMessage1= errorObject.getText();
		if(!ErrorMessage1.equals("This field is required."))
		{
			//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+ErrorMessage1+"");
			System.out.println("The Error Message displayed is "+ErrorMessage1+" not equals to 'This field is required.'");
		}
	}

	public static void ValidateDropDown(WebElement dropDownObject,String InputValue,WebElement errorObject)
	{
		Select DropDown = new Select(dropDownObject);
		DropDown.selectByVisibleText(InputValue);
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals(""))
		{
			//ScreenShot(driver, ""+dropDownObject.getAttribute("id")+" "+ErrorMessage+"");
			System.out.println("The Error Message is "+ErrorMessage+" near Displayed Drop Down ID "+dropDownObject.getAttribute("id")+" for input value : '"+InputValue+" '");
		}
	}

	public static void ValidInputValidation(WebElement textBoxObject,String Input,WebElement errorObject)
	{
		for (String retval: Input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals(""))
			{
				//ScreenShot(driver, ""+textBoxObject.getAttribute("id")+" "+retval+"");
				System.out.println("The Error Message is "+ErrorMessage+" near Displayed Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}	
	}

	public static void PlaceholderValidation(WebElement textObject,String stringToCompare,String Result)
	{
		String stringBase=textObject.getAttribute("placeholder");
		if(!stringBase.equalsIgnoreCase(stringToCompare))
		{
			//ScreenShot(driver,"PlaceholderValidation " +textObject.getAttribute("id")+"");
			System.out.println("The Placeholder value in "+Result+" Input Field doesn't match.");
		}	
	}


	public static void Imagevalidation(WebElement imgObject,String typeattribute,String value,String Result)
	{
		//System.out.println(""+imgObject.getAttribute(typeattribute));
		//System.out.println(""+value+"");
		switch(typeattribute.toLowerCase())
		{
		case "alt":
			if (!imgObject.getAttribute(typeattribute).equals(value))
			{
				//ScreenShot(driver, "Imagevalidation Alternate Text "+Result+"");
				System.out.println("The " + Result +" is having wrong Alternate Text Porperty");
			}
			break;
		case "src":	
			if (!imgObject.getAttribute(typeattribute).equals(value))
			{
				//ScreenShot(driver, "Imagevalidation Source path "+Result+"");
				System.out.println("The " + Result +" is having wrong src Porperty");

			}
			break;
		}	
	}
	public static void StringValidation(String stringBase, String stringToCompare,String value)
	{
		sleep(1000);
		boolean result = true;
		switch(value.toLowerCase())
		{
		case "equal":
			result = stringBase.equals(stringToCompare);
			break;
		case "equalsignorecase":
			result = stringBase.equalsIgnoreCase(stringToCompare);
			break;
		case "doubleequals":
			result = stringBase==stringToCompare;
			break;	
		}
		if (result == false)
		{
			System.out.println("Base String :"+stringBase+"");
			System.out.println("compare String :"+stringToCompare+"");	
			//ScreenShot(driver, "StringValidation in "+stringBase+"");	
			System.out.println("The String " + stringToCompare +" is not " + value +" to "+ stringBase +" ");
		}
	}

	public static void DisabledValidation(WebElement strObject,String Result)
	{
		if (strObject.isEnabled())
		{
			System.out.println("The " + Result +" is Enabled");
		}
	}

	public static void DisplayEnableValidator(WebElement strObject, String value, String Result) 
	{	
		sleep(1000);
		//System.out.println(" The "+Result+" is displayed :"+strObject.isDisplayed()+"");
		//System.out.println(" The "+Result+" is enabled :"+strObject.isEnabled()+"");
		//System.out.println(""+strObject);
		switch(value.toLowerCase())
		{
		case "equal":
			if (strObject.isDisplayed() && strObject.isEnabled())
			{
				//ScreenShot(driver,"DisplayEnableValidator "+ Result+"");
				//Assert.assertEquals(true, strObject.isDisplayed() && strObject.isEnabled());			
				System.out.println("The " + Result +" is Enabled");
			}
			break;
		case "notequal":
			if (!strObject.isDisplayed() && !strObject.isEnabled())
			{
				//ScreenShot(driver, Result);
				System.out.println("The " + Result +" is not Displayed or Enabled");
				//Assert.assertEquals(false, strObject.isDisplayed() && strObject.isEnabled());	
			}
			break;
		}	
	}
	
	public static void ScreenShot(WebDriver driver,String screenshotName)
	{
		try 
		{
			sleep(1200);
			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
			String dateN = formatter.format(currentDate.getTime()).replace("/","_");
			String dateNow = dateN.replace(":","_");
			File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./FailedScreenShot/"+screenshotName+" "+dateNow+".png"));

			System.out.println("Screenshot taken for failed testCase");
		} 
		catch (Exception e)
		{

			System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
	}
	
	public static Properties getPropValues() throws IOException 
	{	
		Properties properties = new Properties();
		String propertiesFile=System.getProperty("user.dir")+ "\\src\\testData.properties";
		try 
		{
			properties.load(new FileInputStream(propertiesFile));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e.getMessage());
		}
		return properties;
	}
	
	public static Properties getUnicomPropValues() throws IOException 
	{

		Properties properties = new Properties();
		String propertiesFile=System.getProperty("user.dir")+ "\\src\\UnicomTestData.properties";
		try 
		{
			properties.load(new FileInputStream(propertiesFile));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e.getMessage());
		}
		return properties;
	}
	
	public static Properties getBellPropValues() throws IOException 
	{

		Properties properties = new Properties();
		String propertiesFile=System.getProperty("user.dir")+ "\\src\\BellTestData.properties";
		try 
		{
			properties.load(new FileInputStream(propertiesFile));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e.getMessage());
		}
		return properties;
	}
	
	public static Properties getTele2PropValues() throws IOException 
	{

		Properties properties = new Properties();
		String propertiesFile=System.getProperty("user.dir")+ "\\src\\tele2TestData.properties";
		try 
		{
			properties.load(new FileInputStream(propertiesFile));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e.getMessage());
		}
		return properties;
	}
	
	public static Properties getPostPropValues() throws IOException 
	{

		Properties properties = new Properties();
		String propertiesFile=System.getProperty("user.dir")+ "\\src\\PostTestData.properties";
		try 
		{
			properties.load(new FileInputStream(propertiesFile));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e.getMessage());
		}
		return properties;
	}
	public static Properties getAdminPropValues() throws IOException 
	{

		Properties properties = new Properties();
		String propertiesFile=System.getProperty("user.dir")+ "\\src\\AdminTestData.properties";
		try 
		{
			properties.load(new FileInputStream(propertiesFile));
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Occurred" + e.getMessage());
		}
		return properties;
	}
	
	
}
