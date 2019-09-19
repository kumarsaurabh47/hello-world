package webdriverrr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class ThirdProgram {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("saurabh");
		WebDriverBackedSelenium s = new WebDriverBackedSelenium(driver,"http://");
		s.type("id=pass","qshore");
		s.select("id=day", "18");
		/*driver.findElement(By.id("u_0_9")).click();*/

	}

}
