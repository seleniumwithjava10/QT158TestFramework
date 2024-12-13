package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leetcode.com/accounts/login/");
		
		Thread.sleep(5000); // This will halt the execution 
		
		WebElement usenametextbox=driver.findElement(By.id("id_login"));
		
		usenametextbox.sendKeys("QualtiythoughtAdmin@gmail.com");//enter text in textbox
		
		WebElement passwordtextbox=driver.findElement(By.id("id_password"));
		
		passwordtextbox.sendKeys("qt@123");
		
		Thread.sleep(2000);
		
		usenametextbox.clear();
		
		passwordtextbox.clear();// This method will clear text in textbox
		
		usenametextbox.sendKeys("QT@gmail.com");
		
		Thread.sleep(5000);// THis will halt the execution
		
		driver.quit();//close entire session
	}

}
