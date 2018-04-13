package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test; 
 
public class TC_FF {
	static WebDriver driver;
	static String gechoDriverPath = "./Drivers/geckodriver.exe";
	 

	 
	@Test
	public void TC1()
	{
   
	System.setProperty("webdriver.gecko.driver", gechoDriverPath);
	driver = new FirefoxDriver();
	driver.get("https://www.yahoo.com/");
	System.out.println("Firefox browser is launched.. ");
	driver.close();
	}
}
