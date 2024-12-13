package com.seleniumdemo.alertsandpopupsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlerts {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//https://username:password@url.com
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
