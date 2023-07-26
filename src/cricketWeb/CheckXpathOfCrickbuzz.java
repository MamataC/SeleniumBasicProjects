package cricketWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckXpathOfCrickbuzz {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/72622/gt-vs-csk-final-reserve-day-indian-premier-league-2023");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement text = driver.findElement(By.xpath("//span[text()='Date & Time: ']"));
		String str =text.getAttribute("May 29, 07:30 PM LOCAL");
		System.out.println(str);

	}

}
