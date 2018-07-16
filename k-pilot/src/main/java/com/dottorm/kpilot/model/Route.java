package com.dottorm.kpilot.model;

public class Route {
	
	private Airport source;
	private Airport dest;
	private float distance;
	private float time;
	
	public Route() {
		setSource(source);
		setDest(dest);
	}

	public Airport getSource() {
		return source;
	}

	public void setSource(Airport source) {
		this.source = source;
	}

	public Airport getDest() {
		return dest;
	}

	public void setDest(Airport dest) {
		this.dest = dest;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return String.format("Route [source=%s, dest=%s, distance=%s, time=%s]", source, dest, distance, time);
	}

}
