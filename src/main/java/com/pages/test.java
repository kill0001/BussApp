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
//	   loginPage.enterPassword("Rammi@100251");
//	   loginPage.ClickOnSignIn();
	   bizQuery  = homePage.ClickOnBizQuery();
	   youtube =  bizQuery.clickOnYouTubeButton();
	   youtube.getAlltableheaders();
	   youtube.checkForSearchbar();
	   youtube.clickCreate_Query();
	   youtube.queryTitlefield();
	   youtube.dateRangeField();
	   youtube.datePickerIcon();
	   youtube.my_queries();
	   youtube.content_Owner_key();
	   youtube.checkBox1();
	   youtube.checkBox2();
	   youtube.Query_String();
	   youtube.Format_SQL();
	   youtube.refresh();
	   youtube.save();
	   youtube.developerslink();
	   youtube.filterteredRowSummery();
	   youtube.submitButton();
	   youtube.clickManageQueryTemplates();
//	   youtube.getAlltableheaders();
	   youtube.manageQuerytableheader();
	   youtube.editIcon();
	   youtube.deleteIcon();
	   youtube.manageQuerySearchbar();
	   youtube.checkForToggleButton();
	   youtube.verifyManageQueryPagination();
	}

}
