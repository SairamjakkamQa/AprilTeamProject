package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		//System.out.println(driver.getWindowHandle());

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)");

		driver.findElement(By.id("newWindowBtn")).click();

		String two = driver.getWindowHandle();
		
		
		String title=driver.getTitle();

		Set<String> id = driver.getWindowHandles();

		for (String ids : id) {

			if (driver.getTitle().contains("Basic Controls - \r\n"
					+ "                H Y R Tutorials")) {

				driver.manage().window().maximize();
				
				driver.switchTo().window(ids);
			}
		}

	}

}
