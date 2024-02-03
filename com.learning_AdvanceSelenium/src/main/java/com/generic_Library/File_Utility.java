package com.generic_Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	
	public static String getPropertyValue(String key) throws Throwable {
	
	//To create java representation object of external file
		FileInputStream fis = new FileInputStream("./src/test/resources/data/commonData.properties");
		
		//This class is used to fetch data from properties file
		Properties prop = new Properties();
		
		//This method is used to load all the keys in properties class object
		prop.load(fis);
		
		return prop.getProperty(key);

}
	public static String fetchSingleDataFromExcel(String sheetName,int rowNum,int cellNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/registerScriptData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		return cell.getStringCellValue();
	}
	
	public static Object[][] fetchMultipleDataFromExcel(String sheetName) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/data/registerScriptData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();//count cell/column of header by taking row index as 0
		
		Object[] [] data = new Object[rowCount-1][cellCount];//as first row is header so creating array with row count -1
		
		for (int i = 1; i < rowCount; i++) {//as the first is header so we start  i=1 instead of 0
			
			for (int j = 0; j < cellCount; j++) {
				
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();//as the excel has haeder also so to form 2d array we decrease i by 1
			}
			
		}
		return data;
		
	}
	
}