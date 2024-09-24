package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Browser;

public class BizQuery  extends Pages{

	public BizQuery(Browser browser) {
		super(browser);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	public BizQuery(WebDriver driver) {
		super(driver);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	private static final By Youtube = By.xpath("//button[@class = 'btn']");
	
	
	public void verifyforYoutubeButton() {
		verifyelementDisplayed(Youtube);
	}
	
	public Youtube clickOnYouTubeButton() {
	 	clickOn(Youtube);
	 	return new Youtube(getDriver());
	}
	
	
}
