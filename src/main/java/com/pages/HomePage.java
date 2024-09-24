package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Browser;

public class HomePage extends Pages {

	public HomePage(Browser browser) {
		super(browser);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}

	private final By BizQuery  = By.xpath("//*[contains(text(),\"BizQuery\")]");
	private final By Master_List  = By.xpath("//*[contains(text(),\"Master List\")]");
	private final By Lookup  = By.xpath("//*[contains(text(),\"Lookup\")]");
	private final By Project_Tracker  = By.xpath("//*[contains(text(),\"Project Tracker\")]");
	
	public void VerifyBizQuery() {	
		getVisibleText(BizQuery);	
	}
	
	public void Master_List() {	
		getVisibleText(Master_List);	
	}
	
	public void Lookup() {	
		getVisibleText(Lookup);	
	}
	
	public void Project_Tracker() {	
		getVisibleText(Project_Tracker);	
	}
	
    public BizQuery ClickOnBizQuery() {
    	clickOn(BizQuery);
    	return new  BizQuery(getDriver());
    }
	
	
}
