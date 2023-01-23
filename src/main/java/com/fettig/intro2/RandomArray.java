package com.fettig.intro2;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

/****

<b>Title:</b> ARandomArray.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b>
	Create an array of 10 elements, store 10 random numbers into the array
	Display the values of the array and their corresponding row
	Bonus: Create a set of random numbers with no duplicated numbers
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 06 2023
@updates:

****/

public class RandomArray {
	
	// Creates an instance of the Random class
	Random r = new Random();
	
	
	/**
	 * Instantiates the class and invokes method to display the random array of length determined by argument
	 * @param args
	 */
	public static void main(String[] args) {
		RandomArray randomNums = new RandomArray();
		randomNums.randomNumsHashSet(10);
	}
	
	/**
	 * Creates a new array taking in size as a parameter, assigns each element in the array to a random number, displays each index/value pair
	 * @param size
	 */
	public void randomNumsArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			int randNum = r.nextInt(100);
			arr[i] = randNum;
			System.out.println("Index" + i + " : " + arr[i]);
		}
	}
	
	/**
	 * Creates a new HashSet object and fills it with a specified number of random numbers with no duplicates
	 * @param size
	 */
	public void randomNumsHashSet(int size) {
		Set<Integer> randomNums = new HashSet<>();
		while (randomNums.size() < size) {
			randomNums.add(r.nextInt(100));
		}
		System.out.println(randomNums);
	}
}