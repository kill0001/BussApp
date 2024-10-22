package com.DataProvider;

import org.testng.annotations.DataProvider;

import com.qa.util.testUtility;

public class BizQueryDataProvider {

	
	@DataProvider(name = "test")
	public String [] [] BizQuerydataprovider(){
		 String data[] [] =  testUtility.readExceldata("bizquery", "Sheet1"); 
		 return data;				 
	}
	
	
	@DataProvider(name = "loginDP")
	public String[][] readLoginDataFromExcel() {
		return testUtility.readExceldata("bizquery", "Sheet1");
	}
	
	@DataProvider(name = "schedule")
	public String[][] readDay() {
		return testUtility.readExceldata("bizquery", "Sheet2");
	}
	
	
}
