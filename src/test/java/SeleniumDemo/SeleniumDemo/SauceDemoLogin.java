package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sa123");
		
		driver.findElement(By.id("login-button")).click();
		
		String expurl="https://www.saucedemo.com/v1/inventory.html";
		
		String actualUrl=driver.getCurrentUrl();
		
		if(expurl.equals(actualUrl)) {
			System.out.println("Login successfully");
		}
		else {
			System.out.println("Login failed");
		}
		
		Thread.sleep(4000);
		driver.quit();
		
	}
}
