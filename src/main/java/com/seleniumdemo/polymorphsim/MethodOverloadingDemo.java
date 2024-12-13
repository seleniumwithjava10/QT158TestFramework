package com.seleniumdemo.polymorphsim;

public class MethodOverloadingDemo {
	
	public void m1() {
		
		System.out.println("This is m1 method");
		
	}
	
	public void m1(int a) {
		System.out.println("THis is m1 method of value "+a);
	}
	
	public void m1(int a, char c) {
		System.out.println("THis is m1 method of value "+a+"\t This is m1 method char is "+c);
	}
	
	public void m1(char c, int a) {
		System.out.println("THis is m1 method of value "+a+"\t This is m1 method char is "+c);
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo ref= new MethodOverloadingDemo();
		ref.m1(10, 'A');
		ref.m1();
		ref.m1(1200);
	}
	
	//if a class contains more than one method with same method name but dif parameters

}
