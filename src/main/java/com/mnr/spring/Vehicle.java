package com.mnr.spring;

public class Vehicle {
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [id=");
		builder.append(id);
		builder.append(", model=");
		builder.append(model);
		builder.append("]");
		return builder.toString();
	}
	private int id;
	private String model;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
