package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Browser;


public class LoginPage extends Pages {

	private final By EmailAdress  = By.id("mat-input-0");
	private final By ClickOnNext  = By.xpath("//span[contains(text(),\"Next\")]");
	
	public LoginPage(Browser browser) {
		super(browser);
		goToWebSite("https://uat-auth-console.sonymusic.com/#/login");
	}
	
	public LoginPage(WebDriver driver) {
		super(driver);
		goToWebSite("https://uat-auth-console.sonymusic.com/#/login");
	}
	
	public void EnterEmailAddress(String emailAdress) {
		enterTextInto(EmailAdress, emailAdress);
	}
	
	public void ClickOnNext() {
		clickOn(ClickOnNext);
	}
	
	
}
