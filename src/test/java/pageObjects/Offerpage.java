package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerpage {
	public WebDriver driver;
	public Offerpage(WebDriver driver)
	{
		this.driver=driver;
	}
By Searchprod=By.xpath("//input[@type='search']");
By prodName=By.cssSelector("tr td:nth-child(1)");

public void searchoffer(String Name) throws InterruptedException
{
	
	
	driver.findElement(Searchprod).sendKeys(Name);
	
}
public  String getprod()
{
	return driver.findElement(prodName).getText();
	
}

}
