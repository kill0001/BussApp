package com.ui.test;

import com.pages.BizQuery;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.Youtube;
import com.qa.util.Browser;

public class BizQueryTestt {
   
	
  static HomePage homePage;
  static BizQuery bizQuery;	
  static Youtube youtube;
  
  
	public static void main(String[] args) throws Throwable {	
     
	   LoginPage loginPage = new  LoginPage(Browser.FF);
	   loginPage.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
	   homePage =    loginPage.ClickOnNext();
	   bizQuery  = homePage.ClickOnBizQuery();
	   youtube =  bizQuery.clickOnYouTubeButton();
	   youtube.getAlltableheaders();
	   youtube.clickOnNext();
	   youtube.checkForSearchbar();
	   youtube.clickCreate_Query();
	   youtube.VerifyqueryTitlefield();
	   youtube.VerifydateRangeField();
	   youtube.datePickerIcon();
	   youtube.Verifymy_queries();
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
	   Thread.sleep(5000);
	   youtube.clickOnManageQueryTemplates();
	   youtube.verify_manageQuerytableheader();
	   youtube.verify_editIcon();
	   youtube.verify_deleteIcon();
	   youtube.verifyManageQueryToggleButton();
	   Thread.sleep(3000);
	   youtube.verifyManageQueryToggleButton();
	   youtube.verify_manageQuerySearchbar();
	   youtube.checkForToggleButton();
//	   youtube.verifyManageQueryPagination();
	   youtube.clickCreate_Query();
	   youtube.enterValueInQueryTitle("test");
	   youtube.pickDate();
	   youtube.selectValueIntoMy_queries("kill001");
//	   youtube.clickOnSubmit();
//	   youtube.clickCreate_Query();
	   youtube.enterQueryString();
	   youtube.verifyRefreshButton();
//	   youtube.verifyScheduleIInterval();
	   youtube.selectEvery_Day_8_00_AM_UTC("Every Day 8:00 AM UTC","kill001");
	   Thread.sleep(3000);
	   youtube.clickCreate_Query();
	   youtube.selectEveryWeekSunday8_00AM_UTC("Every Week - Sunday 8:00 AM UTC","kill001");
	   Thread.sleep(3000);
	   youtube.clickCreate_Query();
	   youtube.selectEvery_Month3rdday8_00AMUTC("Every Month - 3rd day 8:00 AM UTC","kill001");
	   youtube.tearDown();
	}

}
