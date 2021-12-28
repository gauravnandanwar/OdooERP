package com.odoo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.odoo.qa.base.TestBase;
import com.odoo.qa.pages.HomePage;
import com.odoo.qa.pages.LogInPage;

public class LogInTestCase extends TestBase {
	LogInPage logInPage;
	HomePage homePage;

	public LogInTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		logInPage = new LogInPage();
	}

	@Test
	public void logIn() {
		homePage = logInPage.LogInTest(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown()
	{
		tearDown();
	}
}
