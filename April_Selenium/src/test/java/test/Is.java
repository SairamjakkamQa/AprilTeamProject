package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Is {

	public static void main(String[] args) {

		
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   driver.get("https://itera-qa.azurewebsites.net/home/automation");
	   
	   
	   driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
	   
	   
	   WebElement element=driver.findElement(By.id("male"));
	     
	   element.click();
	      
	   System.out.println(element.isSelected());
	   
	   
	   WebElement ele=driver.findElement(By.xpath("//button[@name='submit']"));
	   
	  System.out.println(ele.isDisplayed());
      System.out.println(ele.isEnabled());	   
	   
	   driver.quit();
		
	}

}
