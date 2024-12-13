package com.seleniumdemo.listners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLabsLoginTestWithData {

	@Test(dataProvider = "excelDataRead")
	public void loginWithData(String username, String password) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.saucedemo.com/v1/index.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);

		driver.findElement(By.cssSelector("#password")).sendKeys(password);

		driver.findElement(By.cssSelector(".btn_action")).click();

		boolean condition; // nothing

		try { // No such element exception
			condition = driver.findElement(By.cssSelector(".app_logo")).isDisplayed();

			Assert.assertTrue(condition); // test pass
		} catch (Exception e) {
			condition = false;
			Assert.assertTrue(condition); // false is udpating test case faile

		}

		finally {
			driver.quit();
		}
	}

	@DataProvider
	public Object[][] excelDataRead() {
		FileInputStream fi;
		Object[][] data = null;

		try {
			fi = new FileInputStream(new File(System.getProperty("user.dir") + "/TestExcelData.xlsx"));
			Workbook wb = WorkbookFactory.create(fi);
			Sheet sh = wb.getSheet("Data1");
			System.out.println(sh.getPhysicalNumberOfRows());
			System.out.println(sh.getRow(0).getLastCellNum());
			data = new Object[sh.getPhysicalNumberOfRows()][sh.getRow(0).getLastCellNum()];

			for (int i = 0; i <sh.getPhysicalNumberOfRows(); i++) {
				for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
					data[i][j] = sh.getRow(i).getCell(j).toString();
					System.out.println(data[i][j]);
				}
				System.out.println();
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		return data;

	}

	
	public Object[][] testData() {
		Object[][] data = new Object[4][2];
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";

		data[1][0] = "locked_out_user";
		data[1][1] = "secret_sauce";

		data[2][0] = "problem_user";
		data[2][1] = "secret_sauce";

		data[3][0] = "performance_glitch_user";
		data[3][1] = "secret_sauce";

		return data;

	}

}
