package com.alejandro.java8.optional;

import org.apache.log4j.Logger;
import java.util.Optional;

public class OptionalExample {
	
	static final Logger LOG = Logger.getLogger(Optional.class);
	
	public static void test(String string) {
		LOG.info(string.contains("test"));
	}
	
	public static  void orElse(String string) {
		Optional<String> op = Optional.ofNullable(string);
		String result = op.orElse("Default");
		LOG.info(result);	
	}
	
	public static  void orElseThrow(String string) {
		Optional<String> op = Optional.ofNullable(string);
		op.orElseThrow(NumberFormatException::new);
	}
	
	public static void isPrecent(String string) {
		Optional<String> op = Optional.ofNullable(string);
		LOG.info(op.isPresent());
	}
}
