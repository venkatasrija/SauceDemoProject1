package com.qa.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class AddToCartimagePage extends  BaseClass {
	
	@FindBy(xpath="//*[@id=\"item_3_img_link\"]/img")WebElement clickonimage;
    @FindBy(xpath="//*[@id=\'inventory_item_container\']/div/div/div/button")WebElement Addtocartbyimage;
    @FindBy(id="shopping_cart_container")WebElement cartPage;
    
    
    public  AddToCartimagePage()throws IOException {
		PageFactory.initElements(driver, this);
		
	}
 
    public void cartbyimage() throws InterruptedException {
    	 clickonimage.click();
    	 Thread.sleep(1000);
    	 Addtocartbyimage.click();
    	 Thread.sleep(1000);
    	 cartPage.click();
   	 }

}