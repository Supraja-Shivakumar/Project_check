package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;



import Utils.TestContext_setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.Offerpage;

public class Offerpage_stepdefination {
	public WebDriver driver;
	public String LandingpageProdName;
	public String OfferpageProdName;
	public TestContext_setup testContext;

	public Offerpage_stepdefination(TestContext_setup testContext) {
		this.testContext = testContext;
	}

	@Then("^User searched for(.+) same shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String ShortName)
			throws InterruptedException {
		switchtochildpage();
		Offerpage offerPage = testContext.pageObjectmanager.getofferpage();
		offerPage.searchoffer(ShortName);
		OfferpageProdName = offerPage.getprod();
		System.out.println(OfferpageProdName + " is extracted from offers page");
		Thread.sleep(1000);

	}

	public void switchtochildpage() throws InterruptedException {
//		testContext.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		LandingPage landingPage = testContext.pageObjectmanager.getlandingpage();
		landingPage.topdealsPage();
		Thread.sleep(1000);
		testContext.genaricUtils.SwitchToChildWindow();

	}

	@And("Check if product exist with same name in landing page")
	public void Check_if_product_exist_with_same_name_in_landing_page() {
		Assert.assertEquals(OfferpageProdName, testContext.LandingpageProdName);

	}

}
