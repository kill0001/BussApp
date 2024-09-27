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
	private static final By checForSearchbar = By
			.xpath("//input[@placeholder = \"Search for id, name, requested by, status or query text\"]");
	private static final By queryTitle = By.id("queryTitle");
	private static final By dateRange = By.cssSelector("[class=\"date\"]");
	private static final By datePicker = By.cssSelector("[class=\"ng-fa-icon fa-xs icon\"]");
	private static final By my_queries = By.id("my-queries");
	private static final By content_Owner_key = By.id("content_Owner_key");
	private static final By checkBox1 = By.xpath("(//*[@name='test'])[1]");
	private static final By checkBox2 = By.xpath("(//*[@name='test'])[2]");
	private static final By Query_String = By.id("queryText");
	private static final By Format_SQL = By.xpath("//*[@ngbtooltip='Format SQL']");
	private static final By refresh = By.xpath("//*[@ngbtooltip='Refresh']");
	private static final By save = By.xpath("//*[@ngbtooltip='Save']");
	private static final By developerslink = By.xpath("//*[@ngbtooltip='Developers link']");
	private static final By filterteredRowSummery = By.id("filterteredRowSummery");
	private static final By submitButton = By.id("sendNews");
	private static final By manageQuerytableheader = By.xpath("//table/thead/tr/th");
	private static final By manageQueryToggleButton = By.id("flexSwitchCheckChecked");
	private static final By editIcon = By.xpath("//*[@data-icon=\"pen\"]");
	private static final By deleteIcon = By.xpath("//*[@data-icon=\"trash\"]");
	private static final By manageQuerySearchbar = By.xpath("//input[@placeholder=\" Search for id, name, created by or query text\"]");
	private static final By manageQueryPagination = By.xpath("//li[@class = \"page-item\"]");
	private static final By fromdate = By.xpath("(//*[text()=' 6 '])[1]");
	private static final By toDate = By.xpath("(//*[text()=' 16 '])[1]");
	private static final By scheduleIInterval = By.id("scheduleIIntervalKkey");
	private static final By destinationTableName = By.id("destinationTableName");
	
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

	public void verifyManageQueryToggleButton() {
		
		clickOn(manageQueryToggleButton);
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
		verifyelementDisplayed(my_queries);
		verifyTagname(my_queries);
	}

	public void verify_content_Owner_key() {
		verifyelementDisplayed(content_Owner_key);
		verifyTagname(content_Owner_key);
	}

	public void verify_checkBox1() {
		verifyelementDisplayed(checkBox1);
	}

	public void verify_checkBox2() {
		verifyelementDisplayed(checkBox2);
	}

	public void verify_Query_String() {
		verifyelementDisplayed(Query_String);
	}

	public void verify_Format_SQL() {
		verifyelementDisplayed(Format_SQL);
	}

	public void verify_refresh() {
		verifyelementDisplayed(refresh);
	}

	public void verify_save() {
		verifyelementDisplayed(save);
	}

	public void verify_developerslink() {
		verifyelementDisplayed(developerslink);
	}

	public void verify_filterteredRowSummery() {
		verifyelementDisplayed(filterteredRowSummery);
	}

	public void verify_submitButton() {
		verifyelementDisplayed(submitButton);
		verifyTagname(submitButton);
	}

	public void verify_clickManageQueryTemplates() {
		clickOn(ManageQueryTemplates);
	}

	public void verify_manageQuerytableheader() {
//		getVisibleText(manageQuerytableheader);
		getALLVisibleText(manageQuerytableheader);
	}

	public void verify_editIcon() {

		VerifyIcons(editIcon);

	}

	public void verify_deleteIcon() {
		VerifyIcons(deleteIcon);
	}

	public void verify_manageQuerySearchbar() {
		verifyelementDisplayed(manageQuerySearchbar);
	}

	public void verifyManageQueryPagination() {
		verifyelementDisplayed(manageQueryPagination);
	}

	public void enterValueInQueryTitle() {
		enterTextInto(queryTitle, "test");
	}

	public void pickDate() {
		clickOn(datePicker);
		clickOn(fromdate);
		clickOn(toDate);
		defaultClick();
	}

	public void selectValueIntoMy_queries() {
		selectElementFromDropDown(my_queries, " testtemplate11 - jain004 ");
	}

	public void clickOnSubmit() {
		clickOnSubmitButton(submitButton);
	}

	public void enterQueryString() {
		enterTextInto(Query_String, queryText);
	}

	public void verifyRefreshButton() {
		clickOn(refresh);
	}
	
	public void checkThecheckBox2() {
		clickOn(checkBox2);
	}
	public void verifyScheduleIInterval() {
		
		for (int i = 0; i < 3; i++) {
			clickCreate_Query();
			enterValueInQueryTitle();
			pickDate();
			selectValueIntoMy_queries();
			checkThecheckBox2();
			selectElementFromDropDownByIndex(scheduleIInterval,i);
			enterTextInto(destinationTableName, "test");
			clickOnSubmit();
		}
	
	}

}
