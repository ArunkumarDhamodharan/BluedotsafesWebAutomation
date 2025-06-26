package org.step;

import org.base.BaseClass;
import org.page.Productpurchaseflow;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_ProductPurchase extends BaseClass {

	Productpurchaseflow a = new Productpurchaseflow();

	@Given("I am on product page")
	public void iAmOnProductPage() {

		driver.get("https://bluedotsafes.com/product-category/browse-all/residential/second-amendment-gun-safes/");

	}

	@When("I should click the product anyone product")
	public void iShouldClickTheProductAnyoneProduct() throws InterruptedException {

		a.getProduct1().click();
		Thread.sleep(5000);

	}

	@When("Add to cart the product")
	public void addToCartTheProduct() throws InterruptedException {

		a.getAddToCart().click();
		Thread.sleep(5000);

	}

	@Then("Fill the checkout details to Purchase a product")
	public void fillTheCheckoutDetailsToPurchaseAProduct() throws InterruptedException {

		scrollToElement(a.getCheckoutButton());
		Thread.sleep(3000);
		a.getCheckoutButton().click();
		Thread.sleep(5000);

	}

}
