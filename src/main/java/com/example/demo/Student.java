package com.example.demo;

public class Student {
	private String firstName;
	private String lastName;
	
	
	public Student(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
