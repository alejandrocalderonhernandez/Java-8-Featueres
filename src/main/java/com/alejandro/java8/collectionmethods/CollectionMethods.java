package com.alejandro.java8.collectionmethods;

import java.util.List;

import org.apache.log4j.Logger;

public class CollectionMethods {
	
	static final  Logger LOGGER = Logger.getLogger(CollectionMethods.class);
	
	public static void useForEach(final List<String> list){
		list.forEach(LOGGER::info);
	}
	
	public static void useRemoveIf(final List<String> list){
		list.removeIf(filter -> filter.equalsIgnoreCase("Python"));
	}
	
	public static void useSort(final List<String> list){
		list.sort((s1,s2) -> s1.compareTo(s2));
	}
}
