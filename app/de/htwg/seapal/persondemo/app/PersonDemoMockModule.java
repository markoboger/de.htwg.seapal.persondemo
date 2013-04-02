package de.htwg.seapal.persondemo.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.seapal.persondemo.models.IPerson;



public class PersonDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(de.htwg.seapal.persondemo.models.mock.Person.class);
		bind(IPersonController.class).to(de.htwg.seapal.persondemo.controllers.mock.PersonController.class);	
		
	}

}
