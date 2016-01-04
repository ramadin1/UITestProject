package com.surlatable.ui.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmokeTest {
	WebDriver driver = null;
	LoginPage loginPage = null;
	HomePage homePage = null;
	
	@Before
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown(){
		//driver.quit();
	}
	
	@Given("^user navigates to \"(.*)\"$")
	public void navigatePage(String url) {
		driver.navigate().to(url);
		loginPage = new LoginPage(driver);
	}

	@When("^click login or register link$")
	public void click_login_or_register_link() {
		Assert.assertEquals(loginPage, loginPage.clickLoginLink());
	}
	
	
	@And("^logs in using Email as \"(.*)\"$")
	public void logs_in_using_Email_as(String usename) {
		Assert.assertEquals(loginPage, loginPage.typeUsername(usename));
	}
	
	@And("^password as a \"(.*)\"$")
	public void password_as_a(String password) {
		Assert.assertEquals(loginPage, loginPage.typePassword(password));
	}
	
	@And("^clicks the Submit button$")
	public void clicks_the_Submit_button() {
		Object obj = loginPage.submitLogin();
		homePage = new HomePage(driver);
		//Assert.assertEquals(homePage, obj);
	}
	
	@Then("^login should be successful$")
	public void login_should_be_successful() {
		System.out.println("Executing 2<sup>nd</sup> Then stastatement");
	}
	
	@And("^Home page should be displayed$")
	public void home_page_should_be_displayed() {
		System.out.println("Executing Then statement");
	}
	@And("^should be able to logout successfully$")
	public void should_be_able_to_logout_successfully(){
		loginPage = homePage.logOut();
		//Assert.assertEquals(loginPage, loginPage);
	}
	
	
}
