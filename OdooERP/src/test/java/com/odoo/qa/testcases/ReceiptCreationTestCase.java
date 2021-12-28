package com.odoo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.odoo.qa.base.TestBase;
import com.odoo.qa.pages.HomePage;
import com.odoo.qa.pages.LogInPage;

public class ReceiptCreationTestCase extends TestBase {
	LogInPage logInPage;
	HomePage homePage;

	public ReceiptCreationTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		logInPage = new LogInPage();
		homePage = new HomePage();
		homePage = logInPage.LogInTest(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void clickOnReceipt() {
	homePage.ClickOnReceiptButton();
	}

	@AfterMethod
	public void teardown() {
		tearDown();
	}

}
