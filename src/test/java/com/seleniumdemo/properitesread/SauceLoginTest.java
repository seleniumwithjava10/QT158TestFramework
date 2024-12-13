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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.seleniumdemo.listners.CustomListner.class)
public class SauceLoginTest {
	String projectlocation = System.getProperty("user.dir");
	Properties pr;
	File fi = new File(projectlocation + "\\TestData.properties");
	WebDriver driver = null;

	
	@BeforeTest
	public void loadData() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fi));
			pr = new Properties();
			pr.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeClass
	public void browserSetUp() {
		try {
			System.out.println(pr.getProperty("browser"));
			if (pr.getProperty("browser").equals("chrome")) {
				driver = new ChromeDriver();
			} else if (pr.getProperty("browser").equals("firefox")) {
				driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

			driver.get(pr.getProperty("Appurl"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void loginSauceLabs() {
		try {
			driver.findElement(By.cssSelector("#user-name")).sendKeys(pr.getProperty("username"));

			driver.findElement(By.cssSelector("#password")).sendKeys(pr.getProperty("password"));

			driver.findElement(By.cssSelector("#login-button")).click();
			
			Assert.assertEquals(false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@AfterClass
	public void logOut() {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
