package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

class Data1{
	
	@DataProvider
	public String[][] getDataTest() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\testdata.xlsx");
		
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
	public void getData1() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\testdata.xlsx");

		// "C:\Users\Admin\OneDrive\Desktop\testdata.xlsx" -> Desktop file path
		// ./TestData/testdata.xlsx -> Eclipse file path

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.getRow(0);

		Cell cell = row.getCell(0);

		String value = cell.toString();

		Row row1 = sheet.getRow(1);

		Cell cell1 = row.getCell(1);
		String value1 = cell1.toString();
		System.out.println(value1);

	}
}

public class GetData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		Data1 d1 = new Data1();
		//d1.getData1();
		d1.getDataTest();
	}
}