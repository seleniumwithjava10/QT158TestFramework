package com.seleniumdemo.abstraction;

public class TestInteraface implements TestInterfaceExp1, TestInterfaceExp2 {

	@Override
	public void m3() {
		System.out.println("This is m3 of testinteface 2");
		
	}

	@Override
	public void m1() {
		System.out.println("This is m2 of testinteface 1");
		
	}

	@Override
	public void m2() {
		System.out.println("This is m2 of testinteface 1");
		
	}
	
	public static void main(String[] args) {
		TestInteraface test= new TestInteraface();
		test.m1();
		test.m2();
		test.m3();
	}

}
