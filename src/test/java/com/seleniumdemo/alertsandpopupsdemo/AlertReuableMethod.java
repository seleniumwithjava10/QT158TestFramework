package com.seleniumdemo.alertsandpopupsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertReuableMethod {

	WebDriver driver; // to call instance variable use object reference

	public void setUp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

	public void alertControl(WebElement alertbutton, String alerttype) {
		alertbutton.click();

		Alert alert = driver.switchTo().alert();
		String alertmessage=alert.getText();
		System.out.println(alertmessage);

		if (alerttype.equals("accept")) {
			alert.accept();
		} else if (alerttype.equals("dismiss")) {
			alert.dismiss();
		}
		
	}
	
	public void alertEnterText(WebElement alertbutton, String message) {
		alertbutton.click();

		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys(message);
		
		alert.accept();
	}
	


	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		AlertReuableMethod ref = new AlertReuableMethod();

		ref.setUp("https://the-internet.herokuapp.com/javascript_alerts");

		//WebElement alertbutton = ref.driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

		//ref.alertControl(alertbutton, "accept");
		
		WebElement alertbutton=ref.driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
		
		ref.alertEnterText(alertbutton, "Hi Hello team");
		
		ref.tearDown();

	}

}
