package com.odoo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.odoo.qa.base.TestBase;

public class LogInPage extends TestBase {
	@FindBy(name = "login")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-block\"]")
	WebElement logInButton;

	@FindBy(xpath = "//*[contains(text(),'Reset Password')]")
	WebElement resetPassword;

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public String LogInPageValidateTile() {
		return driver.getTitle();

	}

	public HomePage LogInTest(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		logInButton.click();
		
		return new HomePage();
	}
}
