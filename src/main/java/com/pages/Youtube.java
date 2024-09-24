package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.util.Browser;

public class Youtube extends Pages {

	public Youtube(Browser browser) {
		super(browser);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	public Youtube(WebDriver driver) {
		super(driver);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	
	private static final By YouTubeTab = By.xpath("//*[contains(text(),\" YouTube Reports \")]");
	private static final By Create_Query = By.xpath("//*[contains(text(),\" Create Query \")]");
	private static final By ManageQueryTemplates = By.xpath("//*[contains(text(),\" Manage Query Templates \")]");
	private static final By TableHeaders = By.xpath("//table/thead/tr/th");
	private static final By ToggleButton = By.id("flexSwitchCheckChecked");
	private static final By checForSearchbar = By.xpath("//input[@placeholder = \"Search for id, name, requested by, status or query text\"]");
	
	
	
	public void verifyYouTubeTab() {
		verifyelementDisplayed(YouTubeTab);
	}
	
	public void verifyCreate_QueryTab() {
		verifyelementDisplayed(Create_Query);
	}
	
	public void verifyManageQueryTemplatesTab() {
		verifyelementDisplayed(ManageQueryTemplates);
	}
	
	public void getAlltableheaders() {
		getALLVisibleText(TableHeaders);
	}
	
	public void checkForToggleButton() {
		verifyelementDisplayed(ToggleButton);
	}
	
	public void checkForSearchbar() {
	   verifyelementDisplayed(checForSearchbar);	
	}
	
}
