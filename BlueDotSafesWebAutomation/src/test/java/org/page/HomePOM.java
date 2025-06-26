package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM extends BaseClass {

	public HomePOM() {
		PageFactory.initElements(driver, this);
	}

	// Banner Section
	@FindBy(xpath = "//*[@id=\"rev_slider_7_1\"]/rs-bullets")
	private WebElement bannerSection;

	public WebElement getBannerSection() {
		return bannerSection;
	}

	// Banner Button 1
	@FindBy(xpath = "//*[@id=\"slider-7-slide-10-layer-8\"]")
	private WebElement bannerBtn1;

	public WebElement getBannerBtn1() {
		return bannerBtn1;
	}

	// Banner Button 2
	@FindBy(xpath = "//*[@id=\"slider-7-slide-32-layer-24\"]")
	private WebElement bannerBtn2;

	public WebElement getBannerBtn2() {
		return bannerBtn2;
	}

	// Banner Button 3
	@FindBy(xpath = "//*[@id=\"slider-7-slide-11-layer-8\"]")
	private WebElement bannerBtn3;

	public WebElement getBannerBtn3() {
		return bannerBtn3;
	}

	// Banner Button 4
	@FindBy(xpath = "//*[@id=\"slider-7-slide-31-layer-31\"]")
	private WebElement bannerBtn4;

	public WebElement getBannerBtn4() {
		return bannerBtn4;
	}

	// Owl Carousel 1
	@FindBy(xpath = "//*[@id=\"rev_slider_7_1\"]/rs-bullets/rs-bullet[1]")
	private WebElement owlCorozal1;

	public WebElement getOwlCorozal1() {
		return owlCorozal1;
	}

	// Owl Carousel 2
	@FindBy(xpath = "//*[@id=\"rev_slider_7_1\"]/rs-bullets/rs-bullet[2]")
	private WebElement owlCorozal2;

	public WebElement getOwlCorozal2() {
		return owlCorozal2;
	}

	// Owl Carousel 3
	@FindBy(xpath = "//*[@id=\"rev_slider_7_1\"]/rs-bullets/rs-bullet[3]")
	private WebElement owlCorozal3;

	public WebElement getOwlCorozal3() {
		return owlCorozal3;
	}

	// Owl Carousel 4
	@FindBy(xpath = "//*[@id=\"rev_slider_7_1\"]/rs-bullets/rs-bullet[4]")
	private WebElement owlCorozal4;

	public WebElement getOwlCorozal4() {
		return owlCorozal4;
	}

	// Company Features Section
	@FindBy(xpath = "//*[@id=\"post-5289\"]/div/div/div[2]/div")
	private WebElement companyFeatures;

	public WebElement getCompanyFeatures() {
		return companyFeatures;
	}

	// Major Products Section
	@FindBy(xpath = "//*[@id=\"post-5289\"]/div/div/div[3]")
	private WebElement majorProducts;

	public WebElement getMajorProducts() {
		return majorProducts;
	}

	// Safes Link
	@FindBy(xpath = "(//a[@class='da-media d-flex stretched-link'])[1]")
	private WebElement safesLink;

	public WebElement getSafesLink() {
		return safesLink;
	}

	// Lock Link
	@FindBy(xpath = "(//a[@class='da-media d-flex stretched-link'])[2]")
	private WebElement lockLink;

	public WebElement getLockLink() {
		return lockLink;
	}

	// Currency Store Link
	@FindBy(linkText = "(//a[@class='da-media d-flex stretched-link'])[3]")
	private WebElement currencyStoreLink;

	public WebElement getCurrencyStoreLink() {
		return currencyStoreLink;
	}
	
	

}
