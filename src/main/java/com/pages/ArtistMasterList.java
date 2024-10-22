package com.pages;

import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;
import com.qa.util.Browser;

public class ArtistMasterList extends Pages {

	private static final By tableHeader  = By.xpath("");
	private static final By VerifyViewPeriodIcon = By.xpath("//div[@class = \"dt-rd-cntr-dsp-dts\"]");
	private static final By FromMonth = By.xpath("//select[@id = \"frm-inp-mth-left\"]");
	private static final By ClickOnfromMonthDropDown = By.xpath("(//div[@class = \"frm-inp-mth\"])[1]");
	private static final By ClickOnfromDayDropDown = By.xpath("(//div[@class = \"frm-inp-day\"])[1]");
	private static final By ClickOnfromYearDropDown = By.xpath("(//div[@class = \"frm-inp-year\"])[1]");
	private static final By ClickOnToMonthDropDown = By.xpath("(//div[@class = \"frm-inp-mth\"])[2]");
	private static final By ClickOnToDayDropDown = By.xpath("(//div[@class = \"frm-inp-day\"])[2]");
	private static final By ClickOnTOYearDropDown = By.xpath("(//div[@class = \"frm-inp-year\"])[2]");
	private static final By ClickOnCloseDateRange= By.xpath("(//*[@class = \"ng-fa-icon fa-xs icon\"])[2]");
	private static final By FromDateYear = By.xpath("(//*[@class = \"left-mth-name\"])[1]");
	private static final By ToDateYear = By.xpath("(//*[@class = \"right-mth-name\"])[1]");
	private static final By ClickOnCalederForwardButton = By.xpath("//*[@class = \"svg-inline--fa fa-circle-right\"]");
	private static final By ClickOnFromDate = By.xpath("(//*[@class = \"day-text\" and contains(text(),\"19\")])[1]");
	private static final By ClickOnToDate = By.xpath("(//*[@class = \"day-text\" and contains(text(),\"19\")])[2]");
	private static final By weeksandYearPeriodView = By.xpath("//div[@class = \"qk-select-pill\"]"); 
	private static final By MasterlistHeader = By.xpath("(//table/thead/tr)[1]/th");
	private static final By AddArtistButton = By.xpath("(//*[@class = \"ng-fa-icon fontIcons\"])[1]");
	private static final By exportButton = By.xpath("//button[@class = \"btn export\"]");
	
	
	
	
	public ArtistMasterList(Browser browser) {
		super(browser);
		
	}
	
	public ArtistMasterList(WebDriver driver) {
		super(driver);
		
	}

	public void VerifyPeriodView() {	
	  String visibleText =  getVisibleText(VerifyViewPeriodIcon);	  
	}
	
	public void VerifyDatesThroughDropDowns(String FromMonth,String FromDay,String FromYear,String toMonth,String toDay,String toYear) {
		clickOn(VerifyViewPeriodIcon);
		clickOn(ClickOnfromMonthDropDown);
		selectElementFromDropDown(ClickOnfromMonthDropDown, FromMonth);
		clickOn(ClickOnfromDayDropDown);
		selectElementFromDropDown(ClickOnfromDayDropDown, FromDay);
		clickOn(ClickOnfromYearDropDown);
		selectElementFromDropDown(ClickOnfromYearDropDown, FromYear);
		clickOn(ClickOnToMonthDropDown);
		selectElementFromDropDown(ClickOnToMonthDropDown, toMonth);
		clickOn(ClickOnToDayDropDown);
		selectElementFromDropDown(ClickOnToDayDropDown, toDay);
		clickOn(ClickOnTOYearDropDown);
		selectElementFromDropDown(ClickOnTOYearDropDown, toYear);
		clickOn(ClickOnCloseDateRange);		
	}
	
	Faker faker = new Faker();
	

	
	
	public void selectdateByButton(String FromMonthYear,String ToYearDate,String date ) {
		clickOn(VerifyViewPeriodIcon);
    	
        getVisibleText(FromDateYear);
//        getVisibleText(ToDateYear);
 
        while(!getVisibleText(FromDateYear).equals(FromMonthYear) ) {
        	clickOn(ClickOnCalederForwardButton);
        }
        
       
       
        selectDate(date);
        
       while(!getVisibleText(ToDateYear).equals(ToYearDate) ) {
       	clickOn(ClickOnCalederForwardButton);
       }
       
       selectDate(date);
       clickOn(ClickOnCloseDateRange);
	}

	public void VerifyMasterListTableHeader() {
		getALLVisibleText(MasterlistHeader); 
	}
	

	 public void VerifyWeeksandYearOnPeriodView() {
		 clickOn(VerifyViewPeriodIcon);
		 getALLVisibleText(weeksandYearPeriodView);
		 clickOn(ClickOnCloseDateRange);
	 }
	
	 public void VerifyanddownloadExcelFile() {
		 
	  verifyelementDisplayed(exportButton);	 
	  clickOn(exportButton);
		 
	 }
	 
	
	 public void VerifyAddaArtist() {
		 verifyelementDisplayed(AddArtistButton);
	 }
	  
	 public AddArtist clickOnAddArtist() {
		 clickOn(AddArtistButton);
		 return new  AddArtist(getDriver());
	 }
	
}
