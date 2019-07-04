package com.alejandro.java8.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class MapJava8 {
	
	private static final Logger LOG = Logger.getLogger(MapJava8.class);
	private Map<Integer,String> map;
	
	public void refillMap() {
		this .map = new HashMap<>();
		this.map.put(1, "java");
		this.map.put(2, "python");
		this.map.put(3, "typescropt");
	}
	
	public void printJDK7() {
		for(Entry<Integer, String> entry: map.entrySet()) {
			LOG.info("key: " + entry.getKey() + "value: " + entry.getValue()); 
		}
	}
	
	public void printJDK8Lamda() {
		map.forEach((key, value) -> LOG.info("key: " + key + "value: " + value));
	}
	
	public void printJDK8Stream() {
		map.entrySet().stream().forEach(LOG::info);
	}

	public void insertIfNoExist() {
		map.putIfAbsent(4, "javascript");
	}
	
	public void computeIfPresent() {
		map.computeIfPresent(3, (k,v) -> k + v);
		LOG.info("This condition succesfull " + map.get(3));
	}
	
	public void getDEfault() {
		map.getOrDefault(5, "Default value");
	}

	public static void main(String[] args) {
		
	}

}
