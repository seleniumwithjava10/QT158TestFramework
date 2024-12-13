package com.seleniumdemo.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTestDemo {
	
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		
		vec.addElement("Ram");
		vec.addElement("Sathish");
		vec.add("Dinesh");
		vec.add("Pavan");
		
		
		
		System.out.println(vec);
		
		         Enumeration<String> data=vec.elements();
		         
		         while(data.hasMoreElements()) {
		        	 System.out.println(data.nextElement());
		         }
	}

}
