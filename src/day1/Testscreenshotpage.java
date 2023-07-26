package day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

import utility.ScreenShott;

public class Testscreenshotpage extends ScreenShott {

	
	public static void main(String[] args) throws IOException, InterruptedException {

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Proceed to Recharge']")).click();
		Testscreenshotpage ob = new Testscreenshotpage();
		ob.screenshot("imagescreenshot1");

	}

}
