package com.dottorm.kpilot.model;

import java.util.ArrayList;

public class Owner {
	
	private String name;
	private ArrayList<Aeroplane> AeroplaneList = new ArrayList<Aeroplane>();
	
	public Owner(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Aeroplane> getAeroplaneList() {
		return AeroplaneList;
	}

	public void setAeroplaneList(ArrayList<Aeroplane> aeroplaneList) {
		AeroplaneList = aeroplaneList;
	}

	@Override
	public String toString() {
		return String.format("Owner [name=%s, AeroplaneList=%s]", name, AeroplaneList);
	}
	
	

}
