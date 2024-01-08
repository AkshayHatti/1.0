package utility;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelsheet {
		
     XSSFWorkbook wb;
	
	public Excelsheet() throws IOException
		
	{	
	
	String excelpath=System.getProperty("user.dir")+"\\Testdata\\HomeLyf.xlsx";
		
	File src=new File(excelpath);
	
	FileInputStream file=new FileInputStream(src);
	
	wb=new XSSFWorkbook(file);
	
	}
	
	//for string data
	public String getStringData(String sheetname, int row, int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	
	//for numeric data
	public double getNumericData(String sheetname, int row, int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
    }

}