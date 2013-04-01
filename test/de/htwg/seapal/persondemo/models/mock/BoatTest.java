package de.htwg.seapal.persondemo.models.mock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.persondemo.models.mock.Person;

public class BoatTest {
	
	private Person boat;

	@Before
	public void setup(){
		boat = new Person();	
	}

	@Test
	public void testGetName() {
		assertEquals("Titanic", boat.getName());
	}

}
