package com.seleniumdemo.oops.inheritance;

public class Practice1 {
	
	public void m1() {
		System.out.println("This is m1 pracite method");
	}
	
	public void m2() {
		System.out.println("This is m2 mthod of practice1");
	}
	
	public void m4() {
		System.out.println("This is m4 mthod of practice1");
	}

}

class PracticeChild1 extends Practice1{
	
	public void m2() {
		System.out.println("This is m2 mehtod in child1");
	}
	
	public void m3() {
		System.out.println("This is m3 mehtod in child1");
	}
	
	public static void main(String[] args) {
		
		//parent p= new parent
		//child c= new child
		//parent p= new child
		
	 Practice1 pp= new Practice1();
	 
	 pp.m1();
	 
	 pp.m2();
	 
	 PracticeChild1 cc=new PracticeChild1();
	 
	 cc.m1();
	 
	 cc.m3();
	 
	 cc.m4();
	 
	 
	 Practice1 pc1= new PracticeChild1(); // parent can convert to child
	 
	 pc1.m1();
	 
	 pc1.m1(); // always accessible parent properties  
	 
	 
 //child can't convert to parent
	
 }
	
}
