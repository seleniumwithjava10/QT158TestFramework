package com.seleniumdemo.encapsulation;

public class TestExpEncap {

	private int a;
	private String da;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	
	public static void main(String[] args) {
		TestExpEncap test= new TestExpEncap();
		
		test.setA(10);
		test.setDa("Ram");
		
		System.out.println(test.getA());
		
		System.out.println(test.getDa());
	}
}
