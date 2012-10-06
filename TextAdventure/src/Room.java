package src;

import java.util.ArrayList;

public class Room{
	private ArrayList<Item> items;
	private ArrayList<Person> people;
	private String[] exits;

	public Room(String[] pExits){
		items = new ArrayList<Item>();
		people = new ArrayList<Person>();
		exits = pExits;
	}

	public ArrayList<Item> getItems(){
		return items;
	}

	public ArrayList<Person> getPeople(){
		return people;
	}

	public String[] getExits(){
		return exits;
	}

}