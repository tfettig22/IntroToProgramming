package com.fettig.intro4;

/****

<b>Title:</b> Person.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b>
	Person class to be used with PersonList
	Holds private member variables for id, first name, and last name
	Only methods are getters are setters for the variables
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 09 2023
@updates:

****/

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	
	/**
	 * ID setter method
	 * @param id
	 */
	public void setID(int id) {
		this.id = id;
	}
	
	/**
	 * ID getter method
	 * @return
	 */
	public int getID() {
		return this.id;
	}
	
	/**
	 * First name setter method
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * First name getter method
	 * @return
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Last name setter method
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Last name getter method
	 * @return
	 */
	public String getLastName() {
		return this.lastName;
	}
}