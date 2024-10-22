package com.ui.test;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.BizQuery;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.util.Browser;

public class BizQueryTest {

	 static HomePage homePage;
	 static BizQuery bizQuery;
		
	 @org.testng.annotations.BeforeClass
	 public void setup() {
	  
	 LoginPage loginPage = new LoginPage(Browser.EDGE);	 
	       loginPage.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
	         homePage = loginPage.ClickOnNext();
	         bizQuery = homePage.ClickOnBizQuery();
	       
	 }
	 
	 
	 @Test(priority = 1,description = " Verifying if youTubePage is present or not",groups = "Sanity")
	 public void verifyBizQuery() {
		 
	        String expectedValue = "YouTube Reports\r\n"
		    		+ "With supporting text below as a natural lead-in to additional content.";
	        String actualValue =  bizQuery.verifyforYoutubeButton();
	        Assert.assertEquals(actualValue, expectedValue, "The homepage modules do not match the expected values.");
	 }	 
	
	
	
	
	
	
}
