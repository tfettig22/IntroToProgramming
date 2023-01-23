package com.fettig.intro4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/****

<b>Title:</b> PersonList.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b>
	Create a list of people with ID, first name, last name
	Shuffle the people on the list in a random order
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 09 2023
@updates:

****/

public class PersonList {
	
	// Counter to track and assign an id number for each person that is created
	private int numPeople = 1;
	
	/**
	 * Instantiates the list, creates people to add to the list, adds the people and then displays the list
	 * @param args
	 */
	public static void main(String[] args) {
		PersonList list = new PersonList();
		Person p1 = list.createPerson("Tom", "Fettig");
		Person p2 = list.createPerson("George", "Clam");
		Person p3 = list.createPerson("Nick", "Jones");
		Person p4 = list.createPerson("James", "Camire");
		Person p5 = list.createPerson("Mary", "Camire");
		Person p6 = list.createPerson("Butch", "Carlson");
		
		List<Person> listOfPeople = list.createList();
		list.addPerson(p1, listOfPeople);
		list.addPerson(p2, listOfPeople);
		list.addPerson(p3, listOfPeople);
		list.addPerson(p4, listOfPeople);
		list.addPerson(p5, listOfPeople);
		list.addPerson(p6, listOfPeople);
		list.displayPeopleInList(listOfPeople);
		
		list.shuffleList(listOfPeople);
		list.displayPeopleInList(listOfPeople);
	}
	
	/**
	 * Creates an instance of person, taking first and last name as arguments and assigning id based on the number of people already on the list
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public Person createPerson(String firstName, String lastName) {
		Person person = new Person();
		person.setID(this.numPeople);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		numPeople++;
		return person;
	}
	
	/**
	 * Instantiates and returns a new empty ArrayList
	 * @return empty ArrayList
	 */
	public List<Person> createList() {
		return new ArrayList<>();
	}
	
	/**
	 * Adds a person to a list
	 * @param person the person that will be added to the list
	 * @param list the list that the person will be added to
	 */
	public void addPerson(Person person, List<Person> list) {
		list.add(person);
	}
	
	/**
	 * Shuffles the list that is given as an argument
	 * @param list
	 */
	public void shuffleList(List<Person> list) {
		Collections.shuffle(list);
	}
	
	/**
	 * Prints the selected list to to the console, displaying the ID and first name of each person on the list
	 * @param list
	 */
	public void displayPeopleInList(List<Person> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getID() + " " + list.get(i).getFirstName());
		}
		System.out.println("");
	}
}