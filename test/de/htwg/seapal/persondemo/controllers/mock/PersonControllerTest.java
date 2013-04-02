package de.htwg.seapal.persondemo.controllers.mock;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.persondemo.app.PersonDemoMockModule;
import de.htwg.seapal.persondemo.controllers.IPersonController;

public class PersonControllerTest {

	private IPersonController personController;
	// Set up Google Guice Dependency Injector
	Injector injector = Guice.createInjector(new PersonDemoMockModule());

	
	@Before
	public void setup(){
		// Build up the application, resolving dependencies automatically by Guice
		personController = injector.getInstance(IPersonController.class);
	}

	@Test
	public void testGetPersonName() {
		personController.setPersonName("BullshitName-ShouldNotShowUp");
		assertEquals("Mustermann", personController.getPersonName());
	}

}
