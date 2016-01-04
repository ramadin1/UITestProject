package com.surlatable.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver = null;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		String title = driver.getTitle();
		System.out.println(title);
		  // Check that we're on the right page.
        if (!"Cookware, Cutlery, Dinnerware, Bakeware | Sur La Table".trim().equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the home page");
        }
        
    }
	
    By logOutLinkLocator = By.id("topHeaderSignInOut");

    public LoginPage logOut(){
        driver.findElement(logOutLinkLocator).click();
    	return new LoginPage(driver);
    }

}
