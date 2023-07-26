package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IjmeetBaseClassMethods {

	WebDriver driver = new ChromeDriver();

	public void login() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://ijmeet.com/home");
		driver.findElement(By.xpath("//a[text()=' Sign In ']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mamatapujari2@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mamata@1995");
	}

}
