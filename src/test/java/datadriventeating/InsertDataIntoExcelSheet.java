package datadriventeating;



import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class InsertDataIntoExcelSheet {
	
	
	@Test
	public void insertdata() throws IOException  {
		XSSFWorkbook wo=new XSSFWorkbook();
		XSSFSheet sh=wo.createSheet("demodata");
		 XSSFRow r=sh.createRow(0);
		 r.createCell(0).setCellValue("kumar");
		 r.createCell(1).setCellValue("kumar@12345");
		 
		XSSFRow r1=sh.createRow(1);
		r1.createCell(0).setCellValue("saikumar");
		r1.createCell(1).setCellValue("saikumar@12345");
	
		XSSFRow r2=sh.createRow(2);
		r2.createCell(0).setCellValue("krishna");
		r2.createCell(1).setCellValue("krishna@12345");
		
		XSSFRow r3=sh.createRow(3);
		r3.createCell(0).setCellValue("kishore");
		r3.createCell(1).setCellValue("kishore@12345");
		
		
		FileOutputStream fo=new FileOutputStream("D:\\ExcelsheetTestdatas\\TestData.xlsx");
		wo.write(fo);
		  
	}

}
