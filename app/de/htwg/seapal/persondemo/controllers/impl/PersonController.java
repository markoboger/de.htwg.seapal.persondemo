package de.htwg.seapal.persondemo.controllers.impl;


import com.google.inject.Inject;

import controllers.IBoatController;
import de.htwg.seapal.persondemo.controllers.AbstractPersonController;
import de.htwg.seapal.persondemo.models.IPerson;

public class PersonController extends AbstractPersonController{

	@Inject
	public PersonController(IPerson person, IBoatController boatController) {
		this.person = person;
	}

}
