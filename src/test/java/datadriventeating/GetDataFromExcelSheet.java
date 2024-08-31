package datadriventeating;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetDataFromExcelSheet {

	@Test
	public void getParticularCellValue() throws IOException {

		FileInputStream fs = new FileInputStream("D:\\ExcelsheetTestdatas\\TestData.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fs);
		XSSFSheet sh = wo.getSheet("demodata");
		String data = sh.getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);

	}

	@Test
	public void modifyparticularCell() throws IOException {
		FileInputStream fs = new FileInputStream("D:\\ExcelsheetTestdatas\\TestData.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fs);
		XSSFSheet sh = wo.getSheet("demodata");
		sh.getRow(1).getCell(1).setCellValue("12345@saikumar");
		FileOutputStream fo = new FileOutputStream("D:\\ExcelsheetTestdatas\\TestData.xlsx");
		wo.write(fo);
	}

	@Test
	public void HowtoGetAllrowsandColumnsFromTheSheet() throws IOException {
		FileInputStream fs = new FileInputStream("D:\\ExcelsheetTestdatas\\TestData.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fs);
		XSSFSheet sh = wo.getSheet("demodata");
		int rowcount = sh.getLastRowNum();
		System.out.println("Total No of rows in excel sheet is :" + rowcount);
		System.out.println();
		System.out.println();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow r = sh.getRow(i);
			int cellcount = r.getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				System.out.print(r.getCell(j).getStringCellValue() + "  ");// kumar kumar@12345
			}
			System.out.println();

		}

	}

}
