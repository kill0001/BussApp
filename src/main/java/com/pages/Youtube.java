package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import com.qa.util.Browser;
import com.qa.util.elementUtil;

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
	private static final By temp_Table_Name = By.id("tempTableName");
	private static final By pageNext = By.xpath("//a[normalize-space()='Next']");
	
  
	Faker faker = new Faker();
 	
	

	public void verifyYouTubeTab() {
		verifyelementDisplayed(YouTubeTab);
	}

	public void verifyCreate_QueryTab() {
		verifyelementDisplayed(Create_Query);
	}

	public void verifyManageQueryTemplatesTab() {
		verifyelementDisplayed(ManageQueryTemplates);
	}

	public List<String> getAlltableheaders() {
		return getALLVisibleText(TableHeaders);
	}

	public void checkForToggleButton() {
		verifyelementDisplayed(ToggleButton);
	}

	public boolean checkForSearchbar() {
		return verifyelementDisplayed(checForSearchbar);
	}

	public void verifyManageQueryToggleButton() {
		
		clickOn(manageQueryToggleButton);
	}

	public void clickCreate_Query() {
		clickOn(Create_Query);
	}

	public boolean VerifyqueryTitlefield() {
		return verifyelementDisplayed(queryTitle);
	}

	public  boolean VerifydateRangeField() {
		return verifyelementDisplayed(dateRange);
	}

	public boolean datePickerIcon() {
		return verifyelementDisplayed(datePicker);
	}

	public boolean Verifymy_queries() {
		return verifyelementDisplayed(my_queries);
//		return verifyTagname(my_queries);
	}

	public boolean verify_content_Owner_key() {
		return verifyelementDisplayed(content_Owner_key);
//		verifyTagname(content_Owner_key);
	}

	public boolean verify_checkBox1() {
		return verifyelementDisplayed(checkBox1);
	}

	public boolean verify_checkBox2() {
		return verifyelementDisplayed(checkBox2);
	}

	public boolean verify_Query_String() {
		return verifyelementDisplayed(Query_String);
	}

	public boolean verify_Format_SQL() {
		return verifyelementDisplayed(Format_SQL);
	}

	public boolean verify_refresh() {
		return verifyelementDisplayed(refresh);
	}

	public boolean verify_save() {
		return verifyelementDisplayed(save);
	}

	public boolean verify_developerslink() {
		return verifyelementDisplayed(developerslink);
	}

	public boolean verify_filterteredRowSummery() {
		return verifyelementDisplayed(filterteredRowSummery);
	}

	public boolean verify_submitButton() {
		return verifyelementDisplayed(submitButton);
//		verifyTagname(submitButton);
	}

	public void clickOnManageQueryTemplates() {
		clickOn(ManageQueryTemplates);
	}

	public List<String> verify_manageQuerytableheader() {
//		getVisibleText(manageQuerytableheader);
		return getALLVisibleText(manageQuerytableheader);
	}

	public boolean verify_editIcon() {

		return verifyelementDisplayed(editIcon);

	}

	public boolean verify_deleteIcon() {
		return verifyelementDisplayed(deleteIcon);
	}

	public boolean verify_manageQuerySearchbar() {
		return verifyelementDisplayed(manageQuerySearchbar);
	}

	public boolean verifyManageQueryPagination() {
		return verifyelementDisplayed(manageQueryPagination);
	}

	public void enterValueInQueryTitle(String reqTitle) {
//		String reqTitle =  faker.name().firstName();
		enterTextInto(queryTitle, reqTitle);
	}

	public void pickDate() {
		clickOn(datePicker);
		clickOn(fromdate);
		clickOn(toDate);
		defaultClick();
	}

	public void selectValueIntoMy_queries(String userid) {
		selectElementFromDropDown(my_queries, userid);
	}

	public void clickOnSubmit() {
		clickOnSubmitButton(submitButton);
	}

	public void enterQueryString() {
		enterTextInto(Query_String, queryText);
	}

	public void verifyRefreshButton() {
		verifyelementDisplayed(refresh);
	}
	
	public void checkThecheckBox2() {
		clickOn(checkBox2);
	}
	  
	 public void clickOnNext() {
		 clickOn(pageNext);
	 }
	  
	public void  selectEvery_Day_8_00_AM_UTC (String dropDownvalue,String userid) throws Throwable {
		String tablename =  faker.name().firstName();
		enterValueInQueryTitle(tablename);
		Thread.sleep(3000);
		pickDate();
		Thread.sleep(3000);
		checkThecheckBox2();
		Thread.sleep(3000);
		selectValueIntoMy_queries(userid);
		selectElementFromDropDown(scheduleIInterval, dropDownvalue);
		enterTextInto(destinationTableName, tablename);
		clickOnSubmit();
		
	}
	public void   selectEveryWeekSunday8_00AM_UTC(String dropDownvalue,String userid) throws Throwable {
		String tablename =  faker.name().firstName();
		enterValueInQueryTitle(tablename);
		Thread.sleep(3000);
		pickDate();
		Thread.sleep(3000);
		checkThecheckBox2();
		Thread.sleep(3000);
		selectValueIntoMy_queries(userid);
		Thread.sleep(3000);
		selectElementFromDropDown(scheduleIInterval, dropDownvalue);
		enterTextInto(destinationTableName, tablename);
		clickOnSubmit();
	}
	public void  selectEvery_Month3rdday8_00AMUTC  (String dropDownvalue,String userid) throws Throwable {
		String tablename =  faker.name().firstName();
		enterValueInQueryTitle(tablename);
		Thread.sleep(3000);
		pickDate();
		Thread.sleep(3000);
		checkThecheckBox2();
		Thread.sleep(3000);
		selectValueIntoMy_queries(userid);
		selectElementFromDropDown(scheduleIInterval, dropDownvalue);
		enterTextInto(destinationTableName, tablename);
		Thread.sleep(3000);
		clickOnSubmitButton(submitButton);
		Thread.sleep(3000);
//	
	}
	
	public void creatTempTable(String userid) throws InterruptedException {
		String tablename =  faker.name().firstName();
		enterValueInQueryTitle(tablename);
		Thread.sleep(3000);
		pickDate();
		Thread.sleep(3000);
		selectValueIntoMy_queries(userid);
		clickOn(checkBox1);
		enterTextInto(temp_Table_Name, "test01");
		clickOnSubmitButton(submitButton);
	}
	
	}


