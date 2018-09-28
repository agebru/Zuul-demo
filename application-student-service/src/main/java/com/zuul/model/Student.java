package com.zuul.model;

import java.util.List;

public class Student {
	private int id;
	private String firstName;
	private List<Address> addresses;

	
	public Student() {
		
	}
	
	
	public Student(int id, String firstName, List<Address> addresses) {
		this.id = id;
		this.firstName = firstName;
		this.addresses = addresses;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", addresses=" + addresses + "]";
	}

	
}
