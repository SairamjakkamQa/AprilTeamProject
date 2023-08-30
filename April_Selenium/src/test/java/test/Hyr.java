package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyr {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		WebElement iframe = driver.findElement(By.id("frm1"));

		driver.switchTo().frame(iframe);

		WebElement drop = driver.findElement(By.id("selectnav1"));

		Select sel = new Select(drop);
		
		sel.selectByValue("https://www.hyrtutorials.com/search/label/Java");
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).sendKeys("jakkam");
		

	}

}
