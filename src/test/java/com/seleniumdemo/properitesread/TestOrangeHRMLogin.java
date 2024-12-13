package com.seleniumdemo.properitesread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestOrangeHRMLogin {
	
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
	public void verifyTitle() {
		String expectedtitle="Google";
		String pagetitle=driver.getTitle();
		Assert.assertEquals(pagetitle, expectedtitle);
	}
	
	
	@Test(priority = 1)
	public void verifyURL() {
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String currentUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrl, expectedUrl);
		
		
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
	


}
