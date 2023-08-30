package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handles {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.id("newWindowBtn")).click();

		// driver.navigate().back();

	//	String windowhandle = driver.getWindowHandle();

		//System.out.println(windowhandle);

		// driver.switchTo().window(windowhandle);

		Set<String> handles = driver.getWindowHandles();

		for (String han : handles) {

			//System.out.println(han);
			
			driver.switchTo().window(han);
			

			break;

		}
		
		Thread.sleep(3000);
	//	driver.quit();

	}
}
