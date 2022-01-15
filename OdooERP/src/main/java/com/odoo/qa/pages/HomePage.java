package com.odoo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.odoo.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//*[contains(text(),'Receipt')]//parent::div")
	WebElement receiptButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	public void ClickOnReceiptButton() {
		receiptButton.click();
	}
}
