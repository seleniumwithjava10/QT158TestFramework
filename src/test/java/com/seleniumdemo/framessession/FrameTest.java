package com.seleniumdemo.framessession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.name("fname")).sendKeys("QT Testing");
		
		driver.findElement(By.name("lname")).sendKeys("Guru");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
