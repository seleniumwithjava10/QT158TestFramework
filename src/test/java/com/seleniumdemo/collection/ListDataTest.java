package com.seleniumdemo.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDataTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			ar.add(i);
		}
		
		//System.out.println(ar);
		
		Iterator<Integer> itr=ar.iterator();
		
		while(itr.hasNext()) {
			Integer it=itr.next();
			//System.out.println(it);
			if(it%2==0) {
				itr.remove();// even numbers will  remove
			}
			
		}
		
		System.out.println(ar);//
	}

}
