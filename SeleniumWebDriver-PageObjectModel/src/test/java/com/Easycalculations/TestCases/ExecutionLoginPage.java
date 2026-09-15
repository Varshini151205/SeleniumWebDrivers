package com.Easycalculations.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.easycalculation.pages.LoginEasyCal;

import Helper.BrowserFactory;

public class ExecutionLoginPage {
	@Test 
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.startBrowser("Chrome");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");

		LoginEasyCal loginPageEasyCal = PageFactory.initElements(driver, LoginEasyCal.class);
		loginPageEasyCal.login_EasyCal("9874563210","varshini123");
	}
	
}
