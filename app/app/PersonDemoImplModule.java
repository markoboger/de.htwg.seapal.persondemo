package app;
import models.IBoat;

import com.google.inject.AbstractModule;

import controllers.IBoatController;
import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.seapal.persondemo.models.IPerson;



public class PersonDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPerson.class).to(de.htwg.seapal.persondemo.models.impl.Person.class);
		bind(IPersonController.class).to(de.htwg.seapal.persondemo.controllers.impl.PersonController.class);
		
		bind(IBoatController.class).to(controllers.impl.BoatController.class);
		bind(IBoat.class).to(models.impl.Boat.class);
	}

}
