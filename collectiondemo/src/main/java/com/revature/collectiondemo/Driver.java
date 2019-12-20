package com.revature.collectiondemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(3);
		myList.add(4);
		
		System.out.println(myList.contains(3));
		
		Iterator<Integer> myIterator = myList.iterator();
		
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		for(Integer i : myList) {
			System.out.println(i);
		}
		
		
		System.out.println(myList.toString());
		
		Map<String, Exception> exceptionMap = new HashMap<String, Exception>();
		
		exceptionMap.put("Trying to access index that doesn't exist",
				new ArrayIndexOutOfBoundsException());
		
		exceptionMap.put("Something went wrong while working with files",
				new IOException());
		
		System.out.println(exceptionMap);
		
		System.out.println(exceptionMap.get("Trying to access index that doesn't exist"));
		
		System.out.println(exceptionMap.get("wrong key"));
		
		TreeMap<String, String> myMap;

	}

}
