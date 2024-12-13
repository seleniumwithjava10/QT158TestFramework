package com.seleniumdemo.abstraction;

public class RunAbstract extends TestExp1 {

	@Override
	void m1() {
		System.out.println("This is m1 implemented clases of Test exp1");
		
	}

	@Override
	void m2() {
		System.out.println("This is m2 implemented clases of Test exp1");
		
	}
	
	public static void main(String[] args) {
		RunAbstract run= new RunAbstract();
		
		run.m1();
		run.m2();
	}

}
