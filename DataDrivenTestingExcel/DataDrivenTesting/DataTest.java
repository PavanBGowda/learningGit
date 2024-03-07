package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import Utlities.DataFiles;

public class DataTest {
		
		@DataProvider
		public String[][] getDataTest() throws IOException {
			
			
			FileInputStream fis = new FileInputStream(DataFiles.files());
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet("Sheet1"); 
			
			int noofRows = sheet.getPhysicalNumberOfRows();
			int noofColumn = sheet.getRow(0).getLastCellNum();
			
			String[][] data = new String[noofRows-1][noofColumn];
			
			for(int i=0; i<noofRows-1; i++) {
			
				for(int j=0 ; j<noofColumn; j++) {
					
					DataFormatter df = new DataFormatter();
					data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				}
			//System.out.println(); 
		}
		workbook.close();
		fis.close();
		return data;
	/**	for(String[] dataArr : data) {
			System.out.println(Arrays.toString(dataArr));
			
		}*/
	}

}
