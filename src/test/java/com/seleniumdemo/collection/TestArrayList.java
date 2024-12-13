package com.seleniumdemo.collection;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> array= new ArrayList<String>();
		
		array.add("Guru");
		array.add("Sai");
		array.add("Vinu");
		array.add("Sham");
		array.add("Guru");
		
		System.out.println(array);
		
		array.removeAll(array);
		
		System.out.println(array);
		
		array.add("Guru");
		array.add("Sham");
		array.add("Mohan");
		
		array.set(1, "Venkat"); //replace exiting position if any data is there
		
		array.add(0, "Ram"); //add data and existing data will change position
		
		System.out.println(array);
		
		array.remove("Mohan");
		
		System.out.println(array);
		
		boolean condition=array.contains("Venkat");
		
		System.out.println(condition);
    System.out.println(array.size());		
		
	}

}
