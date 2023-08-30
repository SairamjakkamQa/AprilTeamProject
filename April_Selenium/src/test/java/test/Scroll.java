package test;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll {

	
@Test

public void test() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("//div[text()='CheckBox & Radio Button practice Xpath']"));
		
		Point loc=element.getLocation();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy"+loc);

		
		
	}

}
