package com.seleniumdemo.javascriptexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.letskodeit.com/practice");
		
		WebElement ele=driver.findElement(By.id("mousehover"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);
		
		try {
		js.executeScript("window.alert=function{};");
		}
		catch (Exception e) {
			System.out.println("alert already handled");
		}
	}

}
