package com.fettig.intro4;

/****

<b>Title:</b> State.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b>
	State class to be used with StateMap
	Holds member variables for state code and state name
	Only methods are getters and setters for the variables
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 09 2023
@updates:

****/

public class State {
	private String code;
	private String name;
	
	/**
	 * State code setter method
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * State code getter method
	 * @return
	 */
	public String getCode() {
		return this.code;
	}
	
	/**
	 * State name setter method
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * State name getter method
	 * @return
	 */
	public String getName() {
		return this.name;
	}
}