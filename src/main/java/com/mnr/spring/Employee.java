package com.mnr.spring;

public class Employee {
	
	private int id;
	private String name;
	private Vehicle vehicle;
	
	
	
	public Employee(int id, String name, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", vehicle=");
		builder.append(vehicle);
		builder.append("]");
		return builder.toString();
	}
	
	
}
