package com.seleniumdemo.collection;

import java.util.ArrayList;

public class TestCollection {
	
	public static void main(String[] args) {
		
		int [] nums= new int[2];
		
		nums[0]=101;
		nums[1]=102;
		//nums[2]= 103;
		
		for(int num:nums) {
			System.out.println(num);
		}
		
		ArrayList	 list= new ArrayList();
		
		list.add("guru");
		list.add(101);
		list.add(true);
		list.add('A');
		
		list.add("Rajsh");
		list.add(102);
		list.add(false);
		list.add('B');
		
		list.add("Venky");
		list.add(103);
		list.add(true);
		list.add('C');
		
		list.add("Varun");
		list.add(104);
		list.add(false);
		list.add('C');
		
		System.out.println(list);
	}

}
