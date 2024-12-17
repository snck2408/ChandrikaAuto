package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataprovider {

	@DataProvider(name="Login")
	public String[][] getData() throws IOException
	{
		String path=".\\TestData\\Opencart_LoginData.xlsx";
		excelUtility exc1=new excelUtility(path);
		int rowCount=exc1.getRowCount("Sheet1");
		int colCount=exc1.getColumnCount("Sheet1", 1);
		String data[][]=new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
			data[i-1][j]=exc1.getData("Sheet1", i, j)	;
			}
			
		}
		return data;
		
	}

}
