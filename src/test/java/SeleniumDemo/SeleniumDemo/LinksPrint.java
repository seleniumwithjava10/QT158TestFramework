package SeleniumDemo.SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPrint {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://github.com/login");

		//driver.findElement(By.id("guru")).click();

		int[] ref = new int[0];

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		int linkscount = alllinks.size();

		System.out.println(linkscount);

		for (WebElement link : alllinks) {
			System.out.println(link.getText());
		}

		for (WebElement link : alllinks) {
			System.out.println(link.getAttribute("href"));
		}

		driver.quit();
	}

}
