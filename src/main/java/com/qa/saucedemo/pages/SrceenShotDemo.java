package com.qa.saucedemo.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;
import com.qa.saucedemo.base.BaseClass;

public class SrceenShotDemo extends BaseClass {
	public SrceenShotDemo() {
		PageFactory.initElements(driver,this);
	}

	public void LogoimageSS() throws InterruptedException {
Thread.sleep(2000);
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location=new File("./LogoimageSS.png");
        try {
        	FileUtils.copyFile(screenshot, location);
        }catch(IOException e) {
        	e.printStackTrace();
        }
	}
	public void LoginpagetitleSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location1=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\LoginpagetitleSS.png");
        try {
        	Files.copy(screenshot1, location1);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void LoginpageSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location2=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\LoginpageSS.png");
        try {
        	Files.copy(screenshot2, location2);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void AddtocartbylinkSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location3=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\AddtocartbylinkSS.png");
        try {
        	Files.copy(screenshot3, location3);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void AddtocartbyimageSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location4=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\AddtocartbyimageSS.png");
        try {
        	Files.copy(screenshot4, location4);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void RemoveItemSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location5=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\RemoveItemSS.png");
        try {
        	Files.copy(screenshot5, location5);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void DetailsOverViewSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location6=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\DetailsOverViewSS.png");
        try {
        	Files.copy(screenshot6, location6);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void CrossMarkSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location7=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\CrossMarkSS.png");
        try {
        	Files.copy(screenshot7, location7);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void FiltersSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location8=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\FiltersSS.png");
        try {
        	Files.copy(screenshot8, location8);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}
	public void LogoutSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location9=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Selenium_project\\SreenShotDemo\\LogoutSS.png");
        try {
        	Files.copy(screenshot9, location9);
        }catch(IOException e) {
        	e.printStackTrace();
        }
     

	}

}



