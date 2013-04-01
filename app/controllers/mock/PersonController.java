package controllers.mock;

import models.IPerson;

import com.google.inject.Inject;

import controllers.AbstractPersonController;

public class PersonController extends AbstractPersonController{

	@Inject
	public PersonController(IPerson person) {
		this.person = person;
	}

}
