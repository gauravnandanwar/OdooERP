package com.odoo.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
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
		homePage = new HomePage();
	}

	@Test()
	public void logIn() {
		homePage = logInPage.LogInTest(prop.getProperty("username"), prop.getProperty("password"));
		String actualTitle = homePage.getHomePageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle , "Odoo");
	}
	
	@Test(dependsOnMethods = { "logIn" } , enabled = false)
	public void verifyLogIn() {
		String actualTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actualTitle , "Odoo");
	}
	
	@AfterMethod
	public void teardown()
	{
		tearDown();
	}
}
