package mousehoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CompleteMouserHoveraction {
	@Test(description = "testing rigth click operation")
	public void A() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act = new Actions(driver);
		act.contextClick(btn).build().perform();
	}
	@Test(priority = 3)
	public void verifyDoubleclick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubelclickBtn = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubelclickBtn).build().perform();
	}
	@Test(priority = 2)
	public void verifyDragandDrop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement ddframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ddframe);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, des).build().perform();
	}

	@Test(priority = 0)
	public void verifyMousemovement() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogs = driver.findElement(By.id("blogsmenu"));
		WebElement thirdlink = driver.findElement(By.xpath("//span[contains(text(),'SeleniumOneByArun')]"));
		Actions act = new Actions(driver);
		act.moveToElement(blogs).moveToElement(thirdlink).click().build().perform();

	}

}
