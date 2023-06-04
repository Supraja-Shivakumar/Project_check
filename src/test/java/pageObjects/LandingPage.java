package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By Search = By.xpath("//input[@type='search']");
	By ProductName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By Addtocart = By.cssSelector(".product-action button");

	public void Searchprod(String Name) {
		driver.findElement(Search).sendKeys(Name);
	}

	public String GetProductName() {
		String prod = driver.findElement(ProductName).getText();
		return prod;
	}
	public void Incrementprod(int quantity) {
		int i = quantity-1;
		while(i>0)
				 {
			driver.findElement(increment).click();
			i--;
		}
	}
	public void Addtocart() {
		driver.findElement(Addtocart).click();
	}
		

	public void topdealsPage() throws InterruptedException {
		driver.findElement(By.linkText("Top Deals")).click();

	}
	public String GetLandingPageTitle()
	{
		 return driver.getTitle();
	}

}
