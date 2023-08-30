package test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goolgeauto {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//		driver.findElement(By.id("APjFqb")).sendKeys("Google", Keys.ENTER);
//		driver.findElement(By.tagName("h3")).click();
		
		driver.findElement(By.cssSelector("div[placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("shirts");
		List<WebElement> element = driver
				.findElements(By.xpath("//p[@class='sc-eDvSVe hpsLdS sc-AHaJN puxZX sc-AHaJN puxZX']"));

		// System.out.println(element.size());

		for (WebElement elements : element) {

			System.out.println(elements.getText());

			if (elements.getText().equals("shirts for boys 13 years")) {
				
				elements.click();
			}
		}

	}

}
