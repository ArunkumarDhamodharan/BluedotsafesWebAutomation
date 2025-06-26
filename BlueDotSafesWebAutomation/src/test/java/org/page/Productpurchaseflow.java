package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpurchaseflow extends BaseClass {
	
	public Productpurchaseflow() {
		PageFactory.initElements(driver, this);
	}
	
	// Product 1 (e.g., first product in a product list/grid)
	@FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/div/div/div[1]/a/div")
	private WebElement product1;

	public WebElement getProduct1() {
	    return product1;
	}
	
	// Add to Cart Button
	@FindBy(xpath = "//*[@id=\"product-5906\"]/div[1]/div[2]/form/button")
	private WebElement addToCart;

	public WebElement getAddToCart() {
	    return addToCart;
	}

	// Checkout Button
	@FindBy(xpath = "//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td/div/a") // covers both anchor or button type
	private WebElement checkoutButton;

	public WebElement getCheckoutButton() {
	    return checkoutButton;
	}
	
	

}
