package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By cart=By.cssSelector("img[alt='Cart']");
	By proceed=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promobtn=By.cssSelector(".promoBtn");
	By placeodr=By.xpath("//button[contains(text(),'Place Order')]");
	By prodName=By.cssSelector(".product-name");
	
	
	
	public void checkoutbutton()
	{
		driver.findElement(cart).click();
		driver.findElement(proceed).click();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(promobtn));
		 
	}
	public boolean VerifyPromoBtn()
	{
		return driver.findElement(promobtn).isDisplayed();
	}
	public boolean VerifyPlaceorder()
	{
		return driver.findElement(placeodr).isDisplayed();
	}
	
	public String prodName()
	{
		return driver.findElement(prodName).getText();
	}
	
			

}

