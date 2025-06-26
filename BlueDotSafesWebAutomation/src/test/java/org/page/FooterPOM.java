package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPOM extends BaseClass {

	public FooterPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='header-logo-link'])[1]")
	private WebElement siteLogo;

	public WebElement getSiteLogo() {
		return siteLogo;
	}

	// Contact Details
	@FindBy(xpath = "(//*[@id=\"text-3\"]/div)[1]")
	private WebElement contactDetails;

	public WebElement getContactDetails() {
		return contactDetails;
	}

	// Product Links
	@FindBy(xpath = "(//*[@id=\"nav_menu-4\"]/div)[1]")
	private WebElement productLinks;

	public WebElement getProductLinks() {
		return productLinks;
	}

	// Quick Links
	@FindBy(xpath = "(//*[@id=\"nav_menu-3\"]/div)[1]")
	private WebElement quickLinks;

	public WebElement getQuickLinks() {
		return quickLinks;
	}

	// Customer Care
	@FindBy(xpath = "(//*[@id=\"nav_menu-2\"]/div)[1]")
	private WebElement customerCare;

	public WebElement getCustomerCare() {
		return customerCare;
	}

	// Copyright
	@FindBy(xpath = "//*[@id=\"colophon\"]/div[1]/div[4]/div/div[1]")
	private WebElement copyright;

	public WebElement getCopyright() {
		return copyright;
	}

	// Phone Number Clickable Link
	@FindBy(xpath = "(//*[@id=\"text-3\"]/div/div/ul/li[3]/span/a/span)[1]")
	private WebElement phoneNoLink;

	public WebElement getPhoneNoLink() {
		return phoneNoLink;
	}

	// All Products
	@FindBy(xpath = "//*[@id=\"menu-item-7896\"]/a")
	private WebElement allProducts;

	public WebElement getAllProducts() {
		return allProducts;
	}

	// Residential Safes
	@FindBy(xpath = "//*[@id=\"menu-item-7897\"]/a")
	private WebElement residentialSafes;

	public WebElement getResidentialSafes() {
		return residentialSafes;
	}

	// Commercial Safes
	@FindBy(xpath = "//*[@id=\"menu-item-7899\"]/a")
	private WebElement commercialSafes;

	public WebElement getCommercialSafes() {
		return commercialSafes;
	}

	// Keypads & Locks
	@FindBy(xpath = "//*[@id=\"menu-item-8935\"]/a")
	private WebElement keypadsAndLocks;

	public WebElement getKeypadsAndLocks() {
		return keypadsAndLocks;
	}

	// Banking
	@FindBy(xpath = "//*[@id=\"menu-item-7900\"]/a")
	private WebElement banking;

	public WebElement getBanking() {
		return banking;
	}

	// Cash Handling
	@FindBy(xpath = "//*[@id=\"menu-item-7895\"]/a")
	private WebElement cashHandling;

	public WebElement getCashHandling() {
		return cashHandling;
	}

	// About
	@FindBy(xpath = "//*[@id=\"menu-item-11200\"]/a")
	private WebElement about;

	public WebElement getAbout() {
		return about;
	}

	// Job Openings
	@FindBy(xpath = "//*[@id=\"menu-item-8118\"]/a")
	private WebElement jobOpenings;

	public WebElement getJobOpenings() {
		return jobOpenings;
	}

	// Service
	@FindBy(xpath = "//*[@id=\"menu-item-8001\"]/a")
	private WebElement service;

	public WebElement getService() {
		return service;
	}

	// Blogs
	@FindBy(xpath = "//*[@id=\"menu-item-10364\"]/a")
	private WebElement blogs;

	public WebElement getBlogs() {
		return blogs;
	}

	// Compare
	@FindBy(xpath = "//*[@id=\"menu-item-5645\"]/a")
	private WebElement compare;

	public WebElement getCompare() {
		return compare;
	}

	// Store Directory
	@FindBy(xpath = "//*[@id=\"menu-item-5646\"]/a")
	private WebElement storeDirectory;

	public WebElement getStoreDirectory() {
		return storeDirectory;
	}

	// Warranty
	@FindBy(xpath = "//*[@id=\"menu-item-5728\"]/a")
	private WebElement warranty;

	public WebElement getWarranty() {
		return warranty;
	}

	// Refund Policy
	@FindBy(xpath = "//*[@id=\"menu-item-5386\"]/a")
	private WebElement refundPolicy;

	public WebElement getRefundPolicy() {
		return refundPolicy;
	}

	// Shipping Policy
	@FindBy(xpath = "//*[@id=\"menu-item-5385\"]/a")
	private WebElement shippingPolicy;

	public WebElement getShippingPolicy() {
		return shippingPolicy;
	}

	// Contact Us
	@FindBy(xpath = "//*[@id=\"menu-item-7991\"]/a")
	private WebElement contactUs;

	public WebElement getContactUs() {
		return contactUs;
	}

	// Support
	@FindBy(xpath = "//*[@id=\"menu-item-7992\"]/a")
	private WebElement support;

	public WebElement getSupport() {
		return support;
	}

	// Home Redirection from Copyright
	@FindBy(xpath = "(//a[contains(text(), 'Blue Dot Safes')])[1]")
	private WebElement copyrightsHomeRedirection;

	public WebElement getCopyrightsHomeRedirection() {
		return copyrightsHomeRedirection;
	}

	@FindBy(xpath = "//i[@class='fa fa-angle-up']")
	private WebElement topToScroll;

	public WebElement getTopToScroll() {
		return topToScroll;
	}

}
