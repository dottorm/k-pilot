package com.dottorm.kpilot.model;

public class City {
	
	private String name;

	public City(String name) {
		
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("City [name=%s]", name);
	}

}
