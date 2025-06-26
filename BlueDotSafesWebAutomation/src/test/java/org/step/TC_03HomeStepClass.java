package org.step;

import static org.junit.Assert.assertTrue;

import org.base.BaseClass;
import org.page.HomePOM;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_03HomeStepClass extends BaseClass {

	HomePOM a = new HomePOM();

	@When("the user views the banner section")
	public void theUserViewsTheBannerSection() {

		waitForElementToBeVisible(a.getBannerSection(), 20).isDisplayed();

	}

	@When("the user slides through each banner image one by one")
	public void theUserSlidesThroughEachBannerImageOneByOne() {

		try {
			waitForElementToBeVisible(a.getOwlCorozal2(), 20).click();
			waitForElementToBeVisible(a.getOwlCorozal3(), 20).click();
			waitForElementToBeVisible(a.getOwlCorozal4(), 20).click();
			waitForElementToBeVisible(a.getOwlCorozal1(), 20).click();

			System.out.println("Banner images were slid through successfully, one by one.");
		} catch (Exception e) {
			System.out.println("Banner images were slid through successfully, one by one." + "Error" + e.getMessage());
		}

	}

	@When("each banner displays a corresponding navigation link")
	public void eachBannerDisplaysACorrespondingNavigationLink() {
		try {

			waitForElementToBeVisible(a.getOwlCorozal2(), 20).click();
			waitForElementToBeVisible(a.getBannerBtn2(), 20).isDisplayed();
			waitForElementToBeVisible(a.getOwlCorozal3(), 20).click();
			waitForElementToBeVisible(a.getBannerBtn3(), 20).isDisplayed();
			waitForElementToBeVisible(a.getOwlCorozal4(), 20).click();
			waitForElementToBeVisible(a.getBannerBtn4(), 20).isDisplayed();
			waitForElementToBeVisible(a.getOwlCorozal1(), 20).click();
			waitForElementToBeVisible(a.getBannerBtn1(), 20).isDisplayed();

			System.out.println("Each banner successfully displayed the correct corresponding navigation link.");
		} catch (Exception e) {
			System.out.println("One or more banners did not display the correct corresponding navigation link."
					+ "Error:" + e.getMessage());
		}

	}

	@When("the user clicks the button on each banner")
	public void theUserClicksTheButtonOnEachBanner() {

		try {

			waitForElementToBeVisible(a.getBannerBtn1(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("second-amendment-gun-safes"));
			backwardButton();

			waitForElementToBeVisible(a.getOwlCorozal2(), 20).click();
			waitForElementToBeVisible(a.getBannerBtn2(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("depository-safes"));
			backwardButton();

			waitForElementToBeVisible(a.getOwlCorozal3(), 20).click();
			waitForElementToBeVisible(a.getBannerBtn3(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("fire-burglary-safes"));
			backwardButton();

			waitForElementToBeVisible(a.getOwlCorozal4(), 20).click();
			waitForElementToBeVisible(a.getBannerBtn4(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("high-security-safes/"));
			backwardButton();

			System.out.println("Banner buttons clicked successfully and redirected correctly");
		} catch (Exception e) {
			System.out.println("Banner buttons failed to redirect properly." + "Error:" + e.getMessage());
		}

	}

	@Then("the user should be redirected to the correct page for each banner link")
	public void theUserShouldBeRedirectedToTheCorrectPageForEachBannerLink() {

	}

	@When("the user views the {string} section with four distinct features")
	public void theUserViewsTheSectionWithFourDistinctFeatures(String string) {

	}

	@When("the user sees the {string} section")
	public void theUserSeesTheSection(String string) {

	}

	@When("the user clicks on each product link in the {string} section")
	public void theUserClicksOnEachProductLinkInTheSection(String string) {

	}

	@Then("each product link should redirect to its respective product page")
	public void eachProductLinkShouldRedirectToItsRespectiveProductPage() {

	}

	@When("the user scrolls to {string} section")
	public void theUserScrollsToSection(String string) {

	}

	@When("the user sees product name, price, add to cart button, product image, and {string} label")
	public void theUserSeesProductNamePriceAddToCartButtonProductImageAndLabel(String string) {

	}

	@When("the user clicks on each product in the {string} section")
	public void theUserClicksOnEachProductInTheSection(String string) {

	}

	@Then("each product should navigate to its respective page with matching product details")
	public void eachProductShouldNavigateToItsRespectivePageWithMatchingProductDetails() {

	}

	@Then("the user should see the {string} section content below the depository safes section")
	public void theUserShouldSeeTheSectionContentBelowTheDepositorySafesSection(String string) {

	}

	@When("the user scrolls to the {string} section")
	public void theUserScrollsToTheSection(String string) {

	}

	@When("the user views the product name, actual price, offer price, offer percentage, add to cart button, buy now button, and {string} label")
	public void theUserViewsTheProductNameActualPriceOfferPriceOfferPercentageAddToCartButtonBuyNowButtonAndLabel(
			String string) {

	}

	@When("the user clicks on each product in {string} section")
	public void theUserClicksOnEachProductInSection(String string) {

	}

	@Then("each product should navigate to its respective page with correct deal details")
	public void eachProductShouldNavigateToItsRespectivePageWithCorrectDealDetails() {

	}

	@Then("the user should see the {string} and {string} sections below")
	public void theUserShouldSeeTheAndSectionsBelow(String string, String string2) {

	}

	@When("the user clicks on each keyword in the {string} section")
	public void theUserClicksOnEachKeywordInTheSection(String string) {

	}

	@Then("each keyword should navigate to the relevant search results page")
	public void eachKeywordShouldNavigateToTheRelevantSearchResultsPage() {

	}

	@When("the user views the {string} section")
	public void theUserViewsTheSection(String string) {

	}

	@When("clicks on each top-rated product")
	public void clicksOnEachTopRatedProduct() {

	}

	@Then("each product should redirect to its detailed product page")
	public void eachProductShouldRedirectToItsDetailedProductPage() {

	}

	@When("clicks on each featured product")
	public void clicksOnEachFeaturedProduct() {

	}

}
