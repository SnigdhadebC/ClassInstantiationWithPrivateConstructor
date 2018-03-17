package com.application.model;

public class CustomerBean {

	private String firstName;
	private String lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
	private CustomerBean(String firstName, String lastName) {
		super();
		System.out.println("Inside Private Constructor of CustomerBean class !!");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	

}
