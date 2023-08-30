package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nav {

	public static void main(String[] args) throws Throwable {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.ilovepdf.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title='Compress PDF']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
	}

}
