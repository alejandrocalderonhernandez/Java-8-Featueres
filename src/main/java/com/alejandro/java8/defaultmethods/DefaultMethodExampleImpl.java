package com.alejandro.java8.defaultmethods;

import org.apache.log4j.Logger;

public class DefaultMethodExampleImpl implements DefaultMethodExampleI{
	
	Logger logger = Logger.getLogger(DefaultMethodExampleImpl.class);
	
	// Implementation the method in DefaultMethodExampleI
	
	@Override
	public void greet() {
		logger.info("Hello World");
	}
	
	// This method call a default method in DefaultMethodExampleI
	
	public void getDefaulrMethod() {
		DefaultMethodExampleImpl dme = new DefaultMethodExampleImpl();
		dme.DefaultGreet();
	}

}
