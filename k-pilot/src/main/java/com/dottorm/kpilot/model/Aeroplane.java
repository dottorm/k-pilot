package com.dottorm.kpilot.model;

public class Aeroplane {
	
	private String name;
	private int seats;
	private double distance;
	
	public Aeroplane() {
		setName("Default");
		setDistance(0);
		setSeats(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return String.format("Aeroplane [name=%s, seats=%s, distance=%s]", name, seats, distance);
	}
	
	

}
