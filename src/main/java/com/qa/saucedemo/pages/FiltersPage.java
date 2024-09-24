package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class FiltersPage extends BaseClass{
	public FiltersPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select")WebElement filter;
	@FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select/option[1]")WebElement AZ;
	@FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select/option[2]")WebElement ZA;
	@FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select/option[3]")WebElement LOHI;
	@FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select/option[4]")WebElement HILO;
	

public void Filters() throws InterruptedException {
	Thread.sleep(2000);
	filter.click();
	Thread.sleep(1000);
	AZ.click();
	Thread.sleep(1000);
	ZA.click();
	Thread.sleep(1000);
	LOHI.click();
	Thread.sleep(1000);
	HILO.click();
	Thread.sleep(1000);
}

}

