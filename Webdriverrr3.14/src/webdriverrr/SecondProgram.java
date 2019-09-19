package webdriverrr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SecondProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Saurabh\\Desktop\\WebDriverr\\jar\\IEDriverServer.exe");	
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		/*driver.close();*/

		}

	}