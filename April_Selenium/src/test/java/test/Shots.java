package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shots {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File Source=ts.getScreenshotAs(OutputType.FILE);
		
		File target=new File(".//target//.picss.png");
		
		FileUtils.copyFile(Source, target);
	}

}
