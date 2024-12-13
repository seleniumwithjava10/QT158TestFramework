package com.seleniumdemo.listners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class OrangeHRMLoginTest extends Base {
	
	@BeforeSuite
	public void dataRead() {
		loadData();
	}
	
	@BeforeClass
	public void InitializationTest() {
		initialize();
	}

	@Test
	public void testLogo() throws InterruptedException {
		Thread.sleep(5000);
		boolean conditon = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();

		Assert.assertTrue(conditon);
	}

	@Test(priority = 1)
	public void testAppUrl() {
		String expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/2467";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedurl);

	}

	
	@Test(priority = 2, dependsOnMethods = {"testAppUrl"})
	public void testHomePageTitle() {

		String expectedtitle = "OrangeHRMTest";
		String actualtitle = driver.getTitle();

		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
