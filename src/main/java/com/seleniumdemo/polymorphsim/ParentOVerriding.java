package com.seleniumdemo.polymorphsim;

public class ParentOVerriding {
	
	int a=10;
	
	public void car() {
		System.out.println("Shift Dzire");
	}

}

class ChildOverriding extends ParentOVerriding{
	
	int a=20;
	
	public void car() {
		System.out.println("Audi S4");
	}
	
	public static void main(String[] args) {
		
		/*
		 * ChildOverriding ch= new ChildOverriding();
		 * 
		 * ch.car();
		 * 
		 * System.out.println(ch.a);
		 * 
		 * ParentOVerriding pp= new ParentOVerriding();
		 * 
		 * pp.car();
		 */
		
		ParentOVerriding pp1= new ChildOverriding();
		
		System.out.println(pp1.a);
		
		
		
		
		
	}
}
