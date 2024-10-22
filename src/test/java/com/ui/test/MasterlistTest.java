package com.ui.test;

import com.pages.ArtistMasterList;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MasterList;
import com.qa.util.Browser;

public class MasterlistTest {

	 static HomePage homePage;
	 static MasterList masterList ;
	 static ArtistMasterList artistMasterList;
	 
	 
	 public static void main(String[] args) {
		   LoginPage loginPage = new  LoginPage(Browser.FF);
		   loginPage.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
		   homePage =    loginPage.ClickOnNext();
		   masterList   = homePage.ClickOnMasterList();
		   artistMasterList =      masterList.clickOnArtistMasterList();
		   artistMasterList.VerifyPeriodView();
		   artistMasterList.VerifyDatesThroughDropDowns("Jan","1","2016","Jan","1","2017");
		   artistMasterList.selectdateByButton("October 2025","November 2025","8");
		   artistMasterList.VerifyWeeksandYearOnPeriodView();
		   artistMasterList.VerifyMasterListTableHeader();
//		   artistMasterList.clickOnAddArtist();
		   artistMasterList.VerifyanddownloadExcelFile();
		  // artistMasterList.tearDown();
		   
	}
	
}
