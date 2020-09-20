package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	//Page Factory - OR:
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	WebElement signin;
	
	@FindBy(id="signInSubmit")
	WebElement loginBtn;
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public HomePage login(String un, String pwd){
		signin.click();
		username.sendKeys(un);
		continuebtn.click();
		password.sendKeys(pwd);
		//loginBtn.click();
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginBtn);
		return new HomePage();
	}

}
