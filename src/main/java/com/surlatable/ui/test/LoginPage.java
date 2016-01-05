package com.surlatable.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page{
	    WebElement loginOrRegisteration= null;
	    
	    public LoginPage() {        
	        if (!"Cookware, Cutlery, Dinnerware, Bakeware | Sur La Table".trim().equals(driver.getTitle())) {
	            throw new IllegalStateException("This is not the login page");
	        }
	    }

	        By usernameLocator = By.xpath("//*[@id='popupLoginForm']/dl/dd[1]/input[1]");
	        By passwordLocator = By.xpath("//*[@id='popupLoginForm']/dl/dd[2]/input[1]");
	        By loginButtonLocator = By.id("loginBtnId");
	        By loginOrRegister = By.linkText("Log In or Register");
	        By firstNameLocator = By.xpath("//*[@id='popupRegisterForm']/dl/dd[1]/input[5]");
	        By lastNameLocator = By.xpath("//*[@id='popupRegisterForm']/dl/dd[2]/input[1]");
	        By emailLocator = By.xpath("//*[@id='popupRegisterForm']/dl/dd[3]/input[1]");
	        By registerPasswordLocator = By.xpath("//*[@id='popupRegisterForm']/dl/dd[4]/input[1]");
	        By registerConfigPasswordLocator = By.xpath("//*[@id='popupRegisterForm']/dl/dd[5]/input[1]");
	        By createMyAccountLocator = By.id("registerSubBtn");
	        
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
	        return new HomePage();    
	    }

	    public LoginPage submitLoginExpectingFailure() {
	        driver.findElement(loginButtonLocator).submit();
	        return new LoginPage();   
	    }
	    
	    public LoginPage doRegister(String fName, String lName, String email, String psw){
	    	loginOrRegisteration.findElement(firstNameLocator).sendKeys(fName);
	    	loginOrRegisteration.findElement(lastNameLocator).sendKeys(lName);
	    	loginOrRegisteration.findElement(emailLocator).sendKeys(email);
	    	loginOrRegisteration.findElement(registerPasswordLocator).sendKeys(psw);
	    	loginOrRegisteration.findElement(registerConfigPasswordLocator).sendKeys(psw);
	    	loginOrRegisteration.findElement(createMyAccountLocator).click();
	    	
	    	return new LoginPage();  
	    }

	    public HomePage loginAs(String username, String password) {
	        typeUsername(username);
	        typePassword(password);
	        return submitLogin();
	    }
	

}
