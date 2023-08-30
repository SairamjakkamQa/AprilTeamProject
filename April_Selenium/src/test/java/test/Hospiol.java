package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hospiol {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://hospiol.com/");
		
driver.findElement(By.xpath("//a[@href='http://admin.hospiol.com/site/login']")).click();
	}

}
