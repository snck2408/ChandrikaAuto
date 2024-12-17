package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {
	String path;
	FileInputStream f1;
	XSSFSheet sh1;
	XSSFWorkbook WB;
	XSSFRow r1;
	
	public excelUtility(String path)
	{
	this.path=path;	
	}
	public int getRowCount(String sheetName) throws IOException
	{
		 f1=new FileInputStream(path);
		 WB=new XSSFWorkbook(f1); 
		sh1=WB.getSheet(sheetName);
		int rowCount=sh1.getLastRowNum();
		WB.close();
		f1.close();
		return rowCount;
	}
	
	public int getColumnCount(String sheetName,int rowNumber) throws IOException
	{
		f1=new FileInputStream(path);
		 WB=new XSSFWorkbook(f1); 
		sh1=WB.getSheet(sheetName);
		r1=sh1.getRow(rowNumber);
		int cellCount=r1.getLastCellNum();
		WB.close();
		f1.close();
		return cellCount; 
		
		
		
	}
	
	public String getData(String sheetName,int rowNumber,int cellNumber) throws IOException
	{
		f1=new FileInputStream(path);
		WB=new XSSFWorkbook(f1);
		sh1=WB.getSheet(sheetName);
		r1=sh1.getRow(rowNumber);
		XSSFCell cellData=r1.getCell(cellNumber);
		DataFormatter formatter = new DataFormatter();
		String data;
		try{
		data = formatter.formatCellValue(cellData); //Returns the formatted value of a cell as a String regardless of the cell type.
		}
		catch(Exception e)
		{
			data="";
		}
		WB.close();
		f1.close();
		return data;
		
	}

	

}
