package com.fettig.intro3;

import java.io.IOException;

/****

<b>Title:</b> WriteAFile.java<br>
<b>Project:</b> streamsPractice<br>
<b>Description:</b>
	Create 2 classes, ClassTwo will instantiate ClassOne, read the info from a file, convert it to uppercase, then write out a new file
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 12 2023
@updates:

****/

public class FileToUpperCase {
	
	private final String INPUT_NAME = "src/main/resources/testFile.txt";
	private final String OUTPUT_NAME = "src/main/resources/upperTestFile.txt";
	
/**
 * Instantiates the class, then runs the convertToUpper method
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
		FileToUpperCase upperFile = new FileToUpperCase();
		upperFile.convertToUpper();
	}
	
/**
 * Instantiates ClassOne, runs the read method and assigns the resulting string to a variable
 * converts the string to uppercase
 * writes uppercase string to a different file
 * @throws IOException
 */
	public void convertToUpper() throws IOException {
		FileManager fileManager = new FileManager(INPUT_NAME);
		String text = fileManager.readFile().toUpperCase();
		fileManager.writeCharsToFile(OUTPUT_NAME, text);
	}
}