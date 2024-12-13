package com.seleniumdemo.framessession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		WebElement drop=driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions action= new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		
		driver.switchTo().defaultContent();	
		
		driver.findElement(By.xpath("//a[text()='Download']")).click();
	}

}
