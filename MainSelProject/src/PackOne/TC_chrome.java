package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test; 
 
public class TC_chrome {
	static WebDriver driver;
	static String chromeDriverPath = "./Drivers/chromedriver.exe";
	 

	 
	@Test
	public void TC1()
	{
   
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Chrome browser is launched.... ......");
		driver.close();
	}
}
