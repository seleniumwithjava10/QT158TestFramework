package com.seleniumdemo.abstraction;

public class TestRun  extends TestDummy{

	@Override
	void m2() {
		System.out.println("This is implemeted child class");
		
	}
	
	public static void main(String[] args) {
		TestRun test= new TestRun();
		test.m1();
		test.m2();
				
	}
	

}
