package com.seleniumdemo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListData {
	
	public static void main(String[] args) {
		
		List<String> data= new ArrayList<String>();
		
		data.add("Chiru");
		data.add("Venkey");
		data.add("Ram");
		data.add("Sham");
		data.add("Peter");
		
		
		ListIterator<String> ref=data.listIterator();
		
		System.out.println("Print data in forword direction");
		
		   while (ref.hasNext()) {
			String string = (String) ref.next();
			System.out.println(string);
			
		    }
		  
		   System.out.println("Print data in backword direction");
		   while (ref.hasPrevious()) { // boolean
				String string = (String) ref.previous(); //object
				System.out.println(string);
				
			    }
		   
		}
	}


