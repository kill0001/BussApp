package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.Browser;

public class HomePage extends Pages {

	public HomePage(Browser browser) {
		super(browser);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
//		goToWebSite("https://busapps-dev.scuba.tools");
	}

	private final By ALLmodules = By.xpath("//*[@class = \"btn\"]//h5"); 
	
	private final By BizQuery  = By.xpath("//*[contains(text(),\"BizQuery\")]");
	private final By Master_List  = By.xpath("//*[contains(text(),\"Master List\")]");
	private final By Lookup  = By.xpath("//*[contains(text(),\"Lookup\")]");
	private final By Project_Tracker  = By.xpath("//*[contains(text(),\"Project Tracker\")]");
	
	public List<String> getAllHomePagemodules() {
		
		return getALLVisibleText(ALLmodules);	
	}
	
	public int countHomePageModules() {
		return  Count(ALLmodules);
	}
	
	public String BizQuery() {
		return getVisibleText(BizQuery);
	}
	
	public String Master_List() {
		return getVisibleText(Master_List);
	}
	
	public String Lookup() {
		return getVisibleText(Lookup);
	}
	
	public String Project_Tracker() {
		return getVisibleText(Project_Tracker);
	}
	
    public BizQuery ClickOnBizQuery() {
    	clickOn(BizQuery);
    	return new  BizQuery(getDriver());
    }

    public MasterList ClickOnMasterList() {
    	clickOn(Master_List);
    	return new MasterList(getDriver());
    }
	
}
