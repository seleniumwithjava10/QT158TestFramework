package com.seleniumdemo.dropdownsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectConcepts {
	
	WebDriver driver; // instance variable
	
	public void setUp(String url) {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
	}
	
	
	
	public void selectDropDown(WebElement element, int value, String visibleText) {
		//driver.findElement(By.)
		Select reference= new Select(element);
		
		if(reference.isMultiple()) {
			reference.selectByIndex(value);
			reference.selectByVisibleText(visibleText);
		}
		else {
			reference.selectByIndex(value);
		}
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public static void main(String[] args) {
		SelectConcepts execute= new SelectConcepts();
		
		execute.setUp("https://www.letskodeit.com/practice");
		
		WebElement drodpown=execute.driver.findElement(By.id("multiple-select-example"));
		
		execute.selectDropDown(drodpown, 1, "Peach");
		
		execute.closeBrowser();
	}
	
	
	

}
