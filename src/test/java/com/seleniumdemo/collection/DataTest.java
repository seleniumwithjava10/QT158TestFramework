package com.seleniumdemo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataTest {
	
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		
		//I want to store elements 1 to 10 numbers
		
		for(int i=1;i<=10;i++) { //0 1 2 3 4 5 6 7 8  9 10
			li.add(i);
		}
		
		System.out.println(li);
		
		 Iterator itr= li.iterator();
		 
		 while (itr.hasNext()) { //true
			Integer object = (Integer) itr.next(); //0 1
			//System.out.println(object);
			if(object%2==0) {
				System.out.println(object);
			}
			else {
				itr.remove();
			}
		
		}
		 	
		
	}

}
