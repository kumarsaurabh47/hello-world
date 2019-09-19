package webdriverrr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeventhMethod {

	public WebDriver driver;

	// To launch the application
	public void launchApplication(String url) {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	// to close the application

	public void closeApplication() {
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
		}


}
