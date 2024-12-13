package com.seleniumdemo.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingTest {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.id("opentab")).click();
		
		Set<String> allwindows =driver.getWindowHandles();
		
		for(String window:allwindows) {
			
			driver.switchTo().window(window);
			
			String title=driver.getTitle();
			System.out.println(title);
			
			if(title.equals("All Courses")) {
				driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			}
			
			
		}
		
		
		//2 windows set won't allows order of storing elements
		
		
		
		
		
	}

}
