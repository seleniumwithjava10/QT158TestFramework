package com.seleniumdemo.alertsandpopupsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.letskodeit.com/practice");

		driver.findElement(By.id("alertbtn")).click();

		// To perform any operation on alert first we need to switch our instance to
		// alert

		Alert alert = driver.switchTo().alert();

		String alertmsg = alert.getText();
		
		alert.accept();// This will accept alert and close

		System.out.println(alertmsg);

		driver.quit();
	}

}
