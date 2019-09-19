package webdriverrr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FourthProgram {

public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//print all link name
		
		List<WebElement> Link_name = driver.findElements(By.tagName("a"));
		for(int i=0;i<Link_name.size();i++ )
		{
			System.out.println(Link_name.get(i).getText()+" _ "+Link_name.get(i).getAttribute("href"));
		}
		
}
}
