package com.alejandro.java8.defaultmethods;

public interface DefaultMethodExampleI {
	
	public void greet();
	
	default public void DefaultGreet() {
		System.out.println("Hello World");
	}

}
