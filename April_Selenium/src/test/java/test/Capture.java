package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture {

	public static void main(String[] args) throws Throwable {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mvnrepository.com/");

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver; 
		
		File Src=ts.getScreenshotAs(OutputType.FILE);
		
		File trgt=new File(".//src//maven.png");
		
		FileUtils.copyFile(Src, trgt);
		
		
		

		
		
	}

}
