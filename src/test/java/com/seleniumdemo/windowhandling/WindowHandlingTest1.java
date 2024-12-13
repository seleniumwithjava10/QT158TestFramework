package com.seleniumdemo.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingTest1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		String parentwindow=driver.getWindowHandle();
		
		String openInNewTab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		WebElement createbtn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		createbtn.sendKeys(openInNewTab);
		
		Set<String> allwidnows=driver.getWindowHandles();
		
		for(String window:allwidnows) {
			driver.switchTo().window(window);
			
			if(driver.getTitle().equals("Sign up for Facebook")) {
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("QTDemo");
			}
			
		}
		
		driver.switchTo().window(parentwindow);
		
		WebElement forgotpassword=driver.findElement(By.linkText("Forgotten password?"));
		
		forgotpassword.sendKeys(openInNewTab);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
