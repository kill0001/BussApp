package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Browser;


public class LoginPage extends Pages {

	private final By EmailAdress  = By.id("mat-input-0");
	private final By ClickOnNext  = By.xpath("//span[contains(text(),\"Next\")]");
	private final By Password = By.name("passwd");
	private final By SignIN = By.id("idSIButton9");
	public LoginPage(Browser browser) {
		super(browser);
		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	public LoginPage(WebDriver driver) {
		super(driver);
		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	public void enterPassword( String password) {
		enterTextInto(Password, password);
	}
	
	public void ClickOnSignIn() {
		clickOn(SignIN);
	}
	
	public void EnterEmailAddress(String emailAdress) {
		enterTextInto(EmailAdress, emailAdress);
	}
	
	public HomePage ClickOnNext() {
		clickOn(ClickOnNext);
		return new HomePage(getDriver());
	}
	
	
	
}
