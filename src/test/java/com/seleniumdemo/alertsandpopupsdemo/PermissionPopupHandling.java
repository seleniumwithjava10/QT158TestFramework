package com.seleniumdemo.alertsandpopupsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopupHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://webcammictest.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Start test']")).click();
	}

}
