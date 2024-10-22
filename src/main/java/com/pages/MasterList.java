package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Browser;

public class MasterList extends Pages {
	
	
	private static final By ArtistMasterlist = By.xpath("//div[@class = \"card-body\"]");
	public MasterList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public MasterList(Browser browser) {
		super( browser);
		// TODO Auto-generated constructor stub
	}

	
	
	public ArtistMasterList clickOnArtistMasterList() {
		clickOn(ArtistMasterlist);
		return new ArtistMasterList(getDriver());
	}
	
	
}
