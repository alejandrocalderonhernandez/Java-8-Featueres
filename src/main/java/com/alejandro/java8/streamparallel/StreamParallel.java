package com.alejandro.java8.streamparallel;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class StreamParallel {
	
	private static final Logger LOG = Logger.getLogger(StreamParallel.class);
	private List<Integer> numbers;
	
	public  void refillList() {
		this.numbers = new ArrayList<>();
		for(int i = 0;  i < 10; i++) {
			numbers.add(i);
		}
	}
	
	public  void testStream() {
		numbers.stream().forEach(LOG::info);
	}
	
	public void testStreamParalell() {
		numbers.parallelStream().forEach(LOG::info);
	}
}
