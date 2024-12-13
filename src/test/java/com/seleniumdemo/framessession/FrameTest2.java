package com.seleniumdemo.framessession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr"); 	//parent frame
		
		WebElement lnametextbox=driver.findElement(By.name("lname"));
		lnametextbox.sendKeys("Testing QT");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
	
		driver.switchTo().frame(frame); //child
		
		
		WebElement emailbox=driver.findElement(By.name("email"));
		
		emailbox.sendKeys("QTDemo@gmail.com");
		
		
		
		driver.switchTo().parentFrame(); //parent frame
		
		lnametextbox.clear();
		
		driver.switchTo().defaultContent(); //main web page
		
		driver.findElement(By.xpath("(//a[text()='Log in'])[1]")).click();
	}

}
