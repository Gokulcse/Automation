package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.URL;
import java.util.concurrent.TimeUnit;
public class RemoteTRY
{
	public WebDriver driver;
	public String URL, Node;
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;
 
	@Parameters("browser")
	@BeforeTest
	public void launchbrowser(String browser) throws MalformedURLException {
		String URL = "http://www.calculator.net";
 
		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println(" Executing on FireFox");
			String Node = "http://192.168.1.3:5566/wd/hub";
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
 
			driver = new RemoteWebDriver(new URL(Node), cap);
			// Puts an Implicit wait, Will wait for 10 seconds before throwing
			// exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			String Node = "http://192.168.1.3:5567/wd/hub";
			driver = new RemoteWebDriver(new URL(Node), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.out.println(" Executing on IE");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("ie");
			String Node = "http://192.168.1.3:5568/wd/hub";
			driver = new RemoteWebDriver(new URL(Node), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}

}
