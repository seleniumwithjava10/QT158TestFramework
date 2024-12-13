package com.seleniumdemo.dropdownsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioExample {

	public WebDriver driver; // null //launch url

	public void setUp(String url) {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get(url);
	}
	
	public void selectDropDown(WebElement element, int value, String visibleText) {
		//driver.findElement(By.)
		Select reference= new Select(element);
		
		if(reference.isMultiple()) {
			reference.selectByIndex(value);
			reference.selectByVisibleText(visibleText);
		}
		else {
			reference.selectByIndex(value);
		}
	}

	public void selectRadioOption(List<WebElement> elements, String gender) {
		//List<WebElement> allradioOptions = driver.findElements(By.xpath("//label"));

		for (WebElement radioOption : elements) {
			System.out.println(radioOption.getText()); // Female, Male
			if (radioOption.getText().equals(gender)) {
				radioOption.click();
				break;
			}
		}

	}
	
	public void selectRadioCheckOptionUsingAttribute(List<WebElement> elements, String attributevalue) {
		for (WebElement radioOption : elements) {
			System.out.println(radioOption.getAttribute("value")); // Female, Male
			if (radioOption.getAttribute("value").equals(attributevalue)) {
				radioOption.click();
				break;
			}
		}
	}

	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		RadioExample example = new RadioExample();

		example.setUp("https://www.letskodeit.com/practice");
		
		List<WebElement> checkOptions=example.driver.findElements(By.xpath("//legend[text()='Checkbox Example']/..//input"));
		
		List<WebElement> radioOptions=example.driver.findElements(By.xpath("//input[@type='radio']"));
		
		WebElement fruitsOptions=example.driver.findElement(By.id("carselect"));
		
		example.selectDropDown(fruitsOptions, 1, null);

		example.selectRadioCheckOptionUsingAttribute(radioOptions, "honda");
		
		
		example.selectRadioCheckOptionUsingAttribute(checkOptions, "benz");
		
		example.selectRadioCheckOptionUsingAttribute(checkOptions, "honda");

		example.tearDown();

	}

}
