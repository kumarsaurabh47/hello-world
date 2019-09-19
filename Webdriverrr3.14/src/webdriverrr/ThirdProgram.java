package webdriverrr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdProgram {

public static void main(String[] args) {
	System.setProperty("webdriver.firefox.driver","C:\\Users\\Saurabh\\Desktop\\WebDriverr\\jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.close();
		
	}

}

