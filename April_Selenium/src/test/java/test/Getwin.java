package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwin {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.switchTo().newWindow(WindowType.TAB);
//
//		// Opens a new window and switches to new window
//		driver.switchTo().newWindow(WindowType.WINDOW);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.id("newWindowBtn")).click();

		driver.manage().window().maximize();

		String wins = driver.getWindowHandle();

		System.out.println("window to know " + driver.getWindowHandle());

		// String second=driver.getWindowHandle();

		// driver.findElement(By.linkText("new window")).click();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {

			System.out.println(handle);

			if (!handle.equals(wins)) {

				driver.switchTo().window(handle);
				driver.manage().window().maximize();

				Thread.sleep(3000);

				driver.findElement(By.id("firstName")).sendKeys("sairam");

				Thread.sleep(2000);
			}

		}

		driver.switchTo().window(wins);
		
		
	}

}
