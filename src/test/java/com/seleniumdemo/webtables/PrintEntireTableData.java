package com.seleniumdemo.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintEntireTableData {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/table");
		
		
		WebElement table=driver.findElement(By.id("simpletable"));
		
		List<WebElement> tablerows=table.findElements(By.tagName("tr"));
		
		
		for(int i=0;i<tablerows.size();i++) {
			 List<WebElement> tablecolumns=tablerows.get(i).findElements(By.tagName("td"));
			 
			 for(int j=0;j<tablecolumns.size();j++) {
				 String tabledata=tablecolumns.get(j).getText();
				 System.out.println(tabledata);
				 
			 }
			 System.out.println();
		}
		
	
	}

}
