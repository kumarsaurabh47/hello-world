package webdriverrr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurabh\\Desktop\\WebDriverr\\jar\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	/*driver.close();*/

	}

}
