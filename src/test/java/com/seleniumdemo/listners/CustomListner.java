package com.seleniumdemo.listners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner extends Base implements ITestListener {

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test case is "+result.getName());
		try {
			FailedScreenshot(result.getName());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
	   System.out.println("Skipped test case is "+result.getName());
	  }

}
