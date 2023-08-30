package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1443447988%3A1690532510894222&continue=https%3A%2F%2Fdocs.google.com%2Fforms%2Fd%2Fe%2F1FAIpQLSfugyKsB9bOEN4KkbIrPqNB8id4f1aStHnTXGA_WGiNTbQJ3A%2Fviewform%3Ffbzx%3D118067803381831643&ifkv=AeDOFXghWnqtAoxbU5s-IPb8kn5dvLamFjVh1pF4fjDYjWsGMTF3U_r2A3WHYUM5_o4X14PLbaFCeg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("[id='identifierId']")).sendKeys("Saitish");
	
}
}
