package com.seleniumdemo.oops.inheritance;

public class ParentTest {

	public void asset() {
		System.out.println("2 BHK villa in madhapur");
	}
	
	public void money() {
		System.out.println("100cr of Money");
	}
}


class ChildTest extends ParentTest{
	
	public void land() {
		System.out.println("10 arcs of land");
	}
	
	public void peace() {
		System.out.println("Peace of life");
	}
	
	public static void main(String[] args) {
		ChildTest test= new ChildTest();
		test.asset();
		
		test.money();
		
		test.peace();
	}
}