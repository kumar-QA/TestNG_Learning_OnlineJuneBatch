package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFunction {
	WebDriver driver ;
	
	@BeforeTest
	public void greeting() {
		System.out.println("browser is getting launched");
	}
	
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	
	}

	@AfterMethod
	public void close(){
		driver.close();
	
	}
	
	@AfterTest
	public void end() {
		System.out.println("ended all script execution");
	}


	@Test()
	public void A() throws InterruptedException{
		
	 
	}
	
	
	
	@Test(description = "verifying loginfuction with invalid inputs")
	public void B() throws InterruptedException {
			WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("studeseeggent");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Passwosevegvwrd123");
		WebElement login = driver.findElement(By.id("submit"));
		login.click();	
		Thread.sleep(3000);
		
	}
	
	
	
	@Test()
	public void C() throws InterruptedException {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("dfbbeheet");
		WebElement login = driver.findElement(By.id("submit"));
		login.click();
		Thread.sleep(3000);


	}
}
