package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topgainers {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/");
		
		driver.get("https://www.nseindia.com/market-data/top-gainers-loosers");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help']")).click();
		
		
		WebElement tata=driver.findElement(By.xpath(" //a[normalize-space()=\"TECHM\"]"));
		
		System.out.println(tata.getText());
		
	}

}
