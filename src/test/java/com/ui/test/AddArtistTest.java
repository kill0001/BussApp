package com.ui.test;

import com.pages.AddArtist;
import com.pages.ArtistMasterList;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MasterList;
import com.qa.util.Browser;

public class AddArtistTest {

	static HomePage homePage;
	 static MasterList masterList ;
	 static ArtistMasterList artistMasterList;
	 static AddArtist addArtist;
	 
	 public static void main(String[] args) {
		   LoginPage loginPage = new  LoginPage(Browser.FF);
		   loginPage.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
		   homePage =    loginPage.ClickOnNext();
		   masterList   = homePage.ClickOnMasterList();
		   artistMasterList =      masterList.clickOnArtistMasterList();
		   addArtist =   artistMasterList.clickOnAddArtist();
		   addArtist.searchUsingArtistName("Vicky Badshah");
		   addArtist.searchUsingParticipantNo("1168657");
		   addArtist.searchUsingRepOwner("SME India Pvt. Ltd. ");
		   addArtist.clickOnBack();
//		   artistMasterList.tearDown();
		   
	}

}
