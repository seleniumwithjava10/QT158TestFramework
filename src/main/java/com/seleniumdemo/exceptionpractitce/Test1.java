package com.seleniumdemo.exceptionpractitce;

public class Test1 {
	
	public static void main(String[] args) {
		
		try {
			int a=10/0;
			
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		System.out.println("Test Execution completed");
	}

}
