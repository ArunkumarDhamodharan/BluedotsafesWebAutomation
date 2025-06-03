package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPOM extends BaseClass {
	public HeaderPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='header-logo-link'])[1]")
	private WebElement siteLogo;

	public WebElement getSiteLogo() {
		return siteLogo;
	}

	@FindBy(css = "#page > div.top-bar-announcement > a")
	private WebElement offerLink;

	public WebElement getOfferLink() {
		return offerLink;
	}

	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement pageTittle;

	public WebElement getPageTittle() {
		return pageTittle;
	}

	@FindBy(css = "#menu-item-7383 > a")
	private WebElement phoneNo;

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	@FindBy(css = "#menu-item-5565 > a")
	private WebElement trackOrder;

	public WebElement getTrackOrder() {
		return trackOrder;
	}

	@FindBy(xpath = "//h1[@class='entry-title']")
	private WebElement pageHeading;

	public WebElement getPageHeading() {
		return pageHeading;
	}

	@FindBy(css = "#menu-item-7756 > a")
	private WebElement myAcctMenu;

	public WebElement getMyAcctMenu() {
		return myAcctMenu;
	}

	@FindBy(css = "#menu-item-6646 > a")
	private WebElement loginMenu;

	public WebElement getLoginMenu() {
		return loginMenu;
	}

	@FindBy(xpath = "(//i[@class='ec ec-user'])[2]")
	private WebElement profileIcon;

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	@FindBy(xpath = "//a[@class='sign-in-button']")
	private WebElement signInMenu;

	public WebElement getSignInMenu() {
		return signInMenu;
	}

	@FindBy(xpath = "//div[@class='register-action']")
	private WebElement regiterMenu;

	public WebElement getRegiterMenu() {
		return regiterMenu;
	}

	@FindBy(css = "#customer_login > div.u-column1.col-1 > h2")
	private WebElement loginPage;

	public WebElement getLoginPage() {
		return loginPage;
	}

	@FindBy(css = "#customer_login > div.u-column2.col-2 > h2")
	private WebElement registerPage;

	public WebElement getRegisterPage() {
		return registerPage;
	}

	@FindBy(xpath = "(//i[@class='ec ec-shopping-bag'])[1]")
	private WebElement cartIcon;

	public WebElement getCartIcon() {
		return cartIcon;
	}

	@FindBy(xpath = "//p[@class='woocommerce-mini-cart__empty-message']")
	private WebElement cartEmptyList;

	public WebElement getCartEmptyList() {
		return cartEmptyList;
	}

	//

	@FindBy(xpath = "//a[@class='departments-menu-v2-title show']")
	private WebElement categriesMenu;

	public WebElement getCategriesMenu() {
		return categriesMenu;
	}
	
	

}
