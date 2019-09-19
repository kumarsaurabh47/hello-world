package webdriverrr;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class SixthAction {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		//creating webelement for job menu
		Thread.sleep(3000);
		WebElement job = driver.findElement(By.xpath("html/body/div[2]/div/ul/li[1]/a/div"));
		//moving cursor to job menu
		Thread.sleep(5000);
		a.moveToElement(job).build().perform();
		Thread.sleep(5000);
		//clicking on register now link
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[1]/div/ul[1]/li[4]/a")).click();
		

		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement email = driver.findElement(By.id("email"));*/
		
     // for java function robot select (java.awt.robot)
		
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F5);*/
		/*
		 * a.contextClick(email).build().perform();
		 * a.sendKeys(Keys.DOWN).build().perform(); Thread.sleep(3000);
		 * a.sendKeys(Keys.DOWN).build().perform(); Thread.sleep(3000);
		 * a.sendKeys(Keys.DOWN).build().perform(); Thread.sleep(3000);
		 * a.sendKeys(Keys.DOWN).build().perform(); Thread.sleep(3000);
		 * a.sendKeys(Keys.ENTER).build().perform();
		 */
		a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();
		a.sendKeys(Keys.CONTROL+"n").build().perform();

	}

}
