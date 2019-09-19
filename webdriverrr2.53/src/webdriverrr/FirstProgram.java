package webdriverrr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.close();
		
	}

}

