package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebDriverWait wait = new WebDriverWait(driver, 15);

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.findElement(By.id("display-other-button")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));

		WebElement element = driver.findElement(By.id("hidden"));
		
		System.out.println(element.isDisplayed());

		driver.quit();

	}

}
