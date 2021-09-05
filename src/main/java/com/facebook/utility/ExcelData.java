package com.facebook.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelData {

	public HSSFWorkbook wb;
	
	public ExcelData() throws EncryptedDocumentException, IOException {
		File f=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xls");
		FileInputStream file=new FileInputStream(f);
		
		 wb=new HSSFWorkbook(file);	
	}
	
	public String getExcelData(String sheetName, int row, int cell) {
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	
}
