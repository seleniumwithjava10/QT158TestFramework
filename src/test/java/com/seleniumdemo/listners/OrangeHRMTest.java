package com.seleniumdemo.listners;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRMTest extends Base {

	
	@BeforeSuite
	public void dataRead() {
		loadData();
	}
	
	@BeforeClass
	public void InitializationTest() {
		initialize();
	}
	
	@Test
	public void login() {
		driver.findElement(By.name("username")).sendKeys(pr.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(pr.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
