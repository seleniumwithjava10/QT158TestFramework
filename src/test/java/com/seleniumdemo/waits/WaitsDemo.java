package com.seleniumdemo.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		
		
		
		driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/following-sibling::h3//input[1]")).sendKeys("textbox1 data");
	
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		
		
		
		driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/following-sibling::h3//input[2]")).sendKeys("textbox1 data");

		
		
	
	}
}
