package controllers.impl;

import models.IPerson;

import com.google.inject.Inject;

import controllers.AbstractPersonController;
import controllers.IBoatController;

public class PersonController extends AbstractPersonController{

	@Inject
	public PersonController(IPerson person, IBoatController boatController) {
		this.person = person;
	}

}
