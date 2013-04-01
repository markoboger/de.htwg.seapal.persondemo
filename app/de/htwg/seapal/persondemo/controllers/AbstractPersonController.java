package de.htwg.seapal.persondemo.controllers;

import de.htwg.seapal.persondemo.models.IPerson;
import de.htwg.util.observer.Observable;

public abstract class AbstractPersonController extends Observable implements IPersonController{
	
	protected IPerson person;

	@Override
	public void setPersonName(String string) {
		person.setName(string);
		notifyObservers();
	}
	
	@Override
	public String getString() {
		return "Person: " + person.getName();
	}

	@Override
	public String getPersonName() {
		return person.getName();
	}
	
	@Override
	public String getPersonById(int personId) {
		return person.getName();
	}

}
