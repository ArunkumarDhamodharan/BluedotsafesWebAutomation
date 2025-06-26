package org.step;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

		try {

			waitForElementToBeClickable(a.getCategriesMenu(), 20).click();
			waitForElementToBeVisible(a.getAllSafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("all-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getDepositorySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("depository-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getDepositorySafes(), 20);
			hoverOverElement(a.getDepositorySafes());
			waitForElementToBeVisible(a.getDropSlotDepositorySafe(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("drop-slot-depository-safe"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getDepositorySafes(), 20);
			hoverOverElement(a.getDepositorySafes());
			waitForElementToBeVisible(a.getFrontLoadHopperDepositorySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("front-load-hopper-depository-safe"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getDepositorySafes(), 20);
			hoverOverElement(a.getDepositorySafes());
			waitForElementToBeVisible(a.getPullDrawerDepositorySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("pull-drawer-depository-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getDepositorySafes(), 20);
			hoverOverElement(a.getDepositorySafes());
			waitForElementToBeVisible(a.getRearLoadHopperDepositorySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("rear-load-hopper-safe"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getDepositorySafes(), 20);
			hoverOverElement(a.getDepositorySafes());
			waitForElementToBeVisible(a.getRotaryHopperDepositorySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("rotary-hopper-depository-safe"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getFireAndBurglarySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("fire-burglary-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getFloorSafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("floor-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getGunSafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("second-amendment-gun-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getHighSecuritySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("high-security-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getHighSecuritySafes(), 20);
			hoverOverElement(a.getHighSecuritySafes());
			waitForElementToBeVisible(a.getTl15Safes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("tl15"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getHighSecuritySafes(), 20);
			hoverOverElement(a.getHighSecuritySafes());
			waitForElementToBeVisible(a.getTl30Safes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("tl30"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getHighSecurityVault(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("high-security-vault"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getInventorySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("inventory-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getSafeDepositBoxesLockers(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("safe-deposit-boxes-lockers"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getAllSafes(), 20);
			hoverOverElement(a.getAllSafes());
			waitForElementToBeVisible(a.getUtilitySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("utility-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getHardware(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("locks"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getHardware(), 20);
			hoverOverElement(a.getHardware());
			waitForElementToBeVisible(a.getKeypadsAndLocks(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("locks"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getHardware(), 20);
			hoverOverElement(a.getHardware());
			waitForElementToBeVisible(a.getKeypadsAndLocks(), 20);
			hoverOverElement(a.getKeypadsAndLocks());
			waitForElementToBeVisible(a.getDormakaba(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("dormakaba"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getHardware(), 20);
			hoverOverElement(a.getHardware());
			waitForElementToBeVisible(a.getKeypadsAndLocks(), 20);
			hoverOverElement(a.getKeypadsAndLocks());
			waitForElementToBeVisible(a.getSecuram(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("securam"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getHardware(), 20);
			hoverOverElement(a.getHardware());
			waitForElementToBeVisible(a.getInstallationKits(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("installation-kits"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getCashHandling(), 20);
			waitForElementToBeVisible(a.getCashHandling(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("cash-handling"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getCashHandling(), 20);
			hoverOverElement(a.getCashHandling());
			waitForElementToBeVisible(a.getCurrencySortersCounters(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("currency-sorter"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getCashHandling(), 20);
			hoverOverElement(a.getCashHandling());
			waitForElementToBeVisible(a.getSmartSafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("smart-safes"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getCashHandling(), 20);
			hoverOverElement(a.getCashHandling());
			waitForElementToBeVisible(a.getCashCoinRecyclers(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("recycler"));

			waitForElementToBeVisible(a.getCategriesMenu(), 20);
			hoverOverElement(a.getCategriesMenu());
			waitForElementToBeVisible(a.getBrowseAllCashHandling(), 20);
			waitForElementToBeVisible(a.getBrowseAllCashHandling(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("browse-all"));

			System.out.println("Verification of all category menu page redirections was successful.");

		} catch (Exception e) {

			System.out.println("Verification of all category menu page redirections was unsuccessful." + "Error:"
					+ e.getMessage());
		}
	}

	@Then("Each link within the category and submenus should navigate to its respective page")
	public void eachLinkWithinTheCategoryAndSubmenusShouldNavigateToItsRespectivePage() {

	}

	@When("User clicks header menu items and submenu pages")
	public void userClicksHeaderMenuItemsAndSubmenuPages() {

		try {
			waitForElementToBeVisible(a.getResHeader(), 20);
			waitForElementToBeVisible(a.getResHeader(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("residential"));

			hoverOverElement(a.getResHeader());
			waitForElementToBeVisible(a.getResFireBurglary(), 20);
			waitForElementToBeVisible(a.getResFireBurglary(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("fire-burglary-safes"));

			hoverOverElement(a.getResHeader());
			waitForElementToBeVisible(a.getResGunSafes(), 20);
			waitForElementToBeVisible(a.getResGunSafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("second-amendment-gun-safes"));

			hoverOverElement(a.getResHeader());
			waitForElementToBeVisible(a.getResFloorSafes(), 20);
			waitForElementToBeVisible(a.getResFloorSafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("floor-safes"));

			waitForElementToBeVisible(a.getComHeader(), 20);
			waitForElementToBeVisible(a.getComHeader(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("commercial"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getComDepositorySafes(), 20);
			waitForElementToBeVisible(a.getComDepositorySafes(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("depository-safes"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getComDepositorySafes(), 20);
			hoverOverElement(a.getComDepositorySafes());
			waitForElementToBeVisible(a.getComPullDrawer(), 20);
			waitForElementToBeVisible(a.getComPullDrawer(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("pull-drawer-depository-safes"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getComDepositorySafes(), 20);
			hoverOverElement(a.getComDepositorySafes());
			waitForElementToBeVisible(a.getComDropSlot(), 20);
			waitForElementToBeVisible(a.getComDropSlot(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("drop-slot-depository-safe"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getComDepositorySafes(), 20);
			hoverOverElement(a.getComDepositorySafes());
			waitForElementToBeVisible(a.getComFrontHopper(), 20);
			waitForElementToBeVisible(a.getComFrontHopper(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("front-load-hopper-depository-safe"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getComDepositorySafes(), 20);
			hoverOverElement(a.getComDepositorySafes());
			waitForElementToBeVisible(a.getComRearHopper(), 20);
			waitForElementToBeVisible(a.getComRearHopper(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("rear-load-hopper-safe"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getComDepositorySafes(), 20);
			hoverOverElement(a.getComDepositorySafes());
			waitForElementToBeVisible(a.getComRotaryHopper(), 20);
			waitForElementToBeVisible(a.getComRotaryHopper(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("rotary-hopper-depository-safe"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getUtlSafesElement(), 20);
			waitForElementToBeVisible(a.getUtlSafesElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("utility-safes"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getSecHighSafesElement(), 20);
			waitForElementToBeVisible(a.getSecHighSafesElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("high-security-safes"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getSecHighSafesElement(), 20);
			hoverOverElement(a.getSecHighSafesElement());
			waitForElementToBeVisible(a.getSecTl15Element(), 20);
			waitForElementToBeVisible(a.getSecTl15Element(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("tl15"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getSecHighSafesElement(), 20);
			hoverOverElement(a.getSecHighSafesElement());
			waitForElementToBeVisible(a.getSecTl30Element(), 20);
			waitForElementToBeVisible(a.getSecTl30Element(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("tl30"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getInvSafesElement(), 20);
			waitForElementToBeVisible(a.getInvSafesElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("inventory-safes"));

			hoverOverElement(a.getComHeader());
			waitForElementToBeVisible(a.getInvUnderCounterElement(), 20);
			waitForElementToBeVisible(a.getInvUnderCounterElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("under-counter-safes"));

			waitForElementToBeVisible(a.getBnkHeaderElement(), 20);
			waitForElementToBeVisible(a.getBnkHeaderElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("banking"));

			hoverOverElement(a.getBnkHeaderElement());
			waitForElementToBeVisible(a.getBnkCashHandlingElement(), 20);
			waitForElementToBeVisible(a.getBnkCashHandlingElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("cash-handling"));

			hoverOverElement(a.getBnkHeaderElement());
			waitForElementToBeVisible(a.getBnkCashHandlingElement(), 20);
			hoverOverElement(a.getBnkCashHandlingElement());
			waitForElementToBeVisible(a.getBnkCurrencySortersElement(), 20);
			waitForElementToBeVisible(a.getBnkCurrencySortersElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("currency-sorter"));

			hoverOverElement(a.getBnkHeaderElement());
			waitForElementToBeVisible(a.getBnkCashHandlingElement(), 20);
			hoverOverElement(a.getBnkCashHandlingElement());
			waitForElementToBeVisible(a.getBnkSmartSafesElement(), 20);
			waitForElementToBeVisible(a.getBnkSmartSafesElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("smart-safes"));

			hoverOverElement(a.getBnkHeaderElement());
			waitForElementToBeVisible(a.getBnkCashHandlingElement(), 20);
			hoverOverElement(a.getBnkCashHandlingElement());
			waitForElementToBeVisible(a.getBnkCoinRecyclersElement(), 20);
			waitForElementToBeVisible(a.getBnkCoinRecyclersElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("recycler"));

			hoverOverElement(a.getBnkHeaderElement());
			waitForElementToBeVisible(a.getDepBoxesElement(), 20);
			waitForElementToBeVisible(a.getDepBoxesElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("safe-deposit-boxes-locker"));

			hoverOverElement(a.getBnkHeaderElement());
			waitForElementToBeVisible(a.getDepHighVaultElement(), 20);
			waitForElementToBeVisible(a.getDepHighVaultElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("high-security-vault"));

			waitForElementToBeVisible(a.getHwHeaderElement(), 20);
			waitForElementToBeVisible(a.getHwHeaderElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("locks"));

			hoverOverElement(a.getHwHeaderElement());
			waitForElementToBeVisible(a.getHwKeypadsLocksElement(), 20);
			waitForElementToBeVisible(a.getHwKeypadsLocksElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("locks"));

			hoverOverElement(a.getHwHeaderElement());
			waitForElementToBeVisible(a.getHwKeypadsLocksElement(), 20);
			hoverOverElement(a.getHwKeypadsLocksElement());
			waitForElementToBeVisible(a.getHwDormakabaElement(), 20);
			waitForElementToBeVisible(a.getHwDormakabaElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("dormakaba"));

			hoverOverElement(a.getHwHeaderElement());
			waitForElementToBeVisible(a.getHwKeypadsLocksElement(), 20);
			hoverOverElement(a.getHwKeypadsLocksElement());
			waitForElementToBeVisible(a.getHwSecuramElement(), 20);
			waitForElementToBeVisible(a.getHwSecuramElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("securam"));

			hoverOverElement(a.getHwHeaderElement());
			waitForElementToBeVisible(a.getKitInstallationElement(), 20);
			waitForElementToBeVisible(a.getKitInstallationElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("installation-kits"));

			waitForElementToBeVisible(a.getOthDealsElement(), 20);
			waitForElementToBeVisible(a.getOthDealsElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("deals"));

			waitForElementToBeVisible(a.getOthContactElement(), 20);
			waitForElementToBeVisible(a.getOthContactElement(), 20).click();
			assertTrue(driver.getCurrentUrl().toLowerCase().contains("contact-us"));

			System.out.println("Verification of all header menu page redirections was successful.");

		} catch (Exception e) {
			System.out.println(
					"Verification of all header menu page redirections was unsuccessful." + "Error:" + e.getMessage());
		}
	}

	@Then("Each link should navigate to its respective page")
	public void eachLinkShouldNavigateToItsRespectivePage() {

	}

	@Given("I am on the home page")
	public void iAmOnTheHomePage() {

		assertTrue(a.getSiteLogo().isDisplayed());
	}

	@When("I see the search field")
	public void iSeeTheSearchField() {

		assertTrue(a.getSearchField().isDisplayed());

	}

	@Then("The search field should be visible and editable")
	public void theSearchFieldShouldBeVisibleAndEditable() {

		WebElement inputField = waitForElementToBeVisible(a.getInputField(), 20);
		inputField.sendKeys("Editable");
		String text = inputField.getText();
		System.out.println(text);

		inputField.clear();

	}

	@When("I select any product from the dropdown area")
	public void iSelectAnyProductFromTheDropdownArea() {

		try {
			for (int i = 1; i < new Select(waitForElementToBeVisible(a.getDropDownforSelect(), 10)).getOptions()
					.size(); i++) {

				driver.navigate().to("https://bluedotsafes.com");
				Thread.sleep(2000);

				Select dropdown = new Select(waitForElementToBeVisible(a.getDropDownforSelect(), 10));
				List<WebElement> options = dropdown.getOptions();

				String optionText = options.get(i).getText().trim();
				String expectedSlug = options.get(i).getAttribute("value").trim();

				System.out.println("🔍 Verifying category: " + optionText + " [Expected slug: " + expectedSlug + "]");

				dropdown.selectByIndex(i);
				Thread.sleep(1000);

				waitForElementToBeClickable(a.getSearchBtn(), 10).click();
				Thread.sleep(2000);

				String currentUrl = driver.getCurrentUrl().toLowerCase();

				if (currentUrl.contains(expectedSlug.toLowerCase())) {
					System.out.println("✅ Passed: " + optionText + " -> " + currentUrl);
					System.out.println(
							"=====================================================================================");
				} else {
					System.out.println("❌ Failed: " + optionText + " -> " + currentUrl);
				}
			}

			System.out.println("✅ All dropdown search field verifications completed.");

		} catch (Exception e) {
			System.out.println("❌ Error during dropdown search verification: " + e.getMessage());
		}

	}

	@Then("The selected product should be visible in the search field")
	public void theSelectedProductShouldBeVisibleInTheSearchField() {

	}

	@When("User clicks the search button after selecting the product from dropdown")
	public void userClicksTheSearchButtonAfterSelectingTheProductFromDropdown() {

	}

	@Then("The user should be redirected to the respective product page")
	public void theUserShouldBeRedirectedToTheRespectiveProductPage() {

	}

	@When("I search for a product using a valid product name")
	public void iSearchForAProductUsingAValidProductName() {

		waitForElementToBeVisible(a.getSiteLogo(), 20).click();

		WebElement input = waitForElementToBeVisible(a.getInputField(), 20);
		input.sendKeys("Safes");

		waitForElementToBeClickable(a.getSearchBtn(), 20).click();

	}

	@Then("I should see search results containing related products")
	public void iShouldSeeSearchResultsContainingRelatedProducts() {

		WebElement validResult = waitForElementToBeVisible(a.getValidResult(), 20);
		validResult.isDisplayed();

	}

	@When("I enter special characters in the search field")
	public void iEnterSpecialCharactersInTheSearchField() {

		waitForElementToBeVisible(a.getSiteLogo(), 20).click();

		WebElement input = waitForElementToBeVisible(a.getInputField(), 20);
		input.clear();
		input.sendKeys("!@#$%^&*(");

		waitForElementToBeClickable(a.getSearchBtn(), 20).click();

	}

	@Then("I should see a {string} page")
	public void iShouldSeeAPage(String string) {

		WebElement noResult = waitForElementToBeVisible(a.getNoResultPage(), 20);
		noResult.isDisplayed();

	}

	@When("I enter numeric characters in the search field")
	public void iEnterNumericCharactersInTheSearchField() {

		waitForElementToBeVisible(a.getSiteLogo(), 20).click();

		WebElement input = waitForElementToBeVisible(a.getInputField(), 20);
		input.clear();
		input.sendKeys("4356241365412653");

		waitForElementToBeClickable(a.getSearchBtn(), 20).click();

		WebElement noResult = waitForElementToBeVisible(a.getNoResultPage(), 20);
		noResult.isDisplayed();

	}
}
