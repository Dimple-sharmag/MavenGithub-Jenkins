package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Testbase.TestBase;

public class HomePage extends TestBase {
	@FindBy(linkText= "Welcome Admin")
	WebElement welcome;

	@FindBy(linkText= "Logout")
	WebElement logout;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}


public void logout() {
	welcome.click();
	logout.click();
	
}
}