package com.seleniumdemo.polymorphsim;

public class ParentMarry {
	
	
	public void dowry() {
		System.out.println("1 Cr Dowry");
	}
	
	public void marry() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("My frnd daughter Sharmila");
	}

}

class ChildMarry extends ParentMarry{
	
	public void marry() {
		System.out.println("Marry my class mate Rekha");
	}
	
	public static void main(String[] args) throws Throwable	 {
		//ChildMarry ch= new ChildMarry();
		
		//ch.marry();
		//ch.dowry();
		
		
		ParentMarry pm=new ParentMarry();
		
		pm.marry();
		pm.dowry();
	}
	
	
	
}
