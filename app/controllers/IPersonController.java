package controllers;

import util.observer.IObservable;

public interface IPersonController extends IObservable{

	void setPersonName(String string);
	
	String getPersonName();

	String getString();

}
