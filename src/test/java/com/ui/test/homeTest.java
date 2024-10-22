package com.ui.test;


import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.util.Browser;

public class homeTest {

	 static HomePage homePage;
	
	 @org.testng.annotations.BeforeClass
	 public void setup() {
	  
	 LoginPage loginPage = new LoginPage(Browser.EDGE);	 
	       loginPage.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
	       homePage = loginPage.ClickOnNext();
	 }
	 
	 @Test(priority = 1,description = " Verifying if all five modules are present on the home page",groups = "Sanity")
	 public void verifyBizQuery() {
		 
		    List<String> expectedModules = Arrays.asList("BizQuery", "Master List", "Lookup", "Project Tracker");
	        List<String> actualModules = homePage.getAllHomePagemodules();
	        Assert.assertEquals(actualModules, expectedModules, "The homepage modules do not match the expected values.");
	 }	 
	
}
