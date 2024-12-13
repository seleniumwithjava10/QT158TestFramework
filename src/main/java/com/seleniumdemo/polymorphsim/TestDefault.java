package com.seleniumdemo.polymorphsim;

 class TestDefault {

	 public void m1() {
		 System.out.println("This is defualt m1 method");
	 }
	 
	 public static void main(String[] args) {
		TestProtectedDemo tp= new TestProtectedDemo();
		tp.m1();
		System.out.println(tp.a);
	}
	  
}
