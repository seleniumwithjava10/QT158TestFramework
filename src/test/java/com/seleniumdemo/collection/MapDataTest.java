package com.seleniumdemo.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class MapDataTest {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		map.put("Chiru", 101);
		map.put("Balaya", 102);
		map.put("Nagarjuna", 103);
		map.put("Venky", 104);
		
		  Set<String> keys=map.keySet();
		  
		  System.out.println(keys);
		  
		 Collection<Integer> values= map.values();
		 System.out.println(values);
		 
		 System.out.println(map);
		 
		 LinkedHashMap<String, Integer> linkdata= new LinkedHashMap<String, Integer>();
		 
		 linkdata.put("Chiru", 101);
		 linkdata.put("Balaya", 102);
		 linkdata.put("Nagarjuna", 103);
		 linkdata.put("Venky", 104);
		 
		 System.out.println(linkdata);
	}

}
