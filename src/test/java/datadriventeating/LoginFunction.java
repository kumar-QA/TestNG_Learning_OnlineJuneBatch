package datadriventeating;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream fs = new FileInputStream("D:\\ExcelsheetTestdatas\\TestData.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fs);
		XSSFSheet sh = wo.getSheet("demodata");
		int rowcount = sh.getLastRowNum();
		
		for (int i = 0; i <=rowcount; i++) {
			  XSSFRow  r= sh.getRow(i);
			WebDriver	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(r.getCell(0).getStringCellValue());
			Thread.sleep(3000);
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(r.getCell(1).getStringCellValue());
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.id("submit"));
			login.click();	
			Thread.sleep(3000);
			
		}
		
		
		
	

	}
}
