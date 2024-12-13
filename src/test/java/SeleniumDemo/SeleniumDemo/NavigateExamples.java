package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExamples {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		// This syntax will launch an browser
		
		driver.manage().window().maximize();
		
	   driver.get("https://google.com");
		
		driver.navigate().to("https://facebook.com");
		
		driver.navigate().back();
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.quit();
		
	}
	
}
