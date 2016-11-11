package org.mnr.spring;

import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private Address address;
	private Set<String> phoneNumbers;
	private Department department;
	private Vehicle vehicle;

	public Employee(int id, String name,Address address) {
		
		System.out.println("3 parameter Employee constructor");
		this.id = id;
		this.name = name; 
		this.address=address;
	}

	
	
	public Employee(int id, String name, Address address, Department department){
		System.out.println("4.1 parameter Employee constructor");
		this.id = id;
		this.name = name; 
		this.address=address;
		this.department=department;
	}
	
	public Employee(int id, String name, Address address, Vehicle vehicle){
		System.out.println("4.2 parameter Employee constructor");
		this.id = id;
		this.name = name; 
		this.address=address;
		this.vehicle=vehicle;
		
	}
	
	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		System.out.println("Employee bean created!");
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phoneNumbers=");
		builder.append(phoneNumbers);
		builder.append(", department=");
		builder.append(department);
		builder.append(", vehicle=");
		builder.append(vehicle);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((phoneNumbers == null) ? 0 : phoneNumbers.hashCode());
		result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumbers == null) {
			if (other.phoneNumbers != null)
				return false;
		} else if (!phoneNumbers.equals(other.phoneNumbers))
			return false;
		if (vehicle == null) {
			if (other.vehicle != null)
				return false;
		} else if (!vehicle.equals(other.vehicle))
			return false;
		return true;
	}

}
