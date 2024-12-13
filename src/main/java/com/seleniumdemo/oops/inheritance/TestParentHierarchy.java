package com.seleniumdemo.oops.inheritance;

public class TestParentHierarchy {
	
	public void m1() {
		System.out.println("This is m1 mhod");
	}

	
}

class ChildJ extends TestParentHierarchy{
	
	public static void main(String[] args) {
		ChildJ tt= new ChildJ();
		tt.m1();
	}
	
	
}

class Child2 extends TestParentHierarchy{
	public static void main(String[] args) {
		Child2 tc2= new Child2();
		tc2.m1();
	}
}
