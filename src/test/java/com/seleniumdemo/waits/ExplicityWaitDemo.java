package com.seleniumdemo.waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitDemo {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/waits");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		/*
		 * Alert alert=driver.switchTo().alert();
		 * 
		 * String altmesge=alert.getText();
		 * 
		 * System.out.println(altmesge);
		 * 
		 * alert.accept();
		 */
	}

}
