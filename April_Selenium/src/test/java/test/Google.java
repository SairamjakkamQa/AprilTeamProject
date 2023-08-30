package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("APjFqb")).sendKeys("ferrari");
		
		
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		
		System.out.println(list.size());
		
		for (int i = 0; i < words.size(); i++) {
			
			if(words.get(i).getText().equals("Exide")){
				
				words.get(i).click();
				break;
		
		
		}
	}


