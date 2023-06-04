package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Utils.TestContext_setup;
import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;

public class CheckOutPage_stepdefination {
	public WebDriver driver;
	public String LandingpageProdName;
	public String OfferpageProdName;
	public TestContext_setup testContext;
	public CheckoutPage Checkoutpage;

	public CheckOutPage_stepdefination(TestContext_setup testContext) {
		this.testContext = testContext;
		this.Checkoutpage = testContext.pageObjectmanager.getcheckoutPage();
	}

	@Then("^Verify the user has the ability to enter promo code and place the order$")
	public void verify_the_user_has_the_ability_to_enter_promo_code_and_place_the_order() throws Throwable {
		Assert.assertTrue(Checkoutpage.VerifyPromoBtn());
		Assert.assertTrue(Checkoutpage.VerifyPlaceorder());
	}

	@Then("^User proceeds to checkout and validate the (.+) in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_in_checkout_page(String name) throws Throwable {
		Checkoutpage.checkoutbutton();
		Assert.assertTrue(Checkoutpage.prodName().contains(name));
	}

}
