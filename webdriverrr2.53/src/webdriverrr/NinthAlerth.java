package webdriverrr;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NinthAlerth {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input"))
				.click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.dismiss();
		System.out.println(a.getText());
		

	}

}
