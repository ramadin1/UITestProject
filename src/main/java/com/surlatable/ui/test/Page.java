package com.surlatable.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	
	public static WebDriver driver = null;
	
	@SuppressWarnings("static-access")
	public Page(){
		if(driver == null){
			this.driver = new FirefoxDriver();			
		}
	}
	
	public LoginPage navigate(String url){
		 driver.navigate().to(url);
		 return new LoginPage();
		
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
	public void maximizeBrowser(){
		driver.manage().window().maximize();
	}
	
	public void implicitlyWait(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
