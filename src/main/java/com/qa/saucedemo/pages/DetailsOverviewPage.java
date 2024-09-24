package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class DetailsOverviewPage extends BaseClass{
	
		public DetailsOverviewPage() {
			PageFactory.initElements(driver,this);
		}
		@FindBy(id="first-name")WebElement firstname;
		@FindBy(id="last-name")WebElement lastname;
		@FindBy(id="postal-code")WebElement postalcode;
		@FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")WebElement Continue;
		@FindBy(linkText="FINISH")WebElement Finish;
		
		
		public void OverViewDetails(String first,String last,String postal) {
			firstname.sendKeys(first);
			lastname.sendKeys(last);
			postalcode.sendKeys(postal);
			Continue.click();
			Finish.click();
		}
			
		}



