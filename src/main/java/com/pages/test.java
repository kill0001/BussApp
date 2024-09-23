package com.pages;

import com.qa.util.Browser;

public class test {

	
	 
	public static void main(String[] args) {		
		LoginPage loginPage = new LoginPage(Browser.CHROME);
		loginPage.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
		loginPage.ClickOnNext();
	}

}
