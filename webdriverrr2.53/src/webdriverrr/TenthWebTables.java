package webdriverrr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TenthWebTables {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/auto");
		driver.manage().window().maximize();

		List<WebElement> r = driver.findElements(By.tagName("tr"));
		System.out.println(r.size());
		System.out.println("---------------------------------------------------------------");

		WebElement Table = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody"));
		List<WebElement> rows = Table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		System.out.println("----------------------------------------------------------------------");

		/*String xpath1 = "tr[";
		String xpath2 = "]/td[1]/a";
		int i;
		for (i = 1; i <= rows.size(); i++) {
			System.out.println(Table.findElement(By.xpath("tr[" + i + "]/td[1]/a")).getText());
			
			 * System.out.println(Table.findElement(By.xpath(xpath1+ i +
			 * xpath2)).getText());
			 
		}
		System.out.println("------------------------------------------------------------------");*/

		int j;
		for (j = 1; j <= rows.size(); j++) {
			String Val = Table.findElement(By.xpath("tr[" + j + "]/td[1]/a")).getText();
			/*System.out.println(Val);*/
			if (Val.equals("Tata Motors Ltd.") == true) {
				System.out.println(Table.findElement(By.xpath("tr[" + j + "]/td[6]/font")).getText());
			}
		}
	}
}
