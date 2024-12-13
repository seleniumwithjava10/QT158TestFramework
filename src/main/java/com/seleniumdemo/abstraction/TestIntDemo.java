package com.seleniumdemo.abstraction;

public interface TestIntDemo {
	
	abstract void m1();
	
	abstract void  m2();
	
	public void m3(); // Note abstract class contains only declaration no implemenation
		

}

class RunInterface implements TestIntDemo{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("This is m1 method of mechanism");
		
	}

	@Override
	public void m2() {
		System.out.println("This is m2 method of mechansim");
	}

	@Override
	public void m3() {
		System.out.println("THis is m3 metod of mechanism");
		
	}
	
	public static void main(String[] args) {
		RunInterface run= new RunInterface();
		run.m1();
		run.m2();
		run.m3();
	}
	
}
