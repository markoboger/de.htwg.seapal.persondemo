package de.htwg.seapal.persondemo.controllers.mock;


import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.persondemo.controllers.AbstractPersonController;
import de.htwg.seapal.persondemo.models.IPerson;

@Singleton
public class PersonController extends AbstractPersonController{

	@Inject
	public PersonController(IPerson person, IBoatController boatController) {
		this.person = person;
	}
	
	@Override
	public String getPersonById(int personId) {
		return person.getName();
	}

}
