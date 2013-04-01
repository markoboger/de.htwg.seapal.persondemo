package app;
import models.IBoat;
import models.IPerson;

import com.google.inject.AbstractModule;

import controllers.IBoatController;
import controllers.IPersonController;



public class PersonDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(models.mock.Person.class);
		bind(IPersonController.class).to(controllers.mock.PersonController.class);	
		
		bind(IBoatController.class).to(controllers.mock.BoatController.class);
		bind(IBoat.class).to(models.mock.Boat.class);
		
	}

}
