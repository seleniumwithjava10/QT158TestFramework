package com.seleniumdemo.oops.inheritance;

import com.seleniumdemo.polymorphsim.TestProtectedDemo;

public class Parent extends TestProtectedDemo{
	
	public void m1() {
		System.out.println("This is parent m1 method");
	}
	
	public static void main(String[] args) {
		Parent tp= new Parent();
		
		tp.m1();
		
		System.out.println(tp.a);
		
		
		
		
		
	}
	
	

}
