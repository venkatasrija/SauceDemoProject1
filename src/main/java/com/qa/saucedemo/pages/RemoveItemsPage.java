package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class RemoveItemsPage extends BaseClass{
	public RemoveItemsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button")WebElement RemoveItem;
	@FindBy(linkText="CHECKOUT")WebElement Checkout;
	
	
	public void RemoveItem() throws InterruptedException {
		Thread.sleep(2000);
		RemoveItem.click();
		Thread.sleep(2000);
		Checkout.click();
	
	}
}


