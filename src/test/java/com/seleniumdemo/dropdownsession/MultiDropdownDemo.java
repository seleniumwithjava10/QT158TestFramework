package com.seleniumdemo.dropdownsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement superheros=driver.findElement(By.id("superheros"));
		
		Select hero= new Select(superheros);
		
		hero.selectByIndex(2);
		
		hero.selectByValue("bw");
		
		hero.selectByVisibleText("Captain America");
		
		Thread.sleep(3000);
		
		hero.deselectByValue("bw");
		
		List<WebElement> selectedoptions=hero.getAllSelectedOptions();
		
		System.out.println(selectedoptions.size());//it will given length of options
		
		for(int i=0;i<selectedoptions.size();i++) {
			System.out.println(selectedoptions.get(i).getText());
			
		}
		
		driver.quit();
		
	}
	
	

}
