package com.fettig.intro4;
import java.util.Map;
import java.util.TreeMap;

/****

<b>Title:</b> StateMap.java<br>
<b>Project:</b> smtTraining<br>
<b>Description:</b>
	Create a map of states with state code and state name
	Order and reverse order the data
<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author Tom Fettig
@version 1.0
@since Jan 09 2023
@updates:

****/

public class StateMap {
	
	/**
	 * Instantiates the class, then creates a map and puts state data into the map
	 * @param args
	 */
	public static void main(String[] args) {
		StateMap mapOfStates = new StateMap();
		Map<String, String> states = mapOfStates.createStateMap();
		mapOfStates.addStateToMap("CO", "Colorado", states);
		mapOfStates.addStateToMap("CA", "California", states);
		mapOfStates.addStateToMap("WY", "Wyoming", states);
		mapOfStates.addStateToMap("AZ", "Arizona", states);
		mapOfStates.addStateToMap("MN", "Minnesota", states);
		mapOfStates.displayMap(states);
		Map<String, String> descendingStates = mapOfStates.reverse(states);
		mapOfStates.displayMap(descendingStates);
		
	}
	
	/**
	 * Creates and returns an empty map
	 * @return
	 */
	public Map<String, String> createStateMap() {
		return new TreeMap<>();
	}
	
	/**
	 * Adds state data to a map, taking in the state code, state name, and the map that the state will be added to as arguments
	 * @param code state code key that will be added
	 * @param name state name value that will be assigned to the state code key
	 * @param map the map that the state data will be added to
	 */
	public void addStateToMap(String code, String name, Map<String, String> map) {
		map.put(code, name);
	}
	
	/**
	 * Casts the given map into a TreeMap, then reverses the order and returns the map in descending order
	 * @param map given map that will be reversed
	 * @return TreeMap in descending order
	 */
	public Map<String, String> reverse(Map<String, String> map) {
		TreeMap<String, String> treeMap = (TreeMap<String, String>) map;
		return treeMap.descendingMap();
	}
	
	/**
	 * Prints the map data to the console
	 */
	public void displayMap(Map<String, String> map) {
		System.out.println(map);
	}
}