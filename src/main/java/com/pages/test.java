package com.pages;

import com.qa.util.Browser;

public class test {
   
	
  static HomePage homePage;
  static BizQuery bizQuery;	
  static Youtube youtube;
  
  
	public static void main(String[] args) {	
     
	LoginPage loginPage = new  LoginPage(Browser.CHROME);
	   loginPage.EnterEmailAddress("ramya.shettys.ext@sonymusic.com");
	   homePage =    loginPage.ClickOnNext();
	   loginPage.enterPassword("Rammi@100251");
	   loginPage.ClickOnSignIn();
	   bizQuery  = homePage.ClickOnBizQuery();
	   youtube =  bizQuery.clickOnYouTubeButton();
	   youtube.getAlltableheaders();
	   youtube.checkForSearchbar();
	}

}
