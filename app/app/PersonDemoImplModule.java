package app;


import com.google.inject.AbstractModule;

import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.seapal.persondemo.models.IPerson;



public class PersonDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(de.htwg.seapal.persondemo.models.impl.Person.class);
		bind(IPersonController.class).to(de.htwg.seapal.persondemo.controllers.impl.PersonController.class);
	}

}
