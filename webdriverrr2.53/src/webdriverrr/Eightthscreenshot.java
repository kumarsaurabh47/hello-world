package webdriverrr;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Eightthscreenshot {

	public WebDriver driver;

	// To launch the application
	public void launchApplication(String url,String sspath) throws Exception  {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File(sspath));
	}

	
}
	
	
	// to close the application

	/*public void closeApplication() {
		driver.close();
	}

	// creating method to verify whether element is present or not

	public void elementPresent(String loc,boolean exp)
		{
		boolean a = driver.findElement(By.id(loc)).isDisplayed();	
		if
		(a==exp)
		{
			System.out.println("pass");
			}
		else
			System.out.println("fail");
		}*/
	
	




