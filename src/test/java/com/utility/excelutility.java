package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutility {

	public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\Vivek Sharma\\Downloads\\TestData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		Sheet sheet = book.getSheetAt(0);

	String data =	sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		
		book.close();
		
		return data;

	}

}
