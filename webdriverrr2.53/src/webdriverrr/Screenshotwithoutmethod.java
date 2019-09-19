package webdriverrr;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshotwithoutmethod {

	public static void main(String[] args) throws Exception{
		
	   WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();		
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File("C:\\Users\\Saurabh\\Desktop\\WebDriverr\\screenshot.png"));

	}

}
