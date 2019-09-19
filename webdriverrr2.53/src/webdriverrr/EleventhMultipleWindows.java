package webdriverrr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EleventhMultipleWindows {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("privacy-link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cookie-use-link")).click();
		/*
		 * Set<String> ids = driver.getWindowHandles(); ArrayList a = new
		 * ArrayList(ids);
		 */

		// or we can also write like

		ArrayList a = new ArrayList(driver.getWindowHandles());
		System.out.println(a.size());
		/*
		 * int i; int j; for (i = 0; i < a.size(); i++) {
		 * System.out.println(driver.switchTo().window((String) a.get(i)).getTitle());
		 * List<WebElement> b = driver.switchTo().window((String)
		 * a.get(i)).findElements(By.tagName("a")); System.out.println(b.size());
		 * for(j=0;j<b.size();j++) { System.out.println(b.get(j).getText()); }
		 * System.out.println("----------------------------------------");
		 * driver.switchTo().window((String) a.get(i)).close(); }
		 */

		// inserting values in particular window

		driver.switchTo().window((String) a.get(0)).findElement(By.id("email")).sendKeys("saurabh");
		Thread.sleep(5000);
		driver.switchTo().window((String) a.get(1)).findElement(By.id("pass")).sendKeys("asdf");
		Thread.sleep(5000);
		driver.close();

	}

}
