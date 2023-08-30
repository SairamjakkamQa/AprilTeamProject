package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idhandle {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String window1 = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,255)");

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {

			System.out.println(handle);

			if (!window1.equals(handle)) {

				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();

				Thread.sleep(3000);
				driver.findElement(By.id("firstName")).sendKeys("LIon");

				Thread.sleep(2000);

			}

		}

		driver.switchTo().window(window1);

		driver.findElement(By.id("name")).sendKeys("Hello everyone");

		Thread.sleep(5000);

		driver.close();

	}

}
