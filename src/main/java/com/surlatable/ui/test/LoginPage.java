package com.surlatable.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	    private final WebDriver driver;
	    WebElement loginOrRegisteration= null;
	    
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        
	        if (!"Cookware, Cutlery, Dinnerware, Bakeware | Sur La Table".trim().equals(driver.getTitle())) {
	            throw new IllegalStateException("This is not the login page");
	        }
	    }

	        By usernameLocator = By.xpath("//*[@id='popupLoginForm']/dl/dd[1]/input[1]");
	        By passwordLocator = By.xpath("//*[@id='popupLoginForm']/dl/dd[2]/input[1]");
	        By loginButtonLocator = By.id("loginBtnId");
	        By loginOrRegister = By.linkText("Log In or Register");
	        
	    public LoginPage clickLoginLink() {
	        driver.findElement(loginOrRegister).click();
	        loginOrRegisteration = driver.findElement(By.id("dynamicLoadWrapper"));
	        return this;    
	    }

	    public LoginPage typeUsername(String username) {   	
	    	loginOrRegisteration.findElement(usernameLocator).sendKeys(username);
	        return this;    
	    }

	    public LoginPage typePassword(String password) {
	        driver.findElement(passwordLocator).sendKeys(password);
	        return this;    
	    }

	    public HomePage submitLogin() {
	        driver.findElement(loginButtonLocator).click();;
	        return new HomePage(driver);    
	    }

	    public LoginPage submitLoginExpectingFailure() {
	        driver.findElement(loginButtonLocator).submit();
	        return new LoginPage(driver);   
	    }

	    public HomePage loginAs(String username, String password) {
	        typeUsername(username);
	        typePassword(password);
	        return submitLogin();
	    }
	

}
