package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alts {

	

	
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		

		// driver.findElement(By.cssSelector("[onclick='alertbox()']")).click();

		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		driver.navigate().forward();

		driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();

		Alert al = driver.switchTo().alert();

		Thread.sleep(3000);

		// al.accept();

		// al.dismiss();

		al.sendKeys("hello");

	}

}
