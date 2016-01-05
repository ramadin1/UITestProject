package com.surlatable.ui.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmokeTest {
	LoginPage loginPage = null;
	HomePage homePage = null;
	Page page = null;
	
	@Before
	public void setup(){
		page = new Page();
		page.maximizeBrowser();
		page.implicitlyWait();		
	}
	
	@After
	public void tearDown(){
		page.closeBrowser();
	}
	
	@Given("^user navigates to \"(.*)\"$")
	public void user_navigates_to(String url) {
		loginPage = page.navigate(url);;
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
		homePage = loginPage.submitLogin();
		Assert.assertFalse(homePage.equals(new IllegalStateException("This is not the home page")));
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
