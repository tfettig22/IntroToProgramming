package com.fettig.intro3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/****

<b>Title:</b> ReadAFile.java<br>
<b>Project:</b> streamsPractice<br>
<b>Description:</b>
	Create 2 classes, ClassOne will have 2 methods - 1 to read in a file and 1 to write a file
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 12 2023
@updates:

****/

public class FileManager {
	
	private String name;
	
/**
 * Constructor that takes in a name
 * @param name
 */
	public FileManager(String name) {
		this.name = name;
	}
	
/**
 * Declare int, instantiate new string builder, instantiate new file reader
 * FileReader reads the file, while value is not -1, cast value to char and append to string builder
 * return string builder converted to string
 * @param fileName the name of the file being read
 * @return String value from the string builder
 * @throws IOException
 */
	public String readFile() throws IOException {
		int i;
		StringBuilder str = new StringBuilder();
		try (FileReader reader = new FileReader(name)) {
			while ((i = reader.read()) != -1) {
				str.append((char)i);	
			}
		}
		return str.toString();
	}
	
/**
 * Writes to a file, taking in fileName and text as arguments
 * @param fileName the name of the new file to be written
 * @param text the text to be written to the new file
 * @throws IOException
 */
	public void writeFile(String fileName, String text) throws IOException {
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write(text);
		}
	}
	
/**
 * Writes to file, one character at a time instead of the whole String chunk
 * @param fileName
 * @param text
 * @throws IOException
 */
	public void writeCharsToFile(String fileName, String text) throws IOException {
		try (FileWriter writer = new FileWriter(fileName)) {
			for (int i = 0; i < text.length(); i++) {
				writer.write(text.charAt(i));
			}
		}
	}
	
/**
 * Getter method for name
 * @return
 */
	public String getName() {
		return name;
	}

}