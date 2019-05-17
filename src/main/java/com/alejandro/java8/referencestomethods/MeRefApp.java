package com.alejandro.java8.referencestomethods;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.log4j.Logger;

public class MeRefApp {
	
	final static Logger LOGGER = Logger.getLogger(MeRefApp.class);
	
	public static void referenceMethodStatic() {
		LOGGER.info("Method static");
	}
	
	public void referenceMethodInstanceObjectArbitrary() {
		String[] brands = {"Lamborghini", "Ferrari", "Porsche"};
		
//		without lamda
//		Arrays.sort(brands, new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				return o1.compareToIgnoreCase(o2);
//			}
//		});
		
//		with lamda
//		Arrays.sort(brands, (s1,s2) -> s1.compareToIgnoreCase(s2));
		
//		with reference to methods
		Arrays.sort(brands, String::compareToIgnoreCase);
		LOGGER.info(Arrays.toString(brands));
	}
	
	public void referenceMethodInstanceObjectIndividual() {
		LOGGER.info("Method referenced in instance of object");
	}
	
	public void referenceConstructor() {
		
//		with lamda
//		IObject object = (int id, String description) -> new ObjectExample(id, description);
//		ObjectExample o = object.create(1, "all");
		
//		with reference to methods//		with reference to methods
		IObject object = ObjectExample:: new;
		ObjectExample o = object.create(1, "all");
		LOGGER.info(o.toString());

	}
	
	public void operate() {
		Operation op = () -> MeRefApp.referenceMethodStatic();
		op.execute();
		Operation op2 = MeRefApp::referenceMethodStatic;
		op2.execute();
	}
	
	
	 
	public static void main(String[] args) {
		MeRefApp app = new MeRefApp();
		app.operate();
		app.referenceMethodInstanceObjectArbitrary();
		Operation op = app::referenceMethodInstanceObjectIndividual;
		op.execute();
		app.referenceConstructor();
	}

}
