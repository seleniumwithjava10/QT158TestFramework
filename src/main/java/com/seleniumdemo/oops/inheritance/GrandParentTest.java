package com.seleniumdemo.oops.inheritance;

public class GrandParentTest {
	
	public void asset() {
		System.out.println("Land in madhapur");
	}
	

}

class Parent1 extends GrandParentTest{
	
	public void money1() {
		System.out.println("He earned 100 cr");
	}
	
}

class Child1 extends Parent1 {
	
	public static void main(String[] args) {
		Child1 cc= new Child1();
		
		Parent1 p= new Parent1();
		
		cc.asset();
		
		p.asset();
		
		p.money1();
	}
	
	
}
