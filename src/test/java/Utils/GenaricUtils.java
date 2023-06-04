package Utils;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenaricUtils {

	public WebDriver driver;
	public GenaricUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SwitchToChildWindow()
	{
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);	
	}
}
