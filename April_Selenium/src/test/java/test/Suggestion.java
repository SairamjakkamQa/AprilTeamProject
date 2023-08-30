package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement goog = driver.findElement(By.name("q"));
		goog.sendKeys("ferrari");

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));
		
		System.out.println("size is" + list.size());

		for (WebElement options : list) {
			
		System.out.println(	options.getText());
			
			if (options.getText().equals("price in india")) {
				
				options.click();
				
				break;

			}
		}
	}
}
