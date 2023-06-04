package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import Utils.TestContext_setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class LandingPage_stepdefination {
	public WebDriver driver;
	public String LandingpageProdName;
	public String OfferpageProdName;
	public TestContext_setup testContext;
	public LandingPage landingPage;

	public LandingPage_stepdefination(TestContext_setup testContext) {
		this.testContext = testContext;
		this.landingPage = testContext.pageObjectmanager.getlandingpage();
	}

	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
//		System.setProperty("webdriver.chrome.driver", "C://Web Drivers//chromedriver_win32//chromedriver.exe");
//		testContext.driver = new ChromeDriver();
//		testContext.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		landingPage.GetLandingPageTitle();
		Assert.assertTrue(landingPage.GetLandingPageTitle().contains("GreenKart"));
	}

	@When("^User searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName)
			throws InterruptedException {
//		LandingPage landingPage=testContext.pageObjectmanager.getlandingpage();
		landingPage.Searchprod(shortName);
		Thread.sleep(1000);
		testContext.LandingpageProdName = landingPage.GetProductName().split("-")[0].trim();
		System.out.println(LandingpageProdName + " is extracted from home page");

	}

	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String string) {
		landingPage.Incrementprod(Integer.parseInt(string));
		landingPage.Addtocart();
	}

}
