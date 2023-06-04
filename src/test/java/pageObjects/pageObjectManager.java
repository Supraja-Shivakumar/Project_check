package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	public WebDriver driver;
	public LandingPage landingPage;
	public Offerpage offerPage;
	public CheckoutPage checkoutpage;
	
	public pageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	public LandingPage getlandingpage()
	{
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public  Offerpage getofferpage()
	{
		offerPage=new Offerpage(driver);
		return offerPage;
	}
	public CheckoutPage getcheckoutPage()
	{
		checkoutpage=new CheckoutPage(driver);
		return checkoutpage;
	}
	
	

}
