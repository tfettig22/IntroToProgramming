package com.fettig.intro1;

/****

<b>Title:</b> NumberLoop.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b> 
	Create a class that displays numbers 1-10 using a while statement.
	Repeat the output in reverse order using a for statement.
	Display only the even numbers 1-20 using a loop.
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 04 2023
@updates: 

****/

public class NumberLoop {
	
	/**
	 * Main method to instantiate the class and display the numbers to the console
	 * @param args
	 */
	public static void main (String[] args) {
		NumberLoop loop = new NumberLoop();
		loop.processLoops();
	}
	
	/**
	 * While loop that displays a range of numbers
	 * @param start
	 * @param end
	 */
	public void whileLoop(int start, int end) {
		int x = start;
		while (x <= end) {
			System.out.print(x + " ");
			x++;
		}
	}
	
	/**
	 * For loop that displays a range of numbers descending
	 * @param start
	 * @param end
	 */
	public void forLoop(int start, int end) {
		for (int x = end; x >= start; x--) {
			System.out.print(x + " ");
		}
	}
	
	/**
	 * For loop that displays a range of only even numbers
	 * @param start
	 * @param end
	 */
	public void evenNumbers(int start, int end) {
		for (int x = start; x <= end; x++) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}
		}
	}
	
	/**
	 * Runs all the loops, taking arguments to determine the number ranges
	 */
	public void processLoops() {
		whileLoop(1, 10);
		forLoop(1, 10);
		evenNumbers(1, 20);
	}
}