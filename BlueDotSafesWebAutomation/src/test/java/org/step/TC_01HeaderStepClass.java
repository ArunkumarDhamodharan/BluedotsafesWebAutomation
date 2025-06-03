package org.step;

import static org.junit.Assert.*;

import java.awt.AWTException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.HeaderPOM;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_01HeaderStepClass extends BaseClass {

	HeaderPOM a = new HeaderPOM();

	// @Header01
	@Given("User enters the URL in the browser")
	public void userEntersTheURLInTheBrowser() {

	}

	@When("The homepage loads without errors")
	public void theHomepageLoadsWithoutErrors() {

		assertTrue(driver.getCurrentUrl().contains("bluedotsafes"));

	}

	@Then("The site logo and header section are displayed")
	public void theSiteLogoAndHeaderSectionAreDisplayed() {

		assertTrue(a.getSiteLogo().isDisplayed());

	}

	// Header02

	@Given("User is on the homepage")
	public void userIsOnTheHomepage() {

		assertTrue(a.getSiteLogo().isDisplayed());

	}

	@When("User clicks the site logo")
	public void userClicksTheSiteLogo() {

		a.getSiteLogo().click();
	}

	@Then("The homepage should reload")
	public void theHomepageShouldReload() {

		assertTrue(a.getSiteLogo().isDisplayed());

	}

	@When("User clicks the Save Up to {int}% on Featured Safes! Shop Now link")
	public void userClicksTheSaveUpToOnFeaturedSafesShopNowLink(Integer int1) {

		a.getOfferLink().click();

	}

	@Then("User should be redirect to security sale page")
	public void userShouldBeRedirectToSecuritySalePage() {

		WebElement pageTitle = a.getPageTittle();
		String actualTitle = pageTitle.getText();
		Assert.assertEquals(actualTitle, "Security Sale", "Page title mismatch!");

	}

	@When("User clicks the phone number field")
	public void userClicksThePhoneNumberField() {

		a.getSiteLogo().click();
		a.getPhoneNo().click();

	}

	@Then("The phone dialer box should open")
	public void thePhoneDialerBoxShouldOpen() throws AWTException {

		enterPress();
	}

	@When("User clicks the {string} section")
	public void userClicksTheSection(String string) {

		a.getTrackOrder().click();

	}

	@Then("User should be redirected to the {string} page")
	public void userShouldBeRedirectedToThePage(String string) {

		WebElement pageTittle = a.getPageHeading();
		String text = pageTittle.getText();
		Assert.assertEquals(text, "Track your Order", "Page title mismatch!");

	}

	@When("User clicks the {string} menu")
	public void userClicksTheMenu(String string) {

		a.getMyAcctMenu().click();

	}

	@Then("The login submenu should be visible and redirect to sign in page")
	public void theLoginSubmenuShouldBeVisibleAndRedirectToSignInPage() {

		assertTrue(a.getLoginMenu().isDisplayed());
		a.getLoginMenu().click();
		assertTrue(a.getLoginPage().isDisplayed());

	}

	@When("User clicks the {string} icon")
	public void userClicksTheIcon(String string) {

		a.getProfileIcon().click();

	}

	@Then("The sign-in and register link should be visible and redirect to sign in and register page")
	public void theSignInAndRegisterLinkShouldBeVisibleAndRedirectToSignInAndRegisterPage() {

		assertTrue(a.getSignInMenu().isDisplayed());
		assertTrue(a.getRegiterMenu().isDisplayed());

		clickElement(a.getSignInMenu());
		assertTrue(a.getLoginPage().isDisplayed());

		a.getProfileIcon().click();
		a.getRegiterMenu().click();
		assertTrue(a.getRegisterPage().isDisplayed());

	}

	@When("User clicks the cart icon")
	public void userClicksTheCartIcon() {

		a.getCartIcon().click();

	}

	@Then("The cart mini dialog box should be displayed")
	public void theCartMiniDialogBoxShouldBeDisplayed() {

		assertTrue(a.getCartEmptyList().isDisplayed());

	}

	@When("User clicks a category menu and navigates through submenus")
	public void userClicksACategoryMenuAndNavigatesThroughSubmenus() {

		
	}

	@Then("Each link within the category and submenus should navigate to its respective page")
	public void eachLinkWithinTheCategoryAndSubmenusShouldNavigateToItsRespectivePage() {

	}

	@When("User clicks header menu items and submenu pages")
	public void userClicksHeaderMenuItemsAndSubmenuPages() {

	}

	@Then("Each link should navigate to its respective page")
	public void eachLinkShouldNavigateToItsRespectivePage() {

	}
}
