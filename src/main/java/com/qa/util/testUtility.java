package com.qa.util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testUtility {

	public static String [] [] readExceldata(String fileName ,String sheetName)  {
		XSSFWorkbook myWorkBook = null;
		try {
			myWorkBook = new XSSFWorkbook(System.getProperty("user.dir") + "\\testData\\" + fileName + ".xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet mySheet = myWorkBook.getSheet(sheetName);
		int lastRowIndex = mySheet.getLastRowNum();
		XSSFRow rowHeader = mySheet.getRow(0);
		int lastCellIndex = rowHeader.getLastCellNum() - 1;

		XSSFRow rowData;
		XSSFCell cellData;
		String data[][] = new String[lastRowIndex][lastCellIndex + 1];

		for (int rowIndex = 1; rowIndex <= lastRowIndex; rowIndex++) {
			for (int cellIndex = 0; cellIndex <= lastCellIndex; cellIndex++) {
				rowData = mySheet.getRow(rowIndex);
				cellData = rowData.getCell(cellIndex);
				data[rowIndex - 1][cellIndex] = cellData.toString();
			}
		}

		return data;
	}
	
	
	
	
}
