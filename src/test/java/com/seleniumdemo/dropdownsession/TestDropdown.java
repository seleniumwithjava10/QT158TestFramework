package com.seleniumdemo.dropdownsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruitslist=driver.findElement(By.id("fruits"));
		
		Select fruit= new Select(fruitslist);
		
	    //fruit.selectByIndex(2);
		
		fruit.selectByValue("3");
		
		fruit.selectByIndex(1);
		
		WebElement selectedOption=fruit.getFirstSelectedOption();//this wil return latest selectd option
		
		System.out.println(selectedOption.getText());
	}
	

}
