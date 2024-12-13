package com.seleniumdemo.javascriptexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginUsingJS {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("username"));
		
		WebElement password=driver.findElement(By.name("password"));
		
		WebElement loginbtn=driver.findElement(By.tagName("button"));
		
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].value='Admin'", username);
		
		
		js.executeScript("arguments[0].value='admin123'", password);
		
		js.executeScript("arguments[0].click();", loginbtn);
		
		
		
	}

}
