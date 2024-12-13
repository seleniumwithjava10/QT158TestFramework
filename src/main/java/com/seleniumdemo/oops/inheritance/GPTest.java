package com.seleniumdemo.oops.inheritance;

public class GPTest {
	public void m1() {
		System.out.println("This is GP Test Method");
	}

	public void m2() {
		System.out.println("This is GP Test Method M2");
	}
}

class PTest extends GPTest {
	public void m1() {
		System.out.println("This is P Test Method");
	}
}

class ChildTest1 extends PTest {
	public void m1() {
		System.out.println("This is Child m1 method");
	}
	
	public void m3() {
		System.out.println("This is child m3 method");
	}

	public static void main(String[] args) {
		ChildTest1 c = new ChildTest1();

		c.m1();
		c.m2();

		GPTest t = new GPTest();
		t.m1();
		//t.m3();
		
		
		

		PTest pp = new PTest();

		pp.m1();
		
		pp.m2();
	}
}
