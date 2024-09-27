package com.pages;

import com.qa.util.Browser;

public class test {
   
	
  static HomePage homePage;
  static BizQuery bizQuery;	
  static Youtube youtube;
  
  
	public static void main(String[] args) throws Throwable {	
     
	LoginPage loginPage = new  LoginPage(Browser.CHROME);
	   loginPage.EnterEmailAddress("ramya.shettys.ext@sonymusic.com");
	   homePage =    loginPage.ClickOnNext();
	   loginPage.enterPassword("Rammi@100251");
      loginPage.ClickOnSignIn();
	   bizQuery  = homePage.ClickOnBizQuery();
	   youtube =  bizQuery.clickOnYouTubeButton();
	   youtube.getAlltableheaders();
	   youtube.checkForSearchbar();
	   youtube.clickCreate_Query();
	   youtube.queryTitlefield();
	   youtube.dateRangeField();
	   youtube.datePickerIcon();
	   youtube.my_queries();
	   youtube.verify_content_Owner_key();
	   youtube.verify_checkBox1();
	   youtube.verify_checkBox2();
	   youtube.verify_Query_String();
	   youtube.verify_Format_SQL();
	   youtube.verify_refresh();
	   youtube.verify_save();
	   youtube.verify_developerslink();
	   youtube.verify_filterteredRowSummery();
	   youtube.verify_submitButton();
	   youtube.verify_clickManageQueryTemplates();
	   youtube.verify_manageQuerytableheader();
	   youtube.verify_editIcon();
	   youtube.verify_deleteIcon();
	   youtube.verifyManageQueryToggleButton();
	   Thread.sleep(3000);
	   youtube.verifyManageQueryToggleButton();
	   youtube.verify_manageQuerySearchbar();
	   youtube.checkForToggleButton();
	   youtube.verifyManageQueryPagination();
	   youtube.clickCreate_Query();
	   youtube.enterValueInQueryTitle();
	   youtube.pickDate();
	   youtube.selectValueIntoMy_queries();
//	   youtube.clickOnSubmit();
//	   youtube.clickCreate_Query();
	   youtube.enterQueryString();
	   youtube.verifyRefreshButton();
	   youtube.verifyScheduleIInterval();
	   
	}

}
