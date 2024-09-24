package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class AddToCartLinkPage extends BaseClass {
	public AddToCartLinkPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Sauce Labs Backpack")WebElement BlackBag;
	@FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/div/div/button")WebElement Addtocartbylink;
	@FindBy(xpath="//*[@id=\"inventory_item_container\"]/div/button")WebElement BackButton;
	//@FindBy(id="shopping_cart_container")WebElement CartPage;
	
	public void Cartbylink() throws InterruptedException {
		BlackBag.click();
		Thread.sleep(1000);
		Addtocartbylink.click();
		Thread.sleep(1000);
		BackButton.click();
		//CartPage.click();
	}

}

