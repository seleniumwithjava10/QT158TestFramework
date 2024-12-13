package com.seleniumdemo.oops.inheritance;

public class Child extends Parent {
	
	public void m2() {
		System.out.println("Child class m2 method");
	}
	
	public static void main(String[] args) {
		Child ref= new Child();
		
		ref.m1(); //parent class m1 method
		
		ref.m2();//child class m2 method
	}
	
	

}
