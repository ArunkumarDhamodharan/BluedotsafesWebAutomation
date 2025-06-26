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

	@FindBy(xpath = "//i[@class='departments-menu-v2-icon fa fa-list-ul']")
	private WebElement categriesMenu;

	public WebElement getCategriesMenu() {
		return categriesMenu;
	}

	// All Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8880\"]/a)[2]")
	private WebElement allSafes;

	public WebElement getAllSafes() {
		return allSafes;
	}

	// Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8881\"]/a)[2]")
	private WebElement depositorySafes;

	public WebElement getDepositorySafes() {
		return depositorySafes;
	}

	// Drop Slot Depository Safe
	@FindBy(xpath = "(//*[@id=\"menu-item-8882\"]/a)[2]")
	private WebElement dropSlotDepositorySafe;

	public WebElement getDropSlotDepositorySafe() {
		return dropSlotDepositorySafe;
	}

	// Front Load Hopper Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8883\"]/a)[2]")
	private WebElement frontLoadHopperDepositorySafes;

	public WebElement getFrontLoadHopperDepositorySafes() {
		return frontLoadHopperDepositorySafes;
	}

	// Pull Drawer Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8884\"]/a)[2]")
	private WebElement pullDrawerDepositorySafes;

	public WebElement getPullDrawerDepositorySafes() {
		return pullDrawerDepositorySafes;
	}

	// Rear Load Hopper Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-10597\"]/a)[2]")
	private WebElement rearLoadHopperDepositorySafes;

	public WebElement getRearLoadHopperDepositorySafes() {
		return rearLoadHopperDepositorySafes;
	}

	// Rotary Hopper Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8885\"]/a)[2]")
	private WebElement rotaryHopperDepositorySafes;

	public WebElement getRotaryHopperDepositorySafes() {
		return rotaryHopperDepositorySafes;
	}

	// Fire & Burglary Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8886\"]/a)[2]")
	private WebElement fireAndBurglarySafes;

	public WebElement getFireAndBurglarySafes() {
		return fireAndBurglarySafes;
	}

	// Floor Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8887\"]/a)[2]")
	private WebElement floorSafes;

	public WebElement getFloorSafes() {
		return floorSafes;
	}

	// Gun Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8888\"]/a)[2]")
	private WebElement gunSafes;

	public WebElement getGunSafes() {
		return gunSafes;
	}

	// High Security Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8890\"]/a)[2]")
	private WebElement highSecuritySafes;

	public WebElement getHighSecuritySafes() {
		return highSecuritySafes;
	}

	// TL-15 Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-11158\"]/a)[2]")
	private WebElement tl15Safes;

	public WebElement getTl15Safes() {
		return tl15Safes;
	}

	// TL-30 Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-11159\"]/a)[2]")
	private WebElement tl30Safes;

	public WebElement getTl30Safes() {
		return tl30Safes;
	}

	// High Security Vault
	@FindBy(xpath = "(//*[@id=\"menu-item-8889\"]/a)[2]")
	private WebElement highSecurityVault;

	public WebElement getHighSecurityVault() {
		return highSecurityVault;
	}

	// Inventory Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8891\"]/a)[2]")
	private WebElement inventorySafes;

	public WebElement getInventorySafes() {
		return inventorySafes;
	}

	// Safe Deposit Boxes & Lockers
	@FindBy(xpath = "(//*[@id=\"menu-item-8892\"]/a)[2]")
	private WebElement safeDepositBoxesLockers;

	public WebElement getSafeDepositBoxesLockers() {
		return safeDepositBoxesLockers;
	}

	// Utility Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8893\"]/a)[2]")
	private WebElement utilitySafes;

	public WebElement getUtilitySafes() {
		return utilitySafes;
	}

	// Hardware
	@FindBy(xpath = "(//*[@id=\"menu-item-10419\"]/a)[2]")
	private WebElement hardware;

	public WebElement getHardware() {
		return hardware;
	}

	// Keypads & Locks
	@FindBy(xpath = "(//*[@id=\"menu-item-8894\"]/a)[2]")
	private WebElement keypadsAndLocks;

	public WebElement getKeypadsAndLocks() {
		return keypadsAndLocks;
	}

	// dormakaba
	@FindBy(xpath = "(//*[@id=\"menu-item-8895\"]/a)[2]")
	private WebElement dormakaba;

	public WebElement getDormakaba() {
		return dormakaba;
	}

	// Securam
	@FindBy(xpath = "(//*[@id=\"menu-item-8896\"]/a)[2]")
	private WebElement securam;

	public WebElement getSecuram() {
		return securam;
	}

	// Installation Kits
	@FindBy(xpath = "(//*[@id=\"menu-item-10970\"]/a)[2]")
	private WebElement installationKits;

	public WebElement getInstallationKits() {
		return installationKits;
	}

	// Cash Handling
	@FindBy(xpath = "(//*[@id=\"menu-item-8898\"]/a)[2]")
	private WebElement cashHandling;

	public WebElement getCashHandling() {
		return cashHandling;
	}

	// Currency Sorters / Counters
	@FindBy(xpath = "(//*[@id=\"menu-item-8899\"]/a)[2]")
	private WebElement currencySortersCounters;

	public WebElement getCurrencySortersCounters() {
		return currencySortersCounters;
	}

	// Smart Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8900\"]/a)[2]")
	private WebElement smartSafes;

	public WebElement getSmartSafes() {
		return smartSafes;
	}

	// Cash & Coin Recyclers
	@FindBy(xpath = "(//*[@id=\"menu-item-8901\"]/a)[2]")
	private WebElement cashCoinRecyclers;

	public WebElement getCashCoinRecyclers() {
		return cashCoinRecyclers;
	}

	// Browse All
	@FindBy(xpath = "(//*[@id=\"menu-item-8902\"]/a)[2]")
	private WebElement browseAllCashHandling;

	public WebElement getBrowseAllCashHandling() {
		return browseAllCashHandling;
	}

	// =================== RESIDENTIAL ===================

	// Residential
	@FindBy(xpath = "(//*[@id=\"menu-item-7800\"]/a)[1]")
	private WebElement resHeader;

	public WebElement getResHeader() {
		return resHeader;
	}

	// Fire & Burglary Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-7772\"]/a)[1]")
	private WebElement resFireBurglary;

	public WebElement getResFireBurglary() {
		return resFireBurglary;
	}

	// Gun Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-7774\"]/a)[1]")
	private WebElement resGunSafes;

	public WebElement getResGunSafes() {
		return resGunSafes;
	}

	// Floor Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-7773\"]/a)[1]")
	private WebElement resFloorSafes;

	public WebElement getResFloorSafes() {
		return resFloorSafes;
	}

	// =================== COMMERCIAL ===================

	// Commercial
	@FindBy(xpath = "(//*[@id=\"menu-item-7799\"]/a)[1]")
	private WebElement comHeader;

	public WebElement getComHeader() {
		return comHeader;
	}

	// Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8904\"]/a)[1]")
	private WebElement comDepositorySafes;

	public WebElement getComDepositorySafes() {
		return comDepositorySafes;
	}

	// Pull Drawer Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8862\"]/a)[1]")
	private WebElement comPullDrawer;

	public WebElement getComPullDrawer() {
		return comPullDrawer;
	}

	// Drop Slot Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-8863\"]/a)[1]")
	private WebElement comDropSlot;

	public WebElement getComDropSlot() {
		return comDropSlot;
	}

	// Front Load Hopper Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-7778\"]/a)[1]")
	private WebElement comFrontHopper;

	public WebElement getComFrontHopper() {
		return comFrontHopper;
	}

	// Rear Load Hopper Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-10596\"]/a)[1]")
	private WebElement comRearHopper;

	public WebElement getComRearHopper() {
		return comRearHopper;
	}

	// Rotary Hopper Depository Safes
	@FindBy(xpath = "(//*[@id=\"menu-item-7779\"]/a)[1]")
	private WebElement comRotaryHopper;

	public WebElement getComRotaryHopper() {
		return comRotaryHopper;
	}

	// =================== UTILITY ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-7777\"]/a)[1]")
	private WebElement utl_safes;

	public WebElement getUtlSafesElement() {
		return utl_safes;
	}

	// =================== HIGH SECURITY ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-7780\"]/a)[1]")
	private WebElement sec_highSafes;

	public WebElement getSecHighSafesElement() {
		return sec_highSafes;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-11156\"]/a)[1]")
	private WebElement sec_tl15;

	public WebElement getSecTl15Element() {
		return sec_tl15;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-11157\"]/a)[1]")
	private WebElement sec_tl30;

	public WebElement getSecTl30Element() {
		return sec_tl30;
	}

	// =================== INVENTORY ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-7781\"]/a)[1]")
	private WebElement inv_safes;

	public WebElement getInvSafesElement() {
		return inv_safes;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-7776\"]/a)[1]")
	private WebElement inv_underCounter;

	public WebElement getInvUnderCounterElement() {
		return inv_underCounter;
	}

	// =================== BANKING ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-7798\"]/a)[1]")
	private WebElement bnk_header;

	public WebElement getBnkHeaderElement() {
		return bnk_header;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-8905\"]/a)[1]")
	private WebElement bnk_cashHandling;

	public WebElement getBnkCashHandlingElement() {
		return bnk_cashHandling;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-8906\"]/a)[1]")
	private WebElement bnk_currencySorters;

	public WebElement getBnkCurrencySortersElement() {
		return bnk_currencySorters;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-8907\"]/a)[1]")
	private WebElement bnk_smartSafes;

	public WebElement getBnkSmartSafesElement() {
		return bnk_smartSafes;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-8908\"]/a)[1]")
	private WebElement bnk_coinRecyclers;

	public WebElement getBnkCoinRecyclersElement() {
		return bnk_coinRecyclers;
	}

	// =================== SAFE DEPOSIT ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-8875\"]/a)[1]")
	private WebElement dep_boxes;

	public WebElement getDepBoxesElement() {
		return dep_boxes;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-7802\"]/a)[1]")
	private WebElement dep_highVault;

	public WebElement getDepHighVaultElement() {
		return dep_highVault;
	}

	// =================== HARDWARE ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-8399\"]/a)[1]")
	private WebElement hw_header;

	public WebElement getHwHeaderElement() {
		return hw_header;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-10424\"]/a)[1]")
	private WebElement hw_keypadsLocks;

	public WebElement getHwKeypadsLocksElement() {
		return hw_keypadsLocks;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-10357\"]/a)[1]")
	private WebElement hw_dormakaba;

	public WebElement getHwDormakabaElement() {
		return hw_dormakaba;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-10358\"]/a)[1]")
	private WebElement hw_securam;

	public WebElement getHwSecuramElement() {
		return hw_securam;
	}

	// =================== INSTALLATION ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-10969\"]/a)[1]")
	private WebElement kit_installation;

	public WebElement getKitInstallationElement() {
		return kit_installation;
	}

	// =================== OTHER ===================

	@FindBy(xpath = "(//*[@id=\"menu-item-10235\"]/a)[1]")
	private WebElement oth_deals;

	public WebElement getOthDealsElement() {
		return oth_deals;
	}

	@FindBy(xpath = "(//*[@id=\"menu-item-6144\"]/a)[1]")
	private WebElement oth_contact;

	public WebElement getOthContactElement() {
		return oth_contact;
	}

	@FindBy(xpath = "//*[@id=\"masthead\"]/div[1]/div[1]/form")
	private WebElement searchField;

	public WebElement getSearchField() {
		return searchField;
	}

	@FindBy(xpath = "//*[@id=\"electro_header_search_categories_dropdown\"]")
	private WebElement dropDownforSelect;

	public WebElement getDropDownforSelect() {
		return dropDownforSelect;
	}

	@FindBy(xpath = "//*[@id=\"masthead\"]/div[1]/div[1]/form/div/div[3]/button/i")
	private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy(xpath = "//*[@id=\"search\"]")
	private WebElement inputField;

	public WebElement getInputField() {
		return inputField;
	}

	@FindBy(xpath = "//*[@id=\"main\"]/header/h1")
	private WebElement validResult;

	public WebElement getValidResult() {
		return validResult;
	}

	@FindBy(xpath = "//*[@id=\"main\"]/div/div")
	private WebElement noResultPage;

	public WebElement getNoResultPage() {
		return noResultPage;
	}
	
	
}
