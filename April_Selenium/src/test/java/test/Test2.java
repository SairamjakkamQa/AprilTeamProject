package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); //screen size max 

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

        
	WebElement	checkbox=driver.findElement(By.id("male"));
	checkbox.click();
	System.out.println(checkbox.isSelected());
	
	
	WebElement check=driver.findElement(By.id("monday"));
	check.click();
	
	System.out.println(check.isSelected());
	
	
	
	//driver.quit();
		
		

	}

	
}
