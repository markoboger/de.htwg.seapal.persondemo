package de.htwg.seapal.persondemo.models.mock;

import de.htwg.seapal.persondemo.models.AbstractPerson;

public class Person extends AbstractPerson{

	public String getName() {
		return "Mustermann";
	}

	public void setName(String name) {
		
	}
	
	public int createOwnedBoat(String name){
		return 4711;
		
	}
	
}
