package datadriven;

import java.io.File;
import java.io.FileInputStream; 

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata
{
XSSFWorkbook wb;
	
	public exceldata(String excelPath)
	{
		
		try
		{
			wb=new XSSFWorkbook(new FileInputStream(new File(excelPath)));
		}
		catch (Exception e) 
		{
			System.out.println("Unable to load Excel file "+e);   
		}
		
	}
	
	
	public int getRows(int sheetIndex)
	{
		
		int rows= wb.getSheetAt(sheetIndex).getLastRowNum();
		 
		return rows+1;
	}
	
	
	public int getRows(String sheetName)
	{
		
		int rows= wb.getSheet(sheetName).getLastRowNum();
		
		return rows+1;
	}
	
	// Method overloading
	public String getStringData(int sheetIndex,int row,int column)
	{
		
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	
	public String getStringData(String sheetName,int row,int column)
	{
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public int getNumericData(String sheetName,int row,int column)
	{
		
 	return (int)wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}


	public int getRowCount(int sheetIndex){
		
		
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		 
		return row;
		
	}
	
	}