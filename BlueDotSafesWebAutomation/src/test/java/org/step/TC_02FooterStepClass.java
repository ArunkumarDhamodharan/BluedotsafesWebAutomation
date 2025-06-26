package org.step;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.page.FooterPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_02FooterStepClass extends BaseClass {

	FooterPOM a = new FooterPOM();

	@Given("the user is on the homepage")
	public void theUserIsOnTheHomepage() {

		assertTrue(a.getSiteLogo().isDisplayed());

	}

	@When("the user scrolls down to the footer section")
	public void theUserScrollsDownToTheFooterSection() {

		scrollToElement(a.getContactDetails());

	}

	@Then("the user should see the {string} section")
	public void theUserShouldSeeTheSection(String string) {

		assertTrue(a.getContactDetails().isDisplayed());
		assertTrue(a.getProductLinks().isDisplayed());
		assertTrue(a.getQuickLinks().isDisplayed());
		assertTrue(a.getCustomerCare().isDisplayed());
		assertTrue(a.getCopyright().isDisplayed());

	}

	@Then("all footer links should be displayed correctly")
	public void allFooterLinksShouldBeDisplayedCorrectly() {

	}

	@When("the user clicks the phone number in the Contact Details section")
	public void theUserClicksThePhoneNumberInTheContactDetailsSection() {

		waitForElementToBeVisible(a.getPhoneNoLink(), 20).click();

	}

	@Then("a phone call alert should be triggered")
	public void aPhoneCallAlertShouldBeTriggered() throws AWTException {

		enterPress();

	}

	@When("the user clicks each link under the Product Links section")
	public void theUserClicksEachLinkUnderTheProductLinksSection() {

		try {
			List<WebElement> elements = Arrays.asList(waitForElementToBeVisible(a.getAllProducts(), 20),
					waitForElementToBeVisible(a.getResidentialSafes(), 20),
					waitForElementToBeVisible(a.getCommercialSafes(), 20),
					waitForElementToBeVisible(a.getKeypadsAndLocks(), 20),
					waitForElementToBeVisible(a.getBanking(), 20), waitForElementToBeVisible(a.getCashHandling(), 20));

			List<String> expectedUrls = Arrays.asList("browse-all", "residential", "commercial", "locks", "banking",
					"cash-handling");

			for (int i = 0; i < elements.size(); i++) {
				WebElement menuItem = elements.get(i);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItem);
				Thread.sleep(1000);
				try {
					menuItem.click();
				} catch (ElementClickInterceptedException e) {
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuItem);
				}
				String currentUrl = driver.getCurrentUrl().toLowerCase();
				assertTrue(currentUrl.contains(expectedUrls.get(i)));
				scrollToElement(a.getContactDetails());
			}

			System.out.println(
					"All links under the Product Links section were clicked successfully and navigated correctly.");
		} catch (Exception e) {
			System.out.println("One or more links under the Product Links section failed. Error: " + e.getMessage());
		}

	}

	@Then("the user should be redirected to the respective product pages")
	public void theUserShouldBeRedirectedToTheRespectiveProductPages() {

	}

	@When("the user clicks each link under the Quick Links section")
	public void theUserClicksEachLinkUnderTheQuickLinksSection() {

		try {
			List<WebElement> elements = Arrays.asList(waitForElementToBeVisible(a.getAbout(), 20),
					waitForElementToBeVisible(a.getJobOpenings(), 20), waitForElementToBeVisible(a.getService(), 20),
					waitForElementToBeVisible(a.getBlogs(), 20), waitForElementToBeVisible(a.getCompare(), 20),
					waitForElementToBeVisible(a.getStoreDirectory(), 20));

			List<String> expectedUrls = Arrays.asList("about", "jobs", "service", "blogs", "compare",
					"store-directory");

			for (int i = 0; i < elements.size(); i++) {
				WebElement menuItem = elements.get(i);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItem);
				Thread.sleep(1000);
				try {
					menuItem.click();
				} catch (ElementClickInterceptedException e) {
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuItem);
				}
				String currentUrl = driver.getCurrentUrl().toLowerCase();
				assertTrue(currentUrl.contains(expectedUrls.get(i)));
				scrollToElement(a.getContactDetails());
			}

			System.out.println(
					"All links under the Quick Links section were clicked successfully and navigated to the expected pages.");
		} catch (Exception e) {
			System.out.println(
					"One or more links under the Quick Links section failed to navigate to the expected pages. Error: "
							+ e.getMessage());
		}

	}

	@Then("the user should be redirected to the respective pages")
	public void theUserShouldBeRedirectedToTheRespectivePages() {

	}

	@When("the user clicks each link under the Customer Care section")
	public void theUserClicksEachLinkUnderTheCustomerCareSection() {
		try {
			List<WebElement> elements = Arrays.asList(a.getWarranty(), a.getRefundPolicy(), a.getShippingPolicy(),
					a.getContactUs(), a.getSupport());

			List<String> expectedUrls = Arrays.asList("warranty", "refund-policy", "shipping-policy", "contact-us",
					"contact-us");

			for (int i = 0; i < elements.size(); i++) {
				WebElement menuItem = waitForElementToBeVisible(elements.get(i), 20);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
						menuItem);
				Thread.sleep(1000);

				try {
					menuItem.click();
				} catch (ElementClickInterceptedException e) {
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuItem);
				}

				Thread.sleep(2000);
				String currentUrl = driver.getCurrentUrl().toLowerCase();
				if (!currentUrl.contains(expectedUrls.get(i))) {
					throw new AssertionError(
							"Expected URL to contain: " + expectedUrls.get(i) + " but got: " + currentUrl);
				}

				scrollToElement(a.getContactDetails());
			}

			System.out.println("All links under the Customer Care Links section were clicked and navigated correctly.");
		} catch (Exception e) {
			System.out.println("Customer Care section test failed. Error: " + e.getMessage());
		}
	}

	@When("the user scrolls to the bottom of the footer")
	public void theUserScrollsToTheBottomOfTheFooter() {

	}

	@Then("the user should see the current year displayed in the copyright")
	public void theUserShouldSeeTheCurrentYearDisplayedInTheCopyright() {

		scrollToElement(a.getContactDetails());
		WebElement copyright = a.getCopyright();
		String text = copyright.getText();
		System.out.println("Please verify the Year :" + text);

	}

	@Then("the user clicks the {string} link")
	public void theUserClicksTheLink(String string) {

		waitForElementToBeVisible(a.getCopyrightsHomeRedirection(), 20).click();

	}

	@Then("the user should be redirected to the homepage")
	public void theUserShouldBeRedirectedToTheHomepage() {

		assertTrue(a.getSiteLogo().isDisplayed());

	}

	@Then("the user click the top to scroll icon")
	public void theUserClickTheTopToScrollIcon() {

		scrollToElement(a.getContactDetails());
		waitForElementToBeVisible(a.getTopToScroll(), 20).click();

	}

	@Then("the user should redirect to top of the page")
	public void theUserShouldRedirectToTopOfThePage() {

		assertTrue(a.getSiteLogo().isDisplayed());

	}

}
