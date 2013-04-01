package de.htwg.seapal.persondemo.controllers;

import de.htwg.util.observer.IObservable;

public interface IPersonController extends IObservable{

	void setPersonName(String string);
	
	String getPersonName();
	
	String getPersonById(int personId);

	String getString();

}
