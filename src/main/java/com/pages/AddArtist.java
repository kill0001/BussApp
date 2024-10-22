package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Browser;

public class AddArtist extends Pages {

	private static final By SearchArtist = By.xpath("//input[@placeholder=\"Search for artist name, participant no, rep owner\"]");
	private static final By clickOnConfirmAddArtist = By.xpath("//*[@class=\"btn btn-success btn-sm h-auto me-3 pe-3 sunmit-button\" ]");
	private static final By clickOnAddArtistfromTable = By.xpath("(//*[@class=\"svg-inline--fa fa-circle-plus\" ])[1]");
	private static final By clickOnBack  = By.xpath("//button[@class = \"btn btn-primary back\"]");
	public AddArtist(Browser browser) {
		super(browser);
		
	}

	public AddArtist(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void searchUsingArtistName(String name) {
		
		enterTextInto(SearchArtist, name);
		clickOn(clickOnAddArtistfromTable);
		clickOn(clickOnConfirmAddArtist);
		
	}
	
	
   public void searchUsingParticipantNo(String ParticipantNo) {
		
		enterTextInto(SearchArtist, ParticipantNo);
		clickOn(clickOnAddArtistfromTable);
		clickOn(clickOnConfirmAddArtist);
		
	}
   
   public void searchUsingRepOwner(String RepOwnerNo) {
		
		enterTextInto(SearchArtist, RepOwnerNo);
		clickOn(clickOnAddArtistfromTable);
		clickOn(clickOnConfirmAddArtist);
		
	}
   
   
   public void clickOnBack() {
	   clickOn(clickOnBack);
   }

}
