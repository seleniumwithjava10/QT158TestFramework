package com.seleniumdemo.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetTest {
	
	public static void main(String[] args) {
		HashSet<Object> set= new HashSet<Object>();
		
		set.add("Guru");
		set.add(101);
		set.add('A');
		set.add(1.44);
		set.add("Guru");
		set.add("Sham");
		
		System.out.println(set);
		
		LinkedHashSet<Object> linkset= new LinkedHashSet<Object>();
		linkset.add("Guru");
		linkset.add(101);
		linkset.add('A');
		linkset.add(1.44);
		linkset.add("Guru");
		linkset.add("Sham");
		
		System.out.println(linkset);
		
		
	}

}
