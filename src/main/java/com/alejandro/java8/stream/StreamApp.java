package com.alejandro.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	
	List<String>colors =  new ArrayList<>();
	
	public StreamApp() {
		this.colors.add("blue");
		this.colors.add("green");
		this.colors.add("red");
		this.colors.add("purple");
	}
	
	public List<String> filter() {
		List<String> listFilter = new ArrayList<>();
		this.colors.stream().filter(color -> color.startsWith("r"))
		.forEach(listFilter::add);
		return listFilter;
	}
	
	public List<String> sort() {
		List<String> listFilter = new ArrayList<>();
		this.colors.stream().sorted().forEach(listFilter::add);
		return listFilter;
	}
	
	public List<String> transform() {
		List<String> listFilter = new ArrayList<>();
		this.colors.stream().map(String::toUpperCase)
		.forEach(listFilter::add);
		return listFilter;
	}
	
	public void limit() {
		this.colors.stream().limit(3).forEach(System.out::print);
	}
	
	public Long count() {
		return this.colors.stream().count();
	}
}
