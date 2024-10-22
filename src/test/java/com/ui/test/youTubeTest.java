package com.ui.test;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.BizQuery;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.Youtube;
import com.qa.util.Browser;

public class youTubeTest {

	 static HomePage homePage;
	 static BizQuery bizQuery;
	 static Youtube youtube;
	 
	 @org.testng.annotations.BeforeClass
	 public void setup() {
	  
	 LoginPage loginPage = new LoginPage(Browser.FF);	 
	       loginPage.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
	         homePage = loginPage.ClickOnNext();
	         bizQuery = homePage.ClickOnBizQuery();
	         youtube =  bizQuery.clickOnYouTubeButton();
	 }
	
	 @Test(description =  "Verifying youtube tab table header",priority = 1)
	 public void VerifyYouTubeTableReports() {
		 
		    List<String> expectedModules = Arrays.asList("Request Id", "Name", "Content Owner", "Scheduler","Start Date","End Date","Request Date","Requested By","Status","  ");
	        List<String> actualModules =  youtube.getAlltableheaders();
	        Assert.assertEquals(actualModules, expectedModules, "Youtube tab table headers are verified");
		 
	 }
	
	 @Test(description =  "Verifying for search icon header",priority = 2)
	 
	 public void verifyIconsOnYoutubePage() {
		 
		    boolean isSearchBarVisible = youtube.checkForSearchbar();
	        Assert.assertTrue(isSearchBarVisible, "The search bar should be displayed on the page.");
		 
	 }
	
	 @Test(priority = 3)
	 public void verifyIconsOnCreateQueryTab() {
		 
		 youtube.clickCreate_Query();
		 
		 boolean isqueryTitlefieldVisible = youtube.VerifyqueryTitlefield();
	     Assert.assertTrue(isqueryTitlefieldVisible, "The queryTitlefield should be displayed on the page."); 
		
	     boolean isdateRangeFieldVisible = youtube.VerifydateRangeField();
	     Assert.assertTrue(isdateRangeFieldVisible, "The queryTitlefield should be displayed on the page."); 
	     
	     boolean isdatePickerIconVisible = youtube.datePickerIcon();
	     Assert.assertTrue(isdatePickerIconVisible, "The queryTitlefield should be displayed on the page."); 
		 
	 }
	
	@Test(priority = 4)
	public void  createScheduleIntervalForDayWeekMonth() throws Throwable {
		   youtube.selectEvery_Day_8_00_AM_UTC("Every Day 8:00 AM UTC","kill001");
		   Thread.sleep(3000);
		   youtube.clickCreate_Query();
		   youtube.selectEveryWeekSunday8_00AM_UTC("Every Week - Sunday 8:00 AM UTC","kill001");
		   Thread.sleep(3000);
		   youtube.clickCreate_Query();
		   youtube.selectEvery_Month3rdday8_00AMUTC("Every Month - 3rd day 8:00 AM UTC","kill001");
		   Thread.sleep(3000);	
		   youtube.clickCreate_Query();
	}
	
	@Test(priority = 5)
	public void createTempTable() throws InterruptedException {
		youtube.creatTempTable("kill001");
	}
	 
	@Test(priority = 6)
	public void VerifyManageQuerytab() {
		youtube.clickOnManageQueryTemplates();
	}
	
	
}
