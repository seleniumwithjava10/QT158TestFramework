package com.seleniumdemo.oops.inheritance;

public class RunDefault {
	
	public RunDefault() {
		System.out.println("THis is rundefulat");
	}
	
	private int a=10;
	
	private void m1() {
		System.out.println("This is m1 private method");
	}
	
	public static void main(String[] args) {
		
		RunDefault run=new RunDefault();
		run.m1();
		
		System.out.println(run.a);
	}

}
