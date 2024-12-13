package com.seleniumdemo.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTestDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Chiru");
		names.add("Venkat");
		names.add("Balyaaa");
		names.add("RamCharan");

		System.out.println("Forword direction data printing");

		ListIterator<String> name = names.listIterator();

		while (name.hasNext()) {
			System.out.println(name.next());
		}
		
		System.out.println();

		System.out.println("Backword direction data printing");

		

		while (name.hasPrevious()) {
			System.out.println(name.previous());
		}
	}

}
