package MainRepositery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getdatafromExcel(String sheet, int cell, int row) throws Throwable, IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/testScriptdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return data;	
	}
	
	public int getrowcount(String sheet) throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/testScriptdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int data=wb.getSheet(sheet).getLastRowNum();
		wb.close();
		return data;
	}
	
	public String setdatafromexcel(String sheet, int cell, int row, String data) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("./TestData/testScriptdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).createRow(row).createCell(row).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream("./TestData/testScriptdata.xlsx");
		wb.write(fos);
		wb.close();
		return data;
	
	}

}
