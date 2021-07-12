package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	//change the method to normal method
	public String[][] ReadExcel() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet ws = wb.getSheet("sheet1");
		
		int rowNum = ws.getLastRowNum();
		System.out.println(rowNum);
		short cellNum = ws.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		
		//create a 2D array
		String data[][] = new String[rowNum][cellNum];
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < cellNum; j++) {
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
				data[i-1][j] = value;
				
			}
			//System.out.println("");
		}
		wb.close();
		return data;

	}

}
