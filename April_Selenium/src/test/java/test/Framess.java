package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Framess {

	@Test
	
	public void test1() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		WebElement fram = driver.findElement(
				By.xpath("//iframe[@src='https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html']"));

		driver.switchTo().frame(fram);

		Thread.sleep(3000);

		WebElement dropdown = driver.findElement(By.id("selectnav1"));

		Select sel = new Select(dropdown);

		sel.selectByValue("https://www.hyrtutorials.com/search/label/Selenium");

		driver.switchTo().defaultContent();

		driver.findElement(By.id("name")).sendKeys("satish");

		Thread.sleep(5000);

		driver.close();

	}

}
