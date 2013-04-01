package app;
import models.IBoat;

import com.google.inject.AbstractModule;

import controllers.IBoatController;
import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.seapal.persondemo.models.IPerson;



public class PersonDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(de.htwg.seapal.persondemo.models.mock.Person.class);
		bind(IPersonController.class).to(de.htwg.seapal.persondemo.controllers.mock.PersonController.class);	
		
		bind(IBoatController.class).to(controllers.mock.BoatController.class);
		bind(IBoat.class).to(models.mock.Boat.class);
		
	}

}
