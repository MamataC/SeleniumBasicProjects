package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShott {

	public static WebDriver driver;

	public void screenshot(String Filename) throws IOException {

		TakesScreenshot scrshot = (TakesScreenshot) driver;// typecast driver method which
		                                                  // coming from selenium
		File source = scrshot.getScreenshotAs(OutputType.FILE);//Method from TakesScreenShot class
		File destination = new File("C:\\Mamata Workspace\\ScrrenShotFile\\"+Filename+".png");//pass path
        FileHandler.copy(source, destination);
	}

}
