package test;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.utils.FileUtil;

public class Actionss {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ilovepdf.com/word_to_pdf");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("/April_Selenium/screenshots//pic.png");

		FileUtils.copyFile(source, target);

		List<WebElement> tag = driver.findElements(By.tagName("a"));

		System.out.println(tag.size());

		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();

		Robot rb = new Robot();

		rb.delay(2000);

		StringSelection ss = new StringSelection("D:\\desktops screen\\Desktop stuff\\launch browser.docx");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
