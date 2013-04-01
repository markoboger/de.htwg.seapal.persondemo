package app;
import models.IBoat;
import models.IPerson;

import com.google.inject.AbstractModule;

import controllers.IBoatController;
import controllers.IPersonController;



public class PersonDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(models.impl.Person.class);
		bind(IPersonController.class).to(controllers.impl.PersonController.class);
		
		bind(IBoatController.class).to(controllers.impl.BoatController.class);
		bind(IBoat.class).to(models.impl.Boat.class);
	}

}
