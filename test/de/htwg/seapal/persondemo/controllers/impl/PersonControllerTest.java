package de.htwg.seapal.persondemo.controllers.impl;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import app.PersonDemoImplModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.persondemo.controllers.IPersonController;

public class PersonControllerTest {

	private IPersonController personController;
	// Set up Google Guice Dependency Injector
	Injector injector = Guice.createInjector(new PersonDemoImplModule());

	@Before
	public void setup() {
		// Build up the application, resolving dependencies automatically by Guice
		personController = injector.getInstance(IPersonController.class);
	}

	@Test
	public void testGetPersonName() {
		personController.setPersonName("Mustermann");
		assertEquals("Mustermann", personController.getPersonName());
	}

}
