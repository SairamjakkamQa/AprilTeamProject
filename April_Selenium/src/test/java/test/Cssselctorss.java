package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselctorss {

	public static void main(String[] args) {

		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[placeholder*='Enter your name']")).sendKeys("Selenium");
		
		
	}

}
