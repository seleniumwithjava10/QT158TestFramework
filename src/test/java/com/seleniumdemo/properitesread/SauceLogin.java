package com.seleniumdemo.properitesread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SauceLogin {

	public static void main(String[] args) {
		
		String projectlocation=System.getProperty("user.dir");

		File fi = new File(projectlocation+"\\TestData.properties");
		Properties pr;
		WebDriver driver= null;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fi));
			pr = new Properties();
			pr.load(reader);
			
			if(pr.getProperty("browser").equals("chrome")) {
				 driver= new ChromeDriver();
			}
			else if (pr.getProperty("browser").equals("firefox")) {
			 driver= new FirefoxDriver();
			}
		
			
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
			
			String url=pr.getProperty("Appurl");
			
			driver.get(url);
			
			driver.findElement(By.cssSelector("#user-name")).sendKeys(pr.getProperty("username"));
			
			driver.findElement(By.cssSelector("#password")).sendKeys(pr.getProperty("password"));
			
			
			driver.findElement(By.cssSelector("#login-button")).click();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
