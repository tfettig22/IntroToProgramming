package com.fettig.intro1;

/****

<b>Title:</b> VariableList.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b>
	Write a class that creates and stores values for an int, double, float, char, boolean
	Output these values to the display
	BONUS: Create a method to display this information using class and method variables
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 04 2023
@updates: 

****/

public class VariableList {
	
	int x1 = 10;
	double y1 = 11.22;
	float z1 = 3.14159F;
	char a = 'a';
	boolean isLearning = true;
	
	/**
	 * Instantiates class and runs method to display all variables
	 * @param args
	 */
	public static void main(String[] args) {
		VariableList list = new VariableList();
		list.displayAllVariables();
	}
	
	/**
	 * Method to display member variables
	 */
	public void displayVariables() {
		System.out.println(x1 + " " + y1 + " " + z1 + " " + a + " " + isLearning);
	}
	
	/**
	 * Declare method variables and display them
	 */
	public void displayMethodVariables() {
		int x2 = 20;
		double y2 = 22.44;
		float z2 = 6.2831F;
		char b = 'b';
		boolean isSleeping = false;
		System.out.print(x2 + " " + y2 + " " + z2 + " " + b + " " + isSleeping);
	}
	
	/**
	 * Displays all method and member variables to console
	 */
	public void displayAllVariables() {
		displayVariables();
		displayMethodVariables();
	}
}