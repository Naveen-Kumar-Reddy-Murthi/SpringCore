package com.mnr.spring;

public class Customer {
	
	private int id;
	private String name;
	
	
	
	public Customer() {
		System.out.println("bean1 created");
	}
	
	public Customer( String name, int id) {
		this.id = id;
		this.name = name;
		System.out.println("overloaded bean2 created");
	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("bean2 created");
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setId called");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName called");
		this.name = name;
	}
	
	

}
