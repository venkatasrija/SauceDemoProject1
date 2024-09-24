package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class Logoutpage extends BaseClass {
	public Logoutpage() {
		PageFactory.initElements(driver,this);
	}
	//locators of logout page
	@FindBy(xpath="//button[@style='position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none; opacity: 0; font-size: 8px; cursor: pointer;']") WebElement Menubutton;
	@FindBy(id="logout_sidebar_link") WebElement logoutBtn;

	public void Menu() throws InterruptedException {
		Menubutton.click();
		Thread.sleep(2000);
	}
	public void logout() {
		logoutBtn.click();
	}

}



