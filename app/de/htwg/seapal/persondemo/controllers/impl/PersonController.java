package de.htwg.seapal.persondemo.controllers.impl;


import com.google.inject.Inject;
import com.google.inject.Singleton;


import de.htwg.seapal.persondemo.controllers.AbstractPersonController;
import de.htwg.seapal.persondemo.models.IPerson;

@Singleton
public class PersonController extends AbstractPersonController{

	@Inject
	public PersonController(IPerson person) {
		this.person = person;
	}

}
