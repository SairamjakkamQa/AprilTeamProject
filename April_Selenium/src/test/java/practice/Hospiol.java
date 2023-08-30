package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listsenrs.class)
public class Hospiol {

	
	
	
	@Test
	
	public void test1() {
		
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://admin.hospiol.com/site/login");

		WebElement user = driver.findElement(By.name("username"));

		WebElement pass = driver.findElement(By.name("password"));

		Assert.assertTrue(user.isDisplayed());

		user.sendKeys("abhishek@marolix.com");

		pass.sendKeys("Reset@123");

		driver.findElement(By.xpath("//button[@class='btn']")).click();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);
		
	}
	
}
