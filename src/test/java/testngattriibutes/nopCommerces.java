package testngattriibutes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class nopCommerces {
	
	@DataProvider   //------------these method acting as dataprovider
	public String[][] TestData() {
		String data[][]= {{"abc","abc123"},{"def","def123"},{"ghi","ghi123"},{"student","Password123"}};
		return data;
	}
	
	
	@Test(dataProvider = "TestData")
	public void Vierfylogin(String uname,String pwd) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement username = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("submit"));
		login.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
