package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSatish {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Lenova");
		

		List<WebElement> element = driver.findElements(By.xpath("//div[@class='lnnVSe']//b"));
		
		System.out.println(element.size());

		for (WebElement ele : element) {
			
			System.out.println(ele.getText());
			
			
			if (ele.getText().equals("service center")) {
				ele.click();

			}
		}

	}
}

