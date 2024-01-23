package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtil {

	FileInputStream fs;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	int rowCount=0;

	@Test
	public void setup()throws Exception {
		fs = new FileInputStream("data.xlsx");
		workbook = new XSSFWorkbook(fs);
		sheet = workbook.getSheet("java");
		rowCount  = sheet.getPhysicalNumberOfRows();
	}


	//@Test(priority=5)
	public void readExcel() throws Exception{

		boolean b = false;
		//Row row = sheet.getRow(0);
		//	Cell cell = row.getCell(0);
		for ( int i=0;i<rowCount;i++) {
			System.out.println(sheet.getRow(i).getCell(0));
			if(sheet.getRow(i).getCell(0).toString().equalsIgnoreCase("manual")) {
				System.out.println("found");
				b = true;
				break;

			}

		}

		System.out.println("===========>. "+b );


		//		
		//System.out.println(sheet.getRow(i).getCell(1));
		//		
		//		
		//		
		//		Row row1 = sheet.getRow(1);
		//		Cell cell1 = row1.getCell(1);
		//		System.out.println(sheet.getRow(0).getCell(1));
		//		Row row2 = sheet.getRow(1);
		//		Cell cell2 = row2.getCell(1);
		//		System.out.println(sheet.getRow(1).getCell(0));
		//		Row row3 = sheet.getRow(1);
		//		Cell cell3 = row3.getCell(1);
		//		System.out.println(sheet.getRow(1).getCell(1));
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
	}
	//@Test (priority=1)
	 public void firstcellReadExcel(){

		boolean b = false;
		for (int i= 0;i<rowCount;i++) {
			System.out.println(sheet.getRow(i).getCell(2));
			if (sheet.getRow(i).getCell(2).toString().equalsIgnoreCase("Takes ScreenShot")) {
				System.out.println("hi");
				b = true; 
				break;
			}

		}
	}

   // @Test(priority=2)
	public void secondCellreadExcel() {
		for ( int i=0;i<rowCount;i++) {
			System.out.println(sheet.getRow(i).getCell(3));
			if(sheet.getRow(i).getCell(3).toString().equalsIgnoreCase("status")) {
				System.out.println("hello");
				break;
			}
		}	
	}
	//@Test (priority=3)
	public void thirdCellreadExcel() {
		for (int i=0;i<rowCount;i++) {
			System.out.println(sheet.getRow(i).getCell(5));	
			if(sheet.getRow(i).getCell(5).toString().equalsIgnoreCase("push")) {
				System.out.println("found");
			}
		}
	}
	@Test (priority=4)
	public void  fourthCellReadExcel () {
		for( int i =0;i<rowCount;i++) {
		 System.out.println(sheet.getRow(i).getCell(5));
		 if(sheet.getRow(i).getCell(5).toString().equalsIgnoreCase("Acceptance")){
			 System.out.println("found");
		 }
		} 
		
	}
}