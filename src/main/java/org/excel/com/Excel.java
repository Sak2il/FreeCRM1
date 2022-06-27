package org.excel.com;




import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static String readExcel(int row, int column) throws IOException {
		String testData=null;
		try {
            //String path = "D:\\eclipse-workspace\\Selenium\\Mini\\Excel\\TestData.xlsx";
			String filePath = System.getProperty("user.dir")+"//src/main/resources/Excel//Sahil_Ambekar_FreeCRM_Calender_Module.xlsx";
			//System.out.println(filePath);
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(2); //Sheet4
			testData = String.valueOf(ws.getRow(row).getCell(column)); //0   1
			wb.close();
		}catch(Exception e)
		{
			System.out.println("Excel Read");
		}
		return testData;
	}
	
	/*public static void main(String[] args) throws Exception 
	{
		
		System.out.println(Read.readExcel(0, 1));
	}*/
}

