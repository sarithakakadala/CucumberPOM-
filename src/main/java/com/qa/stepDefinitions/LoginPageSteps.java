package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
	    TestBase.intialization();
	   
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()  {
		loginpage=new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
	    
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
	   homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password")) ;
	   
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	    boolean flag=homepage.validateUserlabel();
	    Assert.assertTrue(flag);
	   
	}

}
