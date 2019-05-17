package com.alejandro.java8.referencestomethods;

public class ObjectExample {
	
	int id;
	String properties;
	
	public ObjectExample() {}
	
	public ObjectExample(int id, String properties) {
		super();
		this.id = id;
		this.properties = properties;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProperties() {
		return properties;
	}
	
	public void setProperties(String properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "ObjectExample [id=" + id + ", properties=" + properties + "]";
	}
	
	

}
