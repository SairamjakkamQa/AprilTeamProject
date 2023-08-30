package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cal {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String date = "12";

		String month = "March";

		String Year = "2015";

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)");

	WebElement	click=driver.findElement(By.id("first_date_picker"));
	click.click();

		while (true) {

			String MONTHandYEAR = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			String[] Month_year = MONTHandYEAR.split(" ");

			String Mon = Month_year[0];

			String yr = Month_year[1];

			if (Mon.equals(month) && (yr.equals(Year)))

				break;

			else {

				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();

			}

		}

		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

		for (WebElement datess : dates) {

			if (datess.getText().equals(date)) {
				
				datess.click();

				break;
			}

		}

		
	}

}
