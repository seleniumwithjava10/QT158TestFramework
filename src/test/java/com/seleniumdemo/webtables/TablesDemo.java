package com.seleniumdemo.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/table");
		
		System.out.println("Print headers of a table");
		
		
		int rowcount=driver.findElements(By.cssSelector("table#shopping>tbody>tr")).size();
		
		System.out.println(rowcount);

	}

}
