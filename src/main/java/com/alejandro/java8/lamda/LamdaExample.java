package com.alejandro.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

public class LamdaExample {
	
	final static Logger LOGGER = 	Logger.getLogger(LamdaExample.class);
	
	// without lamda 
	public static void sortList() {
		List<String> list = new ArrayList<>();
		list.add("Bentley");
		list.add("Chevrolet");
		list.add("Audi");
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(String element : list) {
			logger.info(element);
		}
	}
	
	// with lamda 
	public static void sortListLamda() {
		List<String> list = new ArrayList<>();
		list.add("Bentley");
		list.add("Chevrolet");
		list.add("Audi");
		
		Collections.sort(list, (String element1, String element2) -> element1.compareTo(element2));
		
		list.forEach(elemnt -> logger.info(elemnt));
		
	}static final Logger logger = Logger.getLogger(LamdaExample.class.getName());

}
