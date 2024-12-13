package com.seleniumdemo.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginUsingCss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.saucedemo.com/v1/index.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("problem_user");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector(".btn_action")).click();
	}

}
