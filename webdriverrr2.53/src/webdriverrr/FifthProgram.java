package webdriverrr;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FifthProgram {

			
		public WebDriver driver;
		
		public void launchApp(String url)
		{
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();			
		}
		
		public void closeApp()
		{
			driver.close();
		}}
