package com.seleniumdemo.dropdownsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/dropdowns");

		WebElement fruitslist = driver.findElement(By.id("fruits"));

		Select fruitdata = new Select(fruitslist);

		List<WebElement> allfruits = fruitdata.getOptions();

		for (WebElement fruit : allfruits) {
			System.out.println(fruit.getText());
		}
	}
}


