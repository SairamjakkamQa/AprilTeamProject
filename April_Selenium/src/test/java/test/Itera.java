package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itera {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		List<WebElement> list = driver.findElements(By.xpath("//label[@class='custom-control-label']"));

		System.out.println(list.size());

		Thread.sleep(3000);

		for (WebElement lists : list) {

			if ((lists.getText().equals("Selenium Webdriver") || (lists.getText().equals("Testim")))) {

				lists.click();
			}

		}

	}
}
