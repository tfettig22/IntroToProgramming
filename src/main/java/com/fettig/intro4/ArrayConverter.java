package com.fettig.intro4;

import java.util.ArrayList;
import java.util.List;

/****

<b>Title:</b> ArrayConverter.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b>
	Convert an array of Strings to a List of Strings
	String[] ===> list String = {"one", "two", ... }
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 10 2023
@updates:

****/

public class ArrayConverter {
	
	/**
	 * Instantiates the class, creates an array, converts the array to a List, then prints the list to the console
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayConverter makeAList = new ArrayConverter();
		String[] arr = makeAList.createArray(10);
		List<String> list = makeAList.convertToList(arr);
		makeAList.displayList(list);
	}
	
	/**
	 * Creates a new array of Strings with a given length by looping over the array and converting the value of each index to a String and assigning it to that index
	 * @param length the length of the new array
	 * @return the newly created array
	 */
	public String[] createArray(int length) {
		String[] arr = new String[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(i);
		}
		return arr;
	}
	
	/**
	 * Creates a new list, then loops over the given array and adds each element to the new list
	 * @param array the array that will be converted to a list
	 * @return
	 */
	public List<String> convertToList(String[] array) {
		List<String> list = new ArrayList<>();
		for (int i =0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}
	
	/**
	 * Prints the given list to the console
	 * @param list the list that will be displayed to the console
	 */
	public void displayList(List<String> list) {
		System.out.println(list);
	}
}
