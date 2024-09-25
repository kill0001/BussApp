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
	private static final By queryTitle = By.id("queryTitle");
	private static final By dateRange = By.cssSelector("[class=\"date\"]");
	private static final By datePicker = By.cssSelector("[class=\"ng-fa-icon fa-xs icon\"]");
	private static final By my_queriesTagName=By.id("my-queries");
	private static final By content_Owner_key=By.id("content_Owner_key");
	private static final By checkBox1 = By.xpath("(//*[@name='test'])[1]");
	private static final By checkBox2 = By.xpath("(//*[@name='test'])[2]");
	private static final By Query_String = By.xpath("//*[text()='Query String']");
	private static final By Format_SQL=By.xpath("//*[@ngbtooltip='Format SQL']");
	private static final By refresh= By.xpath("//*[@ngbtooltip='Refresh']");
	private static final By save = By.xpath("//*[@ngbtooltip='Save']");
	private static final By developerslink = By.xpath("//*[@ngbtooltip='Developers link']");
	private static final By filterteredRowSummery = By.id("filterteredRowSummery");
	private static final By submitButton = By.id("sendNews");
	private static final By manageQuerytableheader = By.xpath("//*[@class = \"template-id\"]");
	private static final By editIcon = By.xpath("//*[@data-icon=\"pen\"]");
	private static final By deleteIcon = By.xpath("//*[@data-icon=\"trash\"]");
	private static final By manageQuerySearchbar = By.xpath("//input[@placeholder=\" Search for id, name, created by or query text\"]");
	private static final By manageQueryPagination=By.xpath("//li[@class = \"page-item\"]");
	
	
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
	public void clickCreate_Query() {
		clickOn(Create_Query);
	}
	public void queryTitlefield() {
		verifyelementDisplayed(queryTitle);
	}
	public void dateRangeField() {
		verifyelementDisplayed(dateRange);
	}
	public void datePickerIcon() {
		verifyelementDisplayed(datePicker);	
	}
	public void my_queries() {
		verifyelementDisplayed(my_queriesTagName);
		verifyTagname(my_queriesTagName);	
	}
	public void content_Owner_key() {
		verifyelementDisplayed(content_Owner_key);
		verifyTagname(content_Owner_key);
	}
	public void checkBox1() {
		verifyelementDisplayed(checkBox1);	
	}
	public void checkBox2() {
		verifyelementDisplayed(checkBox2);	
	}
	public void Query_String() {
		verifyelementDisplayed(Query_String);
	}
	public void Format_SQL() {
		verifyelementDisplayed(Format_SQL);	
	}
	public void refresh() {
		verifyelementDisplayed(refresh);
	}
	public void save() {
		verifyelementDisplayed(save);
	}
	public void developerslink() {
		verifyelementDisplayed(developerslink);
	}
	public void filterteredRowSummery() {
		verifyelementDisplayed(filterteredRowSummery);
	}
	
	public void submitButton() {
		verifyelementDisplayed(submitButton);
		verifyTagname(submitButton);
	}
	public void clickManageQueryTemplates() {
		clickOn(ManageQueryTemplates);	
	}
	public void manageQuerytableheader() {
//		getVisibleText(manageQuerytableheader);
		getALLVisibleText(TableHeaders);
	}
	public void editIcon() {
		
		VerifyIcons(editIcon);

	}
	public void deleteIcon() {
		VerifyIcons(deleteIcon);
	}
	public void manageQuerySearchbar() {
	verifyelementDisplayed(manageQuerySearchbar);
	}
	public void verifyManageQueryPagination() {
		verifyelementDisplayed(manageQueryPagination);
	}
	
}
