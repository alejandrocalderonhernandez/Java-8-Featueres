package com.alejandro.java8.lamda;

import org.apache.log4j.Logger;

public class OperationImpl {
	
static final Logger LOGGER = Logger.getLogger(OperationImpl.class);
	
	public static void calculate() {
		OperationI operation = (double valueA, double valueB) -> (valueA + valueB)/2;
		LOGGER.info( "R = " + operation.calculate(2,3));
	}

}
