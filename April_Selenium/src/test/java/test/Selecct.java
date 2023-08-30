package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecct {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		
		List<WebElement> elements = driver
				.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));

		
		System.out.println(elements.size());
		
		
		for(WebElement ele:elements) {
					
			 
			if(ele.getText().equals("apple watch ultra")) {
				
					
				ele.click();
				
				
			}
			
		}
		
		
	}

}
