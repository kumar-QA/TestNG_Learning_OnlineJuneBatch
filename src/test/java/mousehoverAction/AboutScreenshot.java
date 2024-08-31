package mousehoverAction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AboutScreenshot {

	@Test
	public void verifyLoginFunctionWithValidData() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("submit"));

           username.sendKeys("student");
           password.sendKeys("Password123");
           loginBtn.click();
           
           Thread.sleep(2000);
          File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(src, new File(".\\screenshots\\postiveTesting.png"));
           
	}

}
