package Utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebdriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/Resources/global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("Url");
		String browser_properties=prop.getProperty("Browser");
		String browser_maven=System.getProperty("Browser");
//		ternary operator
		 String browser=browser_maven!=null? browser_maven : browser_properties;
				
		if (driver==null)
		{
			if(browser.equalsIgnoreCase("Chrome"))
				{
		driver = new ChromeDriver();
				}
		 if(browser.equalsIgnoreCase("firefox"))
			{
			 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"C://Web Drivers//geckodriver-v0.32.2-win-aarch64");
				driver= new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
				
			
		}
		return driver;
		
	}

}
