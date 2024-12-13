package com.seleniumdemo.properitesread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceAddProductTest {

	String projectlocation = System.getProperty("user.dir");
	Properties pr;
	File fi = new File(projectlocation + "\\TestData.properties");
	WebDriver driver = null;

	@BeforeSuite
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

	@BeforeTest
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

	@BeforeClass
	public void loginSauceLabs() {
		try {
			driver.findElement(By.cssSelector("#user-name")).sendKeys(pr.getProperty("username"));

			driver.findElement(By.cssSelector("#password")).sendKeys(pr.getProperty("password"));

			driver.findElement(By.cssSelector("#login-button")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void addProductToCart() {
		WebElement productfilter = driver.findElement(By.cssSelector(".product_sort_container"));
		Select select = new Select(productfilter);

		select.selectByValue("lohi");

		String value = "Sauce Labs Backpack";

		WebElement addtocarkclick = driver.findElement(By.xpath(String.format(
				"(//div[text()='%s']/../../following::div[@class='pricebar']//button[text()='ADD TO CART'])[1]",
				value)));

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", addtocarkclick);
		
		Assert.assertEquals(true, true);

	}
	
	
	@Test(dependsOnMethods = {"addProductToCart"})
	public void validateAddedProduct() {
		driver.findElement(By.cssSelector("div#shopping_cart_container")).click();
		
		String Expected="Sauce Labs Backpack";
		String actual=driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
		
		Assert.assertEquals(actual, Expected);
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
