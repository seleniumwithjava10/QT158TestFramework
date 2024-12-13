package com.seleniumdemo.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		// map will store data in the form of key & values
		
		//keys can't be duplicate and values can be duplicate
		
		HashMap<Integer, String> stnddata= new HashMap<Integer, String>();
		
		stnddata.put(101, "Guru");
		stnddata.put(102, "Rajesh");
		stnddata.put(103, "Venkatesh");
		stnddata.put(104, "kavya");
		stnddata.put(101, "Mohan");
		
		stnddata.put(105, "Bindu");
		stnddata.put(106, "Venkatesh");
		stnddata.put(null, "Chriu");
		stnddata.put(107, "Santosh");
		stnddata.put(108, null);
		stnddata.put(109, null);
		stnddata.put(null, "Ramcharan");
		
		System.out.println(stnddata);
		
		for(Map.Entry<Integer, String> data:stnddata.entrySet()) {
			//System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
	}

}
