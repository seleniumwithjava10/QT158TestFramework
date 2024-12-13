package com.seleniumdemo.listners;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {

	public static WebDriver driver;

	public static Properties pr;

	String projectlocation = System.getProperty("user.dir");

	File fi = new File(projectlocation + "\\TestData.properties");

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

	public static void initialize() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));

		String url = pr.getProperty("Appurl");

		driver.get(url);
	}

	public void FailedScreenshot(String testMethodName) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();

		String timestamp = d.toString().replaceAll(":", "_").replaceAll(" ", "_");

		FileHandler.copy(src, new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumDemo\\Screenshots/"
				+ (String) testMethodName + " " + timestamp + ".jpg"));
	}

}
