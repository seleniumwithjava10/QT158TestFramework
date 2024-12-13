package com.seleniumdemo.dropdownsession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo1 {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://facebook.com");
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File desti=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumDemo\\Screenshots\\Googlepage.jpg");
		
	     String projectpath=System.getProperty("user.dir"); //C:\\Users\\Admin\\eclipse-workspace\\SeleniumDemo
	     
	     System.out.println(projectpath);
	     
	     File desti1= new File(projectpath+"\\Screenshots\\Facebookpage.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(scr, desti1);
		
		driver.quit();
	}

}
