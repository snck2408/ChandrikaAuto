package ChandrikaTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f1=new FileInputStream("C:\\chandrika\\data1.xlsx")	;
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet shhet=wb.getSheet("Sheet1");
		int rowsCount=shhet.getLastRowNum();
		
		for(int i=0;i<rowsCount;i++)
		{
			
			int cellcount=shhet.getRow(rowsCount).getLastCellNum();
			for(int j=0;j<cellcount;j++)
			{
				System.out.print(shhet.getRow(i).getCell(j)+"\t");
			}
			System.out.println();
			
		}
		wb.close();
		f1.close();

	}

}
