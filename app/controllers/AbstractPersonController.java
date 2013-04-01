package controllers;

import models.IPerson;
import util.observer.Observable;

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

}
