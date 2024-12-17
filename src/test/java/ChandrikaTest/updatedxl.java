package ChandrikaTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class updatedxl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("C:\\chandrika\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet sh1=wb.getSheet("Sheet1");
		int rowCount=sh1.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			XSSFRow r1=sh1.getRow(i);
			int  c1=sh1.getRow(i).getLastCellNum();
			r1.createCell(c1+i).setCellValue("Pass");
		}
		FileOutputStream f2=new FileOutputStream("C:\\chandrika\\data.xlsx");
		
		wb.write(f2);
		
wb.close();
f1.close();

	}

}
