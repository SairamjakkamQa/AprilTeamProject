package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		List<WebElement>columns=driver.findElements(By.xpath("//table[contains(@id,'countries')]//h3"));
		
	   System.out.println(columns.size());
		
		
	   for(WebElement cols:columns) {
		   
		   System.out.println(cols.getText());
		   
		   
		   
		   
	   }
	   
	}

}
