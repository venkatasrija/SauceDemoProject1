package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.saucedemo.base.BaseClass;
//import com.qa.saucedemo.pages.AddToCartLinkPage;
import com.qa.saucedemo.pages.AddToCartimagePage;
//import com.qa.saucedemo.pages.CrossMarkPage;
import com.qa.saucedemo.pages.DetailsOverviewPage;
import com.qa.saucedemo.pages.FiltersPage;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.Logoutpage;
import com.qa.saucedemo.pages.RemoveItemsPage;
import com.qa.saucedemo.pages.SrceenShotDemo;

public class LoginTestCase extends BaseClass{
	
	WebDriver driver;
	LoginPage lp;
	SrceenShotDemo sc= new SrceenShotDemo();
	public LoginTestCase() throws IOException{
		super();
	}
		
	@BeforeSuite
	public void setUp() throws IOException {
		initialization();
		lp=new LoginPage();	
		
	}
	 @Test(priority=1)
	public void loginPageTitle() throws InterruptedException {
		String title=lp.validateLoginPagTitle();
		Assert.assertEquals(title,"Swag Labs");
		Thread.sleep(1000);
		sc.LoginpagetitleSS();
	}
	

	@Test(priority=2)
	public void loginTest()throws InterruptedException {
		lp.login(props.getProperty("username"),props.getProperty("password"));
		Thread.sleep(2000);	
		sc.LoginpageSS();
	}
	
	@Test(priority=3)
	public void Filters() throws InterruptedException {
		FiltersPage f=new FiltersPage();
		f.Filters();
		Thread.sleep(1000);
		sc.FiltersSS();
	}
	
	
	@Test(priority = 4)
	public void addToCartimageTest() throws InterruptedException, IOException {
		AddToCartimagePage Ca=new AddToCartimagePage();
		Ca.cartbyimage();
		Thread.sleep(1000);
		sc.AddtocartbyimageSS();
	}

//	@Test(priority = 5)
	//public void addToCartLink() throws InterruptedException {
	//	AddToCartLinkPage Ca1=new AddToCartLinkPage();
	//	Ca1.Cartbylink();
	//	Thread.sleep(1000);
	//	sc.AddtocartbylinkSS();
	//}
	
	@Test(priority=6)
	public void RemoveItemsTest() throws InterruptedException {
		 RemoveItemsPage ro=new  RemoveItemsPage();
		 ro.RemoveItem();
		 Thread.sleep(1000);
		 sc.RemoveItemSS();
	}
	
	
	
	@Test(priority=7)
	public void OverViewDetails() throws InterruptedException {
		DetailsOverviewPage Ov = new DetailsOverviewPage();
		Ov.OverViewDetails(props.getProperty("firstname"),props.getProperty("lastname"),props.getProperty("postalcode"));
		//Ov.OverViewDetails();
		Thread.sleep(1000);
		sc.DetailsOverViewSS();
	}
	
	
	@Test(priority=8)
    public void Logout() throws InterruptedException {
		Logoutpage lo=new Logoutpage();
		lo.Menu();
		Thread.sleep(1000);
		lo.logout();
		Thread.sleep(1000);
		sc.LogoutSS();
	}
	}
	
	

