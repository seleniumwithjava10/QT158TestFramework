package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// this syntax will launch the browser

		// WebDriver driver= new FirefoxDriver();

		driver.manage().window().maximize();
		// this syntax will maximize the browser

		driver.get("https://google.com/");

		// to title of opened application

		String title = driver.getTitle();

		System.out.println(title); // this wil print title of current opened browser

		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().refresh();

		driver.quit(); // this syntax will close opened browser

	}

}
