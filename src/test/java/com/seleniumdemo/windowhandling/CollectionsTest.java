package com.seleniumdemo.windowhandling;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsTest {
	
	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
		
		names.add("Rajesh");
		names.add("Kavya");
		names.add("Bindu");
		names.add("varun"); //[Kavya, Rajesh, Bindu, varun]
		names.add("guru");
		names.add("Bindu");
		
		System.out.println(names);
		
		ArrayList<String> names1=new ArrayList<String>();
		
		names1.add("Chiru");
		names1.add("Venky");
		names1.add("Balaya");
		names1.add("Rajesh");
		names1.add("Venky");
		
		System.out.println(names1);
	}

}
