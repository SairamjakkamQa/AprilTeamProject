package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mesho {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.meesho.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement search = driver
				.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));

		search.click();

		search.sendKeys("shirts");

//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		  js.executeScript("arguments[0].value='Avinash Mishra';", search);
//		

		List<WebElement> option = driver
				.findElements(By.xpath("//p[@class='sc-eDvSVe hpsLdS sc-AHaJN puxZX sc-AHaJN puxZX']"));

		for (WebElement options : option) {

			System.out.println(options.getText());

			if (options.getText().equalsIgnoreCase("shirts for men")) {

				options.click();
				break;
			}

		}
		
		Thread.sleep(4000);
		driver.close();
	}

}
